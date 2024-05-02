package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: iUj  reason: default package */
/* loaded from: classes.dex */
public final class iUj implements gEL {
    public static final String[] R = new String[0];

    /* renamed from: R  reason: collision with other field name */
    public final SQLiteDatabase f4620R;

    public iUj(SQLiteDatabase sQLiteDatabase) {
        this.f4620R = sQLiteDatabase;
    }

    public final void H() {
        this.f4620R.setTransactionSuccessful();
    }

    public final Cursor O(kj3 kj3) {
        return this.f4620R.rawQueryWithFactory(new kog(kj3, 0), kj3.c(), R, null);
    }

    public final void R() {
        this.f4620R.beginTransaction();
    }

    public final void X(String str) {
        this.f4620R.execSQL(str);
    }

    public final Cursor Z(String str) {
        return O(new h5(str));
    }

    public final void c() {
        this.f4620R.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4620R.close();
    }
}
