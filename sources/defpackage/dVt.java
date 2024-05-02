package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: dVt  reason: default package */
/* loaded from: classes.dex */
public abstract class dVt extends dq {
    public dVt() {
        super((Object) null);
    }

    @Override // defpackage.dq
    public final ProviderInfo V(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // defpackage.dq
    public final List h(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }
}
