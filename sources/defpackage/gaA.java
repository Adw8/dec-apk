package defpackage;

/* renamed from: gaA  reason: default package */
/* loaded from: classes.dex */
public abstract class gaA {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final long f3795R = gQc.S(14);
    public static final long v = gQc.S(0);
    public static final long c = n3.X;
    public static final long e = n3.v;

    static {
        int i = n3.R;
    }

    public static final Object R(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long v(long j, long j2, float f) {
        if (gQc.T(j) || gQc.T(j2)) {
            return ((eT9) R(f, new eT9(j), new eT9(j2))).f3107R;
        }
        if (!(!gQc.T(j) && !gQc.T(j2))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        } else if (lqt.R(eT9.v(j), eT9.v(j2))) {
            return gQc.r(hDC.z(eT9.c(j), eT9.c(j2), f), 1095216660480L & j);
        } else {
            StringBuilder U = opT.U("Cannot perform operation for ");
            U.append((Object) lqt.v(eT9.v(j)));
            U.append(" and ");
            U.append((Object) lqt.v(eT9.v(j2)));
            throw new IllegalArgumentException(U.toString().toString());
        }
    }
}
