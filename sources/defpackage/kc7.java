package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.welcome.WelcomeFragment;

/* renamed from: kc7  reason: default package */
/* loaded from: classes.dex */
public final class kc7 extends aFk implements iv7 {
    public final /* synthetic */ WelcomeFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5367R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kc7(WelcomeFragment welcomeFragment, aOO aoo) {
        super(2, aoo);
        this.R = welcomeFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((kc7) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        mxC.y(((jke) this.R.f2766R.getValue()).f5012R, (jy_) this.f5367R, new jR2(this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        kc7 kc7 = new kc7(this.R, aoo);
        kc7.f5367R = obj;
        return kc7;
    }
}
