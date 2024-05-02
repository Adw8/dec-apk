package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;

/* renamed from: btq  reason: default package */
/* loaded from: classes.dex */
public final class btq extends aFk implements iv7 {
    public final /* synthetic */ LifecycleCoroutineScopeImpl R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1844R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public btq(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, aOO aoo) {
        super(2, aoo);
        this.R = lifecycleCoroutineScopeImpl;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((btq) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f1844R;
        if (((m4i) this.R.R).f5900R.compareTo(iMP.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.R;
            lifecycleCoroutineScopeImpl.R.R(lifecycleCoroutineScopeImpl);
        } else {
            dTl.j(jy_.C(), null);
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        btq btq = new btq(this.R, aoo);
        btq.f1844R = obj;
        return btq;
    }
}
