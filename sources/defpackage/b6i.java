package defpackage;

import android.os.SystemClock;

/* renamed from: b6i  reason: default package */
/* loaded from: classes.dex */
public final class b6i extends aFk implements iv7 {
    public final /* synthetic */ iHI R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1535R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public b6i(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((b6i) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f1535R;
        long uptimeMillis = SystemClock.uptimeMillis();
        dRB drb = new dRB();
        drb.R = uptimeMillis;
        mxC.y(l6.J(this.R.e), jy_, new bmh(uptimeMillis, drb, jy_));
        iHI ihi = this.R;
        return mxC.y(ihi.f4531v, jy_, new lO4(uptimeMillis, drb, jy_, ihi));
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        b6i b6i = new b6i(this.R, aoo);
        b6i.f1535R = obj;
        return b6i;
    }
}
