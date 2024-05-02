package defpackage;

import android.os.SystemClock;

/* renamed from: bmh  reason: default package */
/* loaded from: classes.dex */
public final class bmh implements h2V {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dRB f1810R;

    public bmh(long j, dRB drb, jy_ jy_) {
        this.R = j;
        this.f1810R = drb;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        long uptimeMillis = SystemClock.uptimeMillis();
        String V = gvP.V(-3881557407919761299L);
        kxm.v(V, 4, "[" + (uptimeMillis - this.R) + "ms / delta " + (uptimeMillis - this.f1810R.R) + "ms] " + ((iGi) obj), null);
        this.f1810R.R = uptimeMillis;
        return o8s.R;
    }
}
