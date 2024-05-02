package defpackage;

/* renamed from: pwr  reason: default package */
/* loaded from: classes.dex */
public final class pwr implements iUy {
    public final iUy R;
    public final iUy v;

    public pwr(iUy iuy, iUy iuy2) {
        this.R = iuy;
        this.v = iuy2;
    }

    @Override // defpackage.iUy
    public final int R(jJj jjj, mdz mdz) {
        return Math.max(this.R.R(jjj, mdz), this.v.R(jjj, mdz));
    }

    @Override // defpackage.iUy
    public final int c(jJj jjj) {
        return Math.max(this.R.c(jjj), this.v.c(jjj));
    }

    @Override // defpackage.iUy
    public final int e(jJj jjj) {
        return Math.max(this.R.e(jjj), this.v.e(jjj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwr)) {
            return false;
        }
        pwr pwr = (pwr) obj;
        return n3x.v(pwr.R, this.R) && n3x.v(pwr.v, this.v);
    }

    public final int hashCode() {
        return (this.v.hashCode() * 31) + this.R.hashCode();
    }

    public final String toString() {
        return '(' + this.R + " ∪ " + this.v + ')';
    }

    @Override // defpackage.iUy
    public final int v(jJj jjj, mdz mdz) {
        return Math.max(this.R.v(jjj, mdz), this.v.v(jjj, mdz));
    }
}
