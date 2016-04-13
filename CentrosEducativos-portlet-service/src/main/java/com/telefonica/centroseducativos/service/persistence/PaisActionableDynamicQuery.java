package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.Pais;
import com.telefonica.centroseducativos.service.PaisLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PaisActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PaisActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PaisLocalServiceUtil.getService());
        setClass(Pais.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idpais");
    }
}
