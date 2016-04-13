package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.Usuario;
import com.telefonica.centroseducativos.service.UsuarioLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UsuarioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsuarioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UsuarioLocalServiceUtil.getService());
        setClass(Usuario.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("usuarioId");
    }
}
