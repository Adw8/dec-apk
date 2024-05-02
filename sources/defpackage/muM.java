package defpackage;

import android.content.Intent;
import dev.kdrag0n.virtcontainer.service.VirtService;

/* renamed from: muM  reason: default package */
/* loaded from: classes.dex */
public final class muM extends aFk implements iv7 {
    public final /* synthetic */ kdp R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public muM(kdp kdp, aOO aoo) {
        super(2, aoo);
        this.R = kdp;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((muM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iKP ikp = this.R.f5372R;
            this.X = 1;
            ikp.getClass();
            obj = iKP.R(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            this.R.R.startForegroundService(new Intent(this.R.R, VirtService.class));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new muM(this.R, aoo);
    }
}
