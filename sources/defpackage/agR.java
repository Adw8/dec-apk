package defpackage;

import androidx.work.CoroutineWorker;

/* renamed from: agR  reason: default package */
/* loaded from: classes.dex */
public final class agR extends aFk implements iv7 {
    public final /* synthetic */ CoroutineWorker R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public agR(CoroutineWorker coroutineWorker, aOO aoo) {
        super(2, aoo);
        this.R = coroutineWorker;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((agR) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                CoroutineWorker coroutineWorker = this.R;
                this.X = 1;
                obj = coroutineWorker.L(this);
                if (obj == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.R.R.m((g9z) obj);
        } catch (Throwable th) {
            this.R.R.x(th);
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new agR(this.R, aoo);
    }
}
