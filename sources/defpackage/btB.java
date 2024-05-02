package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: btB  reason: default package */
/* loaded from: classes.dex */
public abstract class btB extends fdM {
    public btB() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // defpackage.fdM
    public final boolean O(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) okB.R(parcel, Bundle.CREATOR);
        nKl nkl = (nKl) this;
        dUW duw = nkl.f6365R.f3780R;
        if (duw != null) {
            duw.c(nkl.R);
        }
        nkl.f6366R.m("onGetLaunchReviewFlowInfo", new Object[0]);
        nkl.R.v(new cL7((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }
}
