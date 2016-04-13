package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PreguntasEncuestaService}.
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuestaService
 * @generated
 */
public class PreguntasEncuestaServiceWrapper implements PreguntasEncuestaService,
    ServiceWrapper<PreguntasEncuestaService> {
    private PreguntasEncuestaService _preguntasEncuestaService;

    public PreguntasEncuestaServiceWrapper(
        PreguntasEncuestaService preguntasEncuestaService) {
        _preguntasEncuestaService = preguntasEncuestaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _preguntasEncuestaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _preguntasEncuestaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _preguntasEncuestaService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PreguntasEncuestaService getWrappedPreguntasEncuestaService() {
        return _preguntasEncuestaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPreguntasEncuestaService(
        PreguntasEncuestaService preguntasEncuestaService) {
        _preguntasEncuestaService = preguntasEncuestaService;
    }

    @Override
    public PreguntasEncuestaService getWrappedService() {
        return _preguntasEncuestaService;
    }

    @Override
    public void setWrappedService(
        PreguntasEncuestaService preguntasEncuestaService) {
        _preguntasEncuestaService = preguntasEncuestaService;
    }
}
