package com.telefonica.centroseducativos.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.telefonica.centroseducativos.model.CategoriaPreguntaClp;
import com.telefonica.centroseducativos.model.CentroEducativoClp;
import com.telefonica.centroseducativos.model.ComunidadAutonomaClp;
import com.telefonica.centroseducativos.model.EvaluacionesCEClp;
import com.telefonica.centroseducativos.model.PaisClp;
import com.telefonica.centroseducativos.model.PreguntasEncuestaClp;
import com.telefonica.centroseducativos.model.RolUsuarioClp;
import com.telefonica.centroseducativos.model.UsuarioClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "CentrosEducativos-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "CentrosEducativos-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "CentrosEducativos-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(CategoriaPreguntaClp.class.getName())) {
            return translateInputCategoriaPregunta(oldModel);
        }

        if (oldModelClassName.equals(CentroEducativoClp.class.getName())) {
            return translateInputCentroEducativo(oldModel);
        }

        if (oldModelClassName.equals(ComunidadAutonomaClp.class.getName())) {
            return translateInputComunidadAutonoma(oldModel);
        }

        if (oldModelClassName.equals(EvaluacionesCEClp.class.getName())) {
            return translateInputEvaluacionesCE(oldModel);
        }

        if (oldModelClassName.equals(PaisClp.class.getName())) {
            return translateInputPais(oldModel);
        }

        if (oldModelClassName.equals(PreguntasEncuestaClp.class.getName())) {
            return translateInputPreguntasEncuesta(oldModel);
        }

        if (oldModelClassName.equals(RolUsuarioClp.class.getName())) {
            return translateInputRolUsuario(oldModel);
        }

        if (oldModelClassName.equals(UsuarioClp.class.getName())) {
            return translateInputUsuario(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputCategoriaPregunta(BaseModel<?> oldModel) {
        CategoriaPreguntaClp oldClpModel = (CategoriaPreguntaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCategoriaPreguntaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputCentroEducativo(BaseModel<?> oldModel) {
        CentroEducativoClp oldClpModel = (CentroEducativoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCentroEducativoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputComunidadAutonoma(BaseModel<?> oldModel) {
        ComunidadAutonomaClp oldClpModel = (ComunidadAutonomaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getComunidadAutonomaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEvaluacionesCE(BaseModel<?> oldModel) {
        EvaluacionesCEClp oldClpModel = (EvaluacionesCEClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEvaluacionesCERemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPais(BaseModel<?> oldModel) {
        PaisClp oldClpModel = (PaisClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaisRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPreguntasEncuesta(BaseModel<?> oldModel) {
        PreguntasEncuestaClp oldClpModel = (PreguntasEncuestaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPreguntasEncuestaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRolUsuario(BaseModel<?> oldModel) {
        RolUsuarioClp oldClpModel = (RolUsuarioClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRolUsuarioRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputUsuario(BaseModel<?> oldModel) {
        UsuarioClp oldClpModel = (UsuarioClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getUsuarioRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.CategoriaPreguntaImpl")) {
            return translateOutputCategoriaPregunta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.CentroEducativoImpl")) {
            return translateOutputCentroEducativo(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.ComunidadAutonomaImpl")) {
            return translateOutputComunidadAutonoma(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.EvaluacionesCEImpl")) {
            return translateOutputEvaluacionesCE(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.PaisImpl")) {
            return translateOutputPais(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.PreguntasEncuestaImpl")) {
            return translateOutputPreguntasEncuesta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.RolUsuarioImpl")) {
            return translateOutputRolUsuario(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.telefonica.centroseducativos.model.impl.UsuarioImpl")) {
            return translateOutputUsuario(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException")) {
            return new com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchCentroEducativoException")) {
            return new com.telefonica.centroseducativos.NoSuchCentroEducativoException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchComunidadAutonomaException")) {
            return new com.telefonica.centroseducativos.NoSuchComunidadAutonomaException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchEvaluacionesCEException")) {
            return new com.telefonica.centroseducativos.NoSuchEvaluacionesCEException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchPaisException")) {
            return new com.telefonica.centroseducativos.NoSuchPaisException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException")) {
            return new com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchRolUsuarioException")) {
            return new com.telefonica.centroseducativos.NoSuchRolUsuarioException();
        }

        if (className.equals(
                    "com.telefonica.centroseducativos.NoSuchUsuarioException")) {
            return new com.telefonica.centroseducativos.NoSuchUsuarioException();
        }

        return throwable;
    }

    public static Object translateOutputCategoriaPregunta(BaseModel<?> oldModel) {
        CategoriaPreguntaClp newModel = new CategoriaPreguntaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCategoriaPreguntaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputCentroEducativo(BaseModel<?> oldModel) {
        CentroEducativoClp newModel = new CentroEducativoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCentroEducativoRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputComunidadAutonoma(BaseModel<?> oldModel) {
        ComunidadAutonomaClp newModel = new ComunidadAutonomaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setComunidadAutonomaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEvaluacionesCE(BaseModel<?> oldModel) {
        EvaluacionesCEClp newModel = new EvaluacionesCEClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEvaluacionesCERemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPais(BaseModel<?> oldModel) {
        PaisClp newModel = new PaisClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaisRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPreguntasEncuesta(BaseModel<?> oldModel) {
        PreguntasEncuestaClp newModel = new PreguntasEncuestaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPreguntasEncuestaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRolUsuario(BaseModel<?> oldModel) {
        RolUsuarioClp newModel = new RolUsuarioClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRolUsuarioRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputUsuario(BaseModel<?> oldModel) {
        UsuarioClp newModel = new UsuarioClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setUsuarioRemoteModel(oldModel);

        return newModel;
    }
}
