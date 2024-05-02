package defpackage;

import android.os.SystemClock;

/* renamed from: lO4  reason: default package */
/* loaded from: classes.dex */
public final class lO4 implements h2V {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dRB f5704R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iHI f5705R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5706R;

    public lO4(long j, dRB drb, jy_ jy_, iHI ihi) {
        this.R = j;
        this.f5704R = drb;
        this.f5706R = jy_;
        this.f5705R = ihi;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        o8s o8s = (o8s) obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        String V = gvP.V(-3881564795263510419L);
        kxm.v(V, 4, "[" + (uptimeMillis - this.R) + "ms / delta " + (uptimeMillis - this.f5704R.R) + "ms] Done - LXD loaded", null);
        this.f5704R.R = uptimeMillis;
        this.f5705R.c.H(Boolean.TRUE);
        jjU.e(this.f5706R);
        return o8s.R;
    }
}
