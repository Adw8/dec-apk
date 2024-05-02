package defpackage;

/* renamed from: Mp  reason: default package */
/* loaded from: classes.dex */
public final class Mp {
    public final /* synthetic */ JF R;

    public Mp(JF jf) {
        this.R = jf;
    }

    public final void R(float f, float f2, float f3, float f4, int i) {
        this.R.R().Z(f, f2, f3, f4, i);
    }

    public final void c(long j) {
        Gp R = this.R.R();
        R.g(aWo.e(j), aWo.X(j));
        R.O();
        R.g(-aWo.e(j), -aWo.X(j));
    }

    public final void v(float f, float f2, float f3, float f4) {
        Gp R = this.R.R();
        JF jf = this.R;
        long e = n1P.e(nqW.e(jf.v()) - (f3 + f), nqW.v(this.R.v()) - (f4 + f2));
        if (nqW.e(e) >= 0.0f && nqW.v(e) >= 0.0f) {
            jf.c(e);
            R.g(f, f2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }
}
