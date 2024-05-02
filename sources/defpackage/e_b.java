package defpackage;

/* renamed from: e_b  reason: default package */
/* loaded from: classes.dex */
public final class e_b {
    public Pc R;

    /* renamed from: R  reason: collision with other field name */
    public final lmp f3151R;
    public Pc c;
    public Pc v;

    public e_b(lmp lmp) {
        this.f3151R = lmp;
    }

    public final Pc R(Pc pc, Pc pc2) {
        if (this.c == null) {
            this.c = pc.c();
        }
        int i = 0;
        Pc pc3 = this.c;
        if (pc3 == null) {
            pc3 = null;
        }
        for (int v = pc3.v(); i < v; v = v) {
            i++;
            Pc pc4 = this.c;
            if (pc4 == null) {
                pc4 = null;
            }
            lmp lmp = this.f3151R;
            float R = pc.R(i);
            float R2 = pc2.R(i);
            df0 df0 = ((o00) lmp).R;
            double v2 = df0.v(R2);
            double d = (double) ldu.R;
            double exp = Math.exp((d / (d - 1.0d)) * v2);
            pc4.X(i, (Math.signum(R2) * ((float) (exp * ((double) (df0.R * df0.v))))) + R);
        }
        Pc pc5 = this.c;
        if (pc5 == null) {
            return null;
        }
        return pc5;
    }

    public final Pc v(long j, Pc pc, Pc pc2) {
        if (this.v == null) {
            this.v = pc.c();
        }
        int i = 0;
        Pc pc3 = this.v;
        if (pc3 == null) {
            pc3 = null;
        }
        int v = pc3.v();
        while (i < v) {
            i++;
            Pc pc4 = this.v;
            if (pc4 == null) {
                pc4 = null;
            }
            lmp lmp = this.f3151R;
            pc.R(i);
            float R = pc2.R(i);
            o00 o00 = (o00) lmp;
            o00.getClass();
            long j2 = j / 1000000;
            c2L R2 = o00.R.R(R);
            long j3 = R2.f1949R;
            pc4.X(i, (((Math.signum(R2.R) * js.R(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).v) * R2.v) / ((float) R2.f1949R)) * 1000.0f);
        }
        Pc pc5 = this.v;
        if (pc5 == null) {
            return null;
        }
        return pc5;
    }
}
