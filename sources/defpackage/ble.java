package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ble  reason: default package */
/* loaded from: classes.dex */
public final class ble extends vd {
    public volatile Handler R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f1808R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final ExecutorService f1809R = Executors.newFixedThreadPool(4, new aB8(this));
}
