package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import dev.kdrag0n.virtcontainer.service.BootReceiver;

/* renamed from: dop  reason: default package */
/* loaded from: classes.dex */
public abstract class dop extends kkd {

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f2874R = false;
    public final Object R = new Object();

    @Override // defpackage.kkd, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.f2874R) {
            synchronized (this.R) {
                if (!this.f2874R) {
                    Application m = cUF.m(context.getApplicationContext());
                    boolean z = m instanceof iLf;
                    Object[] objArr = {m.getClass()};
                    if (z) {
                        ((fMX) ((Mf) ((iLf) m).R())).R((BootReceiver) this);
                        this.f2874R = true;
                    } else {
                        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @AndroidEntryPoint Application. Found: %s", objArr));
                    }
                }
            }
        }
        super.onReceive(context, intent);
    }
}
