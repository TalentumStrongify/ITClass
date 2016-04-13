package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Usuario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
public class UsuarioWrapper implements Usuario, ModelWrapper<Usuario> {
    private Usuario _usuario;

    public UsuarioWrapper(Usuario usuario) {
        _usuario = usuario;
    }

    @Override
    public Class<?> getModelClass() {
        return Usuario.class;
    }

    @Override
    public String getModelClassName() {
        return Usuario.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("usuarioId", getUsuarioId());
        attributes.put("cursoAcademico", getCursoAcademico());
        attributes.put("haContestadoLaEncuesta", getHaContestadoLaEncuesta());
        attributes.put("idrol", getIdrol());
        attributes.put("idce", getIdce());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long usuarioId = (Long) attributes.get("usuarioId");

        if (usuarioId != null) {
            setUsuarioId(usuarioId);
        }

        String cursoAcademico = (String) attributes.get("cursoAcademico");

        if (cursoAcademico != null) {
            setCursoAcademico(cursoAcademico);
        }

        Boolean haContestadoLaEncuesta = (Boolean) attributes.get(
                "haContestadoLaEncuesta");

        if (haContestadoLaEncuesta != null) {
            setHaContestadoLaEncuesta(haContestadoLaEncuesta);
        }

        Integer idrol = (Integer) attributes.get("idrol");

        if (idrol != null) {
            setIdrol(idrol);
        }

        Integer idce = (Integer) attributes.get("idce");

        if (idce != null) {
            setIdce(idce);
        }
    }

    /**
    * Returns the primary key of this usuario.
    *
    * @return the primary key of this usuario
    */
    @Override
    public long getPrimaryKey() {
        return _usuario.getPrimaryKey();
    }

    /**
    * Sets the primary key of this usuario.
    *
    * @param primaryKey the primary key of this usuario
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _usuario.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the usuario ID of this usuario.
    *
    * @return the usuario ID of this usuario
    */
    @Override
    public long getUsuarioId() {
        return _usuario.getUsuarioId();
    }

    /**
    * Sets the usuario ID of this usuario.
    *
    * @param usuarioId the usuario ID of this usuario
    */
    @Override
    public void setUsuarioId(long usuarioId) {
        _usuario.setUsuarioId(usuarioId);
    }

    /**
    * Returns the curso academico of this usuario.
    *
    * @return the curso academico of this usuario
    */
    @Override
    public java.lang.String getCursoAcademico() {
        return _usuario.getCursoAcademico();
    }

    /**
    * Sets the curso academico of this usuario.
    *
    * @param cursoAcademico the curso academico of this usuario
    */
    @Override
    public void setCursoAcademico(java.lang.String cursoAcademico) {
        _usuario.setCursoAcademico(cursoAcademico);
    }

    /**
    * Returns the ha contestado la encuesta of this usuario.
    *
    * @return the ha contestado la encuesta of this usuario
    */
    @Override
    public boolean getHaContestadoLaEncuesta() {
        return _usuario.getHaContestadoLaEncuesta();
    }

    /**
    * Returns <code>true</code> if this usuario is ha contestado la encuesta.
    *
    * @return <code>true</code> if this usuario is ha contestado la encuesta; <code>false</code> otherwise
    */
    @Override
    public boolean isHaContestadoLaEncuesta() {
        return _usuario.isHaContestadoLaEncuesta();
    }

    /**
    * Sets whether this usuario is ha contestado la encuesta.
    *
    * @param haContestadoLaEncuesta the ha contestado la encuesta of this usuario
    */
    @Override
    public void setHaContestadoLaEncuesta(boolean haContestadoLaEncuesta) {
        _usuario.setHaContestadoLaEncuesta(haContestadoLaEncuesta);
    }

    /**
    * Returns the idrol of this usuario.
    *
    * @return the idrol of this usuario
    */
    @Override
    public int getIdrol() {
        return _usuario.getIdrol();
    }

    /**
    * Sets the idrol of this usuario.
    *
    * @param idrol the idrol of this usuario
    */
    @Override
    public void setIdrol(int idrol) {
        _usuario.setIdrol(idrol);
    }

    /**
    * Returns the idce of this usuario.
    *
    * @return the idce of this usuario
    */
    @Override
    public int getIdce() {
        return _usuario.getIdce();
    }

    /**
    * Sets the idce of this usuario.
    *
    * @param idce the idce of this usuario
    */
    @Override
    public void setIdce(int idce) {
        _usuario.setIdce(idce);
    }

    @Override
    public boolean isNew() {
        return _usuario.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _usuario.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _usuario.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _usuario.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _usuario.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _usuario.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _usuario.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _usuario.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _usuario.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _usuario.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _usuario.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UsuarioWrapper((Usuario) _usuario.clone());
    }

    @Override
    public int compareTo(com.telefonica.centroseducativos.model.Usuario usuario) {
        return _usuario.compareTo(usuario);
    }

    @Override
    public int hashCode() {
        return _usuario.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.Usuario> toCacheModel() {
        return _usuario.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.Usuario toEscapedModel() {
        return new UsuarioWrapper(_usuario.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.Usuario toUnescapedModel() {
        return new UsuarioWrapper(_usuario.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _usuario.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _usuario.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _usuario.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UsuarioWrapper)) {
            return false;
        }

        UsuarioWrapper usuarioWrapper = (UsuarioWrapper) obj;

        if (Validator.equals(_usuario, usuarioWrapper._usuario)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Usuario getWrappedUsuario() {
        return _usuario;
    }

    @Override
    public Usuario getWrappedModel() {
        return _usuario;
    }

    @Override
    public void resetOriginalValues() {
        _usuario.resetOriginalValues();
    }
}
