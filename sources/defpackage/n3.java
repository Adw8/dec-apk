package defpackage;

/* renamed from: n3  reason: default package */
/* loaded from: classes.dex */
public final class n3 {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final long f6279R;
    public static final long v = aH9.O(4278190080L);
    public static final long c = aH9.O(4294901760L);
    public static final long e = aH9.O(4278190335L);
    public static final long X = aH9.X(0);
    public static final long O = aH9.e(0.0f, 0.0f, 0.0f, 0.0f, K6.P);

    static {
        aH9.O(4282664004L);
        aH9.O(4287137928L);
        aH9.O(4291611852L);
        aH9.O(4294967295L);
        aH9.O(4278255360L);
        aH9.O(4294967040L);
        aH9.O(4278255615L);
        aH9.O(4294902015L);
    }

    public /* synthetic */ n3(long j) {
        this.f6279R = j;
    }

    public static final float L(long j) {
        return (63 & j) == 0 ? ((float) n3x.J((j >>> 40) & 255)) / 255.0f : mJe.v((short) ((int) ((j >>> 32) & 65535)));
    }

    public static final u_ O(long j) {
        float[] fArr = K6.f230R;
        return K6.f231R[(int) (j & 63)];
    }

    public static final long R(long j, u_ u_Var) {
        if (n3x.v(u_Var, O(j))) {
            return j;
        }
        nMl n = msU.n(O(j), u_Var, 2);
        float[] k = aH9.k(j);
        n.R(k);
        return aH9.e(k[0], k[1], k[2], k[3], u_Var);
    }

    public static final float X(long j) {
        return (63 & j) == 0 ? ((float) n3x.J((j >>> 32) & 255)) / 255.0f : mJe.v((short) ((int) ((j >>> 16) & 65535)));
    }

    public static final float Z(long j) {
        return (63 & j) == 0 ? ((float) n3x.J((j >>> 48) & 255)) / 255.0f : mJe.v((short) ((int) ((j >>> 48) & 65535)));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float e(long j) {
        float f;
        float f2;
        if ((63 & j) == 0) {
            f2 = (float) n3x.J((j >>> 56) & 255);
            f = 255.0f;
        } else {
            f2 = (float) n3x.J((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return f2 / f;
    }

    public static String m(long j) {
        StringBuilder U = opT.U("Color(");
        U.append(Z(j));
        U.append(", ");
        U.append(L(j));
        U.append(", ");
        U.append(X(j));
        U.append(", ");
        U.append(e(j));
        U.append(", ");
        U.append(O(j).f7427R);
        U.append(')');
        return U.toString();
    }

    public static long v(long j, float f) {
        return aH9.e(Z(j), L(j), X(j), f, O(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n3) && this.f6279R == ((n3) obj).f6279R;
    }

    public final int hashCode() {
        return ejC.R(this.f6279R);
    }

    public final String toString() {
        return m(this.f6279R);
    }
}
