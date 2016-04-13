package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Pais}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Pais
 * @generated
 */
public class PaisWrapper implements Pais, ModelWrapper<Pais> {
    private Pais _pais;

    public PaisWrapper(Pais pais) {
        _pais = pais;
    }

    @Override
    public Class<?> getModelClass() {
        return Pais.class;
    }

    @Override
    public String getModelClassName() {
        return Pais.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idpais", getIdpais());
        attributes.put("nombrepais", getNombrepais());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idpais = (Integer) attributes.get("idpais");

        if (idpais != null) {
            setIdpais(idpais);
        }

        String nombrepais = (String) attributes.get("nombrepais");

        if (nombrepais != null) {
            setNombrepais(nombrepais);
        }
    }

    /**
    * Returns the primary key of this pais.
    *
    * @return the primary key of this pais
    */
    @Override
    public int getPrimaryKey() {
        return _pais.getPrimaryKey();
    }

    /**
    * Sets the primary key of this pais.
    *
    * @param primaryKey the primary key of this pais
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _pais.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the idpais of this pais.
    *
    * @return the idpais of this pais
    */
    @Override
    public int getIdpais() {
        return _pais.getIdpais();
    }

    /**
    * Sets the idpais of this pais.
    *
    * @param idpais the idpais of this pais
    */
    @Override
    public void setIdpais(int idpais) {
        _pais.setIdpais(idpais);
    }

    /**
    * Returns the nombrepais of this pais.
    *
    * @return the nombrepais of this pais
    */
    @Override
    public java.lang.String getNombrepais() {
        return _pais.getNombrepais();
    }

    /**
    * Sets the nombrepais of this pais.
    *
    * @param nombrepais the nombrepais of this pais
    */
    @Override
    public void setNombrepais(java.lang.String nombrepais) {
        _pais.setNombrepais(nombrepais);
    }

    @Override
    public boolean isNew() {
        return _pais.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _pais.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _pais.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _pais.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _pais.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _pais.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _pais.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _pais.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _pais.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _pais.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _pais.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaisWrapper((Pais) _pais.clone());
    }

    @Override
    public int compareTo(com.telefonica.centroseducativos.model.Pais pais) {
        return _pais.compareTo(pais);
    }

    @Override
    public int hashCode() {
        return _pais.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.Pais> toCacheModel() {
        return _pais.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.Pais toEscapedModel() {
        return new PaisWrapper(_pais.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.Pais toUnescapedModel() {
        return new PaisWrapper(_pais.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _pais.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _pais.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _pais.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaisWrapper)) {
            return false;
        }

        PaisWrapper paisWrapper = (PaisWrapper) obj;

        if (Validator.equals(_pais, paisWrapper._pais)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Pais getWrappedPais() {
        return _pais;
    }

    @Override
    public Pais getWrappedModel() {
        return _pais;
    }

    @Override
    public void resetOriginalValues() {
        _pais.resetOriginalValues();
    }
}
