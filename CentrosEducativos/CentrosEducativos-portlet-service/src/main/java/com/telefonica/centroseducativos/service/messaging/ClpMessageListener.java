package com.telefonica.centroseducativos.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.telefonica.centroseducativos.service.CategoriaPreguntaLocalServiceUtil;
import com.telefonica.centroseducativos.service.CategoriaPreguntaServiceUtil;
import com.telefonica.centroseducativos.service.CentroEducativoLocalServiceUtil;
import com.telefonica.centroseducativos.service.CentroEducativoServiceUtil;
import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.ComunidadAutonomaLocalServiceUtil;
import com.telefonica.centroseducativos.service.ComunidadAutonomaServiceUtil;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;
import com.telefonica.centroseducativos.service.EvaluacionesCEServiceUtil;
import com.telefonica.centroseducativos.service.PaisLocalServiceUtil;
import com.telefonica.centroseducativos.service.PaisServiceUtil;
import com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil;
import com.telefonica.centroseducativos.service.PreguntasEncuestaServiceUtil;
import com.telefonica.centroseducativos.service.RolUsuarioLocalServiceUtil;
import com.telefonica.centroseducativos.service.RolUsuarioServiceUtil;
import com.telefonica.centroseducativos.service.UsuarioLocalServiceUtil;
import com.telefonica.centroseducativos.service.UsuarioServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            CategoriaPreguntaLocalServiceUtil.clearService();

            CategoriaPreguntaServiceUtil.clearService();
            CentroEducativoLocalServiceUtil.clearService();

            CentroEducativoServiceUtil.clearService();
            ComunidadAutonomaLocalServiceUtil.clearService();

            ComunidadAutonomaServiceUtil.clearService();
            EvaluacionesCELocalServiceUtil.clearService();

            EvaluacionesCEServiceUtil.clearService();
            PaisLocalServiceUtil.clearService();

            PaisServiceUtil.clearService();
            PreguntasEncuestaLocalServiceUtil.clearService();

            PreguntasEncuestaServiceUtil.clearService();
            RolUsuarioLocalServiceUtil.clearService();

            RolUsuarioServiceUtil.clearService();
            UsuarioLocalServiceUtil.clearService();

            UsuarioServiceUtil.clearService();
        }
    }
}
