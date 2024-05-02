package defpackage;

/* renamed from: iYs  reason: default package */
/* loaded from: classes.dex */
public final class iYs extends kvj {
    public static final gUZ R = new gUZ(1);

    /* renamed from: R  reason: collision with other field name */
    public eSi f4641R = new eSi();

    @Override // defpackage.kvj
    public final void v() {
        if (this.f4641R.m() <= 0) {
            eSi esi = this.f4641R;
            int i = esi.e;
            Object[] objArr = esi.f3104R;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            esi.e = 0;
            esi.f3102R = false;
            return;
        }
        jQ.Y(this.f4641R.x(0));
        throw null;
    }
}
