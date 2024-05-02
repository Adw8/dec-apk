package defpackage;

/* renamed from: bYS  reason: default package */
/* loaded from: classes.dex */
public final class bYS {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1719R;
    public final int v;

    public bYS(int i, int i2, boolean z) {
        this.R = i;
        this.v = i2;
        this.f1719R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bYS)) {
            return false;
        }
        bYS bys = (bYS) obj;
        return this.R == bys.R && this.v == bys.v && this.f1719R == bys.f1719R;
    }

    public final int hashCode() {
        int e = opT.e(this.v, Integer.hashCode(this.R) * 31, 31);
        boolean z = this.f1719R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return e + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("BidiRun(start=");
        U.append(this.R);
        U.append(", end=");
        U.append(this.v);
        U.append(", isRtl=");
        U.append(this.f1719R);
        U.append(')');
        return U.toString();
    }
}
