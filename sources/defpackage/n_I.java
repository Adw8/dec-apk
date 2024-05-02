package defpackage;

/* renamed from: n_I  reason: default package */
/* loaded from: classes.dex */
public final class n_I implements dmk {

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f6462R;
    public final fjG R = new fjG(this);

    /* renamed from: R  reason: collision with other field name */
    public final j5q f6461R = new j5q();

    /* renamed from: R  reason: collision with other field name */
    public final oST f6463R = l6.n(Boolean.FALSE);

    public n_I(kg9 kg9) {
        this.f6462R = kg9;
    }

    @Override // defpackage.dmk
    public final Object R(gRY gry, iv7 iv7, aOO aoo) {
        Object L = jjU.L(new oCp(this, gry, iv7, null), aoo);
        return L == bGR.COROUTINE_SUSPENDED ? L : o8s.R;
    }

    @Override // defpackage.dmk
    public final boolean c() {
        return ((Boolean) this.f6463R.getValue()).booleanValue();
    }

    @Override // defpackage.dmk
    public final float e(float f) {
        return ((Number) this.f6462R.x(Float.valueOf(f))).floatValue();
    }
}
