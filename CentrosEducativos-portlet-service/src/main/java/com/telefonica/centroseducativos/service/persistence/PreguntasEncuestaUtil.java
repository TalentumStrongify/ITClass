package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.centroseducativos.model.PreguntasEncuesta;

import java.util.List;

/**
 * The persistence utility for the preguntas encuesta service. This utility wraps {@link PreguntasEncuestaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuestaPersistence
 * @see PreguntasEncuestaPersistenceImpl
 * @generated
 */
public class PreguntasEncuestaUtil {
    private static PreguntasEncuestaPersistence _persistence;

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
    public static void clearCache(PreguntasEncuesta preguntasEncuesta) {
        getPersistence().clearCache(preguntasEncuesta);
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
    public static List<PreguntasEncuesta> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PreguntasEncuesta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PreguntasEncuesta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PreguntasEncuesta update(PreguntasEncuesta preguntasEncuesta)
        throws SystemException {
        return getPersistence().update(preguntasEncuesta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PreguntasEncuesta update(
        PreguntasEncuesta preguntasEncuesta, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(preguntasEncuesta, serviceContext);
    }

    /**
    * Caches the preguntas encuesta in the entity cache if it is enabled.
    *
    * @param preguntasEncuesta the preguntas encuesta
    */
    public static void cacheResult(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta) {
        getPersistence().cacheResult(preguntasEncuesta);
    }

    /**
    * Caches the preguntas encuestas in the entity cache if it is enabled.
    *
    * @param preguntasEncuestas the preguntas encuestas
    */
    public static void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.PreguntasEncuesta> preguntasEncuestas) {
        getPersistence().cacheResult(preguntasEncuestas);
    }

    /**
    * Creates a new preguntas encuesta with the primary key. Does not add the preguntas encuesta to the database.
    *
    * @param numpregunta the primary key for the new preguntas encuesta
    * @return the new preguntas encuesta
    */
    public static com.telefonica.centroseducativos.model.PreguntasEncuesta create(
        int numpregunta) {
        return getPersistence().create(numpregunta);
    }

    /**
    * Removes the preguntas encuesta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param numpregunta the primary key of the preguntas encuesta
    * @return the preguntas encuesta that was removed
    * @throws com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException if a preguntas encuesta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.PreguntasEncuesta remove(
        int numpregunta)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException {
        return getPersistence().remove(numpregunta);
    }

    public static com.telefonica.centroseducativos.model.PreguntasEncuesta updateImpl(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(preguntasEncuesta);
    }

    /**
    * Returns the preguntas encuesta with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException} if it could not be found.
    *
    * @param numpregunta the primary key of the preguntas encuesta
    * @return the preguntas encuesta
    * @throws com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException if a preguntas encuesta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.PreguntasEncuesta findByPrimaryKey(
        int numpregunta)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException {
        return getPersistence().findByPrimaryKey(numpregunta);
    }

    /**
    * Returns the preguntas encuesta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param numpregunta the primary key of the preguntas encuesta
    * @return the preguntas encuesta, or <code>null</code> if a preguntas encuesta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.PreguntasEncuesta fetchByPrimaryKey(
        int numpregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(numpregunta);
    }

    /**
    * Returns all the preguntas encuestas.
    *
    * @return the preguntas encuestas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.PreguntasEncuesta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the preguntas encuestas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of preguntas encuestas
    * @param end the upper bound of the range of preguntas encuestas (not inclusive)
    * @return the range of preguntas encuestas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.PreguntasEncuesta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the preguntas encuestas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of preguntas encuestas
    * @param end the upper bound of the range of preguntas encuestas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of preguntas encuestas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.PreguntasEncuesta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the preguntas encuestas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of preguntas encuestas.
    *
    * @return the number of preguntas encuestas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PreguntasEncuestaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PreguntasEncuestaPersistence) PortletBeanLocatorUtil.locate(com.telefonica.centroseducativos.service.ClpSerializer.getServletContextName(),
                    PreguntasEncuestaPersistence.class.getName());

            ReferenceRegistry.registerReference(PreguntasEncuestaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PreguntasEncuestaPersistence persistence) {
    }
}
