package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.centroseducativos.model.ComunidadAutonoma;

import java.util.List;

/**
 * The persistence utility for the comunidad autonoma service. This utility wraps {@link ComunidadAutonomaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonomaPersistence
 * @see ComunidadAutonomaPersistenceImpl
 * @generated
 */
public class ComunidadAutonomaUtil {
    private static ComunidadAutonomaPersistence _persistence;

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
    public static void clearCache(ComunidadAutonoma comunidadAutonoma) {
        getPersistence().clearCache(comunidadAutonoma);
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
    public static List<ComunidadAutonoma> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ComunidadAutonoma> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ComunidadAutonoma> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static ComunidadAutonoma update(ComunidadAutonoma comunidadAutonoma)
        throws SystemException {
        return getPersistence().update(comunidadAutonoma);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static ComunidadAutonoma update(
        ComunidadAutonoma comunidadAutonoma, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(comunidadAutonoma, serviceContext);
    }

    /**
    * Caches the comunidad autonoma in the entity cache if it is enabled.
    *
    * @param comunidadAutonoma the comunidad autonoma
    */
    public static void cacheResult(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma) {
        getPersistence().cacheResult(comunidadAutonoma);
    }

    /**
    * Caches the comunidad autonomas in the entity cache if it is enabled.
    *
    * @param comunidadAutonomas the comunidad autonomas
    */
    public static void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.ComunidadAutonoma> comunidadAutonomas) {
        getPersistence().cacheResult(comunidadAutonomas);
    }

    /**
    * Creates a new comunidad autonoma with the primary key. Does not add the comunidad autonoma to the database.
    *
    * @param idca the primary key for the new comunidad autonoma
    * @return the new comunidad autonoma
    */
    public static com.telefonica.centroseducativos.model.ComunidadAutonoma create(
        int idca) {
        return getPersistence().create(idca);
    }

    /**
    * Removes the comunidad autonoma with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idca the primary key of the comunidad autonoma
    * @return the comunidad autonoma that was removed
    * @throws com.telefonica.centroseducativos.NoSuchComunidadAutonomaException if a comunidad autonoma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.ComunidadAutonoma remove(
        int idca)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchComunidadAutonomaException {
        return getPersistence().remove(idca);
    }

    public static com.telefonica.centroseducativos.model.ComunidadAutonoma updateImpl(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(comunidadAutonoma);
    }

    /**
    * Returns the comunidad autonoma with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchComunidadAutonomaException} if it could not be found.
    *
    * @param idca the primary key of the comunidad autonoma
    * @return the comunidad autonoma
    * @throws com.telefonica.centroseducativos.NoSuchComunidadAutonomaException if a comunidad autonoma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.ComunidadAutonoma findByPrimaryKey(
        int idca)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchComunidadAutonomaException {
        return getPersistence().findByPrimaryKey(idca);
    }

    /**
    * Returns the comunidad autonoma with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idca the primary key of the comunidad autonoma
    * @return the comunidad autonoma, or <code>null</code> if a comunidad autonoma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.ComunidadAutonoma fetchByPrimaryKey(
        int idca) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idca);
    }

    /**
    * Returns all the comunidad autonomas.
    *
    * @return the comunidad autonomas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.ComunidadAutonoma> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.telefonica.centroseducativos.model.ComunidadAutonoma> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the comunidad autonomas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of comunidad autonomas
    * @param end the upper bound of the range of comunidad autonomas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of comunidad autonomas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.ComunidadAutonoma> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the comunidad autonomas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of comunidad autonomas.
    *
    * @return the number of comunidad autonomas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ComunidadAutonomaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ComunidadAutonomaPersistence) PortletBeanLocatorUtil.locate(com.telefonica.centroseducativos.service.ClpSerializer.getServletContextName(),
                    ComunidadAutonomaPersistence.class.getName());

            ReferenceRegistry.registerReference(ComunidadAutonomaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ComunidadAutonomaPersistence persistence) {
    }
}
