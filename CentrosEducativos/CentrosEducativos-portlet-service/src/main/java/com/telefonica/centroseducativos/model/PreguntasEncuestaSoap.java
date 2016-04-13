package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.PreguntasEncuestaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.PreguntasEncuestaServiceSoap
 * @generated
 */
public class PreguntasEncuestaSoap implements Serializable {
    private int _numpregunta;
    private String _enunciadopregunta;
    private long _idcategoria;

    public PreguntasEncuestaSoap() {
    }

    public static PreguntasEncuestaSoap toSoapModel(PreguntasEncuesta model) {
        PreguntasEncuestaSoap soapModel = new PreguntasEncuestaSoap();

        soapModel.setNumpregunta(model.getNumpregunta());
        soapModel.setEnunciadopregunta(model.getEnunciadopregunta());
        soapModel.setIdcategoria(model.getIdcategoria());

        return soapModel;
    }

    public static PreguntasEncuestaSoap[] toSoapModels(
        PreguntasEncuesta[] models) {
        PreguntasEncuestaSoap[] soapModels = new PreguntasEncuestaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PreguntasEncuestaSoap[][] toSoapModels(
        PreguntasEncuesta[][] models) {
        PreguntasEncuestaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PreguntasEncuestaSoap[models.length][models[0].length];
        } else {
            soapModels = new PreguntasEncuestaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PreguntasEncuestaSoap[] toSoapModels(
        List<PreguntasEncuesta> models) {
        List<PreguntasEncuestaSoap> soapModels = new ArrayList<PreguntasEncuestaSoap>(models.size());

        for (PreguntasEncuesta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PreguntasEncuestaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _numpregunta;
    }

    public void setPrimaryKey(int pk) {
        setNumpregunta(pk);
    }

    public int getNumpregunta() {
        return _numpregunta;
    }

    public void setNumpregunta(int numpregunta) {
        _numpregunta = numpregunta;
    }

    public String getEnunciadopregunta() {
        return _enunciadopregunta;
    }

    public void setEnunciadopregunta(String enunciadopregunta) {
        _enunciadopregunta = enunciadopregunta;
    }

    public long getIdcategoria() {
        return _idcategoria;
    }

    public void setIdcategoria(long idcategoria) {
        _idcategoria = idcategoria;
    }
}
