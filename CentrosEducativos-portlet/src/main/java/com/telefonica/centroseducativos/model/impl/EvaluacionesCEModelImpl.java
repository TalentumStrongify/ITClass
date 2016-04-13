package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.model.EvaluacionesCE;
import com.telefonica.centroseducativos.model.EvaluacionesCEModel;
import com.telefonica.centroseducativos.model.EvaluacionesCESoap;
import com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EvaluacionesCE service. Represents a row in the &quot;CentrosEducativos_EvaluacionesCE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.telefonica.centroseducativos.model.EvaluacionesCEModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EvaluacionesCEImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCEImpl
 * @see com.telefonica.centroseducativos.model.EvaluacionesCE
 * @see com.telefonica.centroseducativos.model.EvaluacionesCEModel
 * @generated
 */
@JSON(strict = true)
public class EvaluacionesCEModelImpl extends BaseModelImpl<EvaluacionesCE>
    implements EvaluacionesCEModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a evaluaciones c e model instance should use the {@link com.telefonica.centroseducativos.model.EvaluacionesCE} interface instead.
     */
    public static final String TABLE_NAME = "CentrosEducativos_EvaluacionesCE";
    public static final Object[][] TABLE_COLUMNS = {
            { "idencuesta", Types.INTEGER },
            { "numpregunta", Types.INTEGER },
            { "notapregunta", Types.INTEGER },
            { "idce", Types.INTEGER },
            { "idrol", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table CentrosEducativos_EvaluacionesCE (idencuesta INTEGER not null,numpregunta INTEGER not null,notapregunta INTEGER,idce INTEGER,idrol INTEGER,primary key (idencuesta, numpregunta))";
    public static final String TABLE_SQL_DROP = "drop table CentrosEducativos_EvaluacionesCE";
    public static final String ORDER_BY_JPQL = " ORDER BY evaluacionesCE.id.idencuesta ASC, evaluacionesCE.id.numpregunta ASC";
    public static final String ORDER_BY_SQL = " ORDER BY CentrosEducativos_EvaluacionesCE.idencuesta ASC, CentrosEducativos_EvaluacionesCE.numpregunta ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.telefonica.centroseducativos.model.EvaluacionesCE"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.telefonica.centroseducativos.model.EvaluacionesCE"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.telefonica.centroseducativos.model.EvaluacionesCE"));
    private static ClassLoader _classLoader = EvaluacionesCE.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EvaluacionesCE.class
        };
    private int _idencuesta;
    private int _numpregunta;
    private int _notapregunta;
    private int _idce;
    private int _idrol;
    private EvaluacionesCE _escapedModel;

    public EvaluacionesCEModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EvaluacionesCE toModel(EvaluacionesCESoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EvaluacionesCE model = new EvaluacionesCEImpl();

        model.setIdencuesta(soapModel.getIdencuesta());
        model.setNumpregunta(soapModel.getNumpregunta());
        model.setNotapregunta(soapModel.getNotapregunta());
        model.setIdce(soapModel.getIdce());
        model.setIdrol(soapModel.getIdrol());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EvaluacionesCE> toModels(EvaluacionesCESoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EvaluacionesCE> models = new ArrayList<EvaluacionesCE>(soapModels.length);

        for (EvaluacionesCESoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public EvaluacionesCEPK getPrimaryKey() {
        return new EvaluacionesCEPK(_idencuesta, _numpregunta);
    }

    @Override
    public void setPrimaryKey(EvaluacionesCEPK primaryKey) {
        setIdencuesta(primaryKey.idencuesta);
        setNumpregunta(primaryKey.numpregunta);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EvaluacionesCEPK(_idencuesta, _numpregunta);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EvaluacionesCEPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EvaluacionesCE.class;
    }

    @Override
    public String getModelClassName() {
        return EvaluacionesCE.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idencuesta", getIdencuesta());
        attributes.put("numpregunta", getNumpregunta());
        attributes.put("notapregunta", getNotapregunta());
        attributes.put("idce", getIdce());
        attributes.put("idrol", getIdrol());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idencuesta = (Integer) attributes.get("idencuesta");

        if (idencuesta != null) {
            setIdencuesta(idencuesta);
        }

        Integer numpregunta = (Integer) attributes.get("numpregunta");

        if (numpregunta != null) {
            setNumpregunta(numpregunta);
        }

        Integer notapregunta = (Integer) attributes.get("notapregunta");

        if (notapregunta != null) {
            setNotapregunta(notapregunta);
        }

        Integer idce = (Integer) attributes.get("idce");

        if (idce != null) {
            setIdce(idce);
        }

        Integer idrol = (Integer) attributes.get("idrol");

        if (idrol != null) {
            setIdrol(idrol);
        }
    }

    @JSON
    @Override
    public int getIdencuesta() {
        return _idencuesta;
    }

    @Override
    public void setIdencuesta(int idencuesta) {
        _idencuesta = idencuesta;
    }

    @JSON
    @Override
    public int getNumpregunta() {
        return _numpregunta;
    }

    @Override
    public void setNumpregunta(int numpregunta) {
        _numpregunta = numpregunta;
    }

    @JSON
    @Override
    public int getNotapregunta() {
        return _notapregunta;
    }

    @Override
    public void setNotapregunta(int notapregunta) {
        _notapregunta = notapregunta;
    }

    @JSON
    @Override
    public int getIdce() {
        return _idce;
    }

    @Override
    public void setIdce(int idce) {
        _idce = idce;
    }

    @JSON
    @Override
    public int getIdrol() {
        return _idrol;
    }

    @Override
    public void setIdrol(int idrol) {
        _idrol = idrol;
    }

    @Override
    public EvaluacionesCE toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EvaluacionesCE) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EvaluacionesCEImpl evaluacionesCEImpl = new EvaluacionesCEImpl();

        evaluacionesCEImpl.setIdencuesta(getIdencuesta());
        evaluacionesCEImpl.setNumpregunta(getNumpregunta());
        evaluacionesCEImpl.setNotapregunta(getNotapregunta());
        evaluacionesCEImpl.setIdce(getIdce());
        evaluacionesCEImpl.setIdrol(getIdrol());

        evaluacionesCEImpl.resetOriginalValues();

        return evaluacionesCEImpl;
    }

    @Override
    public int compareTo(EvaluacionesCE evaluacionesCE) {
        EvaluacionesCEPK primaryKey = evaluacionesCE.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EvaluacionesCE)) {
            return false;
        }

        EvaluacionesCE evaluacionesCE = (EvaluacionesCE) obj;

        EvaluacionesCEPK primaryKey = evaluacionesCE.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<EvaluacionesCE> toCacheModel() {
        EvaluacionesCECacheModel evaluacionesCECacheModel = new EvaluacionesCECacheModel();

        evaluacionesCECacheModel.idencuesta = getIdencuesta();

        evaluacionesCECacheModel.numpregunta = getNumpregunta();

        evaluacionesCECacheModel.notapregunta = getNotapregunta();

        evaluacionesCECacheModel.idce = getIdce();

        evaluacionesCECacheModel.idrol = getIdrol();

        return evaluacionesCECacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{idencuesta=");
        sb.append(getIdencuesta());
        sb.append(", numpregunta=");
        sb.append(getNumpregunta());
        sb.append(", notapregunta=");
        sb.append(getNotapregunta());
        sb.append(", idce=");
        sb.append(getIdce());
        sb.append(", idrol=");
        sb.append(getIdrol());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.EvaluacionesCE");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idencuesta</column-name><column-value><![CDATA[");
        sb.append(getIdencuesta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numpregunta</column-name><column-value><![CDATA[");
        sb.append(getNumpregunta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>notapregunta</column-name><column-value><![CDATA[");
        sb.append(getNotapregunta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idce</column-name><column-value><![CDATA[");
        sb.append(getIdce());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idrol</column-name><column-value><![CDATA[");
        sb.append(getIdrol());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
