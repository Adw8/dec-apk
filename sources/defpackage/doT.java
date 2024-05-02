package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: doT  reason: default package */
/* loaded from: classes.dex */
public final class doT extends Tq {
    public static final /* synthetic */ icv[] v;
    public final hSq L;
    public final hSq O;
    public final SharedPreferences R;
    public final hSq X;
    public final hSq c;
    public final hSq e;

    static {
        hm8 hm8 = new hm8(doT.class, "vmDiskSize", "getVmDiskSize()I", 0);
        j3H j3h = g8d.R;
        j3h.getClass();
        v = new icv[]{hm8, opT.L(doT.class, "vmMemorySize", "getVmMemorySize()I", 0, j3h), opT.L(doT.class, "netPortForwards", "getNetPortForwards()Ljava/util/Set;", 0, j3h), opT.L(doT.class, "serviceStartOnBoot", "getServiceStartOnBoot()Z", 0, j3h), opT.L(doT.class, "dataVersion", "getDataVersion()I", 0, j3h), opT.L(doT.class, "lxdInitialized", "getLxdInitialized()Z", 0, j3h), opT.L(doT.class, "terminalFontSize", "getTerminalFontSize()F", 0, j3h), opT.L(doT.class, "appVersion", "getAppVersion()I", 0, j3h)};
    }

    public doT(Context context, SharedPreferences sharedPreferences) {
        super(context);
        this.R = sharedPreferences;
        Jv h = gvP.h();
        icv[] icvArr = v;
        h.R(this, icvArr[0]);
        this.c = new hSq((hGS) gvP.h().R(this, icvArr[1]), 1200);
        Jv jv = new Jv(null, 5);
        this.e = new hSq((hGS) jv.R(this, icvArr[2]), lsA.R);
        Jv jv2 = new Jv(null, 0);
        Boolean bool = Boolean.FALSE;
        this.X = new hSq((hGS) jv2.R(this, icvArr[3]), bool);
        hSq hsq = new hSq((hGS) gvP.h().R(this, icvArr[4]), 1);
        this.O = new hSq((hGS) new Jv(null, 0).R(this, icvArr[5]), bool);
        Jv jv3 = new Jv(null, 1);
        this.L = new hSq((hGS) jv3.R(this, icvArr[6]), Float.valueOf(14.0f));
        hSq hsq2 = new hSq((hGS) gvP.h().R(this, icvArr[7]), 999957);
        if (((Number) hsq2.v(this, icvArr[7])).intValue() < 999957) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            ((Number) hsq2.v(this, icvArr[7])).intValue();
            edit.putInt("appVersion", 999957);
            edit.apply();
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        hsq.R(this, icvArr[4], 1);
    }

    @Override // defpackage.p1w
    public final SharedPreferences R() {
        return this.R;
    }
}
