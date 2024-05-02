package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Random;

/* renamed from: hAh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hAh implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object v;

    public /* synthetic */ hAh(Object obj, int i, Object obj2) {
        this.e = i;
        this.R = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((n1P) this.R).i((Typeface) this.v);
                return;
            case 1:
            case 2:
            default:
                opT opt = (opT) this.R;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.v;
                try {
                    opt.P();
                    return;
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().L(lXr.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 3:
                hyi hyi = (hyi) this.R;
                if (hyi.R.offer((Runnable) this.v)) {
                    hyi.R();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            case 4:
                ((ProfileInstallerInitializer) this.R).getClass();
                drh.R(Looper.getMainLooper()).postDelayed(new hYX((Context) this.v, 0), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((Context) this.R).startActivity(Intent.createChooser((Intent) this.v, null));
                return;
            case 6:
                ((gS0) this.R).O(((n7K) this.v).getFlushTimeoutMillis());
                return;
            case 7:
                ((dxh) this.R).O((oRG) this.v, true);
                return;
            case VmNativeCallback.$stable:
                ((vm) this.R).R((gS0) this.v);
                return;
        }
    }
}
