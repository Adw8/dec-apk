package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: eiY  reason: default package */
/* loaded from: classes.dex */
public abstract class eiY {
    public static Handler R(Looper looper) {
        return Handler.createAsync(looper);
    }
}
