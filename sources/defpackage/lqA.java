package defpackage;

/* renamed from: lqA  reason: default package */
/* loaded from: classes.dex */
public final class lqA {
    public static final ift R = new ift(14, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final k_s f5842R = msU.mL(ky1.U, nqF.X);

    /* renamed from: R  reason: collision with other field name */
    public final oST f5843R;
    public oST c;
    public final oST v;

    public lqA(float f, float f2, float f3) {
        this.f5843R = l6.n(Float.valueOf(f));
        this.v = l6.n(Float.valueOf(f3));
        this.c = l6.n(Float.valueOf(f2));
    }

    public final float R() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final void c(float f) {
        this.c.R(Float.valueOf(caw.m(f, v(), 0.0f)));
    }

    public final float v() {
        return ((Number) this.f5843R.getValue()).floatValue();
    }
}
