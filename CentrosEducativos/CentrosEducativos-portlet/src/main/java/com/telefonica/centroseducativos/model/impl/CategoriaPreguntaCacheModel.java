package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.CategoriaPregunta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CategoriaPregunta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPregunta
 * @generated
 */
public class CategoriaPreguntaCacheModel implements CacheModel<CategoriaPregunta>,
    Externalizable {
    public int idcategoria;
    public String Categoria;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idcategoria=");
        sb.append(idcategoria);
        sb.append(", Categoria=");
        sb.append(Categoria);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CategoriaPregunta toEntityModel() {
        CategoriaPreguntaImpl categoriaPreguntaImpl = new CategoriaPreguntaImpl();

        categoriaPreguntaImpl.setIdcategoria(idcategoria);

        if (Categoria == null) {
            categoriaPreguntaImpl.setCategoria(StringPool.BLANK);
        } else {
            categoriaPreguntaImpl.setCategoria(Categoria);
        }

        categoriaPreguntaImpl.resetOriginalValues();

        return categoriaPreguntaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idcategoria = objectInput.readInt();
        Categoria = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idcategoria);

        if (Categoria == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Categoria);
        }
    }
}
