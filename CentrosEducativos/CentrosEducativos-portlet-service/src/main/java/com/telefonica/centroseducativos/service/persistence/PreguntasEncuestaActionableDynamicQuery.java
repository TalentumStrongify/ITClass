package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.PreguntasEncuesta;
import com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PreguntasEncuestaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PreguntasEncuestaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PreguntasEncuestaLocalServiceUtil.getService());
        setClass(PreguntasEncuesta.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("numpregunta");
    }
}
