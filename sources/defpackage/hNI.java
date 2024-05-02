package defpackage;

/* renamed from: hNI  reason: default package */
/* loaded from: classes.dex */
public final class hNI implements dmk {
    public static final f1A R = new f1A(4, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final k_s f4218R;

    /* renamed from: R  reason: collision with other field name */
    public float f4219R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4221R;
    public oST v;

    /* renamed from: R  reason: collision with other field name */
    public final p2E f4222R = new p2E();

    /* renamed from: R  reason: collision with other field name */
    public final n_I f4220R = new n_I(new _0(5, this));

    static {
        iJF ijf = iJF.R;
        ih ihVar = ih.X;
        k_s k_s = e29.R;
        f4218R = new k_s(ijf, ihVar);
    }

    public hNI(int i) {
        Integer valueOf = Integer.valueOf(i);
        bHa bha = bHa.R;
        this.f4221R = new oST(valueOf, bha);
        this.v = new oST(Integer.MAX_VALUE, bha);
    }

    @Override // defpackage.dmk
    public final Object R(gRY gry, iv7 iv7, aOO aoo) {
        Object R2 = this.f4220R.R(gry, iv7, aoo);
        return R2 == bGR.COROUTINE_SUSPENDED ? R2 : o8s.R;
    }

    public final int X() {
        return ((Number) this.f4221R.getValue()).intValue();
    }

    @Override // defpackage.dmk
    public final boolean c() {
        return this.f4220R.c();
    }

    @Override // defpackage.dmk
    public final float e(float f) {
        return this.f4220R.e(f);
    }
}
