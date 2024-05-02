package defpackage;

/* renamed from: gBs  reason: default package */
/* loaded from: classes.dex */
public final class gBs implements Su {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Su f3690R;
    public int v;

    public gBs(Su su, int i) {
        this.f3690R = su;
        this.R = i;
    }

    @Override // defpackage.Su
    public final void L(int i, int i2, int i3) {
        int i4 = this.v == 0 ? this.R : 0;
        this.f3690R.L(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.Su
    public final void O(Object obj) {
        this.v++;
        this.f3690R.O(obj);
    }

    @Override // defpackage.Su
    public final void R(int i, Object obj) {
        this.f3690R.R(i + (this.v == 0 ? this.R : 0), obj);
    }

    @Override // defpackage.Su
    public final void Z(int i, int i2) {
        this.f3690R.Z(i + (this.v == 0 ? this.R : 0), i2);
    }

    @Override // defpackage.Su
    public final Object c() {
        return this.f3690R.c();
    }

    @Override // defpackage.Su
    public final void clear() {
        vC.e("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // defpackage.Su
    public final void e() {
        int i = this.v;
        if (i > 0) {
            this.v = i - 1;
            this.f3690R.e();
            return;
        }
        vC.e("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }

    @Override // defpackage.Su
    public final void v(int i, Object obj) {
        this.f3690R.v(i + (this.v == 0 ? this.R : 0), obj);
    }
}
