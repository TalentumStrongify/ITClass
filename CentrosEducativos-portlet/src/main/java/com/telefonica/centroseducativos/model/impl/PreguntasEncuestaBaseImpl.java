package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.PreguntasEncuesta;
import com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil;

/**
 * The extended model base implementation for the PreguntasEncuesta service. Represents a row in the &quot;CentrosEducativos_PreguntasEncuesta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PreguntasEncuestaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuestaImpl
 * @see com.telefonica.centroseducativos.model.PreguntasEncuesta
 * @generated
 */
public abstract class PreguntasEncuestaBaseImpl
    extends PreguntasEncuestaModelImpl implements PreguntasEncuesta {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a preguntas encuesta model instance should use the {@link PreguntasEncuesta} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PreguntasEncuestaLocalServiceUtil.addPreguntasEncuesta(this);
        } else {
            PreguntasEncuestaLocalServiceUtil.updatePreguntasEncuesta(this);
        }
    }
}
