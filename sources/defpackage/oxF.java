package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;

/* renamed from: oxF  reason: default package */
/* loaded from: classes.dex */
public final class oxF extends aFk implements iv7 {
    public final /* synthetic */ RootSettingsViewModel R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oxF(RootSettingsViewModel rootSettingsViewModel, aOO aoo) {
        super(2, aoo);
        this.R = rootSettingsViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oxF) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return ((mMh) ((nak) this.R.f2787R).get()).R(false);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oxF(this.R, aoo);
    }
}
