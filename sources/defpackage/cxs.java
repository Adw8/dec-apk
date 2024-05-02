package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: cxs  reason: default package */
/* loaded from: classes.dex */
public abstract class cxs {
    public static final /* synthetic */ int R = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new hBL(R(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = new bvw(th);
        }
        if (obj instanceof bvw) {
            obj = null;
        }
        k8u k8u = (k8u) obj;
    }

    public static final Handler R(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
