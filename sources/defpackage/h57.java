package defpackage;

/* renamed from: h57  reason: default package */
/* loaded from: classes.dex */
public abstract class h57 {
    public static int R;

    /* renamed from: R  reason: collision with other field name */
    public static final gHI f4041R = new gHI();

    /* renamed from: R  reason: collision with other field name */
    public static mdz f4042R = mdz.Ltr;

    public static void L(h57 h57, l0f l0f, int i, int i2, kg9 kg9, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = aQy.R;
            kg9 = nqF.V;
        }
        h57.getClass();
        long v = cU5.v(i, i2);
        long yf = l0f.yf();
        l0f.KZ(cU5.v(((int) (v >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(v)), 0.0f, kg9);
    }

    public static void O(h57 h57, l0f l0f, int i, int i2) {
        int i3 = aQy.R;
        nqF nqf = nqF.V;
        h57.getClass();
        long v = cU5.v(i, i2);
        if (f4042R == mdz.Ltr || R(h57) == 0) {
            long yf = l0f.yf();
            l0f.KZ(cU5.v(((int) (v >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(v)), 0.0f, nqf);
            return;
        }
        long v2 = cU5.v((R(h57) - l0f.e) - ((int) (v >> 32)), dU5.v(v));
        long yf2 = l0f.yf();
        l0f.KZ(cU5.v(((int) (v2 >> 32)) + ((int) (yf2 >> 32)), dU5.v(yf2) + dU5.v(v2)), 0.0f, nqf);
    }

    public static final int R(h57 h57) {
        ((gHI) h57).getClass();
        return R;
    }

    public static void X(h57 h57, l0f l0f, int i, int i2) {
        h57.getClass();
        long v = cU5.v(i, i2);
        if (f4042R == mdz.Ltr || R(h57) == 0) {
            long yf = l0f.yf();
            l0f.KZ(cU5.v(((int) (v >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(v)), 0.0f, null);
            return;
        }
        long v2 = cU5.v((R(h57) - l0f.e) - ((int) (v >> 32)), dU5.v(v));
        long yf2 = l0f.yf();
        l0f.KZ(cU5.v(((int) (v2 >> 32)) + ((int) (yf2 >> 32)), dU5.v(yf2) + dU5.v(v2)), 0.0f, null);
    }

    public static void Z(l0f l0f, long j, float f, kg9 kg9) {
        long yf = l0f.yf();
        l0f.KZ(cU5.v(((int) (j >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(j)), f, kg9);
    }

    public static void c(l0f l0f, long j, float f) {
        long yf = l0f.yf();
        l0f.KZ(cU5.v(((int) (j >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(j)), f, null);
    }

    public static /* synthetic */ void e(h57 h57, l0f l0f, long j) {
        h57.getClass();
        c(l0f, j, 0.0f);
    }

    public static /* synthetic */ void m(h57 h57, l0f l0f, long j) {
        int i = aQy.R;
        nqF nqf = nqF.V;
        h57.getClass();
        Z(l0f, j, 0.0f, nqf);
    }

    public static void v(h57 h57, l0f l0f, int i, int i2) {
        h57.getClass();
        long v = cU5.v(i, i2);
        long yf = l0f.yf();
        l0f.KZ(cU5.v(((int) (v >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(v)), 0.0f, null);
    }
}
