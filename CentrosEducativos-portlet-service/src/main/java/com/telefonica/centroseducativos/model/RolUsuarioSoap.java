package com.telefonica.centroseducativos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.centroseducativos.service.http.RolUsuarioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.http.RolUsuarioServiceSoap
 * @generated
 */
public class RolUsuarioSoap implements Serializable {
    private int _idrol;
    private String _nombrerol;

    public RolUsuarioSoap() {
    }

    public static RolUsuarioSoap toSoapModel(RolUsuario model) {
        RolUsuarioSoap soapModel = new RolUsuarioSoap();

        soapModel.setIdrol(model.getIdrol());
        soapModel.setNombrerol(model.getNombrerol());

        return soapModel;
    }

    public static RolUsuarioSoap[] toSoapModels(RolUsuario[] models) {
        RolUsuarioSoap[] soapModels = new RolUsuarioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RolUsuarioSoap[][] toSoapModels(RolUsuario[][] models) {
        RolUsuarioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RolUsuarioSoap[models.length][models[0].length];
        } else {
            soapModels = new RolUsuarioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RolUsuarioSoap[] toSoapModels(List<RolUsuario> models) {
        List<RolUsuarioSoap> soapModels = new ArrayList<RolUsuarioSoap>(models.size());

        for (RolUsuario model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RolUsuarioSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idrol;
    }

    public void setPrimaryKey(int pk) {
        setIdrol(pk);
    }

    public int getIdrol() {
        return _idrol;
    }

    public void setIdrol(int idrol) {
        _idrol = idrol;
    }

    public String getNombrerol() {
        return _nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        _nombrerol = nombrerol;
    }
}
