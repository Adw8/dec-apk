package defpackage;

/* renamed from: nLB  reason: default package */
/* loaded from: classes.dex */
public final class nLB extends ora {
    public static int[] R = new int[2];

    public nLB(kwo kwo) {
        super(kwo);
        ((ora) this).f6979R.R = 4;
        ((ora) this).f6981v.R = 5;
        this.c = 0;
    }

    public static void C(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    @Override // defpackage.ora
    public final boolean H() {
        return ((ora) this).v != 3 || ((ora) this).f6978R.f5485O == 0;
    }

    public final void N() {
        ((ora) this).f6980R = false;
        ((ora) this).f6979R.c();
        ((ora) this).f6979R.f7167c = false;
        ((ora) this).f6981v.c();
        ((ora) this).f6981v.f7167c = false;
        ((pgw) ((ora) this).f6977R).f7167c = false;
    }

    @Override // defpackage.ora
    public final void O() {
        ((ora) this).f6976R = null;
        ((ora) this).f6979R.c();
        ((ora) this).f6981v.c();
        ((ora) this).f6977R.c();
        ((ora) this).f6980R = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0271, code lost:
        if (r15 != 1) goto L_0x02d0;
     */
    @Override // defpackage.ora, defpackage.ccT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(defpackage.ccT r21) {
        /*
        // Method dump skipped, instructions count: 1010
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nLB.R(ccT):void");
    }

    @Override // defpackage.ora
    public final void X() {
        pgw pgw = ((ora) this).f6979R;
        if (pgw.f7167c) {
            ((ora) this).f6978R.y = pgw.c;
        }
    }

    @Override // defpackage.ora
    public final void e() {
        kwo kwo;
        kwo kwo2;
        kwo kwo3;
        int i;
        kwo kwo4;
        int i2;
        kwo kwo5 = ((ora) this).f6978R;
        if (kwo5.f5497R) {
            ((ora) this).f6977R.e(kwo5.P());
        }
        gUH guh = ((ora) this).f6977R;
        if (!((pgw) guh).f7167c) {
            kwo kwo6 = ((ora) this).f6978R;
            int i3 = kwo6.f5510c[0];
            ((ora) this).v = i3;
            if (i3 != 3) {
                if (i3 == 4 && (kwo4 = kwo6.f5495R) != null && ((i2 = kwo4.f5510c[0]) == 1 || i2 == 4)) {
                    int P = (kwo4.P() - ((ora) this).f6978R.f5491R.e()) - ((ora) this).f6978R.f5508c.e();
                    ora.v(((ora) this).f6979R, ((ora) kwo4.f5496R).f6979R, ((ora) this).f6978R.f5491R.e());
                    ora.v(((ora) this).f6981v, ((ora) kwo4.f5496R).f6981v, -((ora) this).f6978R.f5508c.e());
                    ((ora) this).f6977R.e(P);
                    return;
                } else if (i3 == 1) {
                    guh.e(kwo6.P());
                }
            }
        } else if (((ora) this).v == 4 && (kwo3 = (kwo2 = ((ora) this).f6978R).f5495R) != null && ((i = kwo3.f5510c[0]) == 1 || i == 4)) {
            ora.v(((ora) this).f6979R, ((ora) kwo3.f5496R).f6979R, kwo2.f5491R.e());
            ora.v(((ora) this).f6981v, ((ora) kwo3.f5496R).f6981v, -((ora) this).f6978R.f5508c.e());
            return;
        }
        gUH guh2 = ((ora) this).f6977R;
        if (((pgw) guh2).f7167c) {
            kwo kwo7 = ((ora) this).f6978R;
            if (kwo7.f5497R) {
                iP5[] ip5Arr = kwo7.f5500R;
                iP5 ip5 = ip5Arr[0];
                iP5 ip52 = ip5.f4581R;
                if (ip52 == null || ip5Arr[1].f4581R == null) {
                    if (ip52 != null) {
                        pgw Z = ora.Z(ip5);
                        if (Z != null) {
                            ora.v(((ora) this).f6979R, Z, ((ora) this).f6978R.f5500R[0].e());
                            ora.v(((ora) this).f6981v, ((ora) this).f6979R, ((pgw) ((ora) this).f6977R).c);
                            return;
                        }
                        return;
                    }
                    iP5 ip53 = ip5Arr[1];
                    if (ip53.f4581R != null) {
                        pgw Z2 = ora.Z(ip53);
                        if (Z2 != null) {
                            ora.v(((ora) this).f6981v, Z2, -((ora) this).f6978R.f5500R[1].e());
                            ora.v(((ora) this).f6979R, ((ora) this).f6981v, -((pgw) ((ora) this).f6977R).c);
                            return;
                        }
                        return;
                    } else if (!(kwo7 instanceof haS) && kwo7.f5495R != null && kwo7.L(icY.CENTER).f4581R == null) {
                        kwo kwo8 = ((ora) this).f6978R;
                        ora.v(((ora) this).f6979R, ((ora) kwo8.f5495R.f5496R).f6979R, kwo8.j());
                        ora.v(((ora) this).f6981v, ((ora) this).f6979R, ((pgw) ((ora) this).f6977R).c);
                        return;
                    } else {
                        return;
                    }
                } else if (kwo7.o()) {
                    ((ora) this).f6979R.v = ((ora) this).f6978R.f5500R[0].e();
                    ((ora) this).f6981v.v = -((ora) this).f6978R.f5500R[1].e();
                    return;
                } else {
                    pgw Z3 = ora.Z(((ora) this).f6978R.f5500R[0]);
                    if (Z3 != null) {
                        ora.v(((ora) this).f6979R, Z3, ((ora) this).f6978R.f5500R[0].e());
                    }
                    pgw Z4 = ora.Z(((ora) this).f6978R.f5500R[1]);
                    if (Z4 != null) {
                        ora.v(((ora) this).f6981v, Z4, -((ora) this).f6978R.f5500R[1].e());
                    }
                    ((ora) this).f6979R.f7166R = true;
                    ((ora) this).f6981v.f7166R = true;
                    return;
                }
            }
        }
        if (((ora) this).v == 3) {
            kwo kwo9 = ((ora) this).f6978R;
            int i4 = kwo9.f5485O;
            if (i4 == 2) {
                kwo kwo10 = kwo9.f5495R;
                if (kwo10 != null) {
                    gUH guh3 = ((ora) kwo10.f5490R).f6977R;
                    ((pgw) guh2).f7168v.add(guh3);
                    ((pgw) guh3).f7164R.add(((ora) this).f6977R);
                    gUH guh4 = ((ora) this).f6977R;
                    ((pgw) guh4).f7166R = true;
                    ((pgw) guh4).f7164R.add(((ora) this).f6979R);
                    ((pgw) ((ora) this).f6977R).f7164R.add(((ora) this).f6981v);
                }
            } else if (i4 == 3) {
                if (kwo9.f5482L == 3) {
                    ((ora) this).f6979R.f7165R = this;
                    ((ora) this).f6981v.f7165R = this;
                    g2a g2a = kwo9.f5490R;
                    ((ora) g2a).f6979R.f7165R = this;
                    ((ora) g2a).f6981v.f7165R = this;
                    ((pgw) guh2).f7165R = this;
                    if (kwo9.K()) {
                        ((pgw) ((ora) this).f6977R).f7168v.add(((ora) ((ora) this).f6978R.f5490R).f6977R);
                        ((pgw) ((ora) ((ora) this).f6978R.f5490R).f6977R).f7164R.add(((ora) this).f6977R);
                        g2a g2a2 = ((ora) this).f6978R.f5490R;
                        ((pgw) ((ora) g2a2).f6977R).f7165R = this;
                        ((pgw) ((ora) this).f6977R).f7168v.add(((ora) g2a2).f6979R);
                        ((pgw) ((ora) this).f6977R).f7168v.add(((ora) ((ora) this).f6978R.f5490R).f6981v);
                        ((ora) ((ora) this).f6978R.f5490R).f6979R.f7164R.add(((ora) this).f6977R);
                        ((ora) ((ora) this).f6978R.f5490R).f6981v.f7164R.add(((ora) this).f6977R);
                    } else if (((ora) this).f6978R.o()) {
                        ((pgw) ((ora) ((ora) this).f6978R.f5490R).f6977R).f7168v.add(((ora) this).f6977R);
                        ((pgw) ((ora) this).f6977R).f7164R.add(((ora) ((ora) this).f6978R.f5490R).f6977R);
                    } else {
                        ((pgw) ((ora) ((ora) this).f6978R.f5490R).f6977R).f7168v.add(((ora) this).f6977R);
                    }
                } else {
                    gUH guh5 = ((ora) kwo9.f5490R).f6977R;
                    ((pgw) guh2).f7168v.add(guh5);
                    ((pgw) guh5).f7164R.add(((ora) this).f6977R);
                    ((ora) ((ora) this).f6978R.f5490R).f6979R.f7164R.add(((ora) this).f6977R);
                    ((ora) ((ora) this).f6978R.f5490R).f6981v.f7164R.add(((ora) this).f6977R);
                    gUH guh6 = ((ora) this).f6977R;
                    ((pgw) guh6).f7166R = true;
                    ((pgw) guh6).f7164R.add(((ora) this).f6979R);
                    ((pgw) ((ora) this).f6977R).f7164R.add(((ora) this).f6981v);
                    ((ora) this).f6979R.f7168v.add(((ora) this).f6977R);
                    ((ora) this).f6981v.f7168v.add(((ora) this).f6977R);
                }
            }
        }
        kwo kwo11 = ((ora) this).f6978R;
        iP5[] ip5Arr2 = kwo11.f5500R;
        iP5 ip54 = ip5Arr2[0];
        iP5 ip55 = ip54.f4581R;
        if (ip55 == null || ip5Arr2[1].f4581R == null) {
            if (ip55 != null) {
                pgw Z5 = ora.Z(ip54);
                if (Z5 != null) {
                    ora.v(((ora) this).f6979R, Z5, ((ora) this).f6978R.f5500R[0].e());
                    c(((ora) this).f6981v, ((ora) this).f6979R, 1, ((ora) this).f6977R);
                    return;
                }
                return;
            }
            iP5 ip56 = ip5Arr2[1];
            if (ip56.f4581R != null) {
                pgw Z6 = ora.Z(ip56);
                if (Z6 != null) {
                    ora.v(((ora) this).f6981v, Z6, -((ora) this).f6978R.f5500R[1].e());
                    c(((ora) this).f6979R, ((ora) this).f6981v, -1, ((ora) this).f6977R);
                }
            } else if (!(kwo11 instanceof haS) && (kwo = kwo11.f5495R) != null) {
                ora.v(((ora) this).f6979R, ((ora) kwo.f5496R).f6979R, kwo11.j());
                c(((ora) this).f6981v, ((ora) this).f6979R, 1, ((ora) this).f6977R);
            }
        } else if (kwo11.o()) {
            ((ora) this).f6979R.v = ((ora) this).f6978R.f5500R[0].e();
            ((ora) this).f6981v.v = -((ora) this).f6978R.f5500R[1].e();
        } else {
            pgw Z7 = ora.Z(((ora) this).f6978R.f5500R[0]);
            pgw Z8 = ora.Z(((ora) this).f6978R.f5500R[1]);
            if (Z7 != null) {
                Z7.v(this);
            }
            if (Z8 != null) {
                Z8.v(this);
            }
            this.e = 4;
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("HorizontalRun ");
        U.append(((ora) this).f6978R.f5517v);
        return U.toString();
    }
}
