package com.telefonica.centroseducativos.registro.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.centroseducativos.model.EvaluacionesCE;
import com.telefonica.centroseducativos.model.PreguntasEncuesta;
import com.telefonica.centroseducativos.model.RolUsuario;
import com.telefonica.centroseducativos.model.impl.CentroEducativoImpl;
import com.telefonica.centroseducativos.model.impl.ComunidadAutonomaImpl;
import com.telefonica.centroseducativos.model.impl.EvaluacionesCEImpl;
import com.telefonica.centroseducativos.model.impl.PaisImpl;
import com.telefonica.centroseducativos.model.impl.PreguntasEncuestaImpl;
import com.telefonica.centroseducativos.model.impl.RolUsuarioImpl;
import com.telefonica.centroseducativos.model.impl.UsuarioImpl;
import com.telefonica.centroseducativos.service.CentroEducativoLocalServiceUtil;
import com.telefonica.centroseducativos.service.ComunidadAutonomaLocalServiceUtil;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;
import com.telefonica.centroseducativos.service.PaisLocalServiceUtil;
import com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil;
import com.telefonica.centroseducativos.service.UsuarioLocalServiceUtil;
import com.telefonica.centroseducativos.service.impl.RolUsuarioServiceImpl;

/**
 * Portlet implementation class Registro
 */
public class Registro extends MVCPortlet {

	private static final String RECOGER_DATOS_ENCUESTA = "recogerDatosEncuesta";
	// inicializar vista registro
	private static final String VISTA_DESTINO = "vista_destino";
	private static final String PROCESAR_REGISTRO = "procesarRegistro";
	
	private String registroTemplate;
	private String viewTemplate;
	private String enviadoTemplate;


	private static Log _log = LogFactoryUtil.getLog(Registro.class);

