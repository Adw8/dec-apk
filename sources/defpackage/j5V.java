package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: j5V  reason: default package */
/* loaded from: classes.dex */
public final class j5V {
    public static final zI R = new zI("AssetPackManager", 0);

    /* renamed from: R  reason: collision with other field name */
    public final dRx f4831R;

    /* renamed from: R  reason: collision with other field name */
    public final e4X f4832R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f4833R;
    public final imF v;

    public j5V(dRx drx, imF imf, e4X e4x, imF imf2) {
        new Handler(Looper.getMainLooper());
        this.f4831R = drx;
        this.f4833R = imf;
        this.f4832R = e4x;
        this.v = imf2;
    }

    public final void R(boolean z) {
        boolean z2;
        e4X e4x = this.f4832R;
        synchronized (e4x) {
            z2 = ((hd8) e4x).R != null;
        }
        e4X e4x2 = this.f4832R;
        synchronized (e4x2) {
            ((hd8) e4x2).f4326R = z;
            e4x2.v();
        }
        if (z && !z2) {
            ((Executor) ((kIP) this.v).R()).execute(new k0f(17, this));
        }
    }
}
