package defpackage;

/* renamed from: ftx  reason: default package */
/* loaded from: classes.dex */
public final class ftx implements iUy {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final iUy f3578R;

    public ftx(y3 y3Var, int i) {
        this.f3578R = y3Var;
        this.R = i;
    }

    @Override // defpackage.iUy
    public final int R(jJj jjj, mdz mdz) {
        if (((mdz == mdz.Ltr ? 8 : 2) & this.R) != 0) {
            return this.f3578R.R(jjj, mdz);
        }
        return 0;
    }

    @Override // defpackage.iUy
    public final int c(jJj jjj) {
        if ((this.R & 32) != 0) {
            return this.f3578R.c(jjj);
        }
        return 0;
    }

    @Override // defpackage.iUy
    public final int e(jJj jjj) {
        if ((this.R & 16) != 0) {
            return this.f3578R.e(jjj);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftx)) {
            return false;
        }
        ftx ftx = (ftx) obj;
        if (n3x.v(this.f3578R, ftx.f3578R)) {
            int i = this.R;
            int i2 = ftx.R;
            int i3 = n1P.R;
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.R;
        int i2 = n1P.R;
        return Integer.hashCode(i) + (this.f3578R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f3578R);
        sb.append(" only ");
        int i = this.R;
        StringBuilder U = opT.U("WindowInsetsSides(");
        StringBuilder sb2 = new StringBuilder();
        int i2 = n1P.R;
        if ((i & i2) == i2) {
            n1P.Y(sb2, "Start");
        }
        int i3 = n1P.c;
        if ((i & i3) == i3) {
            n1P.Y(sb2, "Left");
        }
        if ((i & 16) == 16) {
            n1P.Y(sb2, "Top");
        }
        int i4 = n1P.v;
        if ((i & i4) == i4) {
            n1P.Y(sb2, "End");
        }
        int i5 = n1P.e;
        if ((i & i5) == i5) {
            n1P.Y(sb2, "Right");
        }
        if ((i & 32) == 32) {
            n1P.Y(sb2, "Bottom");
        }
        U.append(sb2.toString());
        U.append(')');
        sb.append((Object) U.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.iUy
    public final int v(jJj jjj, mdz mdz) {
        boolean z = true;
        if (((mdz == mdz.Ltr ? 4 : 1) & this.R) == 0) {
            z = false;
        }
        if (z) {
            return this.f3578R.v(jjj, mdz);
        }
        return 0;
    }
}
