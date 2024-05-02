package dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair;

/* loaded from: classes.dex */
public final class AdbPairViewModel extends kvj {
    public final OT R;

    /* renamed from: R  reason: collision with other field name */
    public final gh f2758R;

    /* renamed from: R  reason: collision with other field name */
    public final oLT f2761R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f2762R;

    /* renamed from: R  reason: collision with other field name */
    public final yd f2763R;
    public final oST v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f2764v = mxC.g();

    /* renamed from: R  reason: collision with other field name */
    public final iyL f2759R = new iyL();

    /* renamed from: R  reason: collision with other field name */
    public final o7V f2760R = l6.z(gvP.o(this), null, 0, new fT(this, null), 3);

    public AdbPairViewModel(gh ghVar, IO io2, oLT olt, yd ydVar) {
        this.f2758R = ghVar;
        this.R = io2;
        this.f2761R = olt;
        this.f2763R = ydVar;
        Boolean bool = Boolean.FALSE;
        this.f2762R = l6.n(bool);
        this.v = l6.n(bool);
    }

    public final boolean e() {
        this.R.getClass();
        oLT olt = this.f2761R;
        boolean z = C1.R(olt.f6770R, olt.R.R) == 0;
        if (((Boolean) this.f2763R.R.getValue()).booleanValue() && !z) {
            this.f2762R.R(Boolean.TRUE);
        }
        return z;
    }
}
