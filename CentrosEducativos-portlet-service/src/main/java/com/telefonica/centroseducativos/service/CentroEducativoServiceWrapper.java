package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CentroEducativoService}.
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativoService
 * @generated
 */
public class CentroEducativoServiceWrapper implements CentroEducativoService,
    ServiceWrapper<CentroEducativoService> {
    private CentroEducativoService _centroEducativoService;

    public CentroEducativoServiceWrapper(
        CentroEducativoService centroEducativoService) {
        _centroEducativoService = centroEducativoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _centroEducativoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _centroEducativoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _centroEducativoService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CentroEducativoService getWrappedCentroEducativoService() {
        return _centroEducativoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCentroEducativoService(
        CentroEducativoService centroEducativoService) {
        _centroEducativoService = centroEducativoService;
    }

    @Override
    public CentroEducativoService getWrappedService() {
        return _centroEducativoService;
    }

    @Override
    public void setWrappedService(CentroEducativoService centroEducativoService) {
        _centroEducativoService = centroEducativoService;
    }
}
