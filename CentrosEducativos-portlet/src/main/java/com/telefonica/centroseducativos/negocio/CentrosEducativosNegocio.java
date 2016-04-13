package com.telefonica.centroseducativos.negocio;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionList;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.telefonica.centroseducativos.model.CentroEducativo;
import com.telefonica.centroseducativos.model.ComunidadAutonoma;
import com.telefonica.centroseducativos.model.Pais;
import com.telefonica.centroseducativos.ranking.RankingResultado;
import com.telefonica.centroseducativos.service.CentroEducativoLocalServiceUtil;
import com.telefonica.centroseducativos.service.ComunidadAutonomaLocalServiceUtil;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;
import com.telefonica.centroseducativos.service.PaisLocalServiceUtil;
import com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil;

public class CentrosEducativosNegocio {
	
	private static Log _log = LogFactoryUtil.getLog(CentrosEducativosNegocio.class);
	public static long contarNumEncuestas(int idce) throws SystemException {

		DynamicQuery dynamicQueryContarEncuestas = EvaluacionesCELocalServiceUtil.dynamicQuery()
				.add(PropertyFactoryUtil.forName("idce").eq(idce));

		Projection projection = ProjectionFactoryUtil.
				countDistinct("primaryKey.idencuesta");

		dynamicQueryContarEncuestas.setProjection(projection);

		List <Long> listaContarEncuestasPorCole = EvaluacionesCELocalServiceUtil.dynamicQuery(dynamicQueryContarEncuestas);
		
		Long numEncuestas = listaContarEncuestasPorCole.get(0);
		_log.debug("El numeo de encuestas es : " + numEncuestas);

		return numEncuestas;

	}

	/**
	 * MÃ©todo que dice si hay personas que han contestado la encuesta en un rol
	 * determinado en un colegio (se usa para la media final)
	 * 
	 * @param idce
	 * @param idrol
	 * @return
	 * @throws SystemException
	 */

	public static boolean existe(int idce, int idrol) throws SystemException {

		DynamicQuery dynamicQueryExisteEncuestaConRolIdrol = EvaluacionesCELocalServiceUtil.dynamicQuery()
				.add(PropertyFactoryUtil.forName("idce").eq(idce)).add(PropertyFactoryUtil.forName("idrol").eq(idrol));

		Projection projection = ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("primaryKey.idencuesta"));

		dynamicQueryExisteEncuestaConRolIdrol.setProjection(projection);

		int numeroEncuestasConRolId = (int) EvaluacionesCELocalServiceUtil
				.dynamicQueryCount(dynamicQueryExisteEncuestaConRolIdrol);

