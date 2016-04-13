package com.telefonica.centroseducativos.model;

import com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.EvaluacionesCEServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.EvaluacionesCEServiceSoap
 * @generated
 */
public class EvaluacionesCESoap implements Serializable {
    private int _idencuesta;
    private int _numpregunta;
    private int _notapregunta;
    private int _idce;
    private int _idrol;

    public EvaluacionesCESoap() {
    }

    public static EvaluacionesCESoap toSoapModel(EvaluacionesCE model) {
        EvaluacionesCESoap soapModel = new EvaluacionesCESoap();

        soapModel.setIdencuesta(model.getIdencuesta());
        soapModel.setNumpregunta(model.getNumpregunta());
        soapModel.setNotapregunta(model.getNotapregunta());
        soapModel.setIdce(model.getIdce());
        soapModel.setIdrol(model.getIdrol());

        return soapModel;
    }

    public static EvaluacionesCESoap[] toSoapModels(EvaluacionesCE[] models) {
        EvaluacionesCESoap[] soapModels = new EvaluacionesCESoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EvaluacionesCESoap[][] toSoapModels(EvaluacionesCE[][] models) {
        EvaluacionesCESoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EvaluacionesCESoap[models.length][models[0].length];
        } else {
            soapModels = new EvaluacionesCESoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EvaluacionesCESoap[] toSoapModels(List<EvaluacionesCE> models) {
        List<EvaluacionesCESoap> soapModels = new ArrayList<EvaluacionesCESoap>(models.size());

        for (EvaluacionesCE model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EvaluacionesCESoap[soapModels.size()]);
    }

    public EvaluacionesCEPK getPrimaryKey() {
        return new EvaluacionesCEPK(_idencuesta, _numpregunta);
    }

    public void setPrimaryKey(EvaluacionesCEPK pk) {
        setIdencuesta(pk.idencuesta);
        setNumpregunta(pk.numpregunta);
    }

    public int getIdencuesta() {
        return _idencuesta;
    }

    public void setIdencuesta(int idencuesta) {
        _idencuesta = idencuesta;
    }

    public int getNumpregunta() {
        return _numpregunta;
    }

    public void setNumpregunta(int numpregunta) {
        _numpregunta = numpregunta;
    }

    public int getNotapregunta() {
        return _notapregunta;
    }

    public void setNotapregunta(int notapregunta) {
        _notapregunta = notapregunta;
    }

    public int getIdce() {
        return _idce;
    }

    public void setIdce(int idce) {
        _idce = idce;
    }

    public int getIdrol() {
        return _idrol;
    }

    public void setIdrol(int idrol) {
        _idrol = idrol;
    }
}
