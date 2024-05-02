package defpackage;

/* renamed from: i5  reason: default package */
/* loaded from: classes.dex */
public final class i5 extends ivC implements obE {
    public final Throwable R;

    public i5(Throwable th) {
        this.R = th;
    }

    @Override // defpackage.ivC
    public final void I(i5 i5Var) {
    }

    @Override // defpackage.obE
    public final Object O() {
        return this;
    }

    @Override // defpackage.ivC
    public final void Y() {
    }

    @Override // defpackage.obE
    public final void c(Object obj) {
    }

    @Override // defpackage.obE
    public final lmI e(Object obj) {
        return mxC.f6247R;
    }

    @Override // defpackage.ivC
    public final Object h() {
        return this;
    }

    public final Throwable n() {
        Throwable th = this.R;
        return th == null ? new b2() : th;
    }

    @Override // defpackage.oLj
    public final String toString() {
        StringBuilder U = opT.U("Closed@");
        U.append(aH9.G(this));
        U.append('[');
        U.append(this.R);
        U.append(']');
        return U.toString();
    }

    @Override // defpackage.ivC
    public final lmI u() {
        return mxC.f6247R;
    }
}
