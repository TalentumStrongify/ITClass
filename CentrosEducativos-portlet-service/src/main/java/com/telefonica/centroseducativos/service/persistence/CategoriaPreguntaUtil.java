package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.centroseducativos.model.CategoriaPregunta;

import java.util.List;

/**
 * The persistence utility for the categoria pregunta service. This utility wraps {@link CategoriaPreguntaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaPersistence
 * @see CategoriaPreguntaPersistenceImpl
 * @generated
 */
public class CategoriaPreguntaUtil {
    private static CategoriaPreguntaPersistence _persistence;

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
    public static void clearCache(CategoriaPregunta categoriaPregunta) {
        getPersistence().clearCache(categoriaPregunta);
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
    public static List<CategoriaPregunta> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CategoriaPregunta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CategoriaPregunta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CategoriaPregunta update(CategoriaPregunta categoriaPregunta)
        throws SystemException {
        return getPersistence().update(categoriaPregunta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CategoriaPregunta update(
        CategoriaPregunta categoriaPregunta, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(categoriaPregunta, serviceContext);
    }

    /**
    * Caches the categoria pregunta in the entity cache if it is enabled.
    *
    * @param categoriaPregunta the categoria pregunta
    */
    public static void cacheResult(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta) {
        getPersistence().cacheResult(categoriaPregunta);
    }

    /**
    * Caches the categoria preguntas in the entity cache if it is enabled.
    *
    * @param categoriaPreguntas the categoria preguntas
    */
    public static void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> categoriaPreguntas) {
        getPersistence().cacheResult(categoriaPreguntas);
    }

    /**
    * Creates a new categoria pregunta with the primary key. Does not add the categoria pregunta to the database.
    *
    * @param idcategoria the primary key for the new categoria pregunta
    * @return the new categoria pregunta
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta create(
        int idcategoria) {
        return getPersistence().create(idcategoria);
    }

    /**
    * Removes the categoria pregunta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta that was removed
    * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta remove(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException {
        return getPersistence().remove(idcategoria);
    }

    public static com.telefonica.centroseducativos.model.CategoriaPregunta updateImpl(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(categoriaPregunta);
    }

    /**
    * Returns the categoria pregunta with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException} if it could not be found.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta
    * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta findByPrimaryKey(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException {
        return getPersistence().findByPrimaryKey(idcategoria);
    }

    /**
    * Returns the categoria pregunta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta, or <code>null</code> if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta fetchByPrimaryKey(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idcategoria);
    }

    /**
    * Returns all the categoria preguntas.
    *
    * @return the categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the categoria preguntas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of categoria preguntas
    * @param end the upper bound of the range of categoria preguntas (not inclusive)
    * @return the range of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the categoria preguntas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of categoria preguntas
    * @param end the upper bound of the range of categoria preguntas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the categoria preguntas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of categoria preguntas.
    *
    * @return the number of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CategoriaPreguntaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CategoriaPreguntaPersistence) PortletBeanLocatorUtil.locate(com.telefonica.centroseducativos.service.ClpSerializer.getServletContextName(),
                    CategoriaPreguntaPersistence.class.getName());

            ReferenceRegistry.registerReference(CategoriaPreguntaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CategoriaPreguntaPersistence persistence) {
    }
}
