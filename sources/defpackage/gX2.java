package defpackage;

/* renamed from: gX2  reason: default package */
/* loaded from: classes.dex */
public abstract class gX2 implements n76 {
    public final bAW R;
    public final bAW c;
    public final bAW e;
    public final bAW v;

    public gX2(bAW baw, bAW baw2, bAW baw3, bAW baw4) {
        this.R = baw;
        this.v = baw2;
        this.c = baw3;
        this.e = baw4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [bAW] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bAW] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bAW] */
    public static o9z v(gX2 gx2, c2I c2i, c2I c2i2, c2I c2i3, int i) {
        c2I c2i4 = c2i;
        if ((i & 1) != 0) {
            c2i4 = gx2.R;
        }
        bAW baw = (i & 2) != 0 ? gx2.v : null;
        c2I c2i5 = c2i2;
        if ((i & 4) != 0) {
            c2i5 = gx2.c;
        }
        c2I c2i6 = c2i3;
        if ((i & 8) != 0) {
            c2i6 = gx2.e;
        }
        ((o9z) gx2).getClass();
        return new o9z(c2i4, baw, c2i5, c2i6);
    }

    @Override // defpackage.n76
    public final vC R(long j, mdz mdz, jJj jjj) {
        float R = this.R.R(j, jjj);
        float R2 = this.v.R(j, jjj);
        float R3 = this.c.R(j, jjj);
        float R4 = this.e.R(j, jjj);
        float c = nqW.c(j);
        float f = R + R4;
        if (f > c) {
            float f2 = c / f;
            R *= f2;
            R4 *= f2;
        }
        float f3 = R2 + R3;
        if (f3 > c) {
            float f4 = c / f3;
            R2 *= f4;
            R3 *= f4;
        }
        boolean z = true;
        if (R >= 0.0f && R2 >= 0.0f && R3 >= 0.0f && R4 >= 0.0f) {
            if (R + R2 + R3 + R4 != 0.0f) {
                z = false;
            }
            if (z) {
                return new kW2(msU.e(aWo.v, j));
            }
            gIA e = msU.e(aWo.v, j);
            mdz mdz2 = mdz.Ltr;
            float f5 = mdz == mdz2 ? R : R2;
            long R5 = g4x.R(f5, f5);
            if (mdz == mdz2) {
                R = R2;
            }
            long R6 = g4x.R(R, R);
            float f6 = mdz == mdz2 ? R3 : R4;
            long R7 = g4x.R(f6, f6);
            if (mdz != mdz2) {
                R4 = R3;
            }
            return new j43(new bwp(e.f3720R, e.v, e.c, e.e, R5, R6, R7, g4x.R(R4, R4)));
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + R + ", topEnd = " + R2 + ", bottomEnd = " + R3 + ", bottomStart = " + R4 + ")!").toString());
    }
}
