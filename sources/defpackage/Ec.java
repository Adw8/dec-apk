package defpackage;

/* renamed from: Ec  reason: default package */
/* loaded from: classes.dex */
public final class Ec extends ivC {
    public final Object R;

    public Ec(Object obj) {
        this.R = obj;
    }

    @Override // defpackage.ivC
    public final void I(i5 i5Var) {
    }

    @Override // defpackage.ivC
    public final void Y() {
    }

    @Override // defpackage.ivC
    public final Object h() {
        return this.R;
    }

    @Override // defpackage.oLj
    public final String toString() {
        StringBuilder U = opT.U("SendBuffered@");
        U.append(aH9.G(this));
        U.append('(');
        U.append(this.R);
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.ivC
    public final lmI u() {
        return mxC.f6247R;
    }
}
