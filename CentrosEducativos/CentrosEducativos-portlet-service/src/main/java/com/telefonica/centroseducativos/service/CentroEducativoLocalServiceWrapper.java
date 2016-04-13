package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CentroEducativoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativoLocalService
 * @generated
 */
public class CentroEducativoLocalServiceWrapper
    implements CentroEducativoLocalService,
        ServiceWrapper<CentroEducativoLocalService> {
    private CentroEducativoLocalService _centroEducativoLocalService;

    public CentroEducativoLocalServiceWrapper(
        CentroEducativoLocalService centroEducativoLocalService) {
        _centroEducativoLocalService = centroEducativoLocalService;
    }

    /**
    * Adds the centro educativo to the database. Also notifies the appropriate model listeners.
    *
    * @param centroEducativo the centro educativo
    * @return the centro educativo that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo addCentroEducativo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.addCentroEducativo(centroEducativo);
    }

    /**
    * Creates a new centro educativo with the primary key. Does not add the centro educativo to the database.
    *
    * @param idce the primary key for the new centro educativo
    * @return the new centro educativo
    */
    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo createCentroEducativo(
        int idce) {
        return _centroEducativoLocalService.createCentroEducativo(idce);
    }

    /**
    * Deletes the centro educativo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo that was removed
    * @throws PortalException if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo deleteCentroEducativo(
        int idce)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.deleteCentroEducativo(idce);
    }

    /**
    * Deletes the centro educativo from the database. Also notifies the appropriate model listeners.
    *
    * @param centroEducativo the centro educativo
    * @return the centro educativo that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo deleteCentroEducativo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.deleteCentroEducativo(centroEducativo);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _centroEducativoLocalService.dynamicQuery();
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
        return _centroEducativoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _centroEducativoLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _centroEducativoLocalService.dynamicQuery(dynamicQuery, start,
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
        return _centroEducativoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _centroEducativoLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo fetchCentroEducativo(
        int idce) throws com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.fetchCentroEducativo(idce);
    }

    /**
    * Returns the centro educativo with the primary key.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo
    * @throws PortalException if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo getCentroEducativo(
        int idce)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.getCentroEducativo(idce);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the centro educativos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of centro educativos
    * @param end the upper bound of the range of centro educativos (not inclusive)
    * @return the range of centro educativos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.CentroEducativo> getCentroEducativos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.getCentroEducativos(start, end);
    }

    /**
    * Returns the number of centro educativos.
    *
    * @return the number of centro educativos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCentroEducativosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.getCentroEducativosCount();
    }

    /**
    * Updates the centro educativo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param centroEducativo the centro educativo
    * @return the centro educativo that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo updateCentroEducativo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _centroEducativoLocalService.updateCentroEducativo(centroEducativo);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _centroEducativoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _centroEducativoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _centroEducativoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CentroEducativoLocalService getWrappedCentroEducativoLocalService() {
        return _centroEducativoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCentroEducativoLocalService(
        CentroEducativoLocalService centroEducativoLocalService) {
        _centroEducativoLocalService = centroEducativoLocalService;
    }

    @Override
    public CentroEducativoLocalService getWrappedService() {
        return _centroEducativoLocalService;
    }

    @Override
    public void setWrappedService(
        CentroEducativoLocalService centroEducativoLocalService) {
        _centroEducativoLocalService = centroEducativoLocalService;
    }
}
