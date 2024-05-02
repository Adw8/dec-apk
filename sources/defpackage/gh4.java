package defpackage;

import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: gh4  reason: default package */
/* loaded from: classes.dex */
public final class gh4 extends lkt {
    public final Serializable R;

    public gh4(Boolean bool) {
        bool.getClass();
        this.R = bool;
    }

    public static boolean C(gh4 gh4) {
        Serializable serializable = gh4.R;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final Number H() {
        Serializable serializable = this.R;
        return serializable instanceof String ? new hSd((String) serializable) : (Number) serializable;
    }

    @Override // defpackage.lkt
    public final int R() {
        return this.R instanceof Number ? H().intValue() : Integer.parseInt(c());
    }

    @Override // defpackage.lkt
    public final String c() {
        Serializable serializable = this.R;
        return serializable instanceof Number ? H().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gh4.class != obj.getClass()) {
            return false;
        }
        gh4 gh4 = (gh4) obj;
        if (this.R == null) {
            return gh4.R == null;
        }
        if (C(this) && C(gh4)) {
            return H().longValue() == gh4.H().longValue();
        }
        Serializable serializable = this.R;
        if (!(serializable instanceof Number) || !(gh4.R instanceof Number)) {
            return serializable.equals(gh4.R);
        }
        double doubleValue = H().doubleValue();
        double doubleValue2 = gh4.H().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long j;
        if (this.R == null) {
            return 31;
        }
        if (C(this)) {
            j = H().longValue();
        } else {
            Serializable serializable = this.R;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            j = Double.doubleToLongBits(H().doubleValue());
        }
        return (int) ((j >>> 32) ^ j);
    }

    public gh4(hSd hsd) {
        this.R = hsd;
    }

    public gh4(String str) {
        str.getClass();
        this.R = str;
    }
}
