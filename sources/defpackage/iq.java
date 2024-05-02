package defpackage;

/* renamed from: iq  reason: default package */
/* loaded from: classes.dex */
public abstract class iq {
    public static final float R;
    public static final float v;

    static {
        float f = (float) 25;
        R = f;
        v = (f * 2.0f) / 2.4142137f;
    }

    public static final void R(long j, ncu ncu, iv7 iv7, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-5185995);
        if ((i & 14) == 0) {
            i2 = (jr_.X(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(ncu) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= jr_.O(iv7) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !jr_.J()) {
            g4x.c(j, n3U.TopMiddle, aH9.I(jr_, -1458480226, new _a(iv7, ncu, i2)), jr_, (i2 & 14) | 432);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new q3(j, ncu, iv7, i, 0);
        }
    }

    public static final void v(ncu ncu, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(694251107);
        if ((i & 14) == 0) {
            i2 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !jr_.J()) {
            dTl.x(g4x.y(adU.m(ncu, v, R), G9.H), jr_, 0);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new O_(ncu, i, 1);
        }
    }
}