	// iniciar portlet
	public void init() throws PortletException {
		super.init();
		registroTemplate = getInitParameter("registro-template");
		viewTemplate = getInitParameter("view-template");
		enviadoTemplate = getInitParameter("enviado-template");
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String vista = renderRequest.getParameter(VISTA_DESTINO);

		if (vista != null) {
			switch (vista) {

			case "view":
				try {
					List<PreguntasEncuesta> preguntas = PreguntasEncuestaLocalServiceUtil.getPreguntasEncuestas(0,
							PreguntasEncuestaLocalServiceUtil.getPreguntasEncuestasCount());

					renderRequest.setAttribute("preguntas", preguntas);
				} catch (SystemException e1) {
					e1.printStackTrace();
				}

				include(viewTemplate, renderRequest, renderResponse);

				try {
					renderRequest.setAttribute("pregunta", PreguntasEncuestaLocalServiceUtil.getPreguntasEncuesta(1));
				} catch (PortalException e) {
						e.printStackTrace();
				} catch (SystemException e) {
						e.printStackTrace();
				}
		

				break;
			case "registro":
				include(registroTemplate, renderRequest, renderResponse);
				break;
			case "enviado":
				include(enviadoTemplate, renderRequest, renderResponse);
				break;
			}
		} else {
			try {
				include(registroTemplate, renderRequest, renderResponse);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@ProcessAction(name = PROCESAR_REGISTRO)
	public void procesarRegistro(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, PortalException {

		int idColegio = Integer.parseInt(actionRequest.getParameter("colegio"));
		String nombre = actionRequest.getParameter("nombre");
		String apellido = actionRequest.getParameter("apellido");
		String email = actionRequest.getParameter("email");
		int idRol = Integer.parseInt(actionRequest.getParameter("perfil"));
		String pais = actionRequest.getParameter("pais");
		String comunidadAutonoma = actionRequest.getParameter("comunidadAutonoma");
		String cursoAcademico = actionRequest.getParameter("cursoAcademico");
		String password = actionRequest.getParameter("password");
		
		
		try {

			// Creamos el usuario de Liferay con el id generado de usuario
			User userLiferay = crearUsuarioLiferay(nombre, email, nombre + apellido, password);
			userLiferay.setPasswordReset(false);
			UserLocalServiceUtil.updateUser(userLiferay);

			UsuarioImpl usuario = new UsuarioImpl();

			// Agregar la informacion del usuario al servicio

			usuario.setIdce(idColegio);
			usuario.setCursoAcademico(cursoAcademico);
			usuario.setIdrol(idRol);
			usuario.setHaContestadoLaEncuesta(false);
			usuario.setUsuarioId(userLiferay.getUserId());

			UsuarioLocalServiceUtil.addUsuario(usuario);
			UserLocalServiceUtil.addOrganizationUser(idColegio, userLiferay.getUserId());
			RoleLocalServiceUtil.addUserRole(userLiferay.getUserId(),idRol );
			UserLocalServiceUtil.addRoleUser(userLiferay.getUserId(), idRol );
			
			actionRequest.getPortletSession().setAttribute("idUsuario", userLiferay.getUserId());
			// Rellenamos los datos del usuario de Liferay CAMPOS REQUERIDOS


			// si es correcto lo mandamos a una pagina
			actionResponse.setRenderParameter(VISTA_DESTINO, "view");

		} catch (SystemException e) {

			// Mensaje de rellenar campos
			// y si la validacion no sale bien
			actionResponse.setRenderParameter(VISTA_DESTINO, "registro");

			e.printStackTrace();

		}

	}

	@ProcessAction(name = RECOGER_DATOS_ENCUESTA)
	public void recogerDatosEncuesta(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, PortalException, SystemException {

		long id = (long) actionRequest.getPortletSession().getAttribute("idUsuario");


		UsuarioImpl usuario = new UsuarioImpl();
		usuario = (UsuarioImpl) UsuarioLocalServiceUtil.getUsuario(id);

		int idce = usuario.getIdce();
		int idrol = usuario.getIdrol();

		// datos de la encuesta


		String[] numpreguntas= new String[PreguntasEncuestaLocalServiceUtil.getPreguntasEncuestasCount()];
		String[] notapreguntas= new String[PreguntasEncuestaLocalServiceUtil.getPreguntasEncuestasCount()];
		
		//el id encuesta, es el numero de preguntas que hay registradas en la BBDD, simplificacion de clave única
		int p=EvaluacionesCELocalServiceUtil.getEvaluacionesCEsCount();
		
		EvaluacionesCEImpl evaluacion = new EvaluacionesCEImpl();
		for (int i = 0; i < PreguntasEncuestaLocalServiceUtil.getPreguntasEncuestasCount(); i++) {

			numpreguntas[i]= actionRequest.getParameter("numpregunta" + i);
			notapreguntas[i]= actionRequest.getParameter("notapregunta" + i);
			
			int numpregunta = Integer.parseInt(numpreguntas[i]);
			int notapregunta = Integer.parseInt(notapreguntas[i]);

			try {
				evaluacion.setIdencuesta(p);
				evaluacion.setIdce(idce);
				evaluacion.setIdrol(idrol);
				evaluacion.setNumpregunta(numpregunta);
				evaluacion.setNotapregunta(notapregunta);
				EvaluacionesCELocalServiceUtil.addEvaluacionesCE(evaluacion);

				actionResponse.setRenderParameter(VISTA_DESTINO, "enviado");

			} catch (Exception e) {
				actionRequest.setAttribute("mensajeDeError", "ERROR");
				// 6 Elegir la vista
				actionResponse.setRenderParameter(VISTA_DESTINO, "view");
			}
		}
		usuario.setHaContestadoLaEncuesta(true);
		UsuarioLocalServiceUtil.updateUsuario(usuario);

		
	}

	private User crearUsuarioLiferay(String firstName, String email, String screenName2, String contrasenya)
			throws SystemException, PortalException {

		long creatorUserId = 0;
		boolean autoPassword = false;
		String password1 = contrasenya;
		String password2 = contrasenya;
		boolean autoScreenName = false;
		String screenName = screenName2;
		String emailAddress = email;
		String openId = StringPool.BLANK;
		Locale locale = LocaleUtil.getDefault();
		String middleName = StringPool.BLANK;
		String lastName = firstName;
		int prefixId = 0;
		int suffixId = 0;
		boolean male = true;
		int birthdayMonth = Calendar.JANUARY;
		int birthdayDay = 1;
		int birthdayYear = 1970;
		String jobTitle = StringPool.BLANK;
		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null;
		long[] userGroupIds = null;
		boolean sendEmail = false;
		long companyId = CompanyLocalServiceUtil.getCompanies().get(0).getCompanyId();
		ServiceContext serviceContext = new ServiceContext();

		User userToCreate = UserLocalServiceUtil.addUser(creatorUserId, companyId, autoPassword, password1, password2,
				autoScreenName, screenName, emailAddress, 0, openId, locale, firstName, middleName, lastName, prefixId,
				suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds,
				userGroupIds, sendEmail, serviceContext);

		return userToCreate;
	}

}
