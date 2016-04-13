package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EvaluacionesCE}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCE
 * @generated
 */
public class EvaluacionesCEWrapper implements EvaluacionesCE,
    ModelWrapper<EvaluacionesCE> {
    private EvaluacionesCE _evaluacionesCE;

    public EvaluacionesCEWrapper(EvaluacionesCE evaluacionesCE) {
        _evaluacionesCE = evaluacionesCE;
    }

    @Override
    public Class<?> getModelClass() {
        return EvaluacionesCE.class;
    }

    @Override
    public String getModelClassName() {
        return EvaluacionesCE.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idencuesta", getIdencuesta());
        attributes.put("numpregunta", getNumpregunta());
        attributes.put("notapregunta", getNotapregunta());
        attributes.put("idce", getIdce());
        attributes.put("idrol", getIdrol());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idencuesta = (Integer) attributes.get("idencuesta");

        if (idencuesta != null) {
            setIdencuesta(idencuesta);
        }

        Integer numpregunta = (Integer) attributes.get("numpregunta");

        if (numpregunta != null) {
            setNumpregunta(numpregunta);
        }

        Integer notapregunta = (Integer) attributes.get("notapregunta");

        if (notapregunta != null) {
            setNotapregunta(notapregunta);
        }

        Integer idce = (Integer) attributes.get("idce");

        if (idce != null) {
            setIdce(idce);
        }

        Integer idrol = (Integer) attributes.get("idrol");

        if (idrol != null) {
            setIdrol(idrol);
        }
    }

    /**
    * Returns the primary key of this evaluaciones c e.
    *
    * @return the primary key of this evaluaciones c e
    */
    @Override
    public com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK getPrimaryKey() {
        return _evaluacionesCE.getPrimaryKey();
    }

    /**
    * Sets the primary key of this evaluaciones c e.
    *
    * @param primaryKey the primary key of this evaluaciones c e
    */
    @Override
    public void setPrimaryKey(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK primaryKey) {
        _evaluacionesCE.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the idencuesta of this evaluaciones c e.
    *
    * @return the idencuesta of this evaluaciones c e
    */
    @Override
    public int getIdencuesta() {
        return _evaluacionesCE.getIdencuesta();
    }

    /**
    * Sets the idencuesta of this evaluaciones c e.
    *
    * @param idencuesta the idencuesta of this evaluaciones c e
    */
    @Override
    public void setIdencuesta(int idencuesta) {
        _evaluacionesCE.setIdencuesta(idencuesta);
    }

    /**
    * Returns the numpregunta of this evaluaciones c e.
    *
    * @return the numpregunta of this evaluaciones c e
    */
    @Override
    public int getNumpregunta() {
        return _evaluacionesCE.getNumpregunta();
    }

    /**
    * Sets the numpregunta of this evaluaciones c e.
    *
    * @param numpregunta the numpregunta of this evaluaciones c e
    */
    @Override
    public void setNumpregunta(int numpregunta) {
        _evaluacionesCE.setNumpregunta(numpregunta);
    }

    /**
    * Returns the notapregunta of this evaluaciones c e.
    *
    * @return the notapregunta of this evaluaciones c e
    */
    @Override
    public int getNotapregunta() {
        return _evaluacionesCE.getNotapregunta();
    }

    /**
    * Sets the notapregunta of this evaluaciones c e.
    *
    * @param notapregunta the notapregunta of this evaluaciones c e
    */
    @Override
    public void setNotapregunta(int notapregunta) {
        _evaluacionesCE.setNotapregunta(notapregunta);
    }

    /**
    * Returns the idce of this evaluaciones c e.
    *
    * @return the idce of this evaluaciones c e
    */
    @Override
    public int getIdce() {
        return _evaluacionesCE.getIdce();
    }

    /**
    * Sets the idce of this evaluaciones c e.
    *
    * @param idce the idce of this evaluaciones c e
    */
    @Override
    public void setIdce(int idce) {
        _evaluacionesCE.setIdce(idce);
    }

    /**
    * Returns the idrol of this evaluaciones c e.
    *
    * @return the idrol of this evaluaciones c e
    */
    @Override
    public int getIdrol() {
        return _evaluacionesCE.getIdrol();
    }

    /**
    * Sets the idrol of this evaluaciones c e.
    *
    * @param idrol the idrol of this evaluaciones c e
    */
    @Override
    public void setIdrol(int idrol) {
        _evaluacionesCE.setIdrol(idrol);
    }

    @Override
    public boolean isNew() {
        return _evaluacionesCE.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _evaluacionesCE.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _evaluacionesCE.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _evaluacionesCE.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _evaluacionesCE.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _evaluacionesCE.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _evaluacionesCE.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _evaluacionesCE.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _evaluacionesCE.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _evaluacionesCE.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _evaluacionesCE.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EvaluacionesCEWrapper((EvaluacionesCE) _evaluacionesCE.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE) {
        return _evaluacionesCE.compareTo(evaluacionesCE);
    }

    @Override
    public int hashCode() {
        return _evaluacionesCE.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.EvaluacionesCE> toCacheModel() {
        return _evaluacionesCE.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE toEscapedModel() {
        return new EvaluacionesCEWrapper(_evaluacionesCE.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.EvaluacionesCE toUnescapedModel() {
        return new EvaluacionesCEWrapper(_evaluacionesCE.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _evaluacionesCE.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _evaluacionesCE.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _evaluacionesCE.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EvaluacionesCEWrapper)) {
            return false;
        }

        EvaluacionesCEWrapper evaluacionesCEWrapper = (EvaluacionesCEWrapper) obj;

        if (Validator.equals(_evaluacionesCE,
                    evaluacionesCEWrapper._evaluacionesCE)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EvaluacionesCE getWrappedEvaluacionesCE() {
        return _evaluacionesCE;
    }

    @Override
    public EvaluacionesCE getWrappedModel() {
        return _evaluacionesCE;
    }

    @Override
    public void resetOriginalValues() {
        _evaluacionesCE.resetOriginalValues();
    }
}
