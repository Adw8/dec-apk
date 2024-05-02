package defpackage;

/* renamed from: nQG  reason: default package */
/* loaded from: classes.dex */
public final class nQG extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nQG(int i, int i2, Object obj) {
        super(3);
        this.X = i2;
        this.R = obj;
        this.O = i;
    }

    public final void R(Su su, mdh mdh, h1W h1w) {
        dYh dyh;
        hAe hae;
        switch (this.X) {
            case 0:
                Object obj = this.R;
                if (obj instanceof ddq) {
                    h1w.X((ddq) obj);
                }
                Object A = mdh.A(this.O, this.R);
                if (A instanceof ddq) {
                    h1w.e((ddq) A);
                    return;
                } else if ((A instanceof dYh) && (hae = (dyh = (dYh) A).f2665R) != null) {
                    dyh.f2665R = null;
                    dyh.f2664R = null;
                    dyh.f2667R = null;
                    hae.f4151R = true;
                    return;
                } else {
                    return;
                }
            default:
                Object Y = mdh.Y(mdh.c((WB) this.R));
                su.e();
                su.v(this.O, Y);
                return;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            default:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
        }
        return o8s.R;
    }
}
