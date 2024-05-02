package defpackage;

import java.io.InputStream;

/* renamed from: bu7  reason: default package */
/* loaded from: classes.dex */
public final class bu7 extends vm {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final vm f1847R;
    public final long v;

    public bu7(aiw aiw, long j, long j2) {
        this.f1847R = aiw;
        long O = O(j);
        this.R = O;
        this.v = O(O + j2);
    }

    public final long O(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f1847R.c() ? this.f1847R.c() : j;
    }

    @Override // defpackage.vm
    public final InputStream X(long j, long j2) {
        long O = O(this.R);
        return this.f1847R.X(O, O(j2 + O) - O);
    }

    @Override // defpackage.vm
    public final long c() {
        return this.v - this.R;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
