package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: h_u  reason: default package */
/* loaded from: classes.dex */
public final class h_u extends SQLiteOpenHelper {
    public final Dn R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4314R;

    /* renamed from: R  reason: collision with other field name */
    public final iUj[] f4315R;

    public h_u(Context context, String str, iUj[] iujArr, Dn dn) {
        super(context, str, null, dn.R, new c2s(dn, iujArr));
        this.R = dn;
        this.f4315R = iujArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        if ((r1.f4620R == r3) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.iUj R(android.database.sqlite.SQLiteDatabase r3) {
        /*
            r2 = this;
            iUj[] r2 = r2.f4315R
            r0 = 0
            r1 = r2[r0]
            if (r1 == 0) goto L_0x0010
            android.database.sqlite.SQLiteDatabase r1 = r1.f4620R
            if (r1 != r3) goto L_0x000d
            r1 = 1
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r1 != 0) goto L_0x0017
        L_0x0010:
            iUj r1 = new iUj
            r1.<init>(r3)
            r2[r0] = r1
        L_0x0017:
            r2 = r2[r0]
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h_u.R(android.database.sqlite.SQLiteDatabase):iUj");
    }

    public final synchronized gEL c() {
        this.f4314R = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (this.f4314R) {
            close();
            return c();
        }
        return R(writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f4315R[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        Dn dn = this.R;
        R(sQLiteDatabase);
        dn.getClass();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            Dn r0 = r3.R
            iUj r3 = r3.R(r4)
            r0.getClass()
            java.lang.String r4 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r4 = r3.Z(r4)
            boolean r1 = r4.moveToFirst()     // Catch: all -> 0x0079
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r1 = r4.getInt(r2)     // Catch: all -> 0x0079
            if (r1 != 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            r4.close()
            c85 r4 = r0.f79R
            r4.getClass()
            defpackage.c85.R(r3)
            if (r1 != 0) goto L_0x0051
            c85 r4 = r0.f79R
            r4.getClass()
            lTo r4 = defpackage.c85.v(r3)
            boolean r1 = r4.f5744R
            if (r1 == 0) goto L_0x003a
            goto L_0x0051
        L_0x003a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r0 = defpackage.opT.U(r0)
            java.lang.Object r4 = r4.R
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0051:
            r0.Z(r3)
            c85 r3 = r0.f79R
            java.lang.Object r4 = r3.R
            androidx.work.impl.WorkDatabase_Impl r4 = (androidx.work.impl.WorkDatabase_Impl) r4
            int r0 = androidx.work.impl.WorkDatabase_Impl.v
            java.util.List r4 = r4.f6210R
            if (r4 == 0) goto L_0x0078
            int r4 = r4.size()
        L_0x0064:
            if (r2 >= r4) goto L_0x0078
            java.lang.Object r0 = r3.R
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            java.util.List r0 = r0.f6210R
            java.lang.Object r0 = r0.get(r2)
            hJ0 r0 = (defpackage.hJ0) r0
            r0.getClass()
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0078:
            return
        L_0x0079:
            r3 = move-exception
            r4.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h_u.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f4314R = true;
        this.R.e(R(sQLiteDatabase), i, i2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r10) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h_u.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f4314R = true;
        this.R.e(R(sQLiteDatabase), i, i2);
    }
}
