package defpackage;

import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;

/* renamed from: kZb  reason: default package */
/* loaded from: classes.dex */
public final class kZb extends aFk implements iv7 {
    public final /* synthetic */ LicenseInvalidViewModel R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kZb(LicenseInvalidViewModel licenseInvalidViewModel, aOO aoo) {
        super(2, aoo);
        this.R = licenseInvalidViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kZb) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return ((mMh) ((pqh) ((nak) this.R.f2719R).get())).R(true);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kZb(this.R, aoo);
    }
}
