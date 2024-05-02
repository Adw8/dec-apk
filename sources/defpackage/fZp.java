package defpackage;

import java.util.ArrayList;

/* renamed from: fZp  reason: default package */
/* loaded from: classes.dex */
public final class fZp {
    public ArrayList R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public ora f3444R;

    public fZp(ora ora) {
        this.f3444R = null;
        this.f3444R = ora;
    }

    public static long R(pgw pgw, long j) {
        ora ora = pgw.f7169v;
        if (ora instanceof kLl) {
            return j;
        }
        int size = pgw.f7164R.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ccT cct = (ccT) pgw.f7164R.get(i);
            if (cct instanceof pgw) {
                pgw pgw2 = (pgw) cct;
                if (pgw2.f7169v != ora) {
                    j2 = Math.min(j2, R(pgw2, ((long) pgw2.v) + j));
                }
            }
        }
        if (pgw != ora.f6981v) {
            return j2;
        }
        long x = j - ora.x();
        return Math.min(Math.min(j2, R(ora.f6979R, x)), x - ((long) ora.f6979R.v));
    }

    public static long v(pgw pgw, long j) {
        ora ora = pgw.f7169v;
        if (ora instanceof kLl) {
            return j;
        }
        int size = pgw.f7164R.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ccT cct = (ccT) pgw.f7164R.get(i);
            if (cct instanceof pgw) {
                pgw pgw2 = (pgw) cct;
                if (pgw2.f7169v != ora) {
                    j2 = Math.max(j2, v(pgw2, ((long) pgw2.v) + j));
                }
            }
        }
        if (pgw != ora.f6979R) {
            return j2;
        }
        long x = j + ora.x();
        return Math.max(Math.max(j2, v(ora.f6981v, x)), x - ((long) ora.f6981v.v));
    }
}
