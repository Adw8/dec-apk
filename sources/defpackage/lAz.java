package defpackage;

/* renamed from: lAz  reason: default package */
/* loaded from: classes.dex */
public final class lAz extends fGd {
    public final /* synthetic */ hgO R;

    /* renamed from: R  reason: collision with other field name */
    public final k0 f5610R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lAz(hgO hgo, Object obj, xx xxVar) {
        super(obj);
        this.R = hgo;
        this.f5610R = xxVar;
    }

    @Override // defpackage.fGd
    public final void Y() {
        xx xxVar = (xx) this.f5610R;
        xxVar.C(xxVar.e);
    }

    @Override // defpackage.fGd
    public final boolean h() {
        if (!fGd.R.compareAndSet(this, 0, 1)) {
            return false;
        }
        return ((xx) this.f5610R).z(o8s.R, null, new Wn(this.R, 6, this)) != null;
    }

    @Override // defpackage.oLj
    public final String toString() {
        StringBuilder U = opT.U("LockCont[");
        U.append(((fGd) this).f3367R);
        U.append(", ");
        U.append(this.f5610R);
        U.append("] for ");
        U.append(this.R);
        return U.toString();
    }
}
