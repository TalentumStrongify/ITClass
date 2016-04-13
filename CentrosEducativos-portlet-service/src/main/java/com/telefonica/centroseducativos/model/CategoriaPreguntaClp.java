package com.telefonica.centroseducativos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.centroseducativos.service.CategoriaPreguntaLocalServiceUtil;
import com.telefonica.centroseducativos.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class CategoriaPreguntaClp extends BaseModelImpl<CategoriaPregunta>
    implements CategoriaPregunta {
    private int _idcategoria;
    private String _Categoria;
    private BaseModel<?> _categoriaPreguntaRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.centroseducativos.service.ClpSerializer.class;

    public CategoriaPreguntaClp() {
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

    @Override
    public int getIdcategoria() {
        return _idcategoria;
    }

    @Override
    public void setIdcategoria(int idcategoria) {
        _idcategoria = idcategoria;

        if (_categoriaPreguntaRemoteModel != null) {
            try {
                Class<?> clazz = _categoriaPreguntaRemoteModel.getClass();

                Method method = clazz.getMethod("setIdcategoria", int.class);

                method.invoke(_categoriaPreguntaRemoteModel, idcategoria);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCategoria() {
        return _Categoria;
    }

    @Override
    public void setCategoria(String Categoria) {
        _Categoria = Categoria;

        if (_categoriaPreguntaRemoteModel != null) {
            try {
                Class<?> clazz = _categoriaPreguntaRemoteModel.getClass();

                Method method = clazz.getMethod("setCategoria", String.class);

                method.invoke(_categoriaPreguntaRemoteModel, Categoria);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCategoriaPreguntaRemoteModel() {
        return _categoriaPreguntaRemoteModel;
    }

    public void setCategoriaPreguntaRemoteModel(
        BaseModel<?> categoriaPreguntaRemoteModel) {
        _categoriaPreguntaRemoteModel = categoriaPreguntaRemoteModel;
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

        Class<?> remoteModelClass = _categoriaPreguntaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_categoriaPreguntaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CategoriaPreguntaLocalServiceUtil.addCategoriaPregunta(this);
        } else {
            CategoriaPreguntaLocalServiceUtil.updateCategoriaPregunta(this);
        }
    }

    @Override
    public CategoriaPregunta toEscapedModel() {
        return (CategoriaPregunta) ProxyUtil.newProxyInstance(CategoriaPregunta.class.getClassLoader(),
            new Class[] { CategoriaPregunta.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CategoriaPreguntaClp clone = new CategoriaPreguntaClp();

        clone.setIdcategoria(getIdcategoria());
        clone.setCategoria(getCategoria());

        return clone;
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

        if (!(obj instanceof CategoriaPreguntaClp)) {
            return false;
        }

        CategoriaPreguntaClp categoriaPregunta = (CategoriaPreguntaClp) obj;

        int primaryKey = categoriaPregunta.getPrimaryKey();

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
