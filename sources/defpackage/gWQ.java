package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: gWQ  reason: default package */
/* loaded from: classes.dex */
public final class gWQ {
    public static final zI R = new zI("ReviewService", 0);

    /* renamed from: R  reason: collision with other field name */
    public dUW f3780R;

    /* renamed from: R  reason: collision with other field name */
    public final String f3781R;

    public gWQ(Context context) {
        this.f3781R = context.getPackageName();
        if (meq.v(context)) {
            this.f3780R = new dUW(context, R, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), dq.N);
        }
    }
}
