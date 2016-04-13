package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.RolUsuario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RolUsuario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuario
 * @generated
 */
public class RolUsuarioCacheModel implements CacheModel<RolUsuario>,
    Externalizable {
    public int idrol;
    public String nombrerol;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idrol=");
        sb.append(idrol);
        sb.append(", nombrerol=");
        sb.append(nombrerol);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RolUsuario toEntityModel() {
        RolUsuarioImpl rolUsuarioImpl = new RolUsuarioImpl();

        rolUsuarioImpl.setIdrol(idrol);

        if (nombrerol == null) {
            rolUsuarioImpl.setNombrerol(StringPool.BLANK);
        } else {
            rolUsuarioImpl.setNombrerol(nombrerol);
        }

        rolUsuarioImpl.resetOriginalValues();

        return rolUsuarioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idrol = objectInput.readInt();
        nombrerol = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idrol);

        if (nombrerol == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombrerol);
        }
    }
}
