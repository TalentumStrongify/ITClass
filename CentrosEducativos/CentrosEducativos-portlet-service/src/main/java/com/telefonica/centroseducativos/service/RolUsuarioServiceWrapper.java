package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RolUsuarioService}.
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuarioService
 * @generated
 */
public class RolUsuarioServiceWrapper implements RolUsuarioService,
    ServiceWrapper<RolUsuarioService> {
    private RolUsuarioService _rolUsuarioService;

    public RolUsuarioServiceWrapper(RolUsuarioService rolUsuarioService) {
        _rolUsuarioService = rolUsuarioService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rolUsuarioService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rolUsuarioService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rolUsuarioService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RolUsuarioService getWrappedRolUsuarioService() {
        return _rolUsuarioService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRolUsuarioService(RolUsuarioService rolUsuarioService) {
        _rolUsuarioService = rolUsuarioService;
    }

    @Override
    public RolUsuarioService getWrappedService() {
        return _rolUsuarioService;
    }

    @Override
    public void setWrappedService(RolUsuarioService rolUsuarioService) {
        _rolUsuarioService = rolUsuarioService;
    }
}
