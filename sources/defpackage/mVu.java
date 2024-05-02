package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: mVu  reason: default package */
/* loaded from: classes.dex */
public final class mVu extends jeV {
    public final SQLiteStatement R;

    public mVu(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.R = sQLiteStatement;
    }

    public final int H() {
        return this.R.executeUpdateDelete();
    }
}
