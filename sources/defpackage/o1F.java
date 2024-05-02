package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;

/* renamed from: o1F  reason: default package */
/* loaded from: classes.dex */
public final class o1F implements fwF, Closeable {
    public Object R;
    public final /* synthetic */ int e;

    public o1F(Runtime runtime) {
        this.e = 0;
        gvP.u(runtime, "Runtime is required");
        this.R = runtime;
    }

    public static void c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    public final void R() {
        Object obj = this.R;
        if (((f4Q) obj) != null) {
            ((f4Q) obj).stopWatching();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.e) {
            case 0:
            default:
                return;
            case 1:
                R();
                return;
        }
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public o1F(int i) {
        this(Runtime.getRuntime());
        this.e = i;
        if (i != 1) {
        }
    }
}
