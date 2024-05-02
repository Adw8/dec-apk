package defpackage;

/* renamed from: pip  reason: default package */
/* loaded from: classes.dex */
public abstract class pip {

    /* renamed from: R  reason: collision with other field name */
    public static final mDL f7198R = new mDL(1);
    public static final lmI R = new lmI("NO_VALUE");

    public static bLS R(int i, int i2, h9 h9Var, int i3) {
        h9 h9Var2 = h9.SUSPEND;
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            h9Var = h9Var2;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                if (i > 0 || i2 > 0 || h9Var == h9Var2) {
                    z = true;
                }
                if (z) {
                    int i4 = i2 + i;
                    if (i4 < 0) {
                        i4 = Integer.MAX_VALUE;
                    }
                    return new bLS(i, i4, h9Var);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + h9Var).toString());
            }
            throw new IllegalArgumentException(opT.Z("extraBufferCapacity cannot be negative, but was ", i2).toString());
        }
        throw new IllegalArgumentException(opT.Z("replay cannot be negative, but was ", i).toString());
    }

    public static String c(int i) {
        boolean z = false;
        if (i == 0) {
            return "Blocking";
        }
        if (i == 1) {
            return "Optional";
        }
        if (i == 2) {
            z = true;
        }
        if (z) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public static FP v(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-89536160);
        owM owm = _1.R;
        long v = _1.v((E2) jr_.x(owm), XW.f619R);
        long v2 = _1.v((E2) jr_.x(owm), XW.X);
        long v3 = _1.v((E2) jr_.x(owm), XW.c);
        long v4 = n3.v(_1.v((E2) jr_.x(owm), XW.v), 0.38f);
        FP fp = new FP(v3, n3.v(v3, 0.0f), v, n3.v(v, 0.0f), v4, n3.v(n3.v(_1.v((E2) jr_.x(owm), XW.e), 0.38f), 0.0f), v4, v, v2, v4, v4);
        jr_.g(false);
        return fp;
    }
}
