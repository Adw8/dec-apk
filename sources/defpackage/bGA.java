package defpackage;

/* renamed from: bGA  reason: default package */
/* loaded from: classes.dex */
public final class bGA {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final l9J f1584R;
    public final int v;

    public bGA(aA aAVar, int i, int i2) {
        this.f1584R = aAVar;
        this.R = i;
        this.v = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bGA)) {
            return false;
        }
        bGA bga = (bGA) obj;
        return n3x.v(this.f1584R, bga.f1584R) && this.R == bga.R && this.v == bga.v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + opT.e(this.R, this.f1584R.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ParagraphIntrinsicInfo(intrinsics=");
        U.append(this.f1584R);
        U.append(", startIndex=");
        U.append(this.R);
        U.append(", endIndex=");
        return jQ.P(U, this.v, ')');
    }
}
