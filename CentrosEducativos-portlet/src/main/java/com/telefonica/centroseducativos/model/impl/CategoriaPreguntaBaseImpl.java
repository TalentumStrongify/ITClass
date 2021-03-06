package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.CategoriaPregunta;
import com.telefonica.centroseducativos.service.CategoriaPreguntaLocalServiceUtil;

/**
 * The extended model base implementation for the CategoriaPregunta service. Represents a row in the &quot;CentrosEducativos_CategoriaPregunta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CategoriaPreguntaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaImpl
 * @see com.telefonica.centroseducativos.model.CategoriaPregunta
 * @generated
 */
public abstract class CategoriaPreguntaBaseImpl
    extends CategoriaPreguntaModelImpl implements CategoriaPregunta {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a categoria pregunta model instance should use the {@link CategoriaPregunta} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CategoriaPreguntaLocalServiceUtil.addCategoriaPregunta(this);
        } else {
            CategoriaPreguntaLocalServiceUtil.updateCategoriaPregunta(this);
        }
    }
}
