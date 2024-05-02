package defpackage;

/* renamed from: oOe  reason: default package */
/* loaded from: classes.dex */
public final class oOe {
    public final int R;
    public final int c;
    public final int e;
    public final int v;

    public oOe(int i, int i2, int i3, int i4) {
        this.R = i;
        this.v = i2;
        this.c = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oOe)) {
            return false;
        }
        oOe ooe = (oOe) obj;
        return this.R == ooe.R && this.v == ooe.v && this.c == ooe.c && this.e == ooe.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + opT.e(this.c, opT.e(this.v, Integer.hashCode(this.R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("IntRect.fromLTRB(");
        U.append(this.R);
        U.append(", ");
        U.append(this.v);
        U.append(", ");
        U.append(this.c);
        U.append(", ");
        return jQ.P(U, this.e, ')');
    }
}
