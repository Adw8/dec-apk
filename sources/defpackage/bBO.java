package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bBO  reason: default package */
/* loaded from: classes.dex */
public final class bBO {
    public static final String[] v = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: R  reason: collision with other field name */
    public volatile mVu f1560R;

    /* renamed from: R  reason: collision with other field name */
    public final msD f1561R;

    /* renamed from: R  reason: collision with other field name */
    public n9T f1562R;

    /* renamed from: R  reason: collision with other field name */
    public final String[] f1564R;

    /* renamed from: R  reason: collision with other field name */
    public AtomicBoolean f1558R = new AtomicBoolean(false);

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f1563R = false;
    public final cWy R = new cWy();

    /* renamed from: R  reason: collision with other field name */
    public k0f f1559R = new k0f(10, this);

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f1557R = new HashMap();

    public bBO(msD msd, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f1561R = msd;
        this.f1562R = new n9T(strArr.length);
        new h5(msd);
        int length = strArr.length;
        this.f1564R = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1557R.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.f1564R[i] = str2.toLowerCase(locale);
            } else {
                this.f1564R[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.f1557R.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f1557R;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean R() {
        gEL gel = this.f1561R.f6208R;
        if (!(gel != null && ((iUj) gel).f4620R.isOpen())) {
            return false;
        }
        if (!this.f1563R) {
            this.f1561R.f6207R.L();
        }
        if (this.f1563R) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(gEL gel) {
        iUj iuj = (iUj) gel;
        if (!iuj.f4620R.inTransaction()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.f1561R.f6212R.readLock();
                    readLock.lock();
                    try {
                        int[] R = this.f1562R.R();
                        if (R != null) {
                            int length = R.length;
                            iuj.R();
                            for (int i = 0; i < length; i++) {
                                int i2 = R[i];
                                if (i2 == 1) {
                                    v(iuj, i);
                                } else if (i2 == 2) {
                                    String str = this.f1564R[i];
                                    StringBuilder sb = new StringBuilder();
                                    String[] strArr = v;
                                    for (int i3 = 0; i3 < 3; i3++) {
                                        String str2 = strArr[i3];
                                        sb.setLength(0);
                                        sb.append("DROP TRIGGER IF EXISTS ");
                                        sb.append("`");
                                        sb.append("room_table_modification_trigger_");
                                        sb.append(str);
                                        sb.append("_");
                                        sb.append(str2);
                                        sb.append("`");
                                        iuj.X(sb.toString());
                                    }
                                }
                            }
                            iuj.H();
                            iuj.c();
                            n9T n9t = this.f1562R;
                            synchronized (n9t) {
                                n9t.v = false;
                            }
                        } else {
                            return;
                        }
                    } finally {
                        readLock.unlock();
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    public final void v(gEL gel, int i) {
        iUj iuj = (iUj) gel;
        iuj.X(opT.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.f1564R[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = v;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            iuj.X(sb.toString());
        }
    }
}
