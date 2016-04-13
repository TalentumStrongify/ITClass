package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.ComunidadAutonomaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ComunidadAutonomaClp extends BaseModelImpl<ComunidadAutonoma>
    implements ComunidadAutonoma {
    private int _idca;
    private String _nombrecomunidad;
    private int _idpais;
    private BaseModel<?> _comunidadAutonomaRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public ComunidadAutonomaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return ComunidadAutonoma.class;
    }

    @Override
    public String getModelClassName() {
        return ComunidadAutonoma.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _idca;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdca(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idca;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idca", getIdca());
        attributes.put("nombrecomunidad", getNombrecomunidad());
        attributes.put("idpais", getIdpais());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idca = (Integer) attributes.get("idca");

        if (idca != null) {
            setIdca(idca);
        }

        String nombrecomunidad = (String) attributes.get("nombrecomunidad");

        if (nombrecomunidad != null) {
            setNombrecomunidad(nombrecomunidad);
        }

        Integer idpais = (Integer) attributes.get("idpais");

        if (idpais != null) {
            setIdpais(idpais);
        }
    }

    @Override
    public int getIdca() {
        return _idca;
    }

    @Override
    public void setIdca(int idca) {
        _idca = idca;

        if (_comunidadAutonomaRemoteModel != null) {
            try {
                Class<?> clazz = _comunidadAutonomaRemoteModel.getClass();

                Method method = clazz.getMethod("setIdca", int.class);

                method.invoke(_comunidadAutonomaRemoteModel, idca);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombrecomunidad() {
        return _nombrecomunidad;
    }

    @Override
    public void setNombrecomunidad(String nombrecomunidad) {
        _nombrecomunidad = nombrecomunidad;

        if (_comunidadAutonomaRemoteModel != null) {
            try {
                Class<?> clazz = _comunidadAutonomaRemoteModel.getClass();

                Method method = clazz.getMethod("setNombrecomunidad",
                        String.class);

                method.invoke(_comunidadAutonomaRemoteModel, nombrecomunidad);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIdpais() {
        return _idpais;
    }

    @Override
    public void setIdpais(int idpais) {
        _idpais = idpais;

        if (_comunidadAutonomaRemoteModel != null) {
            try {
                Class<?> clazz = _comunidadAutonomaRemoteModel.getClass();

                Method method = clazz.getMethod("setIdpais", int.class);

                method.invoke(_comunidadAutonomaRemoteModel, idpais);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getComunidadAutonomaRemoteModel() {
        return _comunidadAutonomaRemoteModel;
    }

    public void setComunidadAutonomaRemoteModel(
        BaseModel<?> comunidadAutonomaRemoteModel) {
        _comunidadAutonomaRemoteModel = comunidadAutonomaRemoteModel;
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

        Class<?> remoteModelClass = _comunidadAutonomaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_comunidadAutonomaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ComunidadAutonomaLocalServiceUtil.addComunidadAutonoma(this);
        } else {
            ComunidadAutonomaLocalServiceUtil.updateComunidadAutonoma(this);
        }
    }

    @Override
    public ComunidadAutonoma toEscapedModel() {
        return (ComunidadAutonoma) ProxyUtil.newProxyInstance(ComunidadAutonoma.class.getClassLoader(),
            new Class[] { ComunidadAutonoma.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ComunidadAutonomaClp clone = new ComunidadAutonomaClp();

        clone.setIdca(getIdca());
        clone.setNombrecomunidad(getNombrecomunidad());
        clone.setIdpais(getIdpais());

        return clone;
    }

    @Override
    public int compareTo(ComunidadAutonoma comunidadAutonoma) {
        int primaryKey = comunidadAutonoma.getPrimaryKey();

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

        if (!(obj instanceof ComunidadAutonomaClp)) {
            return false;
        }

        ComunidadAutonomaClp comunidadAutonoma = (ComunidadAutonomaClp) obj;

        int primaryKey = comunidadAutonoma.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{idca=");
        sb.append(getIdca());
        sb.append(", nombrecomunidad=");
        sb.append(getNombrecomunidad());
        sb.append(", idpais=");
        sb.append(getIdpais());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.ComunidadAutonoma");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idca</column-name><column-value><![CDATA[");
        sb.append(getIdca());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombrecomunidad</column-name><column-value><![CDATA[");
        sb.append(getNombrecomunidad());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idpais</column-name><column-value><![CDATA[");
        sb.append(getIdpais());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
