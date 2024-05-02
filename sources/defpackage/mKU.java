package defpackage;

/* renamed from: mKU  reason: default package */
/* loaded from: classes.dex */
public final class mKU extends dNl {
    public final Ia R;

    public mKU(d74 d74, Lh lh, l9F l9f, Ia ia) {
        super(d74, lh, l9f);
        this.R = ia;
    }

    @Override // defpackage.dNl
    public final Object R(oEG oeg, Object[] objArr) {
        fb fbVar = (fb) this.R.R(oeg);
        aOO aoo = (aOO) objArr[objArr.length - 1];
        try {
            xx xxVar = new xx(1, n3x.U(aoo));
            xxVar.y(new h0U(fbVar, 0));
            fbVar.H(new dN9(xxVar, 0));
            return xxVar.P();
        } catch (Exception e) {
            return jjU.V(e, aoo);
        }
    }
}
