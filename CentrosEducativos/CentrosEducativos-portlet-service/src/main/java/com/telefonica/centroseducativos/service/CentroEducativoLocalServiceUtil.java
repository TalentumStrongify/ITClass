package com.telefonica.centroseducativos.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CentroEducativo. This utility wraps
 * {@link com.telefonica.centroseducativos.service.impl.CentroEducativoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativoLocalService
 * @see com.telefonica.centroseducativos.service.base.CentroEducativoLocalServiceBaseImpl
 * @see com.telefonica.centroseducativos.service.impl.CentroEducativoLocalServiceImpl
 * @generated
 */
public class CentroEducativoLocalServiceUtil {
    private static CentroEducativoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.telefonica.centroseducativos.service.impl.CentroEducativoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the centro educativo to the database. Also notifies the appropriate model listeners.
    *
    * @param centroEducativo the centro educativo
    * @return the centro educativo that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo addCentroEducativo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addCentroEducativo(centroEducativo);
    }

    /**
    * Creates a new centro educativo with the primary key. Does not add the centro educativo to the database.
    *
    * @param idce the primary key for the new centro educativo
    * @return the new centro educativo
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo createCentroEducativo(
        int idce) {
        return getService().createCentroEducativo(idce);
    }

    /**
    * Deletes the centro educativo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo that was removed
    * @throws PortalException if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo deleteCentroEducativo(
        int idce)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCentroEducativo(idce);
    }

    /**
    * Deletes the centro educativo from the database. Also notifies the appropriate model listeners.
    *
    * @param centroEducativo the centro educativo
    * @return the centro educativo that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo deleteCentroEducativo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCentroEducativo(centroEducativo);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.telefonica.centroseducativos.model.CentroEducativo fetchCentroEducativo(
        int idce) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchCentroEducativo(idce);
    }

    /**
    * Returns the centro educativo with the primary key.
    *
    * @param idce the primary key of the centro educativo
    * @return the centro educativo
    * @throws PortalException if a centro educativo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo getCentroEducativo(
        int idce)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getCentroEducativo(idce);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.telefonica.centroseducativos.model.CentroEducativo> getCentroEducativos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCentroEducativos(start, end);
    }

    /**
    * Returns the number of centro educativos.
    *
    * @return the number of centro educativos
    * @throws SystemException if a system exception occurred
    */
    public static int getCentroEducativosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCentroEducativosCount();
    }

    /**
    * Updates the centro educativo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param centroEducativo the centro educativo
    * @return the centro educativo that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.centroseducativos.model.CentroEducativo updateCentroEducativo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateCentroEducativo(centroEducativo);
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

    public static CentroEducativoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    CentroEducativoLocalService.class.getName());

            if (invokableLocalService instanceof CentroEducativoLocalService) {
                _service = (CentroEducativoLocalService) invokableLocalService;
            } else {
                _service = new CentroEducativoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(CentroEducativoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CentroEducativoLocalService service) {
    }
}
