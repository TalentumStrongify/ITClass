package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ComunidadAutonoma service. Represents a row in the &quot;CentrosEducativos_ComunidadAutonoma&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonoma
 * @see com.telefonica.centroseducativos.model.impl.ComunidadAutonomaImpl
 * @see com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl
 * @generated
 */
public interface ComunidadAutonomaModel extends BaseModel<ComunidadAutonoma> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a comunidad autonoma model instance should use the {@link ComunidadAutonoma} interface instead.
     */

    /**
     * Returns the primary key of this comunidad autonoma.
     *
     * @return the primary key of this comunidad autonoma
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this comunidad autonoma.
     *
     * @param primaryKey the primary key of this comunidad autonoma
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the idca of this comunidad autonoma.
     *
     * @return the idca of this comunidad autonoma
     */
    public int getIdca();

    /**
     * Sets the idca of this comunidad autonoma.
     *
     * @param idca the idca of this comunidad autonoma
     */
    public void setIdca(int idca);

    /**
     * Returns the nombrecomunidad of this comunidad autonoma.
     *
     * @return the nombrecomunidad of this comunidad autonoma
     */
    @AutoEscape
    public String getNombrecomunidad();

    /**
     * Sets the nombrecomunidad of this comunidad autonoma.
     *
     * @param nombrecomunidad the nombrecomunidad of this comunidad autonoma
     */
    public void setNombrecomunidad(String nombrecomunidad);

    /**
     * Returns the idpais of this comunidad autonoma.
     *
     * @return the idpais of this comunidad autonoma
     */
    public int getIdpais();

    /**
     * Sets the idpais of this comunidad autonoma.
     *
     * @param idpais the idpais of this comunidad autonoma
     */
    public void setIdpais(int idpais);

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
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.telefonica.centroseducativos.model.ComunidadAutonoma> toCacheModel();

    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma toEscapedModel();

    @Override
    public com.telefonica.centroseducativos.model.ComunidadAutonoma toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
