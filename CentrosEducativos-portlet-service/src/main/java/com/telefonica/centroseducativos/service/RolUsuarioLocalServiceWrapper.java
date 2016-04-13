package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RolUsuarioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuarioLocalService
 * @generated
 */
public class RolUsuarioLocalServiceWrapper implements RolUsuarioLocalService,
    ServiceWrapper<RolUsuarioLocalService> {
    private RolUsuarioLocalService _rolUsuarioLocalService;

    public RolUsuarioLocalServiceWrapper(
        RolUsuarioLocalService rolUsuarioLocalService) {
        _rolUsuarioLocalService = rolUsuarioLocalService;
    }

    /**
    * Adds the rol usuario to the database. Also notifies the appropriate model listeners.
    *
    * @param rolUsuario the rol usuario
    * @return the rol usuario that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.RolUsuario addRolUsuario(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.addRolUsuario(rolUsuario);
    }

    /**
    * Creates a new rol usuario with the primary key. Does not add the rol usuario to the database.
    *
    * @param idrol the primary key for the new rol usuario
    * @return the new rol usuario
    */
    @Override
    public com.telefonica.centroseducativos.model.RolUsuario createRolUsuario(
        int idrol) {
        return _rolUsuarioLocalService.createRolUsuario(idrol);
    }

    /**
    * Deletes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario that was removed
    * @throws PortalException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.RolUsuario deleteRolUsuario(
        int idrol)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.deleteRolUsuario(idrol);
    }

    /**
    * Deletes the rol usuario from the database. Also notifies the appropriate model listeners.
    *
    * @param rolUsuario the rol usuario
    * @return the rol usuario that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.RolUsuario deleteRolUsuario(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.deleteRolUsuario(rolUsuario);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _rolUsuarioLocalService.dynamicQuery();
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
        return _rolUsuarioLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rolUsuarioLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rolUsuarioLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _rolUsuarioLocalService.dynamicQueryCount(dynamicQuery);
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
        return _rolUsuarioLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.RolUsuario fetchRolUsuario(
        int idrol) throws com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.fetchRolUsuario(idrol);
    }

    /**
    * Returns the rol usuario with the primary key.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario
    * @throws PortalException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.RolUsuario getRolUsuario(
        int idrol)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.getRolUsuario(idrol);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the rol usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rol usuarios
    * @param end the upper bound of the range of rol usuarios (not inclusive)
    * @return the range of rol usuarios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.RolUsuario> getRolUsuarios(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.getRolUsuarios(start, end);
    }

    /**
    * Returns the number of rol usuarios.
    *
    * @return the number of rol usuarios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRolUsuariosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.getRolUsuariosCount();
    }

    /**
    * Updates the rol usuario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rolUsuario the rol usuario
    * @return the rol usuario that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.RolUsuario updateRolUsuario(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolUsuarioLocalService.updateRolUsuario(rolUsuario);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rolUsuarioLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rolUsuarioLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rolUsuarioLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RolUsuarioLocalService getWrappedRolUsuarioLocalService() {
        return _rolUsuarioLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRolUsuarioLocalService(
        RolUsuarioLocalService rolUsuarioLocalService) {
        _rolUsuarioLocalService = rolUsuarioLocalService;
    }

    @Override
    public RolUsuarioLocalService getWrappedService() {
        return _rolUsuarioLocalService;
    }

    @Override
    public void setWrappedService(RolUsuarioLocalService rolUsuarioLocalService) {
        _rolUsuarioLocalService = rolUsuarioLocalService;
    }
}
