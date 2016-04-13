package com.telefonica.centroseducativos.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for RolUsuario. This utility wraps
 * {@link com.telefonica.centroseducativos.service.impl.RolUsuarioLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuarioLocalService
 * @see com.telefonica.centroseducativos.service.base.RolUsuarioLocalServiceBaseImpl
 * @see com.telefonica.centroseducativos.service.impl.RolUsuarioLocalServiceImpl
 * @generated
 */
public class RolUsuarioLocalServiceUtil {
    private static RolUsuarioLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.telefonica.centroseducativos.service.impl.RolUsuarioLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the rol usuario to the database. Also notifies the appropriate model listeners.
    *
    * @param rolUsuario the rol usuario
    * @return the rol usuario that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario addRolUsuario(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRolUsuario(rolUsuario);
    }

    /**
    * Creates a new rol usuario with the primary key. Does not add the rol usuario to the database.
    *
    * @param idrol the primary key for the new rol usuario
    * @return the new rol usuario
    */
    public static com.telefonica.centroseducativos.model.RolUsuario createRolUsuario(
        int idrol) {
        return getService().createRolUsuario(idrol);
    }

    /**
    * Deletes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario that was removed
    * @throws PortalException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario deleteRolUsuario(
        int idrol)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRolUsuario(idrol);
    }

    /**
    * Deletes the rol usuario from the database. Also notifies the appropriate model listeners.
    *
    * @param rolUsuario the rol usuario
    * @return the rol usuario that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario deleteRolUsuario(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRolUsuario(rolUsuario);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.telefonica.centroseducativos.model.RolUsuario fetchRolUsuario(
        int idrol) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRolUsuario(idrol);
    }

    /**
    * Returns the rol usuario with the primary key.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario
    * @throws PortalException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario getRolUsuario(
        int idrol)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRolUsuario(idrol);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.telefonica.centroseducativos.model.RolUsuario> getRolUsuarios(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRolUsuarios(start, end);
    }

    /**
    * Returns the number of rol usuarios.
    *
    * @return the number of rol usuarios
    * @throws SystemException if a system exception occurred
    */
    public static int getRolUsuariosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRolUsuariosCount();
    }

    /**
    * Updates the rol usuario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rolUsuario the rol usuario
    * @return the rol usuario that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario updateRolUsuario(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRolUsuario(rolUsuario);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static RolUsuarioLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RolUsuarioLocalService.class.getName());

            if (invokableLocalService instanceof RolUsuarioLocalService) {
                _service = (RolUsuarioLocalService) invokableLocalService;
            } else {
                _service = new RolUsuarioLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RolUsuarioLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RolUsuarioLocalService service) {
    }
}
