package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.RolUsuarioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RolUsuarioClp extends BaseModelImpl<RolUsuario>
    implements RolUsuario {
    private int _idrol;
    private String _nombrerol;
    private BaseModel<?> _rolUsuarioRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public RolUsuarioClp() {
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
    public int getPrimaryKey() {
        return _idrol;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdrol(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idrol;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getIdrol() {
        return _idrol;
    }

    @Override
    public void setIdrol(int idrol) {
        _idrol = idrol;

        if (_rolUsuarioRemoteModel != null) {
            try {
                Class<?> clazz = _rolUsuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setIdrol", int.class);

                method.invoke(_rolUsuarioRemoteModel, idrol);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombrerol() {
        return _nombrerol;
    }

    @Override
    public void setNombrerol(String nombrerol) {
        _nombrerol = nombrerol;

        if (_rolUsuarioRemoteModel != null) {
            try {
                Class<?> clazz = _rolUsuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setNombrerol", String.class);

                method.invoke(_rolUsuarioRemoteModel, nombrerol);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRolUsuarioRemoteModel() {
        return _rolUsuarioRemoteModel;
    }

    public void setRolUsuarioRemoteModel(BaseModel<?> rolUsuarioRemoteModel) {
        _rolUsuarioRemoteModel = rolUsuarioRemoteModel;
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

        Class<?> remoteModelClass = _rolUsuarioRemoteModel.getClass();

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

        Object returnValue = method.invoke(_rolUsuarioRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RolUsuarioLocalServiceUtil.addRolUsuario(this);
        } else {
            RolUsuarioLocalServiceUtil.updateRolUsuario(this);
        }
    }

    @Override
    public RolUsuario toEscapedModel() {
        return (RolUsuario) ProxyUtil.newProxyInstance(RolUsuario.class.getClassLoader(),
            new Class[] { RolUsuario.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RolUsuarioClp clone = new RolUsuarioClp();

        clone.setIdrol(getIdrol());
        clone.setNombrerol(getNombrerol());

        return clone;
    }

    @Override
    public int compareTo(RolUsuario rolUsuario) {
        int primaryKey = rolUsuario.getPrimaryKey();

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

        if (!(obj instanceof RolUsuarioClp)) {
            return false;
        }

        RolUsuarioClp rolUsuario = (RolUsuarioClp) obj;

        int primaryKey = rolUsuario.getPrimaryKey();

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
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idrol=");
        sb.append(getIdrol());
        sb.append(", nombrerol=");
        sb.append(getNombrerol());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.RolUsuario");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idrol</column-name><column-value><![CDATA[");
        sb.append(getIdrol());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombrerol</column-name><column-value><![CDATA[");
        sb.append(getNombrerol());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
