package defpackage;

import android.content.Intent;

/* renamed from: BI  reason: default package */
/* loaded from: classes.dex */
public final class BI extends mjG {
    @Override // defpackage.mjG
    public final Intent c() {
        return "android.permission.POST_NOTIFICATIONS";
    }

    @Override // defpackage.mjG
    public final Object x(Intent intent, int i) {
        return new wt(intent, i);
    }
}
