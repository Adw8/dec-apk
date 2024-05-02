package defpackage;

/* renamed from: oli  reason: default package */
/* loaded from: classes.dex */
public final class oli {
    public double R;
    public double v;

    public oli(double d, double d2) {
        this.R = d;
        this.v = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oli)) {
            return false;
        }
        oli oli = (oli) obj;
        return n3x.v(Double.valueOf(this.R), Double.valueOf(oli.R)) && n3x.v(Double.valueOf(this.v), Double.valueOf(oli.v));
    }

    public final int hashCode() {
        return Double.hashCode(this.v) + (Double.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ComplexDouble(_real=");
        U.append(this.R);
        U.append(", _imaginary=");
        U.append(this.v);
        U.append(')');
        return U.toString();
    }
}
