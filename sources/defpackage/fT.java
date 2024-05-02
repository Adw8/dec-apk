package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;

/* renamed from: fT  reason: default package */
/* loaded from: classes.dex */
public final class fT extends aFk implements iv7 {
    public final /* synthetic */ AdbPairViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fT(AdbPairViewModel adbPairViewModel, aOO aoo) {
        super(2, aoo);
        this.R = adbPairViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fT) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            I7 i7 = new I7(this.R, null);
            this.X = 1;
            if (l6.D(5000, i7, this) == bgr) {
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
        return new fT(this.R, aoo);
    }
}
