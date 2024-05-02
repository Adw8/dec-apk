package defpackage;

import java.io.Closeable;
import java.net.Socket;
import java.util.Random;

/* renamed from: e_  reason: default package */
/* loaded from: classes.dex */
public final class e_ implements AutoCloseable {
    public final Closeable R;

    /* renamed from: R  reason: collision with other field name */
    public final Random f3137R = new Random();

    /* renamed from: R  reason: collision with other field name */
    public final or f3138R;

    /* renamed from: R  reason: collision with other field name */
    public final wJ f3139R;
    public final int e;

    public e_(yn ynVar, wJ wJVar, Socket socket, int i) {
        this.f3139R = wJVar;
        this.R = socket;
        this.e = i;
        this.f3138R = new or(ynVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            this.f3138R.close();
            this.f3139R.close();
            Closeable closeable = this.R;
            if (closeable != null) {
                closeable.close();
            }
        } catch (Throwable unused) {
        }
    }
}
