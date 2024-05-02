package defpackage;

/* renamed from: d7  reason: default package */
/* loaded from: classes.dex */
public final class d7 extends q {
    public d7() {
    }

    public d7(W w) {
        super(w);
    }

    public d7(b bVar) {
        super(bVar);
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.y(z, 48, this.f7346R);
    }

    @Override // defpackage.q
    public final _L T() {
        return new D9(this.f7346R);
    }

    @Override // defpackage.q
    public final e W() {
        return new a9(n());
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        int i = z ? 4 : 3;
        int length = this.f7346R.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.f7346R[i2].v().Y(true);
        }
        return i;
    }

    @Override // defpackage.q
    public final F s() {
        return new CB(Q());
    }
}
