package defpackage;

/* renamed from: pxZ  reason: default package */
/* loaded from: classes.dex */
public final class pxZ implements h2V {
    public final /* synthetic */ dCq R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iHI f7327R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pd2 f7328R;
    public final /* synthetic */ int e;

    public /* synthetic */ pxZ(jy_ jy_, iHI ihi, dCq dcq, pd2 pd2, int i) {
        this.e = i;
        this.f7327R = ihi;
        this.R = dcq;
        this.f7328R = pd2;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        switch (this.e) {
            case 0:
                String str = (String) obj;
                String V = gvP.V(-3881557115861985171L);
                kxm.v(V, 6, "VM error: " + str, null);
                this.f7327R.f4524R.x(this.R, null);
                iHI.R(this.f7327R);
                this.f7328R.c(null);
                Object R = this.f7327R.f4521R.R(str, aoo);
                return R == bgr ? R : o8s.R;
            default:
                o8s o8s = (o8s) obj;
                kxm.v(gvP.V(-3881554822349449107L), 4, gvP.V(-3881554878184023955L), null);
                this.f7327R.f4524R.x(this.R, null);
                iHI.R(this.f7327R);
                this.f7328R.c(null);
                Object L = this.f7327R.f4525R.L(aoo);
                return L == bgr ? L : o8s.R;
        }
    }
}
