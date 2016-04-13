package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CentroEducativo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativo
 * @generated
 */
public class CentroEducativoWrapper implements CentroEducativo,
    ModelWrapper<CentroEducativo> {
    private CentroEducativo _centroEducativo;

    public CentroEducativoWrapper(CentroEducativo centroEducativo) {
        _centroEducativo = centroEducativo;
    }

    @Override
    public Class<?> getModelClass() {
        return CentroEducativo.class;
    }

    @Override
    public String getModelClassName() {
        return CentroEducativo.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idce", getIdce());
        attributes.put("nombrece", getNombrece());
        attributes.put("idca", getIdca());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idce = (Integer) attributes.get("idce");

        if (idce != null) {
            setIdce(idce);
        }

        String nombrece = (String) attributes.get("nombrece");

        if (nombrece != null) {
            setNombrece(nombrece);
        }

        Integer idca = (Integer) attributes.get("idca");

        if (idca != null) {
            setIdca(idca);
        }
    }

    /**
    * Returns the primary key of this centro educativo.
    *
    * @return the primary key of this centro educativo
    */
    @Override
    public int getPrimaryKey() {
        return _centroEducativo.getPrimaryKey();
    }

    /**
    * Sets the primary key of this centro educativo.
    *
    * @param primaryKey the primary key of this centro educativo
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _centroEducativo.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the idce of this centro educativo.
    *
    * @return the idce of this centro educativo
    */
    @Override
    public int getIdce() {
        return _centroEducativo.getIdce();
    }

    /**
    * Sets the idce of this centro educativo.
    *
    * @param idce the idce of this centro educativo
    */
    @Override
    public void setIdce(int idce) {
        _centroEducativo.setIdce(idce);
    }

    /**
    * Returns the nombrece of this centro educativo.
    *
    * @return the nombrece of this centro educativo
    */
    @Override
    public java.lang.String getNombrece() {
        return _centroEducativo.getNombrece();
    }

    /**
    * Sets the nombrece of this centro educativo.
    *
    * @param nombrece the nombrece of this centro educativo
    */
    @Override
    public void setNombrece(java.lang.String nombrece) {
        _centroEducativo.setNombrece(nombrece);
    }

    /**
    * Returns the idca of this centro educativo.
    *
    * @return the idca of this centro educativo
    */
    @Override
    public int getIdca() {
        return _centroEducativo.getIdca();
    }

    /**
    * Sets the idca of this centro educativo.
    *
    * @param idca the idca of this centro educativo
    */
    @Override
    public void setIdca(int idca) {
        _centroEducativo.setIdca(idca);
    }

    @Override
    public boolean isNew() {
        return _centroEducativo.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _centroEducativo.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _centroEducativo.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _centroEducativo.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _centroEducativo.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _centroEducativo.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _centroEducativo.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _centroEducativo.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _centroEducativo.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _centroEducativo.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _centroEducativo.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CentroEducativoWrapper((CentroEducativo) _centroEducativo.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo) {
        return _centroEducativo.compareTo(centroEducativo);
    }

    @Override
    public int hashCode() {
        return _centroEducativo.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.CentroEducativo> toCacheModel() {
        return _centroEducativo.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo toEscapedModel() {
        return new CentroEducativoWrapper(_centroEducativo.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.CentroEducativo toUnescapedModel() {
        return new CentroEducativoWrapper(_centroEducativo.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _centroEducativo.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _centroEducativo.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _centroEducativo.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CentroEducativoWrapper)) {
            return false;
        }

        CentroEducativoWrapper centroEducativoWrapper = (CentroEducativoWrapper) obj;

        if (Validator.equals(_centroEducativo,
                    centroEducativoWrapper._centroEducativo)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CentroEducativo getWrappedCentroEducativo() {
        return _centroEducativo;
    }

    @Override
    public CentroEducativo getWrappedModel() {
        return _centroEducativo;
    }

    @Override
    public void resetOriginalValues() {
        _centroEducativo.resetOriginalValues();
    }
}
