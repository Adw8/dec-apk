package defpackage;

import android.net.Uri;
import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;
import java.io.File;

/* renamed from: m5m  reason: default package */
/* loaded from: classes.dex */
public final class m5m extends aFk implements iv7 {
    public final /* synthetic */ LicenseInvalidViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m5m(LicenseInvalidViewModel licenseInvalidViewModel, aOO aoo) {
        super(2, aoo);
        this.R = licenseInvalidViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((m5m) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.R.f2718R.R(Boolean.TRUE);
            lsf lsf = iFn.f4518R;
            kZb kzb = new kZb(this.R, null);
            this.X = 1;
            obj = l6.a(lsf, kzb, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else if (i == 2) {
            jjU.o(obj);
            this.R.f2718R.R(Boolean.FALSE);
            return o8s.R;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LicenseInvalidViewModel licenseInvalidViewModel = this.R;
        bLS bls = licenseInvalidViewModel.R;
        Uri v = ((mMh) ((pqh) ((nak) licenseInvalidViewModel.f2719R).get())).v((File) obj);
        this.X = 2;
        if (bls.R(v, this) == bgr) {
            return bgr;
        }
        this.R.f2718R.R(Boolean.FALSE);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new m5m(this.R, aoo);
    }
}
