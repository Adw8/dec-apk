package defpackage;

/* renamed from: kV  reason: default package */
/* loaded from: classes.dex */
public final class kV extends k8G implements lR3 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ a1 f5308R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f5309R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kV(float f, n76 n76, a1 a1Var) {
        super(3);
        this.R = f;
        this.f5309R = n76;
        this.f5308R = a1Var;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        Object x = jQ.x(jr_, -1498088849, -492369756);
        if (x == ppN.R) {
            x = new eGS();
            jr_.ZW(x);
        }
        jr_.g(false);
        ncu I = ncu.I(g4x.g(aff.R, lBz.Y, new nzF(1, new xD(this.R, this.f5309R, (eGS) x, this.f5308R))));
        jr_.g(false);
        return I;
    }
}
