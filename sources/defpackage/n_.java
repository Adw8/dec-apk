package defpackage;

/* renamed from: n_  reason: default package */
/* loaded from: classes.dex */
public final class n_ extends aFk implements iv7 {
    public final /* synthetic */ pF R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public n_(pF pFVar, aOO aoo) {
        super(2, aoo);
        this.R = pFVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((n_) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nax nax = this.R.f7071R;
            if (nax == null) {
                nax = null;
            }
            if (!nax.R()) {
                h8R h8r = iFn.R;
                hBL hbl = ((hBL) hJr.R).f4160R;
                oB oBVar = new oB(null);
                this.X = 1;
                if (l6.a(hbl, oBVar, this) == bgr) {
                    return bgr;
                }
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new n_(this.R, aoo);
    }
}
