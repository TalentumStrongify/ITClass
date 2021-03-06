package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CategoriaPregunta service. Represents a row in the &quot;CentrosEducativos_CategoriaPregunta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPregunta
 * @see com.telefonica.centroseducativos.model.impl.CategoriaPreguntaImpl
 * @see com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl
 * @generated
 */
public interface CategoriaPreguntaModel extends BaseModel<CategoriaPregunta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a categoria pregunta model instance should use the {@link CategoriaPregunta} interface instead.
     */

    /**
     * Returns the primary key of this categoria pregunta.
     *
     * @return the primary key of this categoria pregunta
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this categoria pregunta.
     *
     * @param primaryKey the primary key of this categoria pregunta
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the idcategoria of this categoria pregunta.
     *
     * @return the idcategoria of this categoria pregunta
     */
    public int getIdcategoria();

    /**
     * Sets the idcategoria of this categoria pregunta.
     *
     * @param idcategoria the idcategoria of this categoria pregunta
     */
    public void setIdcategoria(int idcategoria);

    /**
     * Returns the categoria of this categoria pregunta.
     *
     * @return the categoria of this categoria pregunta
     */
    @AutoEscape
    public String getCategoria();

    /**
     * Sets the categoria of this categoria pregunta.
     *
     * @param Categoria the categoria of this categoria pregunta
     */
    public void setCategoria(String Categoria);

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
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.telefonica.centroseducativos.model.CategoriaPregunta> toCacheModel();

    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta toEscapedModel();

    @Override
    public com.telefonica.centroseducativos.model.CategoriaPregunta toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
