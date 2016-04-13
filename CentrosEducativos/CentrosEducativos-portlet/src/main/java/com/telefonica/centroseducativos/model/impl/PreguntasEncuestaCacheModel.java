package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.PreguntasEncuesta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PreguntasEncuesta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuesta
 * @generated
 */
public class PreguntasEncuestaCacheModel implements CacheModel<PreguntasEncuesta>,
    Externalizable {
    public int numpregunta;
    public String enunciadopregunta;
    public long idcategoria;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{numpregunta=");
        sb.append(numpregunta);
        sb.append(", enunciadopregunta=");
        sb.append(enunciadopregunta);
        sb.append(", idcategoria=");
        sb.append(idcategoria);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PreguntasEncuesta toEntityModel() {
        PreguntasEncuestaImpl preguntasEncuestaImpl = new PreguntasEncuestaImpl();

        preguntasEncuestaImpl.setNumpregunta(numpregunta);

        if (enunciadopregunta == null) {
            preguntasEncuestaImpl.setEnunciadopregunta(StringPool.BLANK);
        } else {
            preguntasEncuestaImpl.setEnunciadopregunta(enunciadopregunta);
        }

        preguntasEncuestaImpl.setIdcategoria(idcategoria);

        preguntasEncuestaImpl.resetOriginalValues();

        return preguntasEncuestaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        numpregunta = objectInput.readInt();
        enunciadopregunta = objectInput.readUTF();
        idcategoria = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(numpregunta);

        if (enunciadopregunta == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(enunciadopregunta);
        }

        objectOutput.writeLong(idcategoria);
    }
}
