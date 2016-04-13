package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the RolUsuario service. Represents a row in the &quot;CentrosEducativos_RolUsuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.centroseducativos.model.impl.RolUsuarioImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuario
 * @see com.telefonica.centroseducativos.model.impl.RolUsuarioImpl
 * @see com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl
 * @generated
 */
public interface RolUsuarioModel extends BaseModel<RolUsuario> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a rol usuario model instance should use the {@link RolUsuario} interface instead.
     */

    /**
     * Returns the primary key of this rol usuario.
     *
     * @return the primary key of this rol usuario
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this rol usuario.
     *
     * @param primaryKey the primary key of this rol usuario
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the idrol of this rol usuario.
     *
     * @return the idrol of this rol usuario
     */
    public int getIdrol();

    /**
     * Sets the idrol of this rol usuario.
     *
     * @param idrol the idrol of this rol usuario
     */
    public void setIdrol(int idrol);

    /**
     * Returns the nombrerol of this rol usuario.
     *
     * @return the nombrerol of this rol usuario
     */
    @AutoEscape
    public String getNombrerol();

    /**
     * Sets the nombrerol of this rol usuario.
     *
     * @param nombrerol the nombrerol of this rol usuario
     */
    public void setNombrerol(String nombrerol);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.telefonica.centroseducativos.model.RolUsuario> toCacheModel();

    @Override
    public com.telefonica.centroseducativos.model.RolUsuario toEscapedModel();

    @Override
    public com.telefonica.centroseducativos.model.RolUsuario toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}