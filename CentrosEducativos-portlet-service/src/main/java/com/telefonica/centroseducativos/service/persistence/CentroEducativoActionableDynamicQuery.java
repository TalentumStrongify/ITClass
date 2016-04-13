package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.CentroEducativo;
import com.telefonica.centroseducativos.service.CentroEducativoLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CentroEducativoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CentroEducativoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CentroEducativoLocalServiceUtil.getService());
        setClass(CentroEducativo.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idce");
    }
}
