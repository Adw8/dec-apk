package defpackage;

import java.util.WeakHashMap;

/* renamed from: e9r  reason: default package */
/* loaded from: classes.dex */
public final class e9r extends g4x {
    public final gS0 R;

    /* renamed from: R  reason: collision with other field name */
    public final WeakHashMap f2995R = new WeakHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2996R;
    public final boolean v;

    public e9r(gS0 gs0, boolean z, boolean z2) {
        this.R = gs0;
        this.f2996R = z;
        this.v = z2;
    }

    public final void A(pm2 pm2) {
        dWn dwn;
        if ((this.R.Z().isTracingEnabled() && this.v) && this.f2995R.containsKey(pm2) && (dwn = (dWn) this.f2995R.get(pm2)) != null) {
            nse v = dwn.v();
            if (v == null) {
                v = nse.OK;
            }
            dwn.R(v);
            dWn dwn2 = (dWn) this.f2995R.remove(pm2);
        }
    }

    public final void Q(pm2 pm2, String str) {
        if (this.f2996R) {
            H4 h4 = new H4();
            h4.R(str, "state");
            h4.R(pm2.getClass().getSimpleName(), "screen");
            lXr lxr = lXr.INFO;
            ipU ipu = new ipU();
            ipu.R(pm2, "android:fragment");
            this.R.X(h4, ipu);
        }
    }
}
