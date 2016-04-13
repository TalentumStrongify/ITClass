package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.ComunidadAutonoma;
import com.telefonica.centroseducativos.service.ComunidadAutonomaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ComunidadAutonomaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ComunidadAutonomaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ComunidadAutonomaLocalServiceUtil.getService());
        setClass(ComunidadAutonoma.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idca");
    }
}
