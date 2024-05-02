package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: drh  reason: default package */
/* loaded from: classes.dex */
public abstract class drh {
    public static Handler R(Looper looper) {
        return Handler.createAsync(looper);
    }
}
