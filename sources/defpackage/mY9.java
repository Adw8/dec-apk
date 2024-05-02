package defpackage;

import android.util.Log;

/* renamed from: mY9  reason: default package */
/* loaded from: classes.dex */
public final class mY9 implements pby {
    @Override // defpackage.pby
    public final void R(String str, int i, String str2, Throwable th) {
        if (th != null) {
            str2 = opT.H(str2, kxm.R(th));
        }
        Log.println(i, str, str2);
    }
}
