package defpackage;

import com.android.billingclient.api.Purchase;

/* renamed from: kui  reason: default package */
/* loaded from: classes.dex */
public final class kui extends aFk implements iv7 {
    public final /* synthetic */ Purchase R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eJw f5477R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kui(eJw ejw, Purchase purchase, aOO aoo) {
        super(2, aoo);
        this.f5477R = ejw;
        this.R = purchase;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kui) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            eJw ejw = this.f5477R;
            kjd kjd = new kjd(this.R);
            this.X = 1;
            if (eJw.R(ejw, kjd, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-59176086262668L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kui(this.f5477R, this.R, aoo);
    }
}
