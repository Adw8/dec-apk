package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsFragment;

/* renamed from: d44  reason: default package */
/* loaded from: classes.dex */
public final class d44 extends aFk implements iv7 {
    public final /* synthetic */ RootSettingsFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2479R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public d44(RootSettingsFragment rootSettingsFragment, aOO aoo) {
        super(2, aoo);
        this.R = rootSettingsFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((d44) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f2479R;
        RootSettingsFragment rootSettingsFragment = this.R;
        int i = RootSettingsFragment.x;
        mxC.y(rootSettingsFragment.a().f2781R, jy_, new cPb(this.R, 0));
        mxC.y(this.R.a().f2784R, jy_, new cPb(this.R, 1));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        d44 d44 = new d44(this.R, aoo);
        d44.f2479R = obj;
        return d44;
    }
}
