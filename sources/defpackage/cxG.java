package defpackage;

/* renamed from: cxG  reason: default package */
/* loaded from: classes.dex */
public final class cxG extends aFk implements iv7 {
    public final /* synthetic */ cre R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f1X f2463R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cxG(f1X f1x, cre cre, aOO aoo) {
        super(2, aoo);
        this.f2463R = f1x;
        this.R = cre;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cxG) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            eJw ejw = this.f2463R.R;
            pgG pgg = new pgG(this.R, null);
            this.X = 1;
            obj = ejw.Z(pgg, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-74448989967244L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new cxG(this.f2463R, this.R, aoo);
    }
}
