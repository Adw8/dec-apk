package defpackage;

/* renamed from: hO0  reason: default package */
/* loaded from: classes.dex */
public final class hO0 extends k8G implements lR3 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hO0(Object obj, int i, int i2, int i3) {
        super(3);
        this.X = i3;
        this.R = obj;
        this.O = i;
        this.L = i2;
    }

    public final void R(Su su, mdh mdh, h1W h1w) {
        switch (this.X) {
            case 0:
                if (n3x.v(this.R, mdh.W(this.O, this.L))) {
                    h1w.e((ddq) this.R);
                    mdh.A(this.L, ppN.R);
                    return;
                }
                vC.e("Slot table is out of sync".toString());
                throw null;
            default:
                if (n3x.v(this.R, mdh.W(this.O, this.L))) {
                    mdh.A(this.L, ppN.R);
                    return;
                } else {
                    vC.e("Slot table is out of sync".toString());
                    throw null;
                }
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
