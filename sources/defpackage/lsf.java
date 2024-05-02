package defpackage;

import java.util.concurrent.Executor;

/* renamed from: lsf  reason: default package */
/* loaded from: classes.dex */
public final class lsf extends nzn implements Executor {
    public static final lsf R = new lsf();

    /* renamed from: R  reason: collision with other field name */
    public static final n8j f5849R;

    static {
        flf flf = flf.R;
        int i = mrV.R;
        if (64 >= i) {
            i = 64;
        }
        boolean z = false;
        int r = pdD.r("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        if (r >= 1) {
            z = true;
        }
        if (z) {
            f5849R = new n8j(r);
            return;
        }
        throw new IllegalArgumentException(opT.Z("Expected positive parallelism level, but got ", r).toString());
    }

    @Override // defpackage.kE9
    public final void X4(nbD nbd, Runnable runnable) {
        f5849R.X4(nbd, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mL(aIH.R, runnable);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        f5849R.mL(nbd, runnable);
    }

    @Override // defpackage.kE9, java.lang.Object
    public final String toString() {
        return "Dispatchers.IO";
    }
}
