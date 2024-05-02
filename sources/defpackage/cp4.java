package defpackage;

import dev.kdrag0n.app.arch.ProcessLifecycleEvents;

/* renamed from: cp4  reason: default package */
/* loaded from: classes.dex */
public final class cp4 extends aFk implements iv7 {
    public final /* synthetic */ ProcessLifecycleEvents R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cp4(ProcessLifecycleEvents processLifecycleEvents, aOO aoo) {
        super(2, aoo);
        this.R = processLifecycleEvents;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cp4) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iyL iyl = this.R.e;
            this.X = 1;
            if (iyl.L(this) == bgr) {
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
        return new cp4(this.R, aoo);
    }
}
