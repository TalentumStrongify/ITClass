package com.telefonica.centroseducativos.negocio;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.telefonica.centroseducativos.model.CentroEducativo;
import com.telefonica.centroseducativos.model.EvaluacionesCE;
import com.telefonica.centroseducativos.ranking.RankingResultado;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;

public class CentrosEducativosNegocio {

	/**
	 * Metodo que cuente el numero de encuestas contestadas en cada colegio
	 * 
	 * @throws SystemException
	 **/

	public int contarNumEncuestas(int idce) throws SystemException {

		DynamicQuery dynamicQueryContarEncuestas = EvaluacionesCELocalServiceUtil.dynamicQuery()
				.add(PropertyFactoryUtil.forName("idce").eq(idce))
				.setProjection(ProjectionFactoryUtil.countDistinct("idencuesta"));

		java.util.List<Object> numeroEncuestas = EvaluacionesCELocalServiceUtil
				.dynamicQuery(dynamicQueryContarEncuestas);
		return (Integer) numeroEncuestas.get(0);

	}

	// Método que dice si existe gente en una categoría en un colegio
	public boolean existe(int idce, int idrol) throws SystemException {

		DynamicQuery dynamicQueryContarEncuestas = EvaluacionesCELocalServiceUtil.dynamicQuery()
				.add(PropertyFactoryUtil.forName("idce").eq(idce)).add(PropertyFactoryUtil.forName("idrol").eq(idrol))
				.setProjection(ProjectionFactoryUtil.countDistinct("idencuesta"));

		java.util.List<Object> numeroEncuestas = EvaluacionesCELocalServiceUtil
				.dynamicQuery(dynamicQueryContarEncuestas);
		if ((Integer) numeroEncuestas.get(0) > 0) {
			return true;
		} else {
			return false;
		}

	}

/*Método que genera las medias por colegio, rol y categoría,. para cogerlas en el método mediaFinal
	 * @throws SystemException
	 */

	public int mediaPreliminar(int categoriaPregunta, int idrol, int idce) throws SystemException {

		// Conseguimos todos los datos para una categoría concreta y proyectamos
		// la media de las notas de esa categoría concreta

		DynamicQuery dynamicQuerySeleccionCatPregunta = DynamicQueryFactoryUtil.forClass(EvaluacionesCE.class)
				.add(PropertyFactoryUtil.forName("idcategoria").eq(categoriaPregunta))
				.add(PropertyFactoryUtil.forName("idrol").eq(idrol)).add(PropertyFactoryUtil.forName("idce").eq(idce))
				.setProjection(ProjectionFactoryUtil.avg("notapregunta"));

		java.util.List<Object> media = EvaluacionesCELocalServiceUtil.dynamicQuery(dynamicQuerySeleccionCatPregunta);
		return (Integer) media.get(0);

		// TODO get and set nombre de factor

	}
	 
		/**
		 * Un método que da la media 
		 */
	public double mediaFinal(int categoriaPregunta, int idce) throws SystemException {
		double m = 0;
		double ponderacion = 0;
		// 1=docente
		if (existe(idce, 1) == true) {
			m = m + 0.5 * mediaPreliminar(categoriaPregunta, 1, idce);
			ponderacion = ponderacion + 0.5;
		}
		// 2=alumno
		if (existe(idce, 2) == true) {
			m = m + 0.35 * mediaPreliminar(categoriaPregunta, 2, idce);
			ponderacion = ponderacion + 0.35;
		}
		// 3=familiar
		if (existe(idce, 3) == true) {
			m = m + 0.15 * mediaPreliminar(categoriaPregunta, 3, idce);
			ponderacion = ponderacion + 0.15;
		}
		if (m > 0) {
			return m / ponderacion;
		} else {
			return -1;
		}
	}
	
	public List<RankingResultado> listadoRanking (List<CentroEducativo> listaColegios){
		
		//while listaColegios hasnext*,
		//Rankingresultado (nombrecolegio, CA, país, mediaFinal(1,i):(3,i),contarNumEncuestas(i)
		//TODO de nombrecolegio a CA y de CA a país. Método Externo?
		List<RankingResultado> resultadoRanking = new ArrayList<RankingResultado>();
		
		
		return null;
		//return resultadoRanking;
	}

}
