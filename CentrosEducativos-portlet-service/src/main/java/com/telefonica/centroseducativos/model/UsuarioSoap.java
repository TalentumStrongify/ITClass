package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.UsuarioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.UsuarioServiceSoap
 * @generated
 */
public class UsuarioSoap implements Serializable {
    private long _usuarioId;
    private String _cursoAcademico;
    private boolean _haContestadoLaEncuesta;
    private int _idrol;
    private int _idce;

    public UsuarioSoap() {
    }

    public static UsuarioSoap toSoapModel(Usuario model) {
        UsuarioSoap soapModel = new UsuarioSoap();

        soapModel.setUsuarioId(model.getUsuarioId());
        soapModel.setCursoAcademico(model.getCursoAcademico());
        soapModel.setHaContestadoLaEncuesta(model.getHaContestadoLaEncuesta());
        soapModel.setIdrol(model.getIdrol());
        soapModel.setIdce(model.getIdce());

        return soapModel;
    }

    public static UsuarioSoap[] toSoapModels(Usuario[] models) {
        UsuarioSoap[] soapModels = new UsuarioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[][] toSoapModels(Usuario[][] models) {
        UsuarioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsuarioSoap[models.length][models[0].length];
        } else {
            soapModels = new UsuarioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[] toSoapModels(List<Usuario> models) {
        List<UsuarioSoap> soapModels = new ArrayList<UsuarioSoap>(models.size());

        for (Usuario model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsuarioSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _usuarioId;
    }

    public void setPrimaryKey(long pk) {
        setUsuarioId(pk);
    }

    public long getUsuarioId() {
        return _usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    public String getCursoAcademico() {
        return _cursoAcademico;
    }

    public void setCursoAcademico(String cursoAcademico) {
        _cursoAcademico = cursoAcademico;
    }

    public boolean getHaContestadoLaEncuesta() {
        return _haContestadoLaEncuesta;
    }

    public boolean isHaContestadoLaEncuesta() {
        return _haContestadoLaEncuesta;
    }

    public void setHaContestadoLaEncuesta(boolean haContestadoLaEncuesta) {
        _haContestadoLaEncuesta = haContestadoLaEncuesta;
    }

    public int getIdrol() {
        return _idrol;
    }

    public void setIdrol(int idrol) {
        _idrol = idrol;
    }

    public int getIdce() {
        return _idce;
    }

    public void setIdce(int idce) {
        _idce = idce;
    }
}
