package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaisLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PaisLocalService
 * @generated
 */
public class PaisLocalServiceWrapper implements PaisLocalService,
    ServiceWrapper<PaisLocalService> {
    private PaisLocalService _paisLocalService;

    public PaisLocalServiceWrapper(PaisLocalService paisLocalService) {
        _paisLocalService = paisLocalService;
    }

    /**
    * Adds the pais to the database. Also notifies the appropriate model listeners.
    *
    * @param pais the pais
    * @return the pais that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.Pais addPais(
        com.telefonica.centroseducativos.model.Pais pais)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.addPais(pais);
    }

    /**
    * Creates a new pais with the primary key. Does not add the pais to the database.
    *
    * @param idpais the primary key for the new pais
    * @return the new pais
    */
    @Override
    public com.telefonica.centroseducativos.model.Pais createPais(int idpais) {
        return _paisLocalService.createPais(idpais);
    }

    /**
    * Deletes the pais with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idpais the primary key of the pais
    * @return the pais that was removed
    * @throws PortalException if a pais with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.Pais deletePais(int idpais)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.deletePais(idpais);
    }

    /**
    * Deletes the pais from the database. Also notifies the appropriate model listeners.
    *
    * @param pais the pais
    * @return the pais that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.Pais deletePais(
        com.telefonica.centroseducativos.model.Pais pais)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.deletePais(pais);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paisLocalService.dynamicQuery();
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
        return _paisLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PaisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paisLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PaisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paisLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _paisLocalService.dynamicQueryCount(dynamicQuery);
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
        return _paisLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.Pais fetchPais(int idpais)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.fetchPais(idpais);
    }

    /**
    * Returns the pais with the primary key.
    *
    * @param idpais the primary key of the pais
    * @return the pais
    * @throws PortalException if a pais with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.Pais getPais(int idpais)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.getPais(idpais);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the paises.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PaisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of paises
    * @param end the upper bound of the range of paises (not inclusive)
    * @return the range of paises
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.Pais> getPaises(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.getPaises(start, end);
    }

    /**
    * Returns the number of paises.
    *
    * @return the number of paises
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaisesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.getPaisesCount();
    }

    /**
    * Updates the pais in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param pais the pais
    * @return the pais that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.Pais updatePais(
        com.telefonica.centroseducativos.model.Pais pais)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paisLocalService.updatePais(pais);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paisLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paisLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paisLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaisLocalService getWrappedPaisLocalService() {
        return _paisLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaisLocalService(PaisLocalService paisLocalService) {
        _paisLocalService = paisLocalService;
    }

    @Override
    public PaisLocalService getWrappedService() {
        return _paisLocalService;
    }

    @Override
    public void setWrappedService(PaisLocalService paisLocalService) {
        _paisLocalService = paisLocalService;
    }
}
