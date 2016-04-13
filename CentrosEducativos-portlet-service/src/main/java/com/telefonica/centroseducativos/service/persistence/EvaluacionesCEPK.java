package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EvaluacionesCEPK implements Comparable<EvaluacionesCEPK>,
    Serializable {
    public int idencuesta;
    public int numpregunta;

    public EvaluacionesCEPK() {
    }

    public EvaluacionesCEPK(int idencuesta, int numpregunta) {
        this.idencuesta = idencuesta;
        this.numpregunta = numpregunta;
    }

    public int getIdencuesta() {
        return idencuesta;
    }

    public void setIdencuesta(int idencuesta) {
        this.idencuesta = idencuesta;
    }

    public int getNumpregunta() {
        return numpregunta;
    }

    public void setNumpregunta(int numpregunta) {
        this.numpregunta = numpregunta;
    }

    @Override
    public int compareTo(EvaluacionesCEPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (idencuesta < pk.idencuesta) {
            value = -1;
        } else if (idencuesta > pk.idencuesta) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (numpregunta < pk.numpregunta) {
            value = -1;
        } else if (numpregunta > pk.numpregunta) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EvaluacionesCEPK)) {
            return false;
        }

        EvaluacionesCEPK pk = (EvaluacionesCEPK) obj;

        if ((idencuesta == pk.idencuesta) && (numpregunta == pk.numpregunta)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idencuesta) + String.valueOf(numpregunta)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idencuesta");
        sb.append(StringPool.EQUAL);
        sb.append(idencuesta);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("numpregunta");
        sb.append(StringPool.EQUAL);
        sb.append(numpregunta);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
