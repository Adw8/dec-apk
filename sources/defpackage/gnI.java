package defpackage;

/* renamed from: gnI  reason: default package */
/* loaded from: classes.dex */
public final class gnI implements iUy {
    public final iUy R;
    public final iUy v;

    public gnI(iUy iuy, iUy iuy2) {
        this.R = iuy;
        this.v = iuy2;
    }

    @Override // defpackage.iUy
    public final int R(jJj jjj, mdz mdz) {
        int R = this.R.R(jjj, mdz) - this.v.R(jjj, mdz);
        if (R < 0) {
            return 0;
        }
        return R;
    }

    @Override // defpackage.iUy
    public final int c(jJj jjj) {
        int c = this.R.c(jjj) - this.v.c(jjj);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.iUy
    public final int e(jJj jjj) {
        int e = this.R.e(jjj) - this.v.e(jjj);
        if (e < 0) {
            return 0;
        }
        return e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnI)) {
            return false;
        }
        gnI gni = (gnI) obj;
        return n3x.v(gni.R, this.R) && n3x.v(gni.v, this.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        return '(' + this.R + " - " + this.v + ')';
    }

    @Override // defpackage.iUy
    public final int v(jJj jjj, mdz mdz) {
        int v = this.R.v(jjj, mdz) - this.v.v(jjj, mdz);
        if (v < 0) {
            return 0;
        }
        return v;
    }
}
