package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CategoriaPregunta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPregunta
 * @generated
 */
public class CategoriaPreguntaWrapper implements CategoriaPregunta,
    ModelWrapper<CategoriaPregunta> {
    private CategoriaPregunta _categoriaPregunta;

    public CategoriaPreguntaWrapper(CategoriaPregunta categoriaPregunta) {
        _categoriaPregunta = categoriaPregunta;
    }

    @Override
    public Class<?> getModelClass() {
        return CategoriaPregunta.class;
    }

    @Override
    public String getModelClassName() {
        return CategoriaPregunta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idcategoria", getIdcategoria());
        attributes.put("Categoria", getCategoria());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idcategoria = (Integer) attributes.get("idcategoria");

        if (idcategoria != null) {
            setIdcategoria(idcategoria);
        }

        String Categoria = (String) attributes.get("Categoria");

        if (Categoria != null) {
            setCategoria(Categoria);
        }
    }

    /**
    * Returns the primary key of this categoria pregunta.
    *
    * @return the primary key of this categoria pregunta
    */
    @Override
    public int getPrimaryKey() {
        return _categoriaPregunta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this categoria pregunta.
    *
    * @param primaryKey the primary key of this categoria pregunta
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _categoriaPregunta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the idcategoria of this categoria pregunta.
    *
    * @return the idcategoria of this categoria pregunta
    */
    @Override
    public int getIdcategoria() {
        return _categoriaPregunta.getIdcategoria();
    }

    /**
    * Sets the idcategoria of this categoria pregunta.
    *
    * @param idcategoria the idcategoria of this categoria pregunta
    */
    @Override
    public void setIdcategoria(int idcategoria) {
        _categoriaPregunta.setIdcategoria(idcategoria);
    }

    /**
    * Returns the categoria of this categoria pregunta.
    *
    * @return the categoria of this categoria pregunta
    */
    @Override
    public java.lang.String getCategoria() {
        return _categoriaPregunta.getCategoria();
    }

    /**
    * Sets the categoria of this categoria pregunta.
    *
    * @param Categoria the categoria of this categoria pregunta
    */
    @Override
    public void setCategoria(java.lang.String Categoria) {
        _categoriaPregunta.setCategoria(Categoria);
    }

    @Override
    public boolean isNew() {
        return _categoriaPregunta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _categoriaPregunta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _categoriaPregunta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _categoriaPregunta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _categoriaPregunta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _categoriaPregunta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _categoriaPregunta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _categoriaPregunta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _categoriaPregunta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _categoriaPregunta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _categoriaPregunta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CategoriaPreguntaWrapper((CategoriaPregunta) _categoriaPregunta.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta) {
        return _categoriaPregunta.compareTo(categoriaPregunta);
    }

    @Override
    public int hashCode() {
        return _categoriaPregunta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.CategoriaPregunta> toCacheModel() {
        return _categoriaPregunta.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta toEscapedModel() {
        return new CategoriaPreguntaWrapper(_categoriaPregunta.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta toUnescapedModel() {
        return new CategoriaPreguntaWrapper(_categoriaPregunta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _categoriaPregunta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _categoriaPregunta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _categoriaPregunta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CategoriaPreguntaWrapper)) {
            return false;
        }

        CategoriaPreguntaWrapper categoriaPreguntaWrapper = (CategoriaPreguntaWrapper) obj;

        if (Validator.equals(_categoriaPregunta,
                    categoriaPreguntaWrapper._categoriaPregunta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CategoriaPregunta getWrappedCategoriaPregunta() {
        return _categoriaPregunta;
    }

    @Override
    public CategoriaPregunta getWrappedModel() {
        return _categoriaPregunta;
    }

    @Override
    public void resetOriginalValues() {
        _categoriaPregunta.resetOriginalValues();
    }
}
