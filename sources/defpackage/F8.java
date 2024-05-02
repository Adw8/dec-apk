package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* renamed from: F8  reason: default package */
/* loaded from: classes.dex */
public final class F8 implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int e;

    /* renamed from: e  reason: collision with other field name */
    public final /* synthetic */ Object f116e;
    public final /* synthetic */ Object v;

    public /* synthetic */ F8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f116e = obj;
        this.R = obj2;
        this.v = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                g2 g2Var = (g2) this.R;
                if (g2Var != null) {
                    ((f5) ((h89) this.f116e).R).f3287O = true;
                    g2Var.f3654R.c(false);
                    ((f5) ((h89) this.f116e).R).f3287O = false;
                }
                if (((MenuItem) this.v).isEnabled() && ((MenuItem) this.v).hasSubMenu()) {
                    ((lRG) this.c).g((MenuItem) this.v, null, 4);
                    return;
                }
                return;
            case 1:
                ((oE_) this.R).getClass();
                oE_.L((View) this.v, (Rect) this.c);
                return;
            default:
                try {
                    boolean booleanExtra = ((Intent) this.R).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) this.R).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) this.R).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) this.R).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    kfk.U().x(ConstraintProxyUpdateReceiver.R, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                    aGH.R((Context) this.v, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    aGH.R((Context) this.v, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    aGH.R((Context) this.v, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    aGH.R((Context) this.v, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.c).finish();
                }
        }
    }
}
