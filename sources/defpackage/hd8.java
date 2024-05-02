package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;

/* renamed from: hd8  reason: default package */
/* loaded from: classes.dex */
public abstract class hd8 {

    /* renamed from: R  reason: collision with other field name */
    public final Context f4322R;

    /* renamed from: R  reason: collision with other field name */
    public final IntentFilter f4323R;

    /* renamed from: R  reason: collision with other field name */
    public final zI f4325R;

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f4324R = new HashSet();
    public Kw R = null;

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f4326R = false;

    public hd8(zI zIVar, IntentFilter intentFilter, Context context) {
        this.f4325R = zIVar;
        this.f4323R = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f4322R = applicationContext != null ? applicationContext : context;
    }

    public abstract void R(Intent intent);

    public final void v() {
        Kw kw;
        if ((this.f4326R || !this.f4324R.isEmpty()) && this.R == null) {
            Kw kw2 = new Kw(this);
            this.R = kw2;
            this.f4322R.registerReceiver(kw2, this.f4323R);
        }
        if (!this.f4326R && this.f4324R.isEmpty() && (kw = this.R) != null) {
            this.f4322R.unregisterReceiver(kw);
            this.R = null;
        }
    }
}
