package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PreguntasEncuesta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuesta
 * @generated
 */
public class PreguntasEncuestaWrapper implements PreguntasEncuesta,
    ModelWrapper<PreguntasEncuesta> {
    private PreguntasEncuesta _preguntasEncuesta;

    public PreguntasEncuestaWrapper(PreguntasEncuesta preguntasEncuesta) {
        _preguntasEncuesta = preguntasEncuesta;
    }

    @Override
    public Class<?> getModelClass() {
        return PreguntasEncuesta.class;
    }

    @Override
    public String getModelClassName() {
        return PreguntasEncuesta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("numpregunta", getNumpregunta());
        attributes.put("enunciadopregunta", getEnunciadopregunta());
        attributes.put("idcategoria", getIdcategoria());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer numpregunta = (Integer) attributes.get("numpregunta");

        if (numpregunta != null) {
            setNumpregunta(numpregunta);
        }

        String enunciadopregunta = (String) attributes.get("enunciadopregunta");

        if (enunciadopregunta != null) {
            setEnunciadopregunta(enunciadopregunta);
        }

        Long idcategoria = (Long) attributes.get("idcategoria");

        if (idcategoria != null) {
            setIdcategoria(idcategoria);
        }
    }

    /**
    * Returns the primary key of this preguntas encuesta.
    *
    * @return the primary key of this preguntas encuesta
    */
    @Override
    public int getPrimaryKey() {
        return _preguntasEncuesta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this preguntas encuesta.
    *
    * @param primaryKey the primary key of this preguntas encuesta
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _preguntasEncuesta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the numpregunta of this preguntas encuesta.
    *
    * @return the numpregunta of this preguntas encuesta
    */
    @Override
    public int getNumpregunta() {
        return _preguntasEncuesta.getNumpregunta();
    }

    /**
    * Sets the numpregunta of this preguntas encuesta.
    *
    * @param numpregunta the numpregunta of this preguntas encuesta
    */
    @Override
    public void setNumpregunta(int numpregunta) {
        _preguntasEncuesta.setNumpregunta(numpregunta);
    }

    /**
    * Returns the enunciadopregunta of this preguntas encuesta.
    *
    * @return the enunciadopregunta of this preguntas encuesta
    */
    @Override
    public java.lang.String getEnunciadopregunta() {
        return _preguntasEncuesta.getEnunciadopregunta();
    }

    /**
    * Sets the enunciadopregunta of this preguntas encuesta.
    *
    * @param enunciadopregunta the enunciadopregunta of this preguntas encuesta
    */
    @Override
    public void setEnunciadopregunta(java.lang.String enunciadopregunta) {
        _preguntasEncuesta.setEnunciadopregunta(enunciadopregunta);
    }

    /**
    * Returns the idcategoria of this preguntas encuesta.
    *
    * @return the idcategoria of this preguntas encuesta
    */
    @Override
    public long getIdcategoria() {
        return _preguntasEncuesta.getIdcategoria();
    }

    /**
    * Sets the idcategoria of this preguntas encuesta.
    *
    * @param idcategoria the idcategoria of this preguntas encuesta
    */
    @Override
    public void setIdcategoria(long idcategoria) {
        _preguntasEncuesta.setIdcategoria(idcategoria);
    }

    @Override
    public boolean isNew() {
        return _preguntasEncuesta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _preguntasEncuesta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _preguntasEncuesta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _preguntasEncuesta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _preguntasEncuesta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _preguntasEncuesta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _preguntasEncuesta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _preguntasEncuesta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _preguntasEncuesta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _preguntasEncuesta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _preguntasEncuesta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PreguntasEncuestaWrapper((PreguntasEncuesta) _preguntasEncuesta.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta) {
        return _preguntasEncuesta.compareTo(preguntasEncuesta);
    }

    @Override
    public int hashCode() {
        return _preguntasEncuesta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.PreguntasEncuesta> toCacheModel() {
        return _preguntasEncuesta.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta toEscapedModel() {
        return new PreguntasEncuestaWrapper(_preguntasEncuesta.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.PreguntasEncuesta toUnescapedModel() {
        return new PreguntasEncuestaWrapper(_preguntasEncuesta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _preguntasEncuesta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _preguntasEncuesta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _preguntasEncuesta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PreguntasEncuestaWrapper)) {
            return false;
        }

        PreguntasEncuestaWrapper preguntasEncuestaWrapper = (PreguntasEncuestaWrapper) obj;

        if (Validator.equals(_preguntasEncuesta,
                    preguntasEncuestaWrapper._preguntasEncuesta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PreguntasEncuesta getWrappedPreguntasEncuesta() {
        return _preguntasEncuesta;
    }

    @Override
    public PreguntasEncuesta getWrappedModel() {
        return _preguntasEncuesta;
    }

    @Override
    public void resetOriginalValues() {
        _preguntasEncuesta.resetOriginalValues();
    }
}
