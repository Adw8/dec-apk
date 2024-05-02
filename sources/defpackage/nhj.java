package defpackage;

/* renamed from: nhj  reason: default package */
/* loaded from: classes.dex */
public final class nhj implements ngd {
    public final float R;
    public final float c;
    public final float e;
    public final float v;

    public nhj(float f, float f2, float f3, float f4) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    @Override // defpackage.ngd
    public final float R() {
        return this.e;
    }

    @Override // defpackage.ngd
    public final float c(mdz mdz) {
        return mdz == mdz.Ltr ? this.c : this.R;
    }

    @Override // defpackage.ngd
    public final float e(mdz mdz) {
        return mdz == mdz.Ltr ? this.R : this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nhj)) {
            return false;
        }
        nhj nhj = (nhj) obj;
        return hoI.R(this.R, nhj.R) && hoI.R(this.v, nhj.v) && hoI.R(this.c, nhj.c) && hoI.R(this.e, nhj.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("PaddingValues(start=");
        U.append((Object) hoI.v(this.R));
        U.append(", top=");
        U.append((Object) hoI.v(this.v));
        U.append(", end=");
        U.append((Object) hoI.v(this.c));
        U.append(", bottom=");
        U.append((Object) hoI.v(this.e));
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.ngd
    public final float v() {
        return this.v;
    }
}
