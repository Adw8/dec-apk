package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: k7G  reason: default package */
/* loaded from: classes.dex */
public final class k7G extends dVt {
    @Override // defpackage.dq
    public final Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
