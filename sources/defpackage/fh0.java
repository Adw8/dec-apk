package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;

/* renamed from: fh0  reason: default package */
/* loaded from: classes.dex */
public final class fh0 extends aFk implements iv7 {
    public final /* synthetic */ LifecycleCoroutineScopeImpl R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3503R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.R = lifecycleCoroutineScopeImpl;
        this.f3503R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fh0) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            aLd ald = this.R.R;
            iv7 iv7 = this.f3503R;
            this.X = 1;
            iMP imp = iMP.STARTED;
            h8R h8r = iFn.R;
            if (l6.a(((hBL) hJr.R).f4160R, new gHK(ald, imp, iv7, null), this) == bgr) {
                return bgr;
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
        return new fh0(this.R, this.f3503R, aoo);
    }
}
