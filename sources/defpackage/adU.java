package defpackage;

/* renamed from: adU  reason: default package */
/* loaded from: classes.dex */
public abstract class adU {

    /* renamed from: R  reason: collision with other field name */
    public static final prr f942R = new prr(2, 1.0f, new dio(3, 1.0f));

    /* renamed from: v  reason: collision with other field name */
    public static final prr f943v = new prr(1, 1.0f, new dio(1, 1.0f));
    public static final prr c = new prr(3, 1.0f, new dio(2, 1.0f));
    public static final cXC R = R(dq.X, false);
    public static final cXC v = R(dq.R, false);

    public static final ncu H(ncu ncu, float f) {
        return ncu.I(new mu5(f, 0.0f, f, 0.0f, 10));
    }

    public static ncu L(ncu ncu, float f, float f2, int i) {
        return ncu.I(new mu5(0.0f, (i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 5));
    }

    public static final ncu O(ncu ncu, float f) {
        return ncu.I(new mu5(0.0f, f, 0.0f, f, 5));
    }

    public static final cXC R(mz mzVar, boolean z) {
        return new cXC(3, z, new bkx(1, mzVar), mzVar, new UX(mzVar, z, 2));
    }

    public static ncu U(ncu ncu, Y6 y6, int i) {
        if ((i & 1) != 0) {
            y6 = dq.X;
        }
        return ncu.I(n3x.v(y6, dq.X) ? R : n3x.v(y6, dq.R) ? v : R(y6, false));
    }

    public static ncu X(ncu ncu) {
        return ncu.I(f942R);
    }

    public static final ncu Z(ncu ncu, float f) {
        return ncu.I(new mu5(f, f, f, f, true));
    }

    public static /* synthetic */ ncu c(float f, int i) {
        aff aff = aff.R;
        float f2 = Float.NaN;
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) == 0) {
            f2 = 0.0f;
        }
        return v(aff, f, f2);
    }

    public static ncu e(ncu ncu) {
        return ncu.I(f943v);
    }

    public static final ncu m(ncu ncu, float f, float f2) {
        return ncu.I(new mu5(f, f2, f, f2, true));
    }

    public static final ncu v(ncu ncu, float f, float f2) {
        return ncu.I(new a7F(f, f2));
    }

    public static ncu x(ncu ncu, float f, float f2, float f3, int i) {
        float f4 = Float.NaN;
        float f5 = (i & 1) != 0 ? Float.NaN : f;
        float f6 = (i & 2) != 0 ? Float.NaN : f2;
        float f7 = (i & 4) != 0 ? Float.NaN : f3;
        if ((i & 8) == 0) {
            f4 = 0.0f;
        }
        return ncu.I(new mu5(f5, f6, f7, f4, true));
    }
}
