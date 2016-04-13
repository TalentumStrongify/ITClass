package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.centroseducativos.model.CategoriaPregunta;
import com.telefonica.centroseducativos.service.CategoriaPreguntaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CategoriaPreguntaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CategoriaPreguntaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CategoriaPreguntaLocalServiceUtil.getService());
        setClass(CategoriaPregunta.class);

        setClassLoader(com.telefonica.centroseducativos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idcategoria");
    }
}
