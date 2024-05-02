package defpackage;

import dev.kdrag0n.virtcontainer.ui.main.MainActivity;

/* renamed from: ahR  reason: default package */
/* loaded from: classes.dex */
public final class ahR extends aFk implements iv7 {
    public final /* synthetic */ MainActivity R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ahR(MainActivity mainActivity, aOO aoo) {
        super(2, aoo);
        this.R = mainActivity;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ahR) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            MainActivity mainActivity = this.R;
            this.X = 1;
            int i2 = MainActivity.X;
            mainActivity.getClass();
            if (o8s.R == bgr) {
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
        return new ahR(this.R, aoo);
    }
}
