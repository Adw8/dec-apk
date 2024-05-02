package defpackage;

/* renamed from: klw  reason: default package */
/* loaded from: classes.dex */
public final class klw implements iUy {
    public final int R = 0;
    public final int v = 0;
    public final int c = 0;
    public final int e = 0;

    @Override // defpackage.iUy
    public final int R(jJj jjj, mdz mdz) {
        return this.R;
    }

    @Override // defpackage.iUy
    public final int c(jJj jjj) {
        return this.e;
    }

    @Override // defpackage.iUy
    public final int e(jJj jjj) {
        return this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klw)) {
            return false;
        }
        klw klw = (klw) obj;
        return this.R == klw.R && this.v == klw.v && this.c == klw.c && this.e == klw.e;
    }

    public final int hashCode() {
        return (((((this.R * 31) + this.v) * 31) + this.c) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder U = opT.U("Insets(left=");
        U.append(this.R);
        U.append(", top=");
        U.append(this.v);
        U.append(", right=");
        U.append(this.c);
        U.append(", bottom=");
        return jQ.P(U, this.e, ')');
    }

    @Override // defpackage.iUy
    public final int v(jJj jjj, mdz mdz) {
        return this.c;
    }
}
