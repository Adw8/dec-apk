package defpackage;

import dev.kdrag0n.virtcontainer.service.VirtService;

/* renamed from: eaF  reason: default package */
/* loaded from: classes.dex */
public final class eaF extends aFk implements iv7 {
    public final /* synthetic */ VirtService R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eaF(VirtService virtService, aOO aoo) {
        super(2, aoo);
        this.R = virtService;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eaF) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iHI X = this.R.X();
            this.X = 1;
            if (X.X(this) == bgr) {
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
        return new eaF(this.R, aoo);
    }
}
