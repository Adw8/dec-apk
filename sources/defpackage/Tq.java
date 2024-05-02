package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Tq  reason: default package */
/* loaded from: classes.dex */
public abstract class Tq implements p1w, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final /* synthetic */ icv[] R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f538R;

    /* renamed from: R  reason: collision with other field name */
    public final bLS f539R = pip.R(0, 0, null, 7);

    /* renamed from: R  reason: collision with other field name */
    public final hGS f540R;

    /* renamed from: R  reason: collision with other field name */
    public final hSq f541R;

    /* renamed from: R  reason: collision with other field name */
    public final oNK f542R;
    public final hGS X;
    public final hGS c;
    public final hGS e;
    public final hGS v;

    /* renamed from: v  reason: collision with other field name */
    public final hSq f543v;

    static {
        hm8 hm8 = new hm8(Tq.class, "onboardingCompleted", "getOnboardingCompleted()Z", 0);
        j3H j3h = g8d.R;
        j3h.getClass();
        R = new icv[]{hm8, opT.L(Tq.class, "adbLastConnectPort", "getAdbLastConnectPort()Ljava/lang/Integer;", 0, j3h), opT.L(Tq.class, "daemonShellPort", "getDaemonShellPort()Ljava/lang/Integer;", 0, j3h), opT.L(Tq.class, "daemonShellKey", "getDaemonShellKey()Ljava/lang/String;", 0, j3h), opT.L(Tq.class, "drmAuthToken", "getDrmAuthToken()Ljava/lang/String;", 0, j3h), opT.L(Tq.class, "drmLastEntitlement", "getDrmLastEntitlement()Ljava/lang/String;", 0, j3h), opT.L(Tq.class, "uiReviewsRequested", "getUiReviewsRequested()I", 0, j3h), opT.L(Tq.class, "uiLastReviewTime", "getUiLastReviewTime()Ljava/time/Instant;", 0, j3h), opT.L(Tq.class, "uiBetaOptOutsRequested", "getUiBetaOptOutsRequested()I", 0, j3h), opT.L(Tq.class, "uiLastBetaOptOutTime", "getUiLastBetaOptOutTime()Ljava/time/Instant;", 0, j3h)};
    }

    public Tq(Context context) {
        this.f538R = context;
        Jv jv = new Jv(null, 0);
        Boolean bool = Boolean.FALSE;
        icv[] icvArr = R;
        this.f541R = new hSq((hGS) jv.R(this, icvArr[0]), bool);
        this.f540R = (hGS) gvP.h().R(this, icvArr[1]);
        this.v = (hGS) gvP.h().R(this, icvArr[2]);
        this.c = (hGS) new Jv(null, 4).R(this, icvArr[3]);
        this.e = (hGS) new Jv("48f8262a849a3756138cd4edd5d4cf201b69ae4f", 4).R(this, icvArr[4]);
        this.X = (hGS) new Jv("fc4c3e9b157636cae9f0349b2daa7ebe76480f1c", 4).R(this, icvArr[5]);
        this.f543v = new hSq((hGS) gvP.h().R(this, icvArr[6]), 0);
        Jv jv2 = new Jv(null, 3);
        this.f542R = new mlM(new hSq((hGS) jv2.R(this, icvArr[7]), 0L), g5M.g, g5M.y);
        gvP.h().R(this, icvArr[8]);
        hGS hgs = (hGS) new Jv(null, 3).R(this, icvArr[9]);
    }

    public final void c(boolean z) {
        this.f541R.R(this, R[0], Boolean.valueOf(z));
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            l6.z(mxC.N(), null, 0, new p0(this, str, null), 3);
        }
    }

    public final boolean v() {
        return ((Boolean) this.f541R.v(this, R[0])).booleanValue();
    }
}
