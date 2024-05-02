package defpackage;

/* renamed from: aSv  reason: default package */
/* loaded from: classes.dex */
public final class aSv implements ngd {
    public final iUy R;

    /* renamed from: R  reason: collision with other field name */
    public final jJj f893R;

    public aSv(iUy iuy, c2J c2j) {
        this.R = iuy;
        this.f893R = c2j;
    }

    @Override // defpackage.ngd
    public final float R() {
        jJj jjj = this.f893R;
        return jjj.l(this.R.c(jjj));
    }

    @Override // defpackage.ngd
    public final float c(mdz mdz) {
        jJj jjj = this.f893R;
        return jjj.l(this.R.v(jjj, mdz));
    }

    @Override // defpackage.ngd
    public final float e(mdz mdz) {
        jJj jjj = this.f893R;
        return jjj.l(this.R.R(jjj, mdz));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aSv)) {
            return false;
        }
        aSv asv = (aSv) obj;
        return n3x.v(this.R, asv.R) && n3x.v(this.f893R, asv.f893R);
    }

    public final int hashCode() {
        return this.f893R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("InsetsPaddingValues(insets=");
        U.append(this.R);
        U.append(", density=");
        U.append(this.f893R);
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.ngd
    public final float v() {
        jJj jjj = this.f893R;
        return jjj.l(this.R.e(jjj));
    }
}
