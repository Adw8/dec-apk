package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: kF0  reason: default package */
/* loaded from: classes.dex */
public final class kF0 extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ OverviewViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mpr f5222R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kF0(OverviewViewModel overviewViewModel, mpr mpr, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = overviewViewModel;
        this.f5222R = mpr;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                cpc.t(this.R, this.f5222R, m88, this.O | 1);
                return;
            default:
                cpc.t(this.R, this.f5222R, m88, this.O | 1);
                return;
        }
    }
}
