package defpackage;

import android.content.Context;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: foe  reason: default package */
/* loaded from: classes.dex */
public final class foe extends aFk implements iv7 {
    public final /* synthetic */ L2 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eJw f3565R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public foe(eJw ejw, L2 l2, aOO aoo) {
        super(2, aoo);
        this.f3565R = ejw;
        this.R = l2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((foe) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            eJw ejw = this.f3565R;
            L2 l2 = this.R;
            Context context = ejw.f3052R;
            int i2 = l2.v;
            iZ3 iz3 = new iZ3(i2 != -3 ? i2 != -2 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 7 ? context.getString(R.string.iap_response_error_unknown, l2.f269R) : context.getString(R.string.iap_response_error_item_already_owned) : context.getString(R.string.iap_response_error_developer_error) : context.getString(R.string.iap_response_error_item_unavailable) : context.getString(R.string.iap_response_error_billing_unavailable) : context.getString(R.string.iap_response_error_service_unavailable) : context.getString(R.string.iap_response_error_not_supported) : context.getString(R.string.iap_response_error_timeout));
            this.X = 1;
            if (eJw.R(ejw, iz3, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-58969927832460L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new foe(this.f3565R, this.R, aoo);
    }
}
