package defpackage;

/* renamed from: ko1  reason: default package */
/* loaded from: classes.dex */
public class ko1 extends ivC {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final k0 f5432R;

    public ko1(Object obj, xx xxVar) {
        this.R = obj;
        this.f5432R = xxVar;
    }

    @Override // defpackage.ivC
    public final void I(i5 i5Var) {
        k0 k0Var = this.f5432R;
        Throwable th = i5Var.R;
        if (th == null) {
            th = new Z2();
        }
        ((xx) k0Var).Y(new bvw(th));
    }

    @Override // defpackage.ivC
    public final void Y() {
        xx xxVar = (xx) this.f5432R;
        xxVar.C(xxVar.e);
    }

    @Override // defpackage.ivC
    public final Object h() {
        return this.R;
    }

    @Override // defpackage.oLj
    public final String toString() {
        return getClass().getSimpleName() + '@' + aH9.G(this) + '(' + this.R + ')';
    }

    @Override // defpackage.ivC
    public final lmI u() {
        if (((xx) this.f5432R).z(o8s.R, null, null) == null) {
            return null;
        }
        return mxC.f6247R;
    }
}
