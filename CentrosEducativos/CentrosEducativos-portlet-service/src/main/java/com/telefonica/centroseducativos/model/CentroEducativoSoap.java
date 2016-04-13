package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.CentroEducativoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.CentroEducativoServiceSoap
 * @generated
 */
public class CentroEducativoSoap implements Serializable {
    private int _idce;
    private String _nombrece;
    private int _idca;

    public CentroEducativoSoap() {
    }

    public static CentroEducativoSoap toSoapModel(CentroEducativo model) {
        CentroEducativoSoap soapModel = new CentroEducativoSoap();

        soapModel.setIdce(model.getIdce());
        soapModel.setNombrece(model.getNombrece());
        soapModel.setIdca(model.getIdca());

        return soapModel;
    }

    public static CentroEducativoSoap[] toSoapModels(CentroEducativo[] models) {
        CentroEducativoSoap[] soapModels = new CentroEducativoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CentroEducativoSoap[][] toSoapModels(
        CentroEducativo[][] models) {
        CentroEducativoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CentroEducativoSoap[models.length][models[0].length];
        } else {
            soapModels = new CentroEducativoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CentroEducativoSoap[] toSoapModels(
        List<CentroEducativo> models) {
        List<CentroEducativoSoap> soapModels = new ArrayList<CentroEducativoSoap>(models.size());

        for (CentroEducativo model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CentroEducativoSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idce;
    }

    public void setPrimaryKey(int pk) {
        setIdce(pk);
    }

    public int getIdce() {
        return _idce;
    }

    public void setIdce(int idce) {
        _idce = idce;
    }

    public String getNombrece() {
        return _nombrece;
    }

    public void setNombrece(String nombrece) {
        _nombrece = nombrece;
    }

    public int getIdca() {
        return _idca;
    }

    public void setIdca(int idca) {
        _idca = idca;
    }
}
