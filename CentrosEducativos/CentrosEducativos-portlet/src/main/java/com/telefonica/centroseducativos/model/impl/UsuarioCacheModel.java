package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.Usuario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Usuario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
public class UsuarioCacheModel implements CacheModel<Usuario>, Externalizable {
    public long usuarioId;
    public String cursoAcademico;
    public boolean haContestadoLaEncuesta;
    public int idrol;
    public int idce;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{usuarioId=");
        sb.append(usuarioId);
        sb.append(", cursoAcademico=");
        sb.append(cursoAcademico);
        sb.append(", haContestadoLaEncuesta=");
        sb.append(haContestadoLaEncuesta);
        sb.append(", idrol=");
        sb.append(idrol);
        sb.append(", idce=");
        sb.append(idce);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Usuario toEntityModel() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setUsuarioId(usuarioId);

        if (cursoAcademico == null) {
            usuarioImpl.setCursoAcademico(StringPool.BLANK);
        } else {
            usuarioImpl.setCursoAcademico(cursoAcademico);
        }

        usuarioImpl.setHaContestadoLaEncuesta(haContestadoLaEncuesta);
        usuarioImpl.setIdrol(idrol);
        usuarioImpl.setIdce(idce);

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        usuarioId = objectInput.readLong();
        cursoAcademico = objectInput.readUTF();
        haContestadoLaEncuesta = objectInput.readBoolean();
        idrol = objectInput.readInt();
        idce = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(usuarioId);

        if (cursoAcademico == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cursoAcademico);
        }

        objectOutput.writeBoolean(haContestadoLaEncuesta);
        objectOutput.writeInt(idrol);
        objectOutput.writeInt(idce);
    }
}
