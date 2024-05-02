package defpackage;

/* renamed from: ora  reason: default package */
/* loaded from: classes.dex */
public abstract class ora implements ccT {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public fZp f6976R;

    /* renamed from: R  reason: collision with other field name */
    public kwo f6978R;
    public int v;

    /* renamed from: R  reason: collision with other field name */
    public gUH f6977R = new gUH(this);
    public int c = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6980R = false;

    /* renamed from: R  reason: collision with other field name */
    public pgw f6979R = new pgw(this);

    /* renamed from: v  reason: collision with other field name */
    public pgw f6981v = new pgw(this);
    public int e = 1;

    public ora(kwo kwo) {
        this.f6978R = kwo;
    }

    public static pgw Z(iP5 ip5) {
        iP5 ip52 = ip5.f4581R;
        if (ip52 == null) {
            return null;
        }
        kwo kwo = ip52.f4584R;
        int ordinal = ip52.f4582R.ordinal();
        if (ordinal == 1) {
            return ((ora) kwo.f5496R).f6979R;
        }
        if (ordinal == 2) {
            return ((ora) kwo.f5490R).f6979R;
        }
        if (ordinal == 3) {
            return ((ora) kwo.f5496R).f6981v;
        }
        if (ordinal == 4) {
            return ((ora) kwo.f5490R).f6981v;
        }
        if (ordinal != 5) {
            return null;
        }
        return kwo.f5490R.c;
    }

    public static pgw m(iP5 ip5, int i) {
        iP5 ip52 = ip5.f4581R;
        if (ip52 == null) {
            return null;
        }
        kwo kwo = ip52.f4584R;
        ora ora = i == 0 ? kwo.f5496R : kwo.f5490R;
        int ordinal = ip52.f4582R.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return ora.f6979R;
        }
        if (ordinal == 3 || ordinal == 4) {
            return ora.f6981v;
        }
        return null;
    }

    public static void v(pgw pgw, pgw pgw2, int i) {
        pgw.f7168v.add(pgw2);
        pgw.v = i;
        pgw2.f7164R.add(pgw);
    }

    public abstract boolean H();

    public final int L(int i, int i2) {
        int i3;
        if (i2 == 0) {
            kwo kwo = this.f6978R;
            int i4 = kwo.m;
            i3 = Math.max(kwo.Z, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            kwo kwo2 = this.f6978R;
            int i5 = kwo2.H;
            i3 = Math.max(kwo2.x, i);
            if (i5 > 0) {
                i3 = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    public abstract void O();

    @Override // defpackage.ccT
    public abstract void R(ccT cct);

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (((defpackage.ora) r9).R == 3) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(defpackage.iP5 r12, defpackage.iP5 r13, int r14) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ora.U(iP5, iP5, int):void");
    }

    public abstract void X();

    public final void c(pgw pgw, pgw pgw2, int i, gUH guh) {
        pgw.f7168v.add(pgw2);
        pgw.f7168v.add(this.f6977R);
        pgw.e = i;
        pgw.f7163R = guh;
        pgw2.f7164R.add(pgw);
        ((pgw) guh).f7164R.add(pgw);
    }

    public abstract void e();

    public long x() {
        gUH guh = this.f6977R;
        if (((pgw) guh).f7167c) {
            return (long) ((pgw) guh).c;
        }
        return 0;
    }
}
