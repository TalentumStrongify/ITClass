package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaisService}.
 *
 * @author Brian Wing Shun Chan
 * @see PaisService
 * @generated
 */
public class PaisServiceWrapper implements PaisService,
    ServiceWrapper<PaisService> {
    private PaisService _paisService;

    public PaisServiceWrapper(PaisService paisService) {
        _paisService = paisService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paisService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paisService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paisService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaisService getWrappedPaisService() {
        return _paisService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaisService(PaisService paisService) {
        _paisService = paisService;
    }

    @Override
    public PaisService getWrappedService() {
        return _paisService;
    }

    @Override
    public void setWrappedService(PaisService paisService) {
        _paisService = paisService;
    }
}
