package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.ComunidadAutonomaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.ComunidadAutonomaServiceSoap
 * @generated
 */
public class ComunidadAutonomaSoap implements Serializable {
    private int _idca;
    private String _nombrecomunidad;
    private int _idpais;

    public ComunidadAutonomaSoap() {
    }

    public static ComunidadAutonomaSoap toSoapModel(ComunidadAutonoma model) {
        ComunidadAutonomaSoap soapModel = new ComunidadAutonomaSoap();

        soapModel.setIdca(model.getIdca());
        soapModel.setNombrecomunidad(model.getNombrecomunidad());
        soapModel.setIdpais(model.getIdpais());

        return soapModel;
    }

    public static ComunidadAutonomaSoap[] toSoapModels(
        ComunidadAutonoma[] models) {
        ComunidadAutonomaSoap[] soapModels = new ComunidadAutonomaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ComunidadAutonomaSoap[][] toSoapModels(
        ComunidadAutonoma[][] models) {
        ComunidadAutonomaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ComunidadAutonomaSoap[models.length][models[0].length];
        } else {
            soapModels = new ComunidadAutonomaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ComunidadAutonomaSoap[] toSoapModels(
        List<ComunidadAutonoma> models) {
        List<ComunidadAutonomaSoap> soapModels = new ArrayList<ComunidadAutonomaSoap>(models.size());

        for (ComunidadAutonoma model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ComunidadAutonomaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idca;
    }

    public void setPrimaryKey(int pk) {
        setIdca(pk);
    }

    public int getIdca() {
        return _idca;
    }

    public void setIdca(int idca) {
        _idca = idca;
    }

    public String getNombrecomunidad() {
        return _nombrecomunidad;
    }

    public void setNombrecomunidad(String nombrecomunidad) {
        _nombrecomunidad = nombrecomunidad;
    }

    public int getIdpais() {
        return _idpais;
    }

    public void setIdpais(int idpais) {
        _idpais = idpais;
    }
}
