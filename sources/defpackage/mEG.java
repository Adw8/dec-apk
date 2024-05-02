package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: mEG  reason: default package */
/* loaded from: classes.dex */
public final class mEG extends k8G implements f_c {
    public final /* synthetic */ b1n R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ OverviewViewModel f5981R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5982R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mpr f5983R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mEG(jy_ jy_, OverviewViewModel overviewViewModel, b1n b1n, mpr mpr, int i) {
        super(0);
        this.X = i;
        this.f5982R = jy_;
        this.f5981R = overviewViewModel;
        this.R = b1n;
        this.f5983R = mpr;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                l6.z(this.f5982R, null, 0, new jO7(this.f5981R, this.R, this.f5983R, null), 3);
                return;
            default:
                l6.z(this.f5982R, null, 0, new f6O(this.f5981R, this.R, this.f5983R, null), 3);
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
