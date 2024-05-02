package defpackage;

/* renamed from: hgI  reason: default package */
/* loaded from: classes.dex */
public final class hgI implements px {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final Pc f4343R;

    /* renamed from: R  reason: collision with other field name */
    public final iHW f4344R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4345R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f4346R;
    public final Pc c;
    public final Pc e;
    public final Pc v;

    /* renamed from: v  reason: collision with other field name */
    public final Object f4347v;

    public /* synthetic */ hgI(jM jMVar, oHg ohg, Object obj, Object obj2) {
        this(jMVar, ohg, obj, obj2, null);
    }

    @Override // defpackage.px
    public final boolean L(long j) {
        return o02.g(this, j);
    }

    @Override // defpackage.px
    public final oHg O() {
        return this.f4346R;
    }

    @Override // defpackage.px
    public final boolean R() {
        return this.f4344R.R();
    }

    @Override // defpackage.px
    public final Object X(long j) {
        return !o02.g(this, j) ? this.f4346R.v.x(this.f4344R.v(j, this.f4343R, this.v, this.c)) : this.f4347v;
    }

    @Override // defpackage.px
    public final Object c() {
        return this.f4347v;
    }

    @Override // defpackage.px
    public final long e() {
        return this.R;
    }

    public final String toString() {
        StringBuilder U = opT.U("TargetBasedAnimation: ");
        U.append(this.f4345R);
        U.append(" -> ");
        U.append(this.f4347v);
        U.append(",initial velocity: ");
        U.append(this.c);
        U.append(", duration: ");
        U.append(e() / 1000000);
        U.append(" ms");
        return U.toString();
    }

    @Override // defpackage.px
    public final Pc v(long j) {
        return !o02.g(this, j) ? this.f4344R.c(j, this.f4343R, this.v, this.c) : this.e;
    }

    public hgI(jM jMVar, oHg ohg, Object obj, Object obj2, Pc pc) {
        Pc pc2;
        iHW c = jMVar.c(ohg);
        this.f4344R = c;
        this.f4346R = ohg;
        this.f4345R = obj;
        this.f4347v = obj2;
        Pc pc3 = (Pc) ohg.R.x(obj);
        this.f4343R = pc3;
        Pc pc4 = (Pc) ohg.R.x(obj2);
        this.v = pc4;
        if (pc == null) {
            pc2 = null;
        } else {
            pc2 = o02.x(pc);
        }
        pc2 = pc2 == null ? ((Pc) ohg.R.x(obj)).c() : pc2;
        this.c = pc2;
        this.R = c.X(pc3, pc4, pc2);
        this.e = c.e(pc3, pc4, pc2);
    }
}
