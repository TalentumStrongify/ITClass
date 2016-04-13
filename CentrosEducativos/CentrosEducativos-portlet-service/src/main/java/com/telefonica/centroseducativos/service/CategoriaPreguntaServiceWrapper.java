package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CategoriaPreguntaService}.
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaService
 * @generated
 */
public class CategoriaPreguntaServiceWrapper implements CategoriaPreguntaService,
    ServiceWrapper<CategoriaPreguntaService> {
    private CategoriaPreguntaService _categoriaPreguntaService;

    public CategoriaPreguntaServiceWrapper(
        CategoriaPreguntaService categoriaPreguntaService) {
        _categoriaPreguntaService = categoriaPreguntaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _categoriaPreguntaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _categoriaPreguntaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _categoriaPreguntaService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CategoriaPreguntaService getWrappedCategoriaPreguntaService() {
        return _categoriaPreguntaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCategoriaPreguntaService(
        CategoriaPreguntaService categoriaPreguntaService) {
        _categoriaPreguntaService = categoriaPreguntaService;
    }

    @Override
    public CategoriaPreguntaService getWrappedService() {
        return _categoriaPreguntaService;
    }

    @Override
    public void setWrappedService(
        CategoriaPreguntaService categoriaPreguntaService) {
        _categoriaPreguntaService = categoriaPreguntaService;
    }
}
