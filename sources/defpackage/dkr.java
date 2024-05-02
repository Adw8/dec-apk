package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: dkr  reason: default package */
/* loaded from: classes.dex */
public final class dkr {
    public final PowerManager.WakeLock R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2853R;

    public dkr(Context context) {
        ivW O = g4x.O(Boolean.FALSE);
        this.f2853R = O;
        Object obj = C1.R;
        this.R = ((PowerManager) dmD.v(context, PowerManager.class)).newWakeLock(1, "virtc:user");
        mxC.t(O, mxC.N(), new hki(6, this));
    }
}
