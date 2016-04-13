package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.centroseducativos.model.RolUsuario;

import java.util.List;

/**
 * The persistence utility for the rol usuario service. This utility wraps {@link RolUsuarioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuarioPersistence
 * @see RolUsuarioPersistenceImpl
 * @generated
 */
public class RolUsuarioUtil {
    private static RolUsuarioPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(RolUsuario rolUsuario) {
        getPersistence().clearCache(rolUsuario);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<RolUsuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<RolUsuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<RolUsuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static RolUsuario update(RolUsuario rolUsuario)
        throws SystemException {
        return getPersistence().update(rolUsuario);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static RolUsuario update(RolUsuario rolUsuario,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(rolUsuario, serviceContext);
    }

    /**
    * Caches the rol usuario in the entity cache if it is enabled.
    *
    * @param rolUsuario the rol usuario
    */
    public static void cacheResult(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario) {
        getPersistence().cacheResult(rolUsuario);
    }

    /**
    * Caches the rol usuarios in the entity cache if it is enabled.
    *
    * @param rolUsuarios the rol usuarios
    */
    public static void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.RolUsuario> rolUsuarios) {
        getPersistence().cacheResult(rolUsuarios);
    }

    /**
    * Creates a new rol usuario with the primary key. Does not add the rol usuario to the database.
    *
    * @param idrol the primary key for the new rol usuario
    * @return the new rol usuario
    */
    public static com.telefonica.centroseducativos.model.RolUsuario create(
        int idrol) {
        return getPersistence().create(idrol);
    }

    /**
    * Removes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario that was removed
    * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario remove(
        int idrol)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchRolUsuarioException {
        return getPersistence().remove(idrol);
    }

    public static com.telefonica.centroseducativos.model.RolUsuario updateImpl(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(rolUsuario);
    }

    /**
    * Returns the rol usuario with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchRolUsuarioException} if it could not be found.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario
    * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario findByPrimaryKey(
        int idrol)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchRolUsuarioException {
        return getPersistence().findByPrimaryKey(idrol);
    }

    /**
    * Returns the rol usuario with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario, or <code>null</code> if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.RolUsuario fetchByPrimaryKey(
        int idrol) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idrol);
    }

    /**
    * Returns all the rol usuarios.
    *
    * @return the rol usuarios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.RolUsuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.telefonica.centroseducativos.model.RolUsuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the rol usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rol usuarios
    * @param end the upper bound of the range of rol usuarios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rol usuarios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.RolUsuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the rol usuarios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of rol usuarios.
    *
    * @return the number of rol usuarios
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RolUsuarioPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RolUsuarioPersistence) PortletBeanLocatorUtil.locate(com.telefonica.centroseducativos.service.ClpSerializer.getServletContextName(),
                    RolUsuarioPersistence.class.getName());

            ReferenceRegistry.registerReference(RolUsuarioUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RolUsuarioPersistence persistence) {
    }
}
