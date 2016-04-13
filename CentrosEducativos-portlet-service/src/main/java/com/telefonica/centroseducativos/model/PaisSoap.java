package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.PaisServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.PaisServiceSoap
 * @generated
 */
public class PaisSoap implements Serializable {
    private int _idpais;
    private String _nombrepais;

    public PaisSoap() {
    }

    public static PaisSoap toSoapModel(Pais model) {
        PaisSoap soapModel = new PaisSoap();

        soapModel.setIdpais(model.getIdpais());
        soapModel.setNombrepais(model.getNombrepais());

        return soapModel;
    }

    public static PaisSoap[] toSoapModels(Pais[] models) {
        PaisSoap[] soapModels = new PaisSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaisSoap[][] toSoapModels(Pais[][] models) {
        PaisSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaisSoap[models.length][models[0].length];
        } else {
            soapModels = new PaisSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaisSoap[] toSoapModels(List<Pais> models) {
        List<PaisSoap> soapModels = new ArrayList<PaisSoap>(models.size());

        for (Pais model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaisSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idpais;
    }

    public void setPrimaryKey(int pk) {
        setIdpais(pk);
    }

    public int getIdpais() {
        return _idpais;
    }

    public void setIdpais(int idpais) {
        _idpais = idpais;
    }

    public String getNombrepais() {
        return _nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        _nombrepais = nombrepais;
    }
}
