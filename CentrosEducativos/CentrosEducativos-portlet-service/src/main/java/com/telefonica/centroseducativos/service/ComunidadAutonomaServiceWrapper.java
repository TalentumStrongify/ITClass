package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ComunidadAutonomaService}.
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonomaService
 * @generated
 */
public class ComunidadAutonomaServiceWrapper implements ComunidadAutonomaService,
    ServiceWrapper<ComunidadAutonomaService> {
    private ComunidadAutonomaService _comunidadAutonomaService;

    public ComunidadAutonomaServiceWrapper(
        ComunidadAutonomaService comunidadAutonomaService) {
        _comunidadAutonomaService = comunidadAutonomaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _comunidadAutonomaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _comunidadAutonomaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _comunidadAutonomaService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ComunidadAutonomaService getWrappedComunidadAutonomaService() {
        return _comunidadAutonomaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedComunidadAutonomaService(
        ComunidadAutonomaService comunidadAutonomaService) {
        _comunidadAutonomaService = comunidadAutonomaService;
    }

    @Override
    public ComunidadAutonomaService getWrappedService() {
        return _comunidadAutonomaService;
    }

    @Override
    public void setWrappedService(
        ComunidadAutonomaService comunidadAutonomaService) {
        _comunidadAutonomaService = comunidadAutonomaService;
    }
}
