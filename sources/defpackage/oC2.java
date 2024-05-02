package defpackage;

/* renamed from: oC2  reason: default package */
/* loaded from: classes.dex */
public final class oC2 {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final ngd f6700R;

    public oC2() {
        long O = aH9.O(4284900966L);
        float f = (float) 0;
        nhj nhj = new nhj(f, f, f, f);
        this.R = O;
        this.f6700R = nhj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n3x.v(oC2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        oC2 oc2 = (oC2) obj;
        return n3.c(this.R, oc2.R) && n3x.v(this.f6700R, oc2.f6700R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return this.f6700R.hashCode() + (ejC.R(j) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("OverscrollConfiguration(glowColor=");
        U.append((Object) n3.m(this.R));
        U.append(", drawPadding=");
        U.append(this.f6700R);
        U.append(')');
        return U.toString();
    }
}
