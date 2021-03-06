package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.telefonica.centroseducativos.model.Usuario;
import com.telefonica.centroseducativos.model.UsuarioModel;
import com.telefonica.centroseducativos.model.UsuarioSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Usuario service. Represents a row in the &quot;CentrosEducativos_Usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.telefonica.centroseducativos.model.UsuarioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UsuarioImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioImpl
 * @see com.telefonica.centroseducativos.model.Usuario
 * @see com.telefonica.centroseducativos.model.UsuarioModel
 * @generated
 */
@JSON(strict = true)
public class UsuarioModelImpl extends BaseModelImpl<Usuario>
    implements UsuarioModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a usuario model instance should use the {@link com.telefonica.centroseducativos.model.Usuario} interface instead.
     */
    public static final String TABLE_NAME = "CentrosEducativos_Usuario";
    public static final Object[][] TABLE_COLUMNS = {
            { "usuarioId", Types.BIGINT },
            { "cursoAcademico", Types.VARCHAR },
            { "haContestadoLaEncuesta", Types.BOOLEAN },
            { "idrol", Types.INTEGER },
            { "idce", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table CentrosEducativos_Usuario (usuarioId LONG not null primary key,cursoAcademico VARCHAR(75) null,haContestadoLaEncuesta BOOLEAN,idrol INTEGER,idce INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table CentrosEducativos_Usuario";
    public static final String ORDER_BY_JPQL = " ORDER BY usuario.usuarioId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY CentrosEducativos_Usuario.usuarioId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.telefonica.centroseducativos.model.Usuario"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.telefonica.centroseducativos.model.Usuario"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.telefonica.centroseducativos.model.Usuario"));
    private static ClassLoader _classLoader = Usuario.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Usuario.class
        };
    private long _usuarioId;
    private String _cursoAcademico;
    private boolean _haContestadoLaEncuesta;
    private int _idrol;
    private int _idce;
    private Usuario _escapedModel;

    public UsuarioModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Usuario toModel(UsuarioSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Usuario model = new UsuarioImpl();

        model.setUsuarioId(soapModel.getUsuarioId());
        model.setCursoAcademico(soapModel.getCursoAcademico());
        model.setHaContestadoLaEncuesta(soapModel.getHaContestadoLaEncuesta());
        model.setIdrol(soapModel.getIdrol());
        model.setIdce(soapModel.getIdce());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Usuario> toModels(UsuarioSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Usuario> models = new ArrayList<Usuario>(soapModels.length);

        for (UsuarioSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _usuarioId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setUsuarioId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _usuarioId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @JSON
    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    @JSON
    @Override
    public String getCursoAcademico() {
        if (_cursoAcademico == null) {
            return StringPool.BLANK;
        } else {
            return _cursoAcademico;
        }
    }

    @Override
    public void setCursoAcademico(String cursoAcademico) {
        _cursoAcademico = cursoAcademico;
    }

    @JSON
    @Override
    public boolean getHaContestadoLaEncuesta() {
        return _haContestadoLaEncuesta;
    }

    @Override
    public boolean isHaContestadoLaEncuesta() {
        return _haContestadoLaEncuesta;
    }

    @Override
    public void setHaContestadoLaEncuesta(boolean haContestadoLaEncuesta) {
        _haContestadoLaEncuesta = haContestadoLaEncuesta;
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

    @JSON
    @Override
    public int getIdce() {
        return _idce;
    }

    @Override
    public void setIdce(int idce) {
        _idce = idce;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Usuario.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Usuario toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Usuario) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setUsuarioId(getUsuarioId());
        usuarioImpl.setCursoAcademico(getCursoAcademico());
        usuarioImpl.setHaContestadoLaEncuesta(getHaContestadoLaEncuesta());
        usuarioImpl.setIdrol(getIdrol());
        usuarioImpl.setIdce(getIdce());

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
    }

    @Override
    public int compareTo(Usuario usuario) {
        long primaryKey = usuario.getPrimaryKey();

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

        if (!(obj instanceof Usuario)) {
            return false;
        }

        Usuario usuario = (Usuario) obj;

        long primaryKey = usuario.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Usuario> toCacheModel() {
        UsuarioCacheModel usuarioCacheModel = new UsuarioCacheModel();

        usuarioCacheModel.usuarioId = getUsuarioId();

        usuarioCacheModel.cursoAcademico = getCursoAcademico();

        String cursoAcademico = usuarioCacheModel.cursoAcademico;

        if ((cursoAcademico != null) && (cursoAcademico.length() == 0)) {
            usuarioCacheModel.cursoAcademico = null;
        }

        usuarioCacheModel.haContestadoLaEncuesta = getHaContestadoLaEncuesta();

        usuarioCacheModel.idrol = getIdrol();

        usuarioCacheModel.idce = getIdce();

        return usuarioCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{usuarioId=");
        sb.append(getUsuarioId());
        sb.append(", cursoAcademico=");
        sb.append(getCursoAcademico());
        sb.append(", haContestadoLaEncuesta=");
        sb.append(getHaContestadoLaEncuesta());
        sb.append(", idrol=");
        sb.append(getIdrol());
        sb.append(", idce=");
        sb.append(getIdce());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.Usuario");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>usuarioId</column-name><column-value><![CDATA[");
        sb.append(getUsuarioId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cursoAcademico</column-name><column-value><![CDATA[");
        sb.append(getCursoAcademico());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>haContestadoLaEncuesta</column-name><column-value><![CDATA[");
        sb.append(getHaContestadoLaEncuesta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idrol</column-name><column-value><![CDATA[");
        sb.append(getIdrol());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idce</column-name><column-value><![CDATA[");
        sb.append(getIdce());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
