package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CategoriaPreguntaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaLocalService
 * @generated
 */
public class CategoriaPreguntaLocalServiceWrapper
    implements CategoriaPreguntaLocalService,
        ServiceWrapper<CategoriaPreguntaLocalService> {
    private CategoriaPreguntaLocalService _categoriaPreguntaLocalService;

    public CategoriaPreguntaLocalServiceWrapper(
        CategoriaPreguntaLocalService categoriaPreguntaLocalService) {
        _categoriaPreguntaLocalService = categoriaPreguntaLocalService;
    }

    /**
    * Adds the categoria pregunta to the database. Also notifies the appropriate model listeners.
    *
    * @param categoriaPregunta the categoria pregunta
    * @return the categoria pregunta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta addCategoriaPregunta(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.addCategoriaPregunta(categoriaPregunta);
    }

    /**
    * Creates a new categoria pregunta with the primary key. Does not add the categoria pregunta to the database.
    *
    * @param idcategoria the primary key for the new categoria pregunta
    * @return the new categoria pregunta
    */
    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta createCategoriaPregunta(
        int idcategoria) {
        return _categoriaPreguntaLocalService.createCategoriaPregunta(idcategoria);
    }

    /**
    * Deletes the categoria pregunta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta that was removed
    * @throws PortalException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta deleteCategoriaPregunta(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.deleteCategoriaPregunta(idcategoria);
    }

    /**
    * Deletes the categoria pregunta from the database. Also notifies the appropriate model listeners.
    *
    * @param categoriaPregunta the categoria pregunta
    * @return the categoria pregunta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta deleteCategoriaPregunta(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.deleteCategoriaPregunta(categoriaPregunta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _categoriaPreguntaLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta fetchCategoriaPregunta(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.fetchCategoriaPregunta(idcategoria);
    }

    /**
    * Returns the categoria pregunta with the primary key.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta
    * @throws PortalException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta getCategoriaPregunta(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.getCategoriaPregunta(idcategoria);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the categoria preguntas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of categoria preguntas
    * @param end the upper bound of the range of categoria preguntas (not inclusive)
    * @return the range of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> getCategoriaPreguntas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.getCategoriaPreguntas(start, end);
    }

    /**
    * Returns the number of categoria preguntas.
    *
    * @return the number of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCategoriaPreguntasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.getCategoriaPreguntasCount();
    }

    /**
    * Updates the categoria pregunta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param categoriaPregunta the categoria pregunta
    * @return the categoria pregunta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta updateCategoriaPregunta(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _categoriaPreguntaLocalService.updateCategoriaPregunta(categoriaPregunta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _categoriaPreguntaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _categoriaPreguntaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _categoriaPreguntaLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CategoriaPreguntaLocalService getWrappedCategoriaPreguntaLocalService() {
        return _categoriaPreguntaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCategoriaPreguntaLocalService(
        CategoriaPreguntaLocalService categoriaPreguntaLocalService) {
        _categoriaPreguntaLocalService = categoriaPreguntaLocalService;
    }

    @Override
    public CategoriaPreguntaLocalService getWrappedService() {
        return _categoriaPreguntaLocalService;
    }

    @Override
    public void setWrappedService(
        CategoriaPreguntaLocalService categoriaPreguntaLocalService) {
        _categoriaPreguntaLocalService = categoriaPreguntaLocalService;
    }
}
