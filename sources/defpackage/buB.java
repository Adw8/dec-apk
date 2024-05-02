package defpackage;

/* renamed from: buB  reason: default package */
/* loaded from: classes.dex */
public abstract class buB {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final long f1848R = g4x.R(0.0f, 0.0f);

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String e(long j) {
        if (v(j) == c(j)) {
            StringBuilder U = opT.U("CornerRadius.circular(");
            U.append(ooA.J(v(j)));
            U.append(')');
            return U.toString();
        }
        StringBuilder U2 = opT.U("CornerRadius.elliptical(");
        U2.append(ooA.J(v(j)));
        U2.append(", ");
        U2.append(ooA.J(c(j)));
        U2.append(')');
        return U2.toString();
    }

    public static final float v(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }
}
