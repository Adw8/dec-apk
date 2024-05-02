package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* renamed from: jeV  reason: default package */
/* loaded from: classes.dex */
public class jeV implements Closeable {
    public final SQLiteProgram R;

    public jeV(SQLiteProgram sQLiteProgram) {
        this.R = sQLiteProgram;
    }

    public final void O(int i) {
        this.R.bindNull(i);
    }

    public final void R(int i, byte[] bArr) {
        this.R.bindBlob(i, bArr);
    }

    public final void X(long j, int i) {
        this.R.bindLong(i, j);
    }

    public final void Z(int i, String str) {
        this.R.bindString(i, str);
    }

    public final void c(double d, int i) {
        this.R.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }
}
