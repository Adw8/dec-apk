package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* renamed from: k0f  reason: default package */
/* loaded from: classes.dex */
public final class k0f implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ k0f(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    /* JADX INFO: finally extract failed */
    public final HashSet R() {
        HashSet hashSet = new HashSet();
        Cursor L = ((bBO) this.R).f1561R.L(new h5("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (L.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(L.getInt(0)));
            } catch (Throwable th) {
                L.close();
                throw th;
            }
        }
        L.close();
        if (!hashSet.isEmpty()) {
            ((bBO) this.R).f1560R.H();
        }
        return hashSet;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:244:0x02f4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.locks.Lock, java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0632 A[LOOP:4: B:211:0x0542->B:233:0x0632, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0038 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0637 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 1632
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0f.run():void");
    }
}
