package defpackage;

import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: jO7  reason: default package */
/* loaded from: classes.dex */
public final class jO7 extends aFk implements iv7 {
    public final /* synthetic */ b1n R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ OverviewViewModel f4917R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mpr f4918R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jO7(OverviewViewModel overviewViewModel, b1n b1n, mpr mpr, aOO aoo) {
        super(2, aoo);
        this.f4917R = overviewViewModel;
        this.R = b1n;
        this.f4918R = mpr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jO7) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            OverviewViewModel overviewViewModel = this.f4917R;
            b1n b1n = this.R;
            this.X = 1;
            if (overviewViewModel.e(b1n, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f4918R.H(R.id.terminal, hDC.X(new kSh("container_id", this.R.R)), null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new jO7(this.f4917R, this.R, this.f4918R, aoo);
    }
}
