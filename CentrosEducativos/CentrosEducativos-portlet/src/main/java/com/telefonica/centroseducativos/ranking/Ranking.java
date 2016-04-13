package com.telefonica.centroseducativos.ranking;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.centroseducativos.model.CentroEducativo;
import com.telefonica.centroseducativos.model.EvaluacionesCE;
import com.telefonica.centroseducativos.negocio.CentrosEducativosNegocio;
import com.telefonica.centroseducativos.service.CentroEducativoLocalServiceUtil;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;

/**
 * Portlet implementation class Ranking
 */
public class Ranking extends MVCPortlet {

	public void init() throws PortletException {
		super.init();
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		try {
			// Descargar las claves de roles, centros educativos etc
			List<CentroEducativo> centrosEducativos = CentroEducativoLocalServiceUtil.getCentroEducativos(0,
				CentroEducativoLocalServiceUtil.getCentroEducativosCount());

			List<RankingResultado> resultadoRanking = CentrosEducativosNegocio.listadoRanking(centrosEducativos);

			// Guardo la lista nueva de usuarios que he creado en un JSON

			String evaluacionesJSON = JSONFactoryUtil.serialize(resultadoRanking);
			
			// Lo envio a las vistas
			resourceResponse.getWriter().print(evaluacionesJSON);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
