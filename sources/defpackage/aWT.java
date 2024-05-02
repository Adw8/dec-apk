package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: aWT  reason: default package */
/* loaded from: classes.dex */
public final class aWT extends plU {
    public OverviewViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f903R;
    public int e;
    public final /* synthetic */ OverviewViewModel v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aWT(OverviewViewModel overviewViewModel, aOO aoo) {
        super(aoo);
        this.v = overviewViewModel;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f903R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
