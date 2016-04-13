package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.CentroEducativo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CentroEducativo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativo
 * @generated
 */
public class CentroEducativoCacheModel implements CacheModel<CentroEducativo>,
    Externalizable {
    public int idce;
    public String nombrece;
    public int idca;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{idce=");
        sb.append(idce);
        sb.append(", nombrece=");
        sb.append(nombrece);
        sb.append(", idca=");
        sb.append(idca);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CentroEducativo toEntityModel() {
        CentroEducativoImpl centroEducativoImpl = new CentroEducativoImpl();

        centroEducativoImpl.setIdce(idce);

        if (nombrece == null) {
            centroEducativoImpl.setNombrece(StringPool.BLANK);
        } else {
            centroEducativoImpl.setNombrece(nombrece);
        }

        centroEducativoImpl.setIdca(idca);

        centroEducativoImpl.resetOriginalValues();

        return centroEducativoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idce = objectInput.readInt();
        nombrece = objectInput.readUTF();
        idca = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idce);

        if (nombrece == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombrece);
        }

        objectOutput.writeInt(idca);
    }
}
