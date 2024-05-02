package defpackage;

import android.database.DatabaseErrorHandler;

/* renamed from: c2s  reason: default package */
/* loaded from: classes.dex */
public final class c2s implements DatabaseErrorHandler {
    public final /* synthetic */ Dn R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iUj[] f1950R;

    public c2s(Dn dn, iUj[] iujArr) {
        this.R = dn;
        this.f1950R = iujArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if ((r2.f4620R == r4) == false) goto L_0x0012;
     */
    @Override // android.database.DatabaseErrorHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            Dn r0 = r3.R
            iUj[] r3 = r3.f1950R
            r1 = 0
            r2 = r3[r1]
            if (r2 == 0) goto L_0x0012
            android.database.sqlite.SQLiteDatabase r2 = r2.f4620R
            if (r2 != r4) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            if (r2 != 0) goto L_0x0019
        L_0x0012:
            iUj r2 = new iUj
            r2.<init>(r4)
            r3[r1] = r2
        L_0x0019:
            r3 = r3[r1]
            r0.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Corruption reported by sqlite on database: "
            r4.append(r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.f4620R
            java.lang.String r0 = r0.getPath()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.e(r0, r4)
            android.database.sqlite.SQLiteDatabase r4 = r3.f4620R
            boolean r4 = r4.isOpen()
            if (r4 != 0) goto L_0x004c
            android.database.sqlite.SQLiteDatabase r3 = r3.f4620R
            java.lang.String r3 = r3.getPath()
            defpackage.Dn.v(r3)
            goto L_0x00a1
        L_0x004c:
            r4 = 0
            android.database.sqlite.SQLiteDatabase r0 = r3.f4620R     // Catch: SQLiteException -> 0x0056, all -> 0x0054
            java.util.List r4 = r0.getAttachedDbs()     // Catch: SQLiteException -> 0x0056, all -> 0x0054
            goto L_0x0056
        L_0x0054:
            r0 = move-exception
            goto L_0x005a
        L_0x0056:
            r3.close()     // Catch: IOException -> 0x007e, all -> 0x0054
            goto L_0x007e
        L_0x005a:
            if (r4 == 0) goto L_0x0074
            java.util.Iterator r3 = r4.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r3.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            defpackage.Dn.v(r4)
            goto L_0x0060
        L_0x0074:
            android.database.sqlite.SQLiteDatabase r3 = r3.f4620R
            java.lang.String r3 = r3.getPath()
            defpackage.Dn.v(r3)
        L_0x007d:
            throw r0
        L_0x007e:
            if (r4 == 0) goto L_0x0098
            java.util.Iterator r3 = r4.iterator()
        L_0x0084:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r3.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            defpackage.Dn.v(r4)
            goto L_0x0084
        L_0x0098:
            android.database.sqlite.SQLiteDatabase r3 = r3.f4620R
            java.lang.String r3 = r3.getPath()
            defpackage.Dn.v(r3)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2s.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
