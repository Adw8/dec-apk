package defpackage;

/* renamed from: nTx  reason: default package */
/* loaded from: classes.dex */
public final class nTx {
    public final double R;
    public final double X;
    public final double c;
    public final double e;
    public final double v;
    public final double O = 0.0d;
    public final double L = 0.0d;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r5 == 0.0d) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0093, code lost:
        if ((r5 == 0.0d) != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nTx(double r5, double r7, double r9, double r11, double r13) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nTx.<init>(double, double, double, double, double):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nTx)) {
            return false;
        }
        nTx ntx = (nTx) obj;
        return n3x.v(Double.valueOf(this.R), Double.valueOf(ntx.R)) && n3x.v(Double.valueOf(this.v), Double.valueOf(ntx.v)) && n3x.v(Double.valueOf(this.c), Double.valueOf(ntx.c)) && n3x.v(Double.valueOf(this.e), Double.valueOf(ntx.e)) && n3x.v(Double.valueOf(this.X), Double.valueOf(ntx.X)) && n3x.v(Double.valueOf(this.O), Double.valueOf(ntx.O)) && n3x.v(Double.valueOf(this.L), Double.valueOf(ntx.L));
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.v);
        int hashCode2 = Double.hashCode(this.c);
        int hashCode3 = Double.hashCode(this.e);
        int hashCode4 = Double.hashCode(this.X);
        int hashCode5 = Double.hashCode(this.O);
        return Double.hashCode(this.L) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.R) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("TransferParameters(gamma=");
        U.append(this.R);
        U.append(", a=");
        U.append(this.v);
        U.append(", b=");
        U.append(this.c);
        U.append(", c=");
        U.append(this.e);
        U.append(", d=");
        U.append(this.X);
        U.append(", e=");
        U.append(this.O);
        U.append(", f=");
        U.append(this.L);
        U.append(')');
        return U.toString();
    }
}
