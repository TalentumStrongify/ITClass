package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.ClpSerializer;
import com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PreguntasEncuestaClp extends BaseModelImpl<PreguntasEncuesta>
    implements PreguntasEncuesta {
    private int _numpregunta;
    private String _enunciadopregunta;
    private long _idcategoria;
    private BaseModel<?> _preguntasEncuestaRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public PreguntasEncuestaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PreguntasEncuesta.class;
    }

    @Override
    public String getModelClassName() {
        return PreguntasEncuesta.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _numpregunta;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setNumpregunta(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _numpregunta;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("numpregunta", getNumpregunta());
        attributes.put("enunciadopregunta", getEnunciadopregunta());
        attributes.put("idcategoria", getIdcategoria());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer numpregunta = (Integer) attributes.get("numpregunta");

        if (numpregunta != null) {
            setNumpregunta(numpregunta);
        }

        String enunciadopregunta = (String) attributes.get("enunciadopregunta");

        if (enunciadopregunta != null) {
            setEnunciadopregunta(enunciadopregunta);
        }

        Long idcategoria = (Long) attributes.get("idcategoria");

        if (idcategoria != null) {
            setIdcategoria(idcategoria);
        }
    }

    @Override
    public int getNumpregunta() {
        return _numpregunta;
    }

    @Override
    public void setNumpregunta(int numpregunta) {
        _numpregunta = numpregunta;

        if (_preguntasEncuestaRemoteModel != null) {
            try {
                Class<?> clazz = _preguntasEncuestaRemoteModel.getClass();

                Method method = clazz.getMethod("setNumpregunta", int.class);

                method.invoke(_preguntasEncuestaRemoteModel, numpregunta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEnunciadopregunta() {
        return _enunciadopregunta;
    }

    @Override
    public void setEnunciadopregunta(String enunciadopregunta) {
        _enunciadopregunta = enunciadopregunta;

        if (_preguntasEncuestaRemoteModel != null) {
            try {
                Class<?> clazz = _preguntasEncuestaRemoteModel.getClass();

                Method method = clazz.getMethod("setEnunciadopregunta",
                        String.class);

                method.invoke(_preguntasEncuestaRemoteModel, enunciadopregunta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdcategoria() {
        return _idcategoria;
    }

    @Override
    public void setIdcategoria(long idcategoria) {
        _idcategoria = idcategoria;

        if (_preguntasEncuestaRemoteModel != null) {
            try {
                Class<?> clazz = _preguntasEncuestaRemoteModel.getClass();

                Method method = clazz.getMethod("setIdcategoria", long.class);

                method.invoke(_preguntasEncuestaRemoteModel, idcategoria);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPreguntasEncuestaRemoteModel() {
        return _preguntasEncuestaRemoteModel;
    }

    public void setPreguntasEncuestaRemoteModel(
        BaseModel<?> preguntasEncuestaRemoteModel) {
        _preguntasEncuestaRemoteModel = preguntasEncuestaRemoteModel;
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

        Class<?> remoteModelClass = _preguntasEncuestaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_preguntasEncuestaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PreguntasEncuestaLocalServiceUtil.addPreguntasEncuesta(this);
        } else {
            PreguntasEncuestaLocalServiceUtil.updatePreguntasEncuesta(this);
        }
    }

    @Override
    public PreguntasEncuesta toEscapedModel() {
        return (PreguntasEncuesta) ProxyUtil.newProxyInstance(PreguntasEncuesta.class.getClassLoader(),
            new Class[] { PreguntasEncuesta.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PreguntasEncuestaClp clone = new PreguntasEncuestaClp();

        clone.setNumpregunta(getNumpregunta());
        clone.setEnunciadopregunta(getEnunciadopregunta());
        clone.setIdcategoria(getIdcategoria());

        return clone;
    }

    @Override
    public int compareTo(PreguntasEncuesta preguntasEncuesta) {
        int primaryKey = preguntasEncuesta.getPrimaryKey();

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

        if (!(obj instanceof PreguntasEncuestaClp)) {
            return false;
        }

        PreguntasEncuestaClp preguntasEncuesta = (PreguntasEncuestaClp) obj;

        int primaryKey = preguntasEncuesta.getPrimaryKey();

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

        sb.append("{numpregunta=");
        sb.append(getNumpregunta());
        sb.append(", enunciadopregunta=");
        sb.append(getEnunciadopregunta());
        sb.append(", idcategoria=");
        sb.append(getIdcategoria());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.centroseducativos.model.PreguntasEncuesta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>numpregunta</column-name><column-value><![CDATA[");
        sb.append(getNumpregunta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>enunciadopregunta</column-name><column-value><![CDATA[");
        sb.append(getEnunciadopregunta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idcategoria</column-name><column-value><![CDATA[");
        sb.append(getIdcategoria());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
