package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.ComunidadAutonoma;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ComunidadAutonoma in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonoma
 * @generated
 */
public class ComunidadAutonomaCacheModel implements CacheModel<ComunidadAutonoma>,
    Externalizable {
    public int idca;
    public String nombrecomunidad;
    public int idpais;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{idca=");
        sb.append(idca);
        sb.append(", nombrecomunidad=");
        sb.append(nombrecomunidad);
        sb.append(", idpais=");
        sb.append(idpais);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ComunidadAutonoma toEntityModel() {
        ComunidadAutonomaImpl comunidadAutonomaImpl = new ComunidadAutonomaImpl();

        comunidadAutonomaImpl.setIdca(idca);

        if (nombrecomunidad == null) {
            comunidadAutonomaImpl.setNombrecomunidad(StringPool.BLANK);
        } else {
            comunidadAutonomaImpl.setNombrecomunidad(nombrecomunidad);
        }

        comunidadAutonomaImpl.setIdpais(idpais);

        comunidadAutonomaImpl.resetOriginalValues();

        return comunidadAutonomaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idca = objectInput.readInt();
        nombrecomunidad = objectInput.readUTF();
        idpais = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idca);

        if (nombrecomunidad == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombrecomunidad);
        }

        objectOutput.writeInt(idpais);
    }
}
