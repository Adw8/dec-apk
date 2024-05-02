package defpackage;

import dev.kdrag0n.app.ui.drm.LicenseInvalidActivity;
import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;

/* renamed from: bws  reason: default package */
/* loaded from: classes.dex */
public final class bws extends aFk implements iv7 {
    public final /* synthetic */ LicenseInvalidActivity R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1863R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bws(LicenseInvalidActivity licenseInvalidActivity, aOO aoo) {
        super(2, aoo);
        this.R = licenseInvalidActivity;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((bws) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        mxC.y(((LicenseInvalidViewModel) this.R.f2717R.getValue()).R, (jy_) this.f1863R, new hki(3, this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        bws bws = new bws(this.R, aoo);
        bws.f1863R = obj;
        return bws;
    }
}
