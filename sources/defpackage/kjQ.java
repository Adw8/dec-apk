package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: kjQ  reason: default package */
/* loaded from: classes.dex */
public final class kjQ extends aFk implements iv7 {
    public final /* synthetic */ OverviewViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public ivW f5401R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kjQ(OverviewViewModel overviewViewModel, aOO aoo) {
        super(2, aoo);
        this.R = overviewViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kjQ) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        ivW ivw;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            OverviewViewModel overviewViewModel = this.R;
            ivw = overviewViewModel.v;
            aME ame = overviewViewModel.R;
            this.f5401R = ivw;
            this.X = 1;
            obj = ame.X(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            ivw = this.f5401R;
            jjU.o(obj);
        } else if (i == 2) {
            jjU.o(obj);
            return o8s.R;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ivw.H(obj);
        iyL iyl = this.R.f2769R.f4531v;
        this.f5401R = null;
        this.X = 2;
        if (iyl.L(this) == bgr) {
            return bgr;
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kjQ(this.R, aoo);
    }
}
