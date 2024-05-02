package defpackage;

/* renamed from: eA4  reason: default package */
/* loaded from: classes.dex */
public final class eA4 implements px {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final Pc f2997R;

    /* renamed from: R  reason: collision with other field name */
    public final e_b f2998R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f2999R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f3000R;
    public final Pc c;
    public final Pc v;

    /* renamed from: v  reason: collision with other field name */
    public final Object f3001v;

    public eA4(kbU kbu, oHg ohg, Object obj, Pc pc) {
        e_b e_b = new e_b(kbu.R);
        this.f2998R = e_b;
        this.f3000R = ohg;
        this.f2999R = obj;
        Pc pc2 = (Pc) ohg.R.x(obj);
        this.f2997R = pc2;
        this.v = o02.x(pc);
        this.f3001v = ohg.v.x(e_b.R(pc2, pc));
        if (e_b.v == null) {
            e_b.v = pc2.c();
        }
        Pc pc3 = e_b.v;
        int v = (pc3 == null ? null : pc3).v();
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i2 < v) {
            i2++;
            lmp lmp = e_b.f3151R;
            pc2.R(i2);
            j = Math.max(j, ((long) (Math.exp(((o00) lmp).R.v(pc.R(i2)) / (((double) ldu.R) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.R = j;
        Pc x = o02.x(this.f2998R.v(j, this.f2997R, pc));
        this.c = x;
        int v2 = x.v();
        while (i < v2) {
            i++;
            Pc pc4 = this.c;
            float R = pc4.R(i);
            this.f2998R.getClass();
            this.f2998R.getClass();
            pc4.X(i, caw.m(R, -0.0f, 0.0f));
        }
    }

    @Override // defpackage.px
    public final boolean L(long j) {
        return o02.g(this, j);
    }

    @Override // defpackage.px
    public final oHg O() {
        return this.f3000R;
    }

    @Override // defpackage.px
    public final boolean R() {
        return false;
    }

    @Override // defpackage.px
    public final Object X(long j) {
        if (o02.g(this, j)) {
            return this.f3001v;
        }
        kg9 kg9 = this.f3000R.v;
        e_b e_b = this.f2998R;
        Pc pc = this.f2997R;
        Pc pc2 = this.v;
        if (e_b.R == null) {
            e_b.R = pc.c();
        }
        int i = 0;
        Pc pc3 = e_b.R;
        Pc pc4 = null;
        if (pc3 == null) {
            pc3 = null;
        }
        int v = pc3.v();
        while (i < v) {
            i++;
            Pc pc5 = e_b.R;
            if (pc5 == null) {
                pc5 = null;
            }
            lmp lmp = e_b.f3151R;
            float R = pc.R(i);
            float R2 = pc2.R(i);
            o00 o00 = (o00) lmp;
            o00.getClass();
            long j2 = j / 1000000;
            c2L R3 = o00.R.R(R2);
            long j3 = R3.f1949R;
            pc5.X(i, (Math.signum(R3.R) * R3.v * js.R(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).R) + R);
        }
        Pc pc6 = e_b.R;
        if (pc6 != null) {
            pc4 = pc6;
        }
        return kg9.x(pc4);
    }

    @Override // defpackage.px
    public final Object c() {
        return this.f3001v;
    }

    @Override // defpackage.px
    public final long e() {
        return this.R;
    }

    @Override // defpackage.px
    public final Pc v(long j) {
        return !o02.g(this, j) ? this.f2998R.v(j, this.f2997R, this.v) : this.c;
    }
}
