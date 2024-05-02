package defpackage;

import dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsFragment;

/* renamed from: am  reason: default package */
/* loaded from: classes.dex */
public final class am extends aFk implements iv7 {
    public final /* synthetic */ AdbDevOptionsFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1002R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public am(AdbDevOptionsFragment adbDevOptionsFragment, aOO aoo) {
        super(2, aoo);
        this.R = adbDevOptionsFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((am) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        mxC.y(((jke) this.R.v.getValue()).f5012R, (jy_) this.f1002R, new hki(5, this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        am amVar = new am(this.R, aoo);
        amVar.f1002R = obj;
        return amVar;
    }
}
