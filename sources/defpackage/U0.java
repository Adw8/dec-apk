package defpackage;

import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;

/* renamed from: U0  reason: default package */
/* loaded from: classes.dex */
public final class U0 extends aFk implements iv7 {
    public final /* synthetic */ AdbPairingService R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public U0(AdbPairingService adbPairingService, aOO aoo) {
        super(2, aoo);
        this.R = adbPairingService;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((U0) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            AdbPairingService adbPairingService = this.R;
            this.X = 1;
            if (AdbPairingService.X(adbPairingService, this) == bgr) {
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
        return new U0(this.R, aoo);
    }
}
