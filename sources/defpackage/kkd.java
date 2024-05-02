package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import dev.kdrag0n.app.data.SettingsUpdateWorker;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: kkd  reason: default package */
/* loaded from: classes.dex */
public abstract class kkd extends BroadcastReceiver {
    public UserManager R;

    /* renamed from: R  reason: collision with other field name */
    public m5f f5409R;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (dF.F(fwk.R, action) && !fwk.f3631R) {
            fwk.f3631R = true;
            m5f m5f = this.f5409R;
            if (m5f == null) {
                m5f = null;
            }
            l6.z(m5f.f5920R, null, 0, new ntl(m5f, null), 3);
        }
        if (!dF.F(fwk.v, action)) {
            UserManager userManager = this.R;
            if (userManager == null) {
                userManager = null;
            }
            if (!(Y5.f623R ? userManager.isUserUnlocked() : true)) {
                return;
            }
        }
        if (!fwk.f3632v) {
            fwk.f3632v = true;
            m5f m5f2 = this.f5409R;
            if (m5f2 == null) {
                m5f2 = null;
            }
            l6.z(m5f2.f5920R, null, 0, new gWi(m5f2, null), 3);
            eNg eng = m5f2.f5911R;
            eng.getClass();
            g5M g5m = g5M.U;
            mxl mxl = new mxl(SettingsUpdateWorker.class);
            kSx ksx = new kSx();
            g_9 g_9 = g_9.CONNECTED;
            ksx.f5299R = g_9;
            ((oJN) mxl).f6742R.f5559R = new csc(ksx);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            mxl.e(5, timeUnit);
            g5m.x(mxl);
            iSm ism = (iSm) eng.R.getValue();
            ism.getClass();
            new eRT((jFe) ism, "UpdateSettingsBoot", 1, Collections.singletonList((i7a) mxl.R())).K();
            TimeUnit timeUnit2 = TimeUnit.HOURS;
            ok4 ok4 = new ok4(timeUnit2, timeUnit2);
            kSx ksx2 = new kSx();
            ksx2.f5299R = g_9;
            ((oJN) ok4).f6742R.f5559R = new csc(ksx2);
            ok4.e(15, timeUnit);
            jFe jfe = (jFe) ((iSm) eng.R.getValue());
            jfe.getClass();
            new eRT(jfe, "UpdateSettings", 1, Collections.singletonList((e2x) ok4.R())).K();
        }
    }
}
