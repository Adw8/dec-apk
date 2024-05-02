package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairFragment;

/* renamed from: QS  reason: default package */
/* loaded from: classes.dex */
public final class QS extends aFk implements iv7 {
    public final /* synthetic */ AdbPairFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f467R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public QS(AdbPairFragment adbPairFragment, aOO aoo) {
        super(2, aoo);
        this.R = adbPairFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((QS) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f467R;
        mxC.y(((jke) this.R.v.getValue()).f5012R, jy_, new xA(this.R, 0));
        mxC.y(this.R.w().f2759R, jy_, new xA(this.R, 1));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        QS qs = new QS(this.R, aoo);
        qs.f467R = obj;
        return qs;
    }
}
