package defpackage;

/* renamed from: ll  reason: default package */
/* loaded from: classes.dex */
public abstract class ll {

    /* renamed from: R  reason: collision with other field name */
    public static final nhj f5813R;
    public static final nhj c;
    public static final nhj e;

    /* renamed from: v  reason: collision with other field name */
    public static final nhj f5814v;
    public static final float R = (float) 280;
    public static final float v = (float) 560;

    static {
        float f = (float) 24;
        f5813R = new nhj(f, f, f, f);
        float f2 = (float) 16;
        f5814v = aH9.P(f2);
        c = aH9.P(f2);
        e = aH9.P(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.iv7 r36, defpackage.ncu r37, defpackage.iv7 r38, defpackage.iv7 r39, defpackage.iv7 r40, defpackage.n76 r41, long r42, float r44, long r45, long r47, long r49, long r51, defpackage.m88 r53, int r54, int r55, int r56) {
        /*
        // Method dump skipped, instructions count: 541
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll.R(iv7, ncu, iv7, iv7, iv7, n76, long, float, long, long, long, long, m88, int, int, int):void");
    }

    public static final void v(float f, float f2, iv7 iv7, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(586821353);
        if ((i & 14) == 0) {
            i2 = (jr_.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.c(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= jr_.O(iv7) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !jr_.J()) {
            g4 g4Var = new g4(f, f2);
            jr_.w(-1323940314);
            aff aff = aff.R;
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(aff);
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, g4Var, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                b.y(jQ.m(jr_, buo, igT.X, jr_), jr_, Integer.valueOf((i3 >> 3) & 112));
                jr_.w(2058660585);
                iv7.J(jr_, Integer.valueOf((i3 >> 9) & 14));
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fm(f, f2, iv7, i);
        }
    }
}
