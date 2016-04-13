package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.EvaluacionesCELocalServiceUtil;
import com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EvaluacionesCEClp extends BaseModelImpl<EvaluacionesCE>
    implements EvaluacionesCE {
    private int _idencuesta;
    private int _numpregunta;
    private int _notapregunta;
    private int _idce;
    private int _idrol;
    private BaseModel<?> _evaluacionesCERemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public EvaluacionesCEClp() {
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

    @Override
    public int getIdencuesta() {
        return _idencuesta;
    }

    @Override
    public void setIdencuesta(int idencuesta) {
        _idencuesta = idencuesta;

        if (_evaluacionesCERemoteModel != null) {
            try {
                Class<?> clazz = _evaluacionesCERemoteModel.getClass();

                Method method = clazz.getMethod("setIdencuesta", int.class);

                method.invoke(_evaluacionesCERemoteModel, idencuesta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNumpregunta() {
        return _numpregunta;
    }

    @Override
    public void setNumpregunta(int numpregunta) {
        _numpregunta = numpregunta;

        if (_evaluacionesCERemoteModel != null) {
            try {
                Class<?> clazz = _evaluacionesCERemoteModel.getClass();

                Method method = clazz.getMethod("setNumpregunta", int.class);

                method.invoke(_evaluacionesCERemoteModel, numpregunta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNotapregunta() {
        return _notapregunta;
    }

    @Override
    public void setNotapregunta(int notapregunta) {
        _notapregunta = notapregunta;

        if (_evaluacionesCERemoteModel != null) {
            try {
                Class<?> clazz = _evaluacionesCERemoteModel.getClass();

                Method method = clazz.getMethod("setNotapregunta", int.class);

                method.invoke(_evaluacionesCERemoteModel, notapregunta);
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

        if (_evaluacionesCERemoteModel != null) {
            try {
                Class<?> clazz = _evaluacionesCERemoteModel.getClass();

                Method method = clazz.getMethod("setIdce", int.class);

                method.invoke(_evaluacionesCERemoteModel, idce);
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

        if (_evaluacionesCERemoteModel != null) {
            try {
                Class<?> clazz = _evaluacionesCERemoteModel.getClass();

                Method method = clazz.getMethod("setIdrol", int.class);

                method.invoke(_evaluacionesCERemoteModel, idrol);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEvaluacionesCERemoteModel() {
        return _evaluacionesCERemoteModel;
    }

    public void setEvaluacionesCERemoteModel(
        BaseModel<?> evaluacionesCERemoteModel) {
        _evaluacionesCERemoteModel = evaluacionesCERemoteModel;
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

        Class<?> remoteModelClass = _evaluacionesCERemoteModel.getClass();

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

        Object returnValue = method.invoke(_evaluacionesCERemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EvaluacionesCELocalServiceUtil.addEvaluacionesCE(this);
        } else {
            EvaluacionesCELocalServiceUtil.updateEvaluacionesCE(this);
        }
    }

    @Override
    public EvaluacionesCE toEscapedModel() {
        return (EvaluacionesCE) ProxyUtil.newProxyInstance(EvaluacionesCE.class.getClassLoader(),
            new Class[] { EvaluacionesCE.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EvaluacionesCEClp clone = new EvaluacionesCEClp();

        clone.setIdencuesta(getIdencuesta());
        clone.setNumpregunta(getNumpregunta());
        clone.setNotapregunta(getNotapregunta());
        clone.setIdce(getIdce());
        clone.setIdrol(getIdrol());

        return clone;
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

        if (!(obj instanceof EvaluacionesCEClp)) {
            return false;
        }

        EvaluacionesCEClp evaluacionesCE = (EvaluacionesCEClp) obj;

        EvaluacionesCEPK primaryKey = evaluacionesCE.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
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
