package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.RolUsuario;
import com.telefonica.centroseducativos.service.RolUsuarioLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RolUsuarioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RolUsuarioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RolUsuarioLocalServiceUtil.getService());
        setClass(RolUsuario.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idrol");
    }
}
