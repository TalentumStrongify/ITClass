package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ComunidadAutonoma}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonoma
 * @generated
 */
public class ComunidadAutonomaWrapper implements ComunidadAutonoma,
    ModelWrapper<ComunidadAutonoma> {
    private ComunidadAutonoma _comunidadAutonoma;

    public ComunidadAutonomaWrapper(ComunidadAutonoma comunidadAutonoma) {
        _comunidadAutonoma = comunidadAutonoma;
    }

    @Override
    public Class<?> getModelClass() {
        return ComunidadAutonoma.class;
    }

    @Override
    public String getModelClassName() {
        return ComunidadAutonoma.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idca", getIdca());
        attributes.put("nombrecomunidad", getNombrecomunidad());
        attributes.put("idpais", getIdpais());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idca = (Integer) attributes.get("idca");

        if (idca != null) {
            setIdca(idca);
        }

        String nombrecomunidad = (String) attributes.get("nombrecomunidad");

        if (nombrecomunidad != null) {
            setNombrecomunidad(nombrecomunidad);
        }

        Integer idpais = (Integer) attributes.get("idpais");

        if (idpais != null) {
            setIdpais(idpais);
        }
    }

    /**
    * Returns the primary key of this comunidad autonoma.
    *
    * @return the primary key of this comunidad autonoma
    */
    @Override
    public int getPrimaryKey() {
        return _comunidadAutonoma.getPrimaryKey();
    }

    /**
    * Sets the primary key of this comunidad autonoma.
    *
    * @param primaryKey the primary key of this comunidad autonoma
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _comunidadAutonoma.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the idca of this comunidad autonoma.
    *
    * @return the idca of this comunidad autonoma
    */
    @Override
    public int getIdca() {
        return _comunidadAutonoma.getIdca();
    }

    /**
    * Sets the idca of this comunidad autonoma.
    *
    * @param idca the idca of this comunidad autonoma
    */
    @Override
    public void setIdca(int idca) {
        _comunidadAutonoma.setIdca(idca);
    }

    /**
    * Returns the nombrecomunidad of this comunidad autonoma.
    *
    * @return the nombrecomunidad of this comunidad autonoma
    */
    @Override
    public java.lang.String getNombrecomunidad() {
        return _comunidadAutonoma.getNombrecomunidad();
    }

    /**
    * Sets the nombrecomunidad of this comunidad autonoma.
    *
    * @param nombrecomunidad the nombrecomunidad of this comunidad autonoma
    */
    @Override
    public void setNombrecomunidad(java.lang.String nombrecomunidad) {
        _comunidadAutonoma.setNombrecomunidad(nombrecomunidad);
    }

    /**
    * Returns the idpais of this comunidad autonoma.
    *
    * @return the idpais of this comunidad autonoma
    */
    @Override
    public int getIdpais() {
        return _comunidadAutonoma.getIdpais();
    }

    /**
    * Sets the idpais of this comunidad autonoma.
    *
    * @param idpais the idpais of this comunidad autonoma
    */
    @Override
    public void setIdpais(int idpais) {
        _comunidadAutonoma.setIdpais(idpais);
    }

    @Override
    public boolean isNew() {
        return _comunidadAutonoma.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _comunidadAutonoma.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _comunidadAutonoma.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _comunidadAutonoma.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _comunidadAutonoma.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _comunidadAutonoma.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _comunidadAutonoma.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _comunidadAutonoma.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _comunidadAutonoma.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _comunidadAutonoma.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _comunidadAutonoma.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ComunidadAutonomaWrapper((ComunidadAutonoma) _comunidadAutonoma.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma) {
        return _comunidadAutonoma.compareTo(comunidadAutonoma);
    }

    @Override
    public int hashCode() {
        return _comunidadAutonoma.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.ComunidadAutonoma> toCacheModel() {
        return _comunidadAutonoma.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma toEscapedModel() {
        return new ComunidadAutonomaWrapper(_comunidadAutonoma.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma toUnescapedModel() {
        return new ComunidadAutonomaWrapper(_comunidadAutonoma.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _comunidadAutonoma.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _comunidadAutonoma.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _comunidadAutonoma.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ComunidadAutonomaWrapper)) {
            return false;
        }

        ComunidadAutonomaWrapper comunidadAutonomaWrapper = (ComunidadAutonomaWrapper) obj;

        if (Validator.equals(_comunidadAutonoma,
                    comunidadAutonomaWrapper._comunidadAutonoma)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public ComunidadAutonoma getWrappedComunidadAutonoma() {
        return _comunidadAutonoma;
    }

    @Override
    public ComunidadAutonoma getWrappedModel() {
        return _comunidadAutonoma;
    }

    @Override
    public void resetOriginalValues() {
        _comunidadAutonoma.resetOriginalValues();
    }
}
