package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fiw  reason: default package */
/* loaded from: classes.dex */
public final class fiw implements Iterable {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3523R = new ArrayList();

    public fiw(Context context) {
        this.R = context;
    }

    public final void R(ComponentName componentName) {
        int size = this.f3523R.size();
        try {
            Intent P = dtx.P(this.R, componentName);
            while (P != null) {
                this.f3523R.add(size, P);
                P = dtx.P(this.R, P.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3523R.iterator();
    }

    public final void v() {
        if (!this.f3523R.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3523R.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.R;
            Object obj = C1.R;
            aCt.R(context, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
