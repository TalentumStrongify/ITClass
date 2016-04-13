package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.CentroEducativoLocalServiceUtil;
import com.telefonica.centroseducativos.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class CentroEducativoClp extends BaseModelImpl<CentroEducativo>
    implements CentroEducativo {
    private int _idce;
    private String _nombrece;
    private int _idca;
    private BaseModel<?> _centroEducativoRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public CentroEducativoClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return CentroEducativo.class;
    }

    @Override
    public String getModelClassName() {
        return CentroEducativo.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _idce;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdce(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idce;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idce", getIdce());
        attributes.put("nombrece", getNombrece());
        attributes.put("idca", getIdca());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idce = (Integer) attributes.get("idce");

        if (idce != null) {
            setIdce(idce);
        }

        String nombrece = (String) attributes.get("nombrece");

        if (nombrece != null) {
            setNombrece(nombrece);
        }

        Integer idca = (Integer) attributes.get("idca");

        if (idca != null) {
            setIdca(idca);
        }
    }

    @Override
    public int getIdce() {
        return _idce;
    }

    @Override
    public void setIdce(int idce) {
        _idce = idce;

        if (_centroEducativoRemoteModel != null) {
            try {
                Class<?> clazz = _centroEducativoRemoteModel.getClass();

                Method method = clazz.getMethod("setIdce", int.class);

                method.invoke(_centroEducativoRemoteModel, idce);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombrece() {
        return _nombrece;
    }

    @Override
    public void setNombrece(String nombrece) {
        _nombrece = nombrece;

        if (_centroEducativoRemoteModel != null) {
            try {
                Class<?> clazz = _centroEducativoRemoteModel.getClass();

                Method method = clazz.getMethod("setNombrece", String.class);

                method.invoke(_centroEducativoRemoteModel, nombrece);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIdca() {
        return _idca;
    }

    @Override
    public void setIdca(int idca) {
        _idca = idca;

        if (_centroEducativoRemoteModel != null) {
            try {
                Class<?> clazz = _centroEducativoRemoteModel.getClass();

                Method method = clazz.getMethod("setIdca", int.class);

                method.invoke(_centroEducativoRemoteModel, idca);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCentroEducativoRemoteModel() {
        return _centroEducativoRemoteModel;
    }

    public void setCentroEducativoRemoteModel(
        BaseModel<?> centroEducativoRemoteModel) {
        _centroEducativoRemoteModel = centroEducativoRemoteModel;
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

        Class<?> remoteModelClass = _centroEducativoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_centroEducativoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CentroEducativoLocalServiceUtil.addCentroEducativo(this);
        } else {
            CentroEducativoLocalServiceUtil.updateCentroEducativo(this);
        }
    }

    @Override
    public CentroEducativo toEscapedModel() {
        return (CentroEducativo) ProxyUtil.newProxyInstance(CentroEducativo.class.getClassLoader(),
            new Class[] { CentroEducativo.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CentroEducativoClp clone = new CentroEducativoClp();

        clone.setIdce(getIdce());
        clone.setNombrece(getNombrece());
        clone.setIdca(getIdca());

        return clone;
    }

    @Override
    public int compareTo(CentroEducativo centroEducativo) {
        int primaryKey = centroEducativo.getPrimaryKey();

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

        if (!(obj instanceof CentroEducativoClp)) {
            return false;
        }

        CentroEducativoClp centroEducativo = (CentroEducativoClp) obj;

        int primaryKey = centroEducativo.getPrimaryKey();

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

        sb.append("{idce=");
        sb.append(getIdce());
        sb.append(", nombrece=");
        sb.append(getNombrece());
        sb.append(", idca=");
        sb.append(getIdca());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.CentroEducativo");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idce</column-name><column-value><![CDATA[");
        sb.append(getIdce());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombrece</column-name><column-value><![CDATA[");
        sb.append(getNombrece());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idca</column-name><column-value><![CDATA[");
        sb.append(getIdca());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