		if (numeroEncuestasConRolId > 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * MÃ‰TODO QUE GENERA LAS MEDIAS POR CENTRO EDUCATIVO, ROL Y CATEGORÃ�A Este
	 * mÃ©todo recoge los datos de la base de datos mediante querys dinÃ¡micas
	 * 
	 * @throws SystemException
	 */

	public static double mediaPreliminar(long categoriaPregunta, int idrol, int idce) throws SystemException {

		// Conseguimos todos los datos para una categoria concreta y
		// proyectamos
		// la media de las notas de esa categoria concreta

		try {

			// Nos quedamos con una tabla con las columnas (numpregunta,
			// idpregunta, idcategoria) donde categoria="categoriaPregunta"
			DynamicQuery dynamicQueryPreguntasDeUnaCategoria = PreguntasEncuestaLocalServiceUtil.dynamicQuery()
					.add(PropertyFactoryUtil.forName("idcategoria").eq(categoriaPregunta));

			// Seleccionamos de la tabla anterior la columna "numpregunta"
			ProjectionList projectionListSoloNumeroPregunta = ProjectionFactoryUtil.projectionList();
			projectionListSoloNumeroPregunta.add(ProjectionFactoryUtil.property("numpregunta"));
			dynamicQueryPreguntasDeUnaCategoria.setProjection(projectionListSoloNumeroPregunta);

			// Descargamos los datos anteriores a una lista:
			// preguntasDeUnaCategoria
			// TABLA PREGUNTASENCUESTA
			List<Double> preguntasDeUnaCategoria = PreguntasEncuestaLocalServiceUtil
					.dynamicQuery(dynamicQueryPreguntasDeUnaCategoria);

			// De la tabla EvaluacionesCE (idpregunta, numpregunta,
			// notapregunta, idce, idrol) seleccionamos las filas
			// con idrol="idrol" y idce="idce" (por ejemplo, del centro X, los
			// profesores)
			// TABLA EVALUACIONESCE
			DynamicQuery dynamicQueryNotasDeUnaCategoria = EvaluacionesCELocalServiceUtil.dynamicQuery()
					.add(PropertyFactoryUtil.forName("idrol").eq(idrol))
					.add(PropertyFactoryUtil.forName("idce").eq(idce));

			// De la tabla anterior nos quedamos con las filas que tengan el
			// numpregunta de la categoria=categoriaPregunta
			// (El disjunction es un "OR")
			// TABLA EVALUACIONESCE

			int size = preguntasDeUnaCategoria.size();

			Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
			for (int i = 0; i < size; i++) {
				disjunction
						.add(PropertyFactoryUtil.forName("primaryKey.numpregunta").eq(preguntasDeUnaCategoria.get(i)));
			}
			dynamicQueryNotasDeUnaCategoria.add(disjunction);
			// De lo que hemos seleccionado en el paso anterior nos quedamos
			// solo con la columna de las notas
			// y hacemos una media (average)
			// TABLA EVALUACIONESCE
			Projection projectionMedia = PropertyFactoryUtil.forName("notapregunta").avg();
			dynamicQueryNotasDeUnaCategoria.setProjection(projectionMedia);

			List<Double> media = EvaluacionesCELocalServiceUtil.dynamicQuery(dynamicQueryNotasDeUnaCategoria);
	
			return media.get(0);

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	/**
	 * METODO QUE GENERA LA MEDIA FINAL PARA CADA CENTRO EDUCATIVO
	 * 
	 * Este mÃ©todo "llama" al mÃ©todo de las medias preliminares (desde ese
	 * mÃ©todo es desde donde se llama a la base de datos mediante querys
	 * dinÃ¡micas)
	 * 
	 */
	public static double mediaFinal(int categoriaPregunta, int idce) throws SystemException {

		double m = 0;
		double ponderacion = 0;

		// 1=docente
		if (existe(idce, 28730) == true) {
			m = m + 0.5 * mediaPreliminar(categoriaPregunta, 28730, idce);
			ponderacion = ponderacion + 0.5;
		}
		// 2=alumno
		if (existe(idce, 28729) == true) {
			m = m + 0.35 * mediaPreliminar(categoriaPregunta, 28729, idce);
			ponderacion = ponderacion + 0.35;
		}
		// 3=familiar
		if (existe(idce, 28731) == true) {
			m = m + 0.15 * mediaPreliminar(categoriaPregunta, 28731, idce);
			ponderacion = ponderacion + 0.15;
		}
		if (m > 0) {
			double mediaPonderada = m/ponderacion;
			double mediaTmp=mediaPonderada*100;
			double media = Math.round(mediaTmp);
			return media/100;
		} else {
			return 0;
		}
	}

	public static List<RankingResultado> listadoRanking(List<CentroEducativo> listaCentrosEducativos)
			throws SystemException, PortalException {

		// 1. Generamos la lista vacia que vamos a llenar
		List<RankingResultado> resultadoRanking = new ArrayList<RankingResultado>();

		for (int i = 0; i < CentroEducativoLocalServiceUtil.getCentroEducativosCount(); i++) {

			CentroEducativo miCentroEducativo = listaCentrosEducativos.get(i);

			// 2. Almacenamos el idce del centro educativo para luego poder
			// usarlo para las medias etc
			int idce = miCentroEducativo.getIdce();

			// 3. Calculamos el numero de encuestas
			long numEvaluaciones = contarNumEncuestas(idce);
			// Calculamos "cosas" solo si hay encuestas contestadas por este colegio
			if (numEvaluaciones > 0.0) {

				// 4. Almacenamos el nombre para luego añadirlo a la lista
				// resultadoRanking que es lo que mostraremos en las vistas
				String nombreCentroEducativo = miCentroEducativo.getNombrece();

				// 5.Escogemos la comunidad autonoma correspondiente al colegio
				// y guardamos el nombre para
				// luego mostrarlo en las vistas

				ComunidadAutonoma miComunidadAutonoma = ComunidadAutonomaLocalServiceUtil
						.getComunidadAutonoma(miCentroEducativo.getIdca());
				String nombreComunidadAutonoma = miComunidadAutonoma.getNombrecomunidad();

				// 5. Escogemos el pais correspondiente a la comunidad autonoma
				// y guardamos el nombre
				// para mostrarlo en las vistas
				Pais miPais = PaisLocalServiceUtil.getPais(miComunidadAutonoma.getIdpais());
				String nombrePais = miPais.getNombrepais();

				// 6. Calculamos medias
				double media1 = mediaFinal(1, idce);
				double media2 = mediaFinal(2, idce);
				double media3 = mediaFinal(3, idce);

				// 7. Almacenamos todos lo que hemos calculado en la lista que
				// hemos creado en el paso 1
				RankingResultado unResultadoRanking = new RankingResultado(nombreCentroEducativo,
						nombreComunidadAutonoma, nombrePais, media1, media2, media3, numEvaluaciones);
				resultadoRanking.add(unResultadoRanking);
			}
		}

		return resultadoRanking;
	}

	/**
	 * METODO ALTERNATIVO
	 * 
	 * @param listaCustomQueryCentrosEducativos
	 * @return
	 * @throws SystemException
	 * @throws PortalException
	 */
	// Otro mÃ©todo para cuando resolvamos las custom queries

	public static List<RankingResultado> listadoRankingII(List<CustomCentroEducativo> listaCustomQueryCentrosEducativos)
			throws SystemException, PortalException {

		// 1. Generamos la lista vacÃ­a que vamos a llenar
		List<RankingResultado> resultadoRanking = new ArrayList<RankingResultado>();
		// TODO refactorizar para no tener que usar la persistencia. No existe
		// list.length.
		for (int i = 1; i < CentroEducativoLocalServiceUtil.getCentroEducativosCount() - 1; i++) {

			CustomCentroEducativo miCentroEducativo = listaCustomQueryCentrosEducativos.get(i);

			String miCentro = miCentroEducativo.getNombreCentroEducativo();
			String CA = miCentroEducativo.getNombreComunidadAutonoma();
			String pais = miCentroEducativo.getNombrePais();

			// Calculamos cosas
			int idce = miCentroEducativo.getIdce();
			double media1 = mediaFinal(1, idce);
			double media2 = mediaFinal(2, idce);
			double media3 = mediaFinal(3, idce);
			long numEvaluaciones = contarNumEncuestas(idce);

			// Solo guardamos en el ranking si hay al menos una evaluaciÃ³n
			if (numEvaluaciones > 0) {
				resultadoRanking.add(new RankingResultado(miCentro, CA, pais, media1, media2, media3, numEvaluaciones));
			}
		}
		return resultadoRanking;
	}
}