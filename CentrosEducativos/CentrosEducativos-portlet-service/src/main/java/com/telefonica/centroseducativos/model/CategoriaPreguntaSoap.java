package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.CategoriaPreguntaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.CategoriaPreguntaServiceSoap
 * @generated
 */
public class CategoriaPreguntaSoap implements Serializable {
    private int _idcategoria;
    private String _Categoria;

    public CategoriaPreguntaSoap() {
    }

    public static CategoriaPreguntaSoap toSoapModel(CategoriaPregunta model) {
        CategoriaPreguntaSoap soapModel = new CategoriaPreguntaSoap();

        soapModel.setIdcategoria(model.getIdcategoria());
        soapModel.setCategoria(model.getCategoria());

        return soapModel;
    }

    public static CategoriaPreguntaSoap[] toSoapModels(
        CategoriaPregunta[] models) {
        CategoriaPreguntaSoap[] soapModels = new CategoriaPreguntaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CategoriaPreguntaSoap[][] toSoapModels(
        CategoriaPregunta[][] models) {
        CategoriaPreguntaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CategoriaPreguntaSoap[models.length][models[0].length];
        } else {
            soapModels = new CategoriaPreguntaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CategoriaPreguntaSoap[] toSoapModels(
        List<CategoriaPregunta> models) {
        List<CategoriaPreguntaSoap> soapModels = new ArrayList<CategoriaPreguntaSoap>(models.size());

        for (CategoriaPregunta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CategoriaPreguntaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idcategoria;
    }

    public void setPrimaryKey(int pk) {
        setIdcategoria(pk);
    }

    public int getIdcategoria() {
        return _idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        _idcategoria = idcategoria;
    }

    public String getCategoria() {
        return _Categoria;
    }

    public void setCategoria(String Categoria) {
        _Categoria = Categoria;
    }
}
