package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.debug.DebugSettingsFragment;

/* renamed from: jLx  reason: default package */
/* loaded from: classes.dex */
public final class jLx extends aFk implements iv7 {
    public final /* synthetic */ DebugSettingsFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4904R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jLx(DebugSettingsFragment debugSettingsFragment, aOO aoo) {
        super(2, aoo);
        this.R = debugSettingsFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((jLx) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f4904R;
        DebugSettingsFragment debugSettingsFragment = this.R;
        int i = DebugSettingsFragment.H;
        mxC.y(debugSettingsFragment.F().v, jy_, new l7h(this.R, 0));
        mxC.y(this.R.F().f2773R, jy_, new l7h(this.R, 1));
        mxC.y(this.R.F().c, jy_, new l7h(this.R, 2));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jLx jlx = new jLx(this.R, aoo);
        jlx.f4904R = obj;
        return jlx;
    }
}
