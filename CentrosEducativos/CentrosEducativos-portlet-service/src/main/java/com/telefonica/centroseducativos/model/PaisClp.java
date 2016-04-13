package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.PaisLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PaisClp extends BaseModelImpl<Pais> implements Pais {
    private int _idpais;
    private String _nombrepais;
    private BaseModel<?> _paisRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public PaisClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Pais.class;
    }

    @Override
    public String getModelClassName() {
        return Pais.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _idpais;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdpais(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idpais;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idpais", getIdpais());
        attributes.put("nombrepais", getNombrepais());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idpais = (Integer) attributes.get("idpais");

        if (idpais != null) {
            setIdpais(idpais);
        }

        String nombrepais = (String) attributes.get("nombrepais");

        if (nombrepais != null) {
            setNombrepais(nombrepais);
        }
    }

    @Override
    public int getIdpais() {
        return _idpais;
    }

    @Override
    public void setIdpais(int idpais) {
        _idpais = idpais;

        if (_paisRemoteModel != null) {
            try {
                Class<?> clazz = _paisRemoteModel.getClass();

                Method method = clazz.getMethod("setIdpais", int.class);

                method.invoke(_paisRemoteModel, idpais);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombrepais() {
        return _nombrepais;
    }

    @Override
    public void setNombrepais(String nombrepais) {
        _nombrepais = nombrepais;

        if (_paisRemoteModel != null) {
            try {
                Class<?> clazz = _paisRemoteModel.getClass();

                Method method = clazz.getMethod("setNombrepais", String.class);

                method.invoke(_paisRemoteModel, nombrepais);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaisRemoteModel() {
        return _paisRemoteModel;
    }

    public void setPaisRemoteModel(BaseModel<?> paisRemoteModel) {
        _paisRemoteModel = paisRemoteModel;
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

        Class<?> remoteModelClass = _paisRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paisRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaisLocalServiceUtil.addPais(this);
        } else {
            PaisLocalServiceUtil.updatePais(this);
        }
    }

    @Override
    public Pais toEscapedModel() {
        return (Pais) ProxyUtil.newProxyInstance(Pais.class.getClassLoader(),
            new Class[] { Pais.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaisClp clone = new PaisClp();

        clone.setIdpais(getIdpais());
        clone.setNombrepais(getNombrepais());

        return clone;
    }

    @Override
    public int compareTo(Pais pais) {
        int primaryKey = pais.getPrimaryKey();

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

        if (!(obj instanceof PaisClp)) {
            return false;
        }

        PaisClp pais = (PaisClp) obj;

        int primaryKey = pais.getPrimaryKey();

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

        sb.append("{idpais=");
        sb.append(getIdpais());
        sb.append(", nombrepais=");
        sb.append(getNombrepais());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.Pais");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idpais</column-name><column-value><![CDATA[");
        sb.append(getIdpais());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombrepais</column-name><column-value><![CDATA[");
        sb.append(getNombrepais());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
