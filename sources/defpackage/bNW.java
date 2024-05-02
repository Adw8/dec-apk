package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: bNW  reason: default package */
/* loaded from: classes.dex */
public final class bNW extends ebQ {
    public final NotificationManager R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f1613R;

    /* renamed from: R  reason: collision with other field name */
    public final dRx f1614R;

    /* renamed from: R  reason: collision with other field name */
    public final j5V f1615R;

    /* renamed from: R  reason: collision with other field name */
    public final kX6 f1616R;

    /* renamed from: R  reason: collision with other field name */
    public final zI f1617R = new zI("AssetPackExtractionService", 0);

    public bNW(Context context, dRx drx, j5V j5v, kX6 kx6) {
        this.f1613R = context;
        this.f1614R = drx;
        this.f1615R = j5v;
        this.f1616R = kx6;
        this.R = (NotificationManager) context.getSystemService("notification");
    }
}
