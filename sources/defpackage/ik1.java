package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: ik1  reason: default package */
/* loaded from: classes.dex */
public final class ik1 extends aFk implements iv7 {
    public final /* synthetic */ b1n R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ OverviewViewModel f4707R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(OverviewViewModel overviewViewModel, b1n b1n, aOO aoo) {
        super(2, aoo);
        this.f4707R = overviewViewModel;
        this.R = b1n;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ik1) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            aME ame = this.f4707R.R;
            b1n b1n = this.R;
            this.X = 1;
            if (ame.e(b1n, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f4707R.X();
        this.f4707R.m.H(null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new ik1(this.f4707R, this.R, aoo);
    }
}
