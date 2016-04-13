package com.telefonica.centroseducativos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.telefonica.centroseducativos.model.EvaluacionesCE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EvaluacionesCE in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCE
 * @generated
 */
public class EvaluacionesCECacheModel implements CacheModel<EvaluacionesCE>,
    Externalizable {
    public int idencuesta;
    public int numpregunta;
    public int notapregunta;
    public int idce;
    public int idrol;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{idencuesta=");
        sb.append(idencuesta);
        sb.append(", numpregunta=");
        sb.append(numpregunta);
        sb.append(", notapregunta=");
        sb.append(notapregunta);
        sb.append(", idce=");
        sb.append(idce);
        sb.append(", idrol=");
        sb.append(idrol);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EvaluacionesCE toEntityModel() {
        EvaluacionesCEImpl evaluacionesCEImpl = new EvaluacionesCEImpl();

        evaluacionesCEImpl.setIdencuesta(idencuesta);
        evaluacionesCEImpl.setNumpregunta(numpregunta);
        evaluacionesCEImpl.setNotapregunta(notapregunta);
        evaluacionesCEImpl.setIdce(idce);
        evaluacionesCEImpl.setIdrol(idrol);

        evaluacionesCEImpl.resetOriginalValues();

        return evaluacionesCEImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idencuesta = objectInput.readInt();
        numpregunta = objectInput.readInt();
        notapregunta = objectInput.readInt();
        idce = objectInput.readInt();
        idrol = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idencuesta);
        objectOutput.writeInt(numpregunta);
        objectOutput.writeInt(notapregunta);
        objectOutput.writeInt(idce);
        objectOutput.writeInt(idrol);
    }
}
