package defpackage;

import android.util.Log;

/* renamed from: kfk  reason: default package */
/* loaded from: classes.dex */
public final class kfk implements cZB, nKM, giw {
    public static kfk R;

    /* renamed from: R  reason: collision with other field name */
    public int f5390R;

    public /* synthetic */ kfk(int i) {
        this.f5390R = i;
    }

    public static int N(iRR irr, int i, int i2, int i3, boolean z, boolean z2) {
        long N = irr.N(i);
        int i4 = (int) (N >> 32);
        if (irr.O(i4) != i2) {
            i4 = irr.x(i2);
        }
        int c = irr.O(odN.c(N)) == i2 ? odN.c(N) : irr.X(i2, false);
        if (i4 == i3) {
            return c;
        }
        if (c == i3) {
            return i4;
        }
        int i5 = (i4 + c) / 2;
        if (z ^ z2) {
            if (i <= i5) {
                return i4;
            }
        } else if (i < i5) {
            return i4;
        }
        return c;
    }

    public static String P(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized kfk U() {
        kfk kfk;
        synchronized (kfk.class) {
            if (R == null) {
                R = new kfk(3);
            }
            kfk = R;
        }
        return kfk;
    }

    public static int j(iRR irr, int i, int i2, int i3, boolean z, boolean z2) {
        if (i == -1) {
            return i2;
        }
        int O = irr.O(i);
        if (O != irr.O(i2)) {
            return N(irr, i, O, i3, z, z2);
        }
        boolean z3 = false;
        z3 = true;
        long N = irr.N(i2);
        if (i2 == ((int) (N >> 32)) || i2 == odN.c(N)) {
        }
        return !z3 ? i : N(irr, i, O, i3, z, z2);
    }

    public void C(String str, String str2, Throwable... thArr) {
        if (this.f5390R > 4) {
            return;
        }
        if (thArr.length >= 1) {
            Log.i(str, str2, thArr[0]);
        } else {
            Log.i(str, str2);
        }
    }

    public void H(String str, String str2, Throwable... thArr) {
        if (this.f5390R > 6) {
            return;
        }
        if (thArr.length >= 1) {
            Log.e(str, str2, thArr[0]);
        } else {
            Log.e(str, str2);
        }
    }

    @Override // defpackage.giw
    public int L() {
        return this.f5390R;
    }

    @Override // defpackage.giw
    public int O() {
        return 0;
    }

    @Override // defpackage.iHW
    public boolean R() {
        return false;
    }

    @Override // defpackage.iHW
    public long X(Pc pc, Pc pc2, Pc pc3) {
        return ((long) (L() + 0)) * 1000000;
    }

    public long Z(iRR irr, long j, boolean z, odN odn) {
        int i;
        int i2;
        switch (this.f5390R) {
            case 0:
                if (!odN.v(j)) {
                    return j;
                }
                return gQc.J((int) (j >> 32), iH_.A(irr.f4590R.f4165R), z, odn != null ? odN.O(odn.f6859R) : false);
            case 1:
                if (odn == null) {
                    return dq.f2888e.Z(irr, j, z, odn);
                }
                if (odN.v(j)) {
                    return gQc.J((int) (j >> 32), iH_.A(irr.f4590R.f4165R), z, odN.O(odn.f6859R));
                }
                if (z) {
                    i2 = j(irr, (int) (j >> 32), (int) (odn.f6859R >> 32), odN.c(j), true, odN.O(j));
                    i = odN.c(j);
                } else {
                    int i3 = (int) (j >> 32);
                    i = j(irr, odN.c(j), odN.c(odn.f6859R), i3, false, odN.O(j));
                    i2 = i3;
                }
                return dtx.e(i2, i);
            case 2:
                return j;
            case 3:
                return dq.U(irr, j, new mCa(2, irr.f4590R.f4165R));
            default:
                return dq.U(irr, j, new mCa(3, irr));
        }
    }

    @Override // defpackage.iHW
    public Pc c(long j, Pc pc, Pc pc2, Pc pc3) {
        return pc3;
    }

    @Override // defpackage.iHW
    public Pc e(Pc pc, Pc pc2, Pc pc3) {
        return o02.P(this, pc, pc2, pc3);
    }

    public void g(String str, String str2, Throwable... thArr) {
        if (this.f5390R > 5) {
            return;
        }
        if (thArr.length >= 1) {
            Log.w(str, str2, thArr[0]);
        } else {
            Log.w(str, str2);
        }
    }

    public long m(long j, long j2) {
        switch (this.f5390R) {
            case 4:
                float min = Math.min(nqW.e(j2) / nqW.e(j), nqW.v(j2) / nqW.v(j));
                return gQc.Z(min, min);
            default:
                if (nqW.e(j) <= nqW.e(j2) && nqW.v(j) <= nqW.v(j2)) {
                    return gQc.Z(1.0f, 1.0f);
                }
                float min2 = Math.min(nqW.e(j2) / nqW.e(j), nqW.v(j2) / nqW.v(j));
                return gQc.Z(min2, min2);
        }
    }

    @Override // defpackage.iHW
    public Pc v(long j, Pc pc, Pc pc2, Pc pc3) {
        return j < ((long) this.f5390R) * 1000000 ? pc : pc2;
    }

    public void x(String str, String str2, Throwable... thArr) {
        if (this.f5390R > 3) {
            return;
        }
        if (thArr.length >= 1) {
            Log.d(str, str2, thArr[0]);
        } else {
            Log.d(str, str2);
        }
    }
}
