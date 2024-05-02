package defpackage;

import com.termux.terminal.Y;

/* renamed from: cs  reason: default package */
/* loaded from: classes.dex */
public final class cs extends aFk implements iv7 {
    public final /* synthetic */ Y R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ng f2436R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cs(ng ngVar, Y y, aOO aoo) {
        super(2, aoo);
        this.f2436R = ngVar;
        this.R = y;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cs) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.f2436R.f6501R.v;
            String str = this.R.f2415R;
            this.X = 1;
            if (bls.R(str, this) == bgr) {
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
        return new cs(this.f2436R, this.R, aoo);
    }
}
