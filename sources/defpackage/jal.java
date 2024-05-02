package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: jal  reason: default package */
/* loaded from: classes.dex */
public final class jal {
    public Object L;
    public Object O;
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public CV f4973R;

    /* renamed from: R  reason: collision with other field name */
    public jP7 f4974R;

    /* renamed from: R  reason: collision with other field name */
    public Object f4975R;
    public Object X;
    public Object c;
    public Object e;
    public Object v;

    public jal(fue fue) {
        this.R = 0;
        this.f4975R = fue;
        jP7 jp7 = new jP7((fue) this.f4975R);
        this.f4974R = jp7;
        this.v = jp7;
        mDL mdl = jp7.f4923R;
        this.c = mdl;
        this.e = mdl;
    }

    public static void c(eo1 eo1, j28 j28) {
        if (j28 instanceof e7) {
            e7 e7Var = (e7) j28;
            if (((j28) e7Var).f4792R) {
                e7Var.H();
            }
            e7Var.R = eo1;
            e7Var.e = msU.i(eo1);
            if (((j28) e7Var).f4792R) {
                e7Var.Z(false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void R() {
        for (j28 j28 = (j28) this.e; j28 != null; j28 = j28.c) {
            boolean z = j28.f4792R;
            if (!z) {
                if (!(!z)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (j28.f4791R != null) {
                    j28.f4792R = true;
                    j28.O();
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                StringBuilder U = opT.U("[");
                j28 j28 = (j28) this.e;
                if (j28 == ((j28) this.c)) {
                    U.append("]");
                } else {
                    while (true) {
                        if (!(j28 == null || j28 == ((j28) this.c))) {
                            U.append(String.valueOf(j28));
                            if (j28.c == ((j28) this.c)) {
                                U.append("]");
                            } else {
                                U.append(",");
                                j28 = j28.c;
                            }
                        }
                    }
                }
                return U.toString();
            default:
                return super.toString();
        }
    }

    public final void v(biT bit, int i, biT bit2, int i2, j28 j28) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        int i8;
        char c;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c2;
        blF blf = (blF) this.L;
        if (blf == null) {
            blf = new blF(this, j28, j28.X, bit, bit2);
            this.L = blf;
        } else {
            blf.f1806R = j28;
            blf.R = j28.X;
            blf.f1805R = bit;
            blf.v = bit2;
        }
        int i14 = 1;
        int i15 = ((i + i2) + 1) / 2;
        l7M l7m = new l7M(i15 * 3);
        l7M l7m2 = new l7M(i15 * 4);
        int i16 = 0;
        l7m2.e(0, i, 0, i2);
        int i17 = (i15 * 2) + 1;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        int[] iArr3 = new int[5];
        while (true) {
            if (l7m2.v != 0) {
                i16 = i14;
            }
            if (i16 == 0) {
                break;
            }
            int R = l7m2.R();
            int R2 = l7m2.R();
            int R3 = l7m2.R();
            int R4 = l7m2.R();
            int i18 = R3 - R4;
            int i19 = R - R2;
            if (i18 >= i14 && i19 >= i14) {
                int i20 = ((i18 + i19) + 1) / 2;
                int i21 = i17 / 2;
                int i22 = i21 + 1;
                iArr[i22] = R4;
                iArr2[i22] = R3;
                i4 = i17;
                int i23 = 0;
                while (i23 < i20) {
                    int i24 = i18 - i19;
                    boolean z4 = Math.abs(i24) % 2 == 1;
                    int i25 = -i23;
                    int i26 = i25;
                    while (true) {
                        if (i26 > i23) {
                            l7m = l7m;
                            l7m2 = l7m2;
                            i5 = R2;
                            z2 = false;
                            break;
                        }
                        if (i26 == i25 || (i26 != i23 && iArr[i26 + 1 + i21] > iArr[(i26 - 1) + i21])) {
                            i10 = iArr[i26 + 1 + i21];
                            i9 = i10;
                        } else {
                            i10 = iArr[(i26 - 1) + i21];
                            i9 = i10 + 1;
                        }
                        int i27 = ((i9 - R4) + R2) - i26;
                        if (i23 == 0 || i9 != i10) {
                            i11 = i27;
                            l7m2 = l7m2;
                            i12 = i11;
                        } else {
                            i11 = i27 - 1;
                            l7m2 = l7m2;
                            i12 = i27;
                        }
                        while (i9 < R3 && i12 < R) {
                            l7m = l7m;
                            eo1 eo1 = (eo1) blf.f1805R.f1772R[i9];
                            i5 = R2;
                            eo1 eo12 = (eo1) blf.v.f1772R[i12];
                            if (n3x.v(eo1, eo12)) {
                                c2 = 2;
                            } else {
                                c2 = eo1.getClass() == eo12.getClass() ? (char) 1 : 0;
                            }
                            if (!(c2 != 0)) {
                                break;
                            }
                            i9++;
                            i12++;
                            l7m = l7m;
                            R2 = i5;
                        }
                        l7m = l7m;
                        i5 = R2;
                        iArr[i21 + i26] = i9;
                        if (z4 && (i13 = i24 - i26) >= i25 + 1 && i13 <= i23 - 1 && iArr2[i21 + i13] <= i9) {
                            iArr3[0] = i10;
                            iArr3[1] = i11;
                            iArr3[2] = i9;
                            iArr3[3] = i12;
                            iArr3[4] = 0;
                            z2 = true;
                            break;
                        }
                        i26 += 2;
                        l7m2 = l7m2;
                        l7m = l7m;
                        R2 = i5;
                    }
                    if (z2) {
                        R = R;
                        R3 = R3;
                        R2 = i5;
                    } else {
                        boolean z5 = i24 % 2 == 0;
                        int i28 = i25;
                        while (true) {
                            if (i28 > i23) {
                                R = R;
                                R3 = R3;
                                R2 = i5;
                                z3 = false;
                                break;
                            }
                            if (i28 == i25 || (i28 != i23 && iArr2[i28 + 1 + i21] < iArr2[(i28 - 1) + i21])) {
                                i7 = iArr2[i28 + 1 + i21];
                                i6 = i7;
                            } else {
                                i7 = iArr2[(i28 - 1) + i21];
                                i6 = i7 - 1;
                            }
                            int i29 = R - ((R3 - i6) - i28);
                            int i30 = (i23 == 0 || i6 != i7) ? i29 : i29 + 1;
                            while (true) {
                                if (i6 > R4) {
                                    R2 = i5;
                                    if (i29 <= R2) {
                                        R = R;
                                        R3 = R3;
                                        break;
                                    }
                                    int i31 = i6 - 1;
                                    int i32 = i29 - 1;
                                    R = R;
                                    eo1 eo13 = (eo1) blf.f1805R.f1772R[i31];
                                    R3 = R3;
                                    eo1 eo14 = (eo1) blf.v.f1772R[i32];
                                    if (n3x.v(eo13, eo14)) {
                                        c = 2;
                                    } else {
                                        c = eo13.getClass() == eo14.getClass() ? (char) 1 : 0;
                                    }
                                    if (!(c != 0)) {
                                        break;
                                    }
                                    i6 = i31;
                                    i29 = i32;
                                    R = R;
                                    R3 = R3;
                                    i5 = R2;
                                } else {
                                    R = R;
                                    R3 = R3;
                                    R2 = i5;
                                    break;
                                }
                            }
                            iArr2[i21 + i28] = i6;
                            if (z5 && (i8 = i24 - i28) >= i25 && i8 <= i23 && iArr[i21 + i8] >= i6) {
                                iArr3[0] = i6;
                                iArr3[1] = i29;
                                iArr3[2] = i7;
                                iArr3[3] = i30;
                                iArr3[4] = 1;
                                z3 = true;
                                break;
                            }
                            i28 += 2;
                            i5 = R2;
                            R = R;
                            R3 = R3;
                        }
                        if (!z3) {
                            i23++;
                            i18 = i18;
                            i19 = i19;
                            i20 = i20;
                            l7m2 = l7m2;
                            l7m = l7m;
                            R = R;
                            R3 = R3;
                        }
                    }
                    z = true;
                    break;
                }
            } else {
                i4 = i17;
            }
            z = false;
            if (z) {
                if (msU.B(iArr3) > 0) {
                    int i33 = iArr3[3];
                    int i34 = iArr3[1];
                    int i35 = i33 - i34;
                    int i36 = iArr3[2];
                    int i37 = iArr3[0];
                    int i38 = i36 - i37;
                    if (i35 != i38) {
                        if (iArr3[4] != 0) {
                            l7m = l7m;
                            l7m.c(i37, i34, msU.B(iArr3));
                        } else {
                            l7m = l7m;
                            if (i35 > i38) {
                                l7m.c(i37, i34 + 1, msU.B(iArr3));
                            } else {
                                l7m.c(i37 + 1, i34, msU.B(iArr3));
                            }
                        }
                    } else {
                        l7m = l7m;
                        l7m.c(i37, i34, i38);
                    }
                } else {
                    l7m = l7m;
                }
                l7m2.e(R4, iArr3[0], R2, iArr3[1]);
                l7m2.e(iArr3[2], R3, iArr3[3], R);
                i14 = 1;
                l7m2 = l7m2;
                i16 = 0;
                i17 = i4;
            } else {
                i17 = i4;
                l7m2 = l7m2;
                l7m = l7m;
                i14 = 1;
                i16 = 0;
            }
        }
        int i39 = l7m.v;
        if ((i39 % 3 == 0 ? i14 : 0) != 0) {
            if (i39 > 3) {
                i3 = 0;
                l7m.X(0, i39 - 3);
            } else {
                i3 = 0;
            }
            int i40 = i;
            int i41 = i2;
            l7m.c(i40, i41, i3);
            while (true) {
                if ((l7m.v != 0 ? i14 : i3) != 0) {
                    int R5 = l7m.R();
                    int R6 = l7m.R();
                    int R7 = l7m.R();
                    while (i40 > R7) {
                        i40--;
                        blf.v(i40);
                    }
                    while (i41 > R6) {
                        i41--;
                        blf.R(i40, i41);
                    }
                    while (true) {
                        R5--;
                        if (R5 > 0) {
                            i40--;
                            i41--;
                            blf.f1806R = blf.f1806R.v;
                            eo1 eo15 = (eo1) blf.v.f1772R[i41];
                            if (!n3x.v((eo1) blf.f1805R.f1772R[i40], eo15)) {
                                j28 j282 = blf.f1806R;
                                blf.f1807R.getClass();
                                c(eo15, j282);
                                blf.f1806R = j282;
                                gFQ gfq = (gFQ) blf.f1807R.f4973R;
                                if (gfq != null) {
                                    gfq.R();
                                }
                            } else {
                                gFQ gfq2 = (gFQ) blf.f1807R.f4973R;
                                if (gfq2 != null) {
                                    gfq2.X();
                                }
                            }
                            int i42 = blf.R;
                            j28 j283 = blf.f1806R;
                            int i43 = i42 | j283.e;
                            blf.R = i43;
                            j283.X = i43;
                        }
                    }
                }
            }
            while (i40 > 0) {
                i40--;
                blf.v(i40);
            }
            while (i41 > 0) {
                i41--;
                blf.R(i40, i41);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public jal(Context context, l_s l_s, CV cv, cpn cpn, WorkDatabase workDatabase, String str) {
        this.R = 1;
        this.f4973R = new CV(13);
        this.f4975R = context.getApplicationContext();
        this.c = cv;
        this.v = cpn;
        this.e = l_s;
        this.X = workDatabase;
        this.O = str;
    }
}
