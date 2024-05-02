package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;

/* renamed from: I7  reason: default package */
/* loaded from: classes.dex */
public final class I7 extends aFk implements iv7 {
    public final /* synthetic */ AdbPairViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f182R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public I7(AdbPairViewModel adbPairViewModel, aOO aoo) {
        super(2, aoo);
        this.R = adbPairViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((I7) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            cMC J = l6.J(this.R.f2758R.v);
            BW bw = new BW(this.R, (jy_) this.f182R);
            this.X = 1;
            if (J.v(bw, this) == bgr) {
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
        I7 i7 = new I7(this.R, aoo);
        i7.f182R = obj;
        return i7;
    }
}
