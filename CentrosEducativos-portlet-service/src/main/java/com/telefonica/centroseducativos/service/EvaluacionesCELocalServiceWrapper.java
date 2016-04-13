package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EvaluacionesCELocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCELocalService
 * @generated
 */
public class EvaluacionesCELocalServiceWrapper
    implements EvaluacionesCELocalService,
        ServiceWrapper<EvaluacionesCELocalService> {
    private EvaluacionesCELocalService _evaluacionesCELocalService;

    public EvaluacionesCELocalServiceWrapper(
        EvaluacionesCELocalService evaluacionesCELocalService) {
        _evaluacionesCELocalService = evaluacionesCELocalService;
    }

    /**
    * Adds the evaluaciones c e to the database. Also notifies the appropriate model listeners.
    *
    * @param evaluacionesCE the evaluaciones c e
    * @return the evaluaciones c e that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE addEvaluacionesCE(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.addEvaluacionesCE(evaluacionesCE);
    }

    /**
    * Creates a new evaluaciones c e with the primary key. Does not add the evaluaciones c e to the database.
    *
    * @param evaluacionesCEPK the primary key for the new evaluaciones c e
    * @return the new evaluaciones c e
    */
    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE createEvaluacionesCE(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK) {
        return _evaluacionesCELocalService.createEvaluacionesCE(evaluacionesCEPK);
    }

    /**
    * Deletes the evaluaciones c e with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e that was removed
    * @throws PortalException if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE deleteEvaluacionesCE(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.deleteEvaluacionesCE(evaluacionesCEPK);
    }

    /**
    * Deletes the evaluaciones c e from the database. Also notifies the appropriate model listeners.
    *
    * @param evaluacionesCE the evaluaciones c e
    * @return the evaluaciones c e that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE deleteEvaluacionesCE(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.deleteEvaluacionesCE(evaluacionesCE);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _evaluacionesCELocalService.dynamicQuery();
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
        return _evaluacionesCELocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _evaluacionesCELocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _evaluacionesCELocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _evaluacionesCELocalService.dynamicQueryCount(dynamicQuery);
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
        return _evaluacionesCELocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE fetchEvaluacionesCE(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.fetchEvaluacionesCE(evaluacionesCEPK);
    }

    /**
    * Returns the evaluaciones c e with the primary key.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e
    * @throws PortalException if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE getEvaluacionesCE(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.getEvaluacionesCE(evaluacionesCEPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> getEvaluacionesCEs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.getEvaluacionesCEs(start, end);
    }

    /**
    * Returns the number of evaluaciones c es.
    *
    * @return the number of evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEvaluacionesCEsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.getEvaluacionesCEsCount();
    }

    /**
    * Updates the evaluaciones c e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param evaluacionesCE the evaluaciones c e
    * @return the evaluaciones c e that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE updateEvaluacionesCE(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _evaluacionesCELocalService.updateEvaluacionesCE(evaluacionesCE);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _evaluacionesCELocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _evaluacionesCELocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _evaluacionesCELocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EvaluacionesCELocalService getWrappedEvaluacionesCELocalService() {
        return _evaluacionesCELocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEvaluacionesCELocalService(
        EvaluacionesCELocalService evaluacionesCELocalService) {
        _evaluacionesCELocalService = evaluacionesCELocalService;
    }

    @Override
    public EvaluacionesCELocalService getWrappedService() {
        return _evaluacionesCELocalService;
    }

    @Override
    public void setWrappedService(
        EvaluacionesCELocalService evaluacionesCELocalService) {
        _evaluacionesCELocalService = evaluacionesCELocalService;
    }
}
