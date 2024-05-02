package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.zzbn;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: e4X  reason: default package */
/* loaded from: classes.dex */
public final class e4X extends hd8 {
    public final Handler R = new Handler(Looper.getMainLooper());

    /* renamed from: R  reason: collision with other field name */
    public final bRH f2962R;

    /* renamed from: R  reason: collision with other field name */
    public final gMW f2963R;

    /* renamed from: R  reason: collision with other field name */
    public final gkF f2964R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f2965R;

    /* renamed from: R  reason: collision with other field name */
    public final n2N f2966R;

    /* renamed from: R  reason: collision with other field name */
    public final nt4 f2967R;
    public final imF c;
    public final imF v;

    public e4X(Context context, nt4 nt4, bRH brh, imF imf, gMW gmw, gkF gkf, imF imf2, imF imf3, n2N n2n) {
        super(new zI("AssetPackServiceListenerRegistry", 0), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f2967R = nt4;
        this.f2962R = brh;
        this.f2965R = imf;
        this.f2963R = gmw;
        this.f2964R = gkf;
        this.v = imf2;
        this.c = imf3;
        this.f2966R = n2n;
    }

    @Override // defpackage.hd8
    public final void R(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                ((hd8) this).f4325R.L("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            zzbn v = zzbn.v(bundleExtra, stringArrayList.get(0), this.f2963R, this.f2966R, hw1.j);
            ((hd8) this).f4325R.X("ListenerRegistryBroadcastReceiver.onReceive: %s", v);
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                this.f2964R.getClass();
            }
            ((Executor) ((kIP) this.c).R()).execute(new dX(this, bundleExtra, v, 11, 0));
            ((Executor) ((kIP) this.v).R()).execute(new bx(this, bundleExtra, 11));
            return;
        }
        ((hd8) this).f4325R.L("Empty bundle received from broadcast.", new Object[0]);
    }
}
