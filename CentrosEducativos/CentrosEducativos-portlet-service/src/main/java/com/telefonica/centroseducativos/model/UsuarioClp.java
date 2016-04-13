package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.UsuarioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UsuarioClp extends BaseModelImpl<Usuario> implements Usuario {
    private long _usuarioId;
    private String _cursoAcademico;
    private boolean _haContestadoLaEncuesta;
    private int _idrol;
    private int _idce;
    private BaseModel<?> _usuarioRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public UsuarioClp() {
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

    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setUsuarioId", long.class);

                method.invoke(_usuarioRemoteModel, usuarioId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCursoAcademico() {
        return _cursoAcademico;
    }

    @Override
    public void setCursoAcademico(String cursoAcademico) {
        _cursoAcademico = cursoAcademico;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setCursoAcademico",
                        String.class);

                method.invoke(_usuarioRemoteModel, cursoAcademico);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setHaContestadoLaEncuesta",
                        boolean.class);

                method.invoke(_usuarioRemoteModel, haContestadoLaEncuesta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIdrol() {
        return _idrol;
    }

    @Override
    public void setIdrol(int idrol) {
        _idrol = idrol;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setIdrol", int.class);

                method.invoke(_usuarioRemoteModel, idrol);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIdce() {
        return _idce;
    }

    @Override
    public void setIdce(int idce) {
        _idce = idce;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setIdce", int.class);

                method.invoke(_usuarioRemoteModel, idce);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUsuarioRemoteModel() {
        return _usuarioRemoteModel;
    }

    public void setUsuarioRemoteModel(BaseModel<?> usuarioRemoteModel) {
        _usuarioRemoteModel = usuarioRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _usuarioRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_usuarioRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UsuarioLocalServiceUtil.addUsuario(this);
        } else {
            UsuarioLocalServiceUtil.updateUsuario(this);
        }
    }

    @Override
    public Usuario toEscapedModel() {
        return (Usuario) ProxyUtil.newProxyInstance(Usuario.class.getClassLoader(),
            new Class[] { Usuario.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UsuarioClp clone = new UsuarioClp();

        clone.setUsuarioId(getUsuarioId());
        clone.setCursoAcademico(getCursoAcademico());
        clone.setHaContestadoLaEncuesta(getHaContestadoLaEncuesta());
        clone.setIdrol(getIdrol());
        clone.setIdce(getIdce());

        return clone;
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

        if (!(obj instanceof UsuarioClp)) {
            return false;
        }

        UsuarioClp usuario = (UsuarioClp) obj;

        long primaryKey = usuario.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
