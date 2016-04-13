package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.centroseducativos.model.EvaluacionesCE;

import java.util.List;

/**
 * The persistence utility for the evaluaciones c e service. This utility wraps {@link EvaluacionesCEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCEPersistence
 * @see EvaluacionesCEPersistenceImpl
 * @generated
 */
public class EvaluacionesCEUtil {
    private static EvaluacionesCEPersistence _persistence;

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
    public static void clearCache(EvaluacionesCE evaluacionesCE) {
        getPersistence().clearCache(evaluacionesCE);
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
    public static List<EvaluacionesCE> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EvaluacionesCE> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EvaluacionesCE> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EvaluacionesCE update(EvaluacionesCE evaluacionesCE)
        throws SystemException {
        return getPersistence().update(evaluacionesCE);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EvaluacionesCE update(EvaluacionesCE evaluacionesCE,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(evaluacionesCE, serviceContext);
    }

    /**
    * Caches the evaluaciones c e in the entity cache if it is enabled.
    *
    * @param evaluacionesCE the evaluaciones c e
    */
    public static void cacheResult(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE) {
        getPersistence().cacheResult(evaluacionesCE);
    }

    /**
    * Caches the evaluaciones c es in the entity cache if it is enabled.
    *
    * @param evaluacionesCEs the evaluaciones c es
    */
    public static void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> evaluacionesCEs) {
        getPersistence().cacheResult(evaluacionesCEs);
    }

    /**
    * Creates a new evaluaciones c e with the primary key. Does not add the evaluaciones c e to the database.
    *
    * @param evaluacionesCEPK the primary key for the new evaluaciones c e
    * @return the new evaluaciones c e
    */
    public static com.telefonica.centroseducativos.model.EvaluacionesCE create(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK) {
        return getPersistence().create(evaluacionesCEPK);
    }

    /**
    * Removes the evaluaciones c e with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e that was removed
    * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.EvaluacionesCE remove(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchEvaluacionesCEException {
        return getPersistence().remove(evaluacionesCEPK);
    }

    public static com.telefonica.centroseducativos.model.EvaluacionesCE updateImpl(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(evaluacionesCE);
    }

    /**
    * Returns the evaluaciones c e with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchEvaluacionesCEException} if it could not be found.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e
    * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.EvaluacionesCE findByPrimaryKey(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchEvaluacionesCEException {
        return getPersistence().findByPrimaryKey(evaluacionesCEPK);
    }

    /**
    * Returns the evaluaciones c e with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e, or <code>null</code> if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.EvaluacionesCE fetchByPrimaryKey(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(evaluacionesCEPK);
    }

    /**
    * Returns all the evaluaciones c es.
    *
    * @return the evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the evaluaciones c es.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of evaluaciones c es
    * @param end the upper bound of the range of evaluaciones c es (not inclusive)
    * @return the range of evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the evaluaciones c es.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of evaluaciones c es
    * @param end the upper bound of the range of evaluaciones c es (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the evaluaciones c es from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of evaluaciones c es.
    *
    * @return the number of evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EvaluacionesCEPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EvaluacionesCEPersistence) PortletBeanLocatorUtil.locate(com.telefonica.centroseducativos.service.ClpSerializer.getServletContextName(),
                    EvaluacionesCEPersistence.class.getName());

            ReferenceRegistry.registerReference(EvaluacionesCEUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EvaluacionesCEPersistence persistence) {
    }
}
