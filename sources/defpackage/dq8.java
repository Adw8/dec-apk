package defpackage;

/* renamed from: dq8  reason: default package */
/* loaded from: classes.dex */
public final class dq8 implements iUy {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f2899R;

    public dq8(g2o g2o, String str) {
        this.R = str;
        this.f2899R = l6.n(g2o);
    }

    public final void O(g2o g2o) {
        this.f2899R.R(g2o);
    }

    @Override // defpackage.iUy
    public final int R(jJj jjj, mdz mdz) {
        return X().R;
    }

    public final g2o X() {
        return (g2o) this.f2899R.getValue();
    }

    @Override // defpackage.iUy
    public final int c(jJj jjj) {
        return X().e;
    }

    @Override // defpackage.iUy
    public final int e(jJj jjj) {
        return X().v;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dq8)) {
            return false;
        }
        return n3x.v(X(), ((dq8) obj).X());
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.R);
        sb.append("(left=");
        sb.append(X().R);
        sb.append(", top=");
        sb.append(X().v);
        sb.append(", right=");
        sb.append(X().c);
        sb.append(", bottom=");
        return jQ.P(sb, X().e, ')');
    }

    @Override // defpackage.iUy
    public final int v(jJj jjj, mdz mdz) {
        return X().c;
    }
}
