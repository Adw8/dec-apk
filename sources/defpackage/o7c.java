package defpackage;

import java.util.zip.Inflater;

/* renamed from: o7c  reason: default package */
/* loaded from: classes.dex */
public final class o7c implements fGn {
    public final Jl R;

    /* renamed from: R  reason: collision with other field name */
    public final Inflater f6679R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6680R;
    public int e;

    public o7c(oDA oda, Inflater inflater) {
        this.R = oda;
        this.f6679R = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e A[SYNTHETIC] */
    @Override // defpackage.fGn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Y(defpackage.ME r9, long r10) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7c.Y(ME, long):long");
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f6680R) {
            this.f6679R.end();
            this.f6680R = true;
            this.R.close();
        }
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.R.e();
    }
}
