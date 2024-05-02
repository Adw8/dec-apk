package defpackage;

/* renamed from: mtG  reason: default package */
/* loaded from: classes.dex */
public final class mtG implements j__, iCt {
    public final dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public gAN f6223R = jzg.f5174R;

    public mtG(h0T h0t) {
        this.R = h0t;
    }

    @Override // defpackage.iCt
    public final void R(float f) {
        bs4 bs4 = (bs4) this.R.getValue();
        bs4.R(this.f6223R, bs4.X(f), 1);
    }

    @Override // defpackage.j__
    public final Object v(iv7 iv7, aOO aoo) {
        Object R = ((bs4) this.R.getValue()).f1827R.R(gRY.UserInput, new kj8(this, iv7, null), aoo);
        return R == bGR.COROUTINE_SUSPENDED ? R : o8s.R;
    }
}
