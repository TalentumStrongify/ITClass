package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.Pais;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Pais in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Pais
 * @generated
 */
public class PaisCacheModel implements CacheModel<Pais>, Externalizable {
    public int idpais;
    public String nombrepais;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idpais=");
        sb.append(idpais);
        sb.append(", nombrepais=");
        sb.append(nombrepais);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Pais toEntityModel() {
        PaisImpl paisImpl = new PaisImpl();

        paisImpl.setIdpais(idpais);

        if (nombrepais == null) {
            paisImpl.setNombrepais(StringPool.BLANK);
        } else {
            paisImpl.setNombrepais(nombrepais);
        }

        paisImpl.resetOriginalValues();

        return paisImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idpais = objectInput.readInt();
        nombrepais = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idpais);

        if (nombrepais == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombrepais);
        }
    }
}
