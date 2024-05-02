package defpackage;

/* renamed from: Hd  reason: default package */
/* loaded from: classes.dex */
public final class Hd {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public Pc f175R;

    /* renamed from: R  reason: collision with other field name */
    public final f_c f176R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f177R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f178R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f179R;
    public long v;
    public long c = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with other field name */
    public final oST f180v = l6.n(Boolean.TRUE);

    public Hd(Object obj, oHg ohg, Pc pc, long j, Object obj2, long j2, pst pst) {
        this.f178R = ohg;
        this.f177R = obj2;
        this.R = j2;
        this.f176R = pst;
        this.f179R = l6.n(obj);
        this.f175R = o02.x(pc);
        this.v = j;
    }

    public final void R() {
        this.f180v.R(Boolean.FALSE);
        this.f176R.g();
    }

    public final Object c() {
        return this.f178R.v.x(this.f175R);
    }

    public final boolean e() {
        return ((Boolean) this.f180v.getValue()).booleanValue();
    }

    public final Object v() {
        return this.f179R.getValue();
    }
}
