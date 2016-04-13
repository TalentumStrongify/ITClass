package com.telefonica.centroseducativos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EvaluacionesCEService}.
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCEService
 * @generated
 */
public class EvaluacionesCEServiceWrapper implements EvaluacionesCEService,
    ServiceWrapper<EvaluacionesCEService> {
    private EvaluacionesCEService _evaluacionesCEService;

    public EvaluacionesCEServiceWrapper(
        EvaluacionesCEService evaluacionesCEService) {
        _evaluacionesCEService = evaluacionesCEService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _evaluacionesCEService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _evaluacionesCEService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _evaluacionesCEService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EvaluacionesCEService getWrappedEvaluacionesCEService() {
        return _evaluacionesCEService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEvaluacionesCEService(
        EvaluacionesCEService evaluacionesCEService) {
        _evaluacionesCEService = evaluacionesCEService;
    }

    @Override
    public EvaluacionesCEService getWrappedService() {
        return _evaluacionesCEService;
    }

    @Override
    public void setWrappedService(EvaluacionesCEService evaluacionesCEService) {
        _evaluacionesCEService = evaluacionesCEService;
    }
}
