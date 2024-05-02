package defpackage;

/* renamed from: aGK  reason: default package */
/* loaded from: classes.dex */
public final class aGK {
    public eDo R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h5L f814R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f815R;

    public aGK(h5L h5l, oHg ohg, String str) {
        this.f814R = h5l;
        this.f815R = ohg;
    }

    public final eDo R(kg9 kg9, kg9 kg92) {
        eDo edo = this.R;
        if (edo == null) {
            h5L h5l = this.f814R;
            Object x = kg92.x(h5l.v());
            oHg ohg = this.f815R;
            c0y c0y = new c0y(h5l, x, ((Pc) ohg.R.x(kg92.x(this.f814R.v()))).c(), this.f815R);
            edo = new eDo(this, c0y, kg9, kg92);
            h5L h5l2 = this.f814R;
            this.R = edo;
            h5l2.f4044R.add(c0y);
        }
        h5L h5l3 = this.f814R;
        edo.v = kg92;
        edo.f3038R = kg9;
        edo.v(h5l3.c());
        return edo;
    }
}
