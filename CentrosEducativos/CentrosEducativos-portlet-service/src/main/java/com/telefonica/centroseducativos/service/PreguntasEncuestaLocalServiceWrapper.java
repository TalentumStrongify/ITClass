package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PreguntasEncuestaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuestaLocalService
 * @generated
 */
public class PreguntasEncuestaLocalServiceWrapper
    implements PreguntasEncuestaLocalService,
        ServiceWrapper<PreguntasEncuestaLocalService> {
    private PreguntasEncuestaLocalService _preguntasEncuestaLocalService;

    public PreguntasEncuestaLocalServiceWrapper(
        PreguntasEncuestaLocalService preguntasEncuestaLocalService) {
        _preguntasEncuestaLocalService = preguntasEncuestaLocalService;
    }

    /**
    * Adds the preguntas encuesta to the database. Also notifies the appropriate model listeners.
    *
    * @param preguntasEncuesta the preguntas encuesta
    * @return the preguntas encuesta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta addPreguntasEncuesta(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.addPreguntasEncuesta(preguntasEncuesta);
    }

    /**
    * Creates a new preguntas encuesta with the primary key. Does not add the preguntas encuesta to the database.
    *
    * @param numpregunta the primary key for the new preguntas encuesta
    * @return the new preguntas encuesta
    */
    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta createPreguntasEncuesta(
        int numpregunta) {
        return _preguntasEncuestaLocalService.createPreguntasEncuesta(numpregunta);
    }

    /**
    * Deletes the preguntas encuesta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param numpregunta the primary key of the preguntas encuesta
    * @return the preguntas encuesta that was removed
    * @throws PortalException if a preguntas encuesta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta deletePreguntasEncuesta(
        int numpregunta)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.deletePreguntasEncuesta(numpregunta);
    }

    /**
    * Deletes the preguntas encuesta from the database. Also notifies the appropriate model listeners.
    *
    * @param preguntasEncuesta the preguntas encuesta
    * @return the preguntas encuesta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta deletePreguntasEncuesta(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.deletePreguntasEncuesta(preguntasEncuesta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _preguntasEncuestaLocalService.dynamicQuery();
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
        return _preguntasEncuestaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _preguntasEncuestaLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _preguntasEncuestaLocalService.dynamicQuery(dynamicQuery, start,
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
        return _preguntasEncuestaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _preguntasEncuestaLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta fetchPreguntasEncuesta(
        int numpregunta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.fetchPreguntasEncuesta(numpregunta);
    }

    /**
    * Returns the preguntas encuesta with the primary key.
    *
    * @param numpregunta the primary key of the preguntas encuesta
    * @return the preguntas encuesta
    * @throws PortalException if a preguntas encuesta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta getPreguntasEncuesta(
        int numpregunta)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.getPreguntasEncuesta(numpregunta);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.telefonica.centroseducativos.model.PreguntasEncuesta> getPreguntasEncuestas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.getPreguntasEncuestas(start, end);
    }

    /**
    * Returns the number of preguntas encuestas.
    *
    * @return the number of preguntas encuestas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPreguntasEncuestasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.getPreguntasEncuestasCount();
    }

    /**
    * Updates the preguntas encuesta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param preguntasEncuesta the preguntas encuesta
    * @return the preguntas encuesta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta updatePreguntasEncuesta(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _preguntasEncuestaLocalService.updatePreguntasEncuesta(preguntasEncuesta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _preguntasEncuestaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _preguntasEncuestaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _preguntasEncuestaLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PreguntasEncuestaLocalService getWrappedPreguntasEncuestaLocalService() {
        return _preguntasEncuestaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPreguntasEncuestaLocalService(
        PreguntasEncuestaLocalService preguntasEncuestaLocalService) {
        _preguntasEncuestaLocalService = preguntasEncuestaLocalService;
    }

    @Override
    public PreguntasEncuestaLocalService getWrappedService() {
        return _preguntasEncuestaLocalService;
    }

    @Override
    public void setWrappedService(
        PreguntasEncuestaLocalService preguntasEncuestaLocalService) {
        _preguntasEncuestaLocalService = preguntasEncuestaLocalService;
    }
}
