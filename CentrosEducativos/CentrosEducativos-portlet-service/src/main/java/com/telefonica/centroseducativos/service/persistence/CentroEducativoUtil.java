package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.centroseducativos.model.CentroEducativo;

import java.util.List;

/**
 * The persistence utility for the centro educativo service. This utility wraps {@link CentroEducativoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativoPersistence
 * @see CentroEducativoPersistenceImpl
 * @generated
 */
public class CentroEducativoUtil {
    private static CentroEducativoPersistence _persistence;

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
    public static void clearCache(CentroEducativo centroEducativo) {
        getPersistence().clearCache(centroEducativo);
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
    public static List<CentroEducativo> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CentroEducativo> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CentroEducativo> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CentroEducativo update(CentroEducativo centroEducativo)
        throws SystemException {
        return getPersistence().update(centroEducativo);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CentroEducativo update(CentroEducativo centroEducativo,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(centroEducativo, serviceContext);
    }

    /**
    * Caches the centro educativo in the entity cache if it is enabled.
    *
    * @param centroEducativo the centro educativo
    */
    public static void cacheResult(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo) {
        getPersistence().cacheResult(centroEducativo);
    }

    /**
    * Caches the centro educativos in the entity cache if it is enabled.
    *
    * @param centroEducativos the centro educativos
    */
    public static void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.CentroEducativo> centroEducativos) {
        getPersistence().cacheResult(centroEducativos);
    }

    /**
    * Creates a new centro educativo with the primary key. Does not add the centro educativo to the database.
    *
    * @param idce the primary key for the new centro educativo
    * @return the new centro educativo
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo create(
        int idce) {
        return getPersistence().create(idce);
    }

    /**
    * Removes the centro educativo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo that was removed
    * @throws com.telefonica.centroseducativos.NoSuchCentroEducativoException if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo remove(
        int idce)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchCentroEducativoException {
        return getPersistence().remove(idce);
    }

    public static com.telefonica.centroseducativos.model.CentroEducativo updateImpl(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(centroEducativo);
    }

    /**
    * Returns the centro educativo with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchCentroEducativoException} if it could not be found.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo
    * @throws com.telefonica.centroseducativos.NoSuchCentroEducativoException if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo findByPrimaryKey(
        int idce)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchCentroEducativoException {
        return getPersistence().findByPrimaryKey(idce);
    }

    /**
    * Returns the centro educativo with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo, or <code>null</code> if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo fetchByPrimaryKey(
        int idce) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idce);
    }

    /**
    * Returns all the centro educativos.
    *
    * @return the centro educativos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.CentroEducativo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.telefonica.centroseducativos.model.CentroEducativo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the centro educativos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of centro educativos
    * @param end the upper bound of the range of centro educativos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of centro educativos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.CentroEducativo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the centro educativos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of centro educativos.
    *
    * @return the number of centro educativos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CentroEducativoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CentroEducativoPersistence) PortletBeanLocatorUtil.locate(com.telefonica.centroseducativos.service.ClpSerializer.getServletContextName(),
                    CentroEducativoPersistence.class.getName());

            ReferenceRegistry.registerReference(CentroEducativoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CentroEducativoPersistence persistence) {
    }
}
