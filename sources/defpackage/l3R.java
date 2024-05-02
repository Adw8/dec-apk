package defpackage;

import com.android.billingclient.api.Purchase;

/* renamed from: l3R  reason: default package */
/* loaded from: classes.dex */
public final class l3R extends aFk implements iv7 {
    public final /* synthetic */ Purchase R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eJw f5571R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public l3R(eJw ejw, Purchase purchase, aOO aoo) {
        super(2, aoo);
        this.f5571R = ejw;
        this.R = purchase;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((l3R) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            eJw ejw = this.f5571R;
            kjd kjd = new kjd(this.R);
            this.X = 1;
            if (eJw.R(ejw, kjd, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-59635647763340L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new l3R(this.f5571R, this.R, aoo);
    }
}
