package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.Usuario;
import com.telefonica.centroseducativos.service.UsuarioLocalServiceUtil;

/**
 * The extended model base implementation for the Usuario service. Represents a row in the &quot;CentrosEducativos_Usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UsuarioImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioImpl
 * @see com.telefonica.centroseducativos.model.Usuario
 * @generated
 */
public abstract class UsuarioBaseImpl extends UsuarioModelImpl
    implements Usuario {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a usuario model instance should use the {@link Usuario} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UsuarioLocalServiceUtil.addUsuario(this);
        } else {
            UsuarioLocalServiceUtil.updateUsuario(this);
        }
    }
}
