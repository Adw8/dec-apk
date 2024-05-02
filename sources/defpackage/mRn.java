package defpackage;

import dev.kdrag0n.virtcontainer.ui.main.MainViewModel;

/* renamed from: mRn  reason: default package */
/* loaded from: classes.dex */
public final class mRn extends aFk implements iv7 {
    public final /* synthetic */ MainViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mRn(MainViewModel mainViewModel, aOO aoo) {
        super(2, aoo);
        this.R = mainViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((mRn) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            m5f m5f = this.R.R;
            this.X = 1;
            if (m5f.O(this) == bgr) {
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
        return new mRn(this.R, aoo);
    }
}
