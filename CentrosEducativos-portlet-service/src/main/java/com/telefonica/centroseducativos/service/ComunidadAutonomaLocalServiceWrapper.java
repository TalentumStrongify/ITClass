package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ComunidadAutonomaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonomaLocalService
 * @generated
 */
public class ComunidadAutonomaLocalServiceWrapper
    implements ComunidadAutonomaLocalService,
        ServiceWrapper<ComunidadAutonomaLocalService> {
    private ComunidadAutonomaLocalService _comunidadAutonomaLocalService;

    public ComunidadAutonomaLocalServiceWrapper(
        ComunidadAutonomaLocalService comunidadAutonomaLocalService) {
        _comunidadAutonomaLocalService = comunidadAutonomaLocalService;
    }

    /**
    * Adds the comunidad autonoma to the database. Also notifies the appropriate model listeners.
    *
    * @param comunidadAutonoma the comunidad autonoma
    * @return the comunidad autonoma that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma addComunidadAutonoma(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.addComunidadAutonoma(comunidadAutonoma);
    }

    /**
    * Creates a new comunidad autonoma with the primary key. Does not add the comunidad autonoma to the database.
    *
    * @param idca the primary key for the new comunidad autonoma
    * @return the new comunidad autonoma
    */
    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma createComunidadAutonoma(
        int idca) {
        return _comunidadAutonomaLocalService.createComunidadAutonoma(idca);
    }

    /**
    * Deletes the comunidad autonoma with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idca the primary key of the comunidad autonoma
    * @return the comunidad autonoma that was removed
    * @throws PortalException if a comunidad autonoma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma deleteComunidadAutonoma(
        int idca)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.deleteComunidadAutonoma(idca);
    }

    /**
    * Deletes the comunidad autonoma from the database. Also notifies the appropriate model listeners.
    *
    * @param comunidadAutonoma the comunidad autonoma
    * @return the comunidad autonoma that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma deleteComunidadAutonoma(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.deleteComunidadAutonoma(comunidadAutonoma);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _comunidadAutonomaLocalService.dynamicQuery();
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
        return _comunidadAutonomaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _comunidadAutonomaLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _comunidadAutonomaLocalService.dynamicQuery(dynamicQuery, start,
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
        return _comunidadAutonomaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _comunidadAutonomaLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma fetchComunidadAutonoma(
        int idca) throws com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.fetchComunidadAutonoma(idca);
    }

    /**
    * Returns the comunidad autonoma with the primary key.
    *
    * @param idca the primary key of the comunidad autonoma
    * @return the comunidad autonoma
    * @throws PortalException if a comunidad autonoma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma getComunidadAutonoma(
        int idca)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.getComunidadAutonoma(idca);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the comunidad autonomas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of comunidad autonomas
    * @param end the upper bound of the range of comunidad autonomas (not inclusive)
    * @return the range of comunidad autonomas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.ComunidadAutonoma> getComunidadAutonomas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.getComunidadAutonomas(start, end);
    }

    /**
    * Returns the number of comunidad autonomas.
    *
    * @return the number of comunidad autonomas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getComunidadAutonomasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.getComunidadAutonomasCount();
    }

    /**
    * Updates the comunidad autonoma in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param comunidadAutonoma the comunidad autonoma
    * @return the comunidad autonoma that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma updateComunidadAutonoma(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _comunidadAutonomaLocalService.updateComunidadAutonoma(comunidadAutonoma);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _comunidadAutonomaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _comunidadAutonomaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _comunidadAutonomaLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ComunidadAutonomaLocalService getWrappedComunidadAutonomaLocalService() {
        return _comunidadAutonomaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedComunidadAutonomaLocalService(
        ComunidadAutonomaLocalService comunidadAutonomaLocalService) {
        _comunidadAutonomaLocalService = comunidadAutonomaLocalService;
    }

    @Override
    public ComunidadAutonomaLocalService getWrappedService() {
        return _comunidadAutonomaLocalService;
    }

    @Override
    public void setWrappedService(
        ComunidadAutonomaLocalService comunidadAutonomaLocalService) {
        _comunidadAutonomaLocalService = comunidadAutonomaLocalService;
    }
}
