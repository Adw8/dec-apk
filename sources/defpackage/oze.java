package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: oze  reason: default package */
/* loaded from: classes.dex */
public final class oze extends aFk implements iv7 {
    public final /* synthetic */ OverviewViewModel R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oze(OverviewViewModel overviewViewModel, aOO aoo) {
        super(2, aoo);
        this.R = overviewViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((oze) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        this.R.f2769R.e();
        this.R.O.H(Boolean.TRUE);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oze(this.R, aoo);
    }
}
