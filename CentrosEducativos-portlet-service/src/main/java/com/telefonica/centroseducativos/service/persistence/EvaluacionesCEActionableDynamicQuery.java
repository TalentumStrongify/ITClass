package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.EvaluacionesCE;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EvaluacionesCEActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EvaluacionesCEActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EvaluacionesCELocalServiceUtil.getService());
        setClass(EvaluacionesCE.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idencuesta");
    }
}
