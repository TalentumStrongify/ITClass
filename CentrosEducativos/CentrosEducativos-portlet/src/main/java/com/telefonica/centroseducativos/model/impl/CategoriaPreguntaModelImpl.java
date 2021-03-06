package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.model.CategoriaPregunta;
import com.telefonica.centroseducativos.model.CategoriaPreguntaModel;
import com.telefonica.centroseducativos.model.CategoriaPreguntaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CategoriaPregunta service. Represents a row in the &quot;CentrosEducativos_CategoriaPregunta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.telefonica.centroseducativos.model.CategoriaPreguntaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CategoriaPreguntaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaImpl
 * @see com.telefonica.centroseducativos.model.CategoriaPregunta
 * @see com.telefonica.centroseducativos.model.CategoriaPreguntaModel
 * @generated
 */
@JSON(strict = true)
public class CategoriaPreguntaModelImpl extends BaseModelImpl<CategoriaPregunta>
    implements CategoriaPreguntaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a categoria pregunta model instance should use the {@link com.telefonica.centroseducativos.model.CategoriaPregunta} interface instead.
     */
    public static final String TABLE_NAME = "CentrosEducativos_CategoriaPregunta";
    public static final Object[][] TABLE_COLUMNS = {
            { "idcategoria", Types.INTEGER },
            { "Categoria", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table CentrosEducativos_CategoriaPregunta (idcategoria INTEGER not null primary key,Categoria VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table CentrosEducativos_CategoriaPregunta";
    public static final String ORDER_BY_JPQL = " ORDER BY categoriaPregunta.idcategoria ASC";
    public static final String ORDER_BY_SQL = " ORDER BY CentrosEducativos_CategoriaPregunta.idcategoria ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.telefonica.centroseducativos.model.CategoriaPregunta"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.telefonica.centroseducativos.model.CategoriaPregunta"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.telefonica.centroseducativos.model.CategoriaPregunta"));
    private static ClassLoader _classLoader = CategoriaPregunta.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            CategoriaPregunta.class
        };
    private int _idcategoria;
    private String _Categoria;
    private CategoriaPregunta _escapedModel;

    public CategoriaPreguntaModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static CategoriaPregunta toModel(CategoriaPreguntaSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        CategoriaPregunta model = new CategoriaPreguntaImpl();

        model.setIdcategoria(soapModel.getIdcategoria());
        model.setCategoria(soapModel.getCategoria());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<CategoriaPregunta> toModels(
        CategoriaPreguntaSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<CategoriaPregunta> models = new ArrayList<CategoriaPregunta>(soapModels.length);

        for (CategoriaPreguntaSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _idcategoria;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdcategoria(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idcategoria;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @JSON
    @Override
    public int getIdcategoria() {
        return _idcategoria;
    }

    @Override
    public void setIdcategoria(int idcategoria) {
        _idcategoria = idcategoria;
    }

    @JSON
    @Override
    public String getCategoria() {
        if (_Categoria == null) {
            return StringPool.BLANK;
        } else {
            return _Categoria;
        }
    }

    @Override
    public void setCategoria(String Categoria) {
        _Categoria = Categoria;
    }

    @Override
    public CategoriaPregunta toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (CategoriaPregunta) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        CategoriaPreguntaImpl categoriaPreguntaImpl = new CategoriaPreguntaImpl();

        categoriaPreguntaImpl.setIdcategoria(getIdcategoria());
        categoriaPreguntaImpl.setCategoria(getCategoria());

        categoriaPreguntaImpl.resetOriginalValues();

        return categoriaPreguntaImpl;
    }

    @Override
    public int compareTo(CategoriaPregunta categoriaPregunta) {
        int primaryKey = categoriaPregunta.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CategoriaPregunta)) {
            return false;
        }

        CategoriaPregunta categoriaPregunta = (CategoriaPregunta) obj;

        int primaryKey = categoriaPregunta.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<CategoriaPregunta> toCacheModel() {
        CategoriaPreguntaCacheModel categoriaPreguntaCacheModel = new CategoriaPreguntaCacheModel();

        categoriaPreguntaCacheModel.idcategoria = getIdcategoria();

        categoriaPreguntaCacheModel.Categoria = getCategoria();

        String Categoria = categoriaPreguntaCacheModel.Categoria;

        if ((Categoria != null) && (Categoria.length() == 0)) {
            categoriaPreguntaCacheModel.Categoria = null;
        }

        return categoriaPreguntaCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idcategoria=");
        sb.append(getIdcategoria());
        sb.append(", Categoria=");
        sb.append(getCategoria());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.CategoriaPregunta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idcategoria</column-name><column-value><![CDATA[");
        sb.append(getIdcategoria());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Categoria</column-name><column-value><![CDATA[");
        sb.append(getCategoria());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
