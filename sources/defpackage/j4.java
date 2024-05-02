package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: j4  reason: default package */
/* loaded from: classes.dex */
public abstract class j4 extends d72 {
    public static final String v = kfk.P("BrdcstRcvrCnstrntTrckr");
    public final Kw R = new Kw(1, this);

    public j4(Context context, CV cv) {
        super(context, cv);
    }

    public abstract void O(Intent intent);

    public abstract IntentFilter X();

    @Override // defpackage.d72
    public final void c() {
        kfk.U().x(v, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        ((d72) this).f2492R.registerReceiver(this.R, X());
    }

    @Override // defpackage.d72
    public final void e() {
        kfk.U().x(v, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        ((d72) this).f2492R.unregisterReceiver(this.R);
    }
}
