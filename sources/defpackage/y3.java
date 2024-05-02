package defpackage;

/* renamed from: y3  reason: default package */
/* loaded from: classes.dex */
public final class y3 implements iUy {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7481R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f7482R = l6.n(ojk.R);
    public final oST v = l6.n(Boolean.TRUE);

    public y3(int i, String str) {
        this.R = i;
        this.f7481R = str;
    }

    public final void O(gWM gwm, int i) {
        if (i == 0 || (i & this.R) != 0) {
            this.f7482R.R(gwm.R(this.R));
            this.v.R(Boolean.valueOf(gwm.f3779R.C(this.R)));
        }
    }

    @Override // defpackage.iUy
    public final int R(jJj jjj, mdz mdz) {
        return X().f6899R;
    }

    public final ojk X() {
        return (ojk) this.f7482R.getValue();
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
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3) && this.R == ((y3) obj).R;
    }

    public final int hashCode() {
        return this.R;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7481R);
        sb.append('(');
        sb.append(X().f6899R);
        sb.append(", ");
        sb.append(X().v);
        sb.append(", ");
        sb.append(X().c);
        sb.append(", ");
        return jQ.P(sb, X().e, ')');
    }

    @Override // defpackage.iUy
    public final int v(jJj jjj, mdz mdz) {
        return X().c;
    }
}
