package defpackage;

/* renamed from: hn4  reason: default package */
/* loaded from: classes.dex */
public final class hn4 extends dNl {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Ia f4380R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn4(d74 d74, Lh lh, l9F l9f, Ia ia, int i) {
        super(d74, lh, l9f);
        this.R = i;
        this.f4380R = ia;
    }

    @Override // defpackage.dNl
    public final Object R(oEG oeg, Object[] objArr) {
        switch (this.R) {
            case 0:
                return this.f4380R.R(oeg);
            default:
                fb fbVar = (fb) this.f4380R.R(oeg);
                aOO aoo = (aOO) objArr[objArr.length - 1];
                try {
                    xx xxVar = new xx(1, n3x.U(aoo));
                    xxVar.y(new h0U(fbVar, 2));
                    fbVar.H(new dN9(xxVar, 2));
                    return xxVar.P();
                } catch (Exception e) {
                    return jjU.V(e, aoo);
                }
        }
    }
}
