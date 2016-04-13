package com.telefonica.centroseducativos.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CategoriaPregunta. This utility wraps
 * {@link com.telefonica.centroseducativos.service.impl.CategoriaPreguntaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaLocalService
 * @see com.telefonica.centroseducativos.service.base.CategoriaPreguntaLocalServiceBaseImpl
 * @see com.telefonica.centroseducativos.service.impl.CategoriaPreguntaLocalServiceImpl
 * @generated
 */
public class CategoriaPreguntaLocalServiceUtil {
    private static CategoriaPreguntaLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.telefonica.centroseducativos.service.impl.CategoriaPreguntaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the categoria pregunta to the database. Also notifies the appropriate model listeners.
    *
    * @param categoriaPregunta the categoria pregunta
    * @return the categoria pregunta that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta addCategoriaPregunta(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addCategoriaPregunta(categoriaPregunta);
    }

    /**
    * Creates a new categoria pregunta with the primary key. Does not add the categoria pregunta to the database.
    *
    * @param idcategoria the primary key for the new categoria pregunta
    * @return the new categoria pregunta
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta createCategoriaPregunta(
        int idcategoria) {
        return getService().createCategoriaPregunta(idcategoria);
    }

    /**
    * Deletes the categoria pregunta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta that was removed
    * @throws PortalException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta deleteCategoriaPregunta(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCategoriaPregunta(idcategoria);
    }

    /**
    * Deletes the categoria pregunta from the database. Also notifies the appropriate model listeners.
    *
    * @param categoriaPregunta the categoria pregunta
    * @return the categoria pregunta that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta deleteCategoriaPregunta(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCategoriaPregunta(categoriaPregunta);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.telefonica.centroseducativos.model.CategoriaPregunta fetchCategoriaPregunta(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchCategoriaPregunta(idcategoria);
    }

    /**
    * Returns the categoria pregunta with the primary key.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta
    * @throws PortalException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta getCategoriaPregunta(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getCategoriaPregunta(idcategoria);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> getCategoriaPreguntas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCategoriaPreguntas(start, end);
    }

    /**
    * Returns the number of categoria preguntas.
    *
    * @return the number of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public static int getCategoriaPreguntasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCategoriaPreguntasCount();
    }

    /**
    * Updates the categoria pregunta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param categoriaPregunta the categoria pregunta
    * @return the categoria pregunta that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CategoriaPregunta updateCategoriaPregunta(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateCategoriaPregunta(categoriaPregunta);
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

    public static CategoriaPreguntaLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    CategoriaPreguntaLocalService.class.getName());

            if (invokableLocalService instanceof CategoriaPreguntaLocalService) {
                _service = (CategoriaPreguntaLocalService) invokableLocalService;
            } else {
                _service = new CategoriaPreguntaLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(CategoriaPreguntaLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CategoriaPreguntaLocalService service) {
    }
}
