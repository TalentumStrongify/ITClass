package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RolUsuario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuario
 * @generated
 */
public class RolUsuarioWrapper implements RolUsuario, ModelWrapper<RolUsuario> {
    private RolUsuario _rolUsuario;

    public RolUsuarioWrapper(RolUsuario rolUsuario) {
        _rolUsuario = rolUsuario;
    }

    @Override
    public Class<?> getModelClass() {
        return RolUsuario.class;
    }

    @Override
    public String getModelClassName() {
        return RolUsuario.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idrol", getIdrol());
        attributes.put("nombrerol", getNombrerol());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idrol = (Integer) attributes.get("idrol");

        if (idrol != null) {
            setIdrol(idrol);
        }

        String nombrerol = (String) attributes.get("nombrerol");

        if (nombrerol != null) {
            setNombrerol(nombrerol);
        }
    }

    /**
    * Returns the primary key of this rol usuario.
    *
    * @return the primary key of this rol usuario
    */
    @Override
    public int getPrimaryKey() {
        return _rolUsuario.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rol usuario.
    *
    * @param primaryKey the primary key of this rol usuario
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _rolUsuario.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the idrol of this rol usuario.
    *
    * @return the idrol of this rol usuario
    */
    @Override
    public int getIdrol() {
        return _rolUsuario.getIdrol();
    }

    /**
    * Sets the idrol of this rol usuario.
    *
    * @param idrol the idrol of this rol usuario
    */
    @Override
    public void setIdrol(int idrol) {
        _rolUsuario.setIdrol(idrol);
    }

    /**
    * Returns the nombrerol of this rol usuario.
    *
    * @return the nombrerol of this rol usuario
    */
    @Override
    public java.lang.String getNombrerol() {
        return _rolUsuario.getNombrerol();
    }

    /**
    * Sets the nombrerol of this rol usuario.
    *
    * @param nombrerol the nombrerol of this rol usuario
    */
    @Override
    public void setNombrerol(java.lang.String nombrerol) {
        _rolUsuario.setNombrerol(nombrerol);
    }

    @Override
    public boolean isNew() {
        return _rolUsuario.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rolUsuario.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rolUsuario.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rolUsuario.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rolUsuario.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rolUsuario.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rolUsuario.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rolUsuario.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rolUsuario.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rolUsuario.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rolUsuario.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RolUsuarioWrapper((RolUsuario) _rolUsuario.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario) {
        return _rolUsuario.compareTo(rolUsuario);
    }

    @Override
    public int hashCode() {
        return _rolUsuario.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.centroseducativos.model.RolUsuario> toCacheModel() {
        return _rolUsuario.toCacheModel();
    }

    @Override
    public com.telefonica.centroseducativos.model.RolUsuario toEscapedModel() {
        return new RolUsuarioWrapper(_rolUsuario.toEscapedModel());
    }

    @Override
    public com.telefonica.centroseducativos.model.RolUsuario toUnescapedModel() {
        return new RolUsuarioWrapper(_rolUsuario.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rolUsuario.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rolUsuario.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rolUsuario.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RolUsuarioWrapper)) {
            return false;
        }

        RolUsuarioWrapper rolUsuarioWrapper = (RolUsuarioWrapper) obj;

        if (Validator.equals(_rolUsuario, rolUsuarioWrapper._rolUsuario)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RolUsuario getWrappedRolUsuario() {
        return _rolUsuario;
    }

    @Override
    public RolUsuario getWrappedModel() {
        return _rolUsuario;
    }

    @Override
    public void resetOriginalValues() {
        _rolUsuario.resetOriginalValues();
    }
}
