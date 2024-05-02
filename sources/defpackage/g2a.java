package defpackage;

/* renamed from: g2a  reason: default package */
/* loaded from: classes.dex */
public final class g2a extends ora {
    public cu R = null;
    public pgw c;

    public g2a(kwo kwo) {
        super(kwo);
        pgw pgw = new pgw(this);
        this.c = pgw;
        ((ora) this).f6979R.R = 6;
        ((ora) this).f6981v.R = 7;
        pgw.R = 8;
        super.c = 1;
    }

    public final void C() {
        ((ora) this).f6980R = false;
        ((ora) this).f6979R.c();
        ((ora) this).f6979R.f7167c = false;
        ((ora) this).f6981v.c();
        ((ora) this).f6981v.f7167c = false;
        this.c.c();
        this.c.f7167c = false;
        ((pgw) ((ora) this).f6977R).f7167c = false;
    }

    @Override // defpackage.ora
    public final boolean H() {
        return ((ora) this).v != 3 || ((ora) this).f6978R.f5482L == 0;
    }

    @Override // defpackage.ora
    public final void O() {
        ((ora) this).f6976R = null;
        ((ora) this).f6979R.c();
        ((ora) this).f6981v.c();
        this.c.c();
        ((ora) this).f6977R.c();
        ((ora) this).f6980R = false;
    }

    @Override // defpackage.ora, defpackage.ccT
    public final void R(ccT cct) {
        int i;
        float f;
        float f2;
        float f3;
        if (jQ.I(this.e) != 3) {
            gUH guh = ((ora) this).f6977R;
            if (((pgw) guh).f7170v && !((pgw) guh).f7167c && ((ora) this).v == 3) {
                kwo kwo = ((ora) this).f6978R;
                int i2 = kwo.f5482L;
                if (i2 == 2) {
                    kwo kwo2 = kwo.f5495R;
                    if (kwo2 != null) {
                        gUH guh2 = ((ora) kwo2.f5490R).f6977R;
                        if (((pgw) guh2).f7167c) {
                            guh.e((int) ((((float) ((pgw) guh2).c) * kwo.v) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    gUH guh3 = ((ora) kwo.f5496R).f6977R;
                    if (((pgw) guh3).f7167c) {
                        int i3 = kwo.g;
                        if (i3 == -1) {
                            f2 = (float) ((pgw) guh3).c;
                            f3 = kwo.X;
                        } else if (i3 == 0) {
                            f = ((float) ((pgw) guh3).c) * kwo.X;
                            i = (int) (f + 0.5f);
                            guh.e(i);
                        } else if (i3 != 1) {
                            i = 0;
                            guh.e(i);
                        } else {
                            f2 = (float) ((pgw) guh3).c;
                            f3 = kwo.X;
                        }
                        f = f2 / f3;
                        i = (int) (f + 0.5f);
                        guh.e(i);
                    }
                }
            }
            pgw pgw = ((ora) this).f6979R;
            if (pgw.f7170v) {
                pgw pgw2 = ((ora) this).f6981v;
                if (pgw2.f7170v) {
                    if (!pgw.f7167c || !pgw2.f7167c || !((pgw) ((ora) this).f6977R).f7167c) {
                        if (!((pgw) ((ora) this).f6977R).f7167c && ((ora) this).v == 3) {
                            kwo kwo3 = ((ora) this).f6978R;
                            if (kwo3.f5485O == 0 && !kwo3.K()) {
                                int i4 = ((pgw) ((ora) this).f6979R.f7168v.get(0)).c;
                                pgw pgw3 = ((ora) this).f6979R;
                                int i5 = i4 + pgw3.v;
                                int i6 = ((pgw) ((ora) this).f6981v.f7168v.get(0)).c + ((ora) this).f6981v.v;
                                pgw3.e(i5);
                                ((ora) this).f6981v.e(i6);
                                ((ora) this).f6977R.e(i6 - i5);
                                return;
                            }
                        }
                        if (!((pgw) ((ora) this).f6977R).f7167c && ((ora) this).v == 3 && ((ora) this).R == 1 && ((ora) this).f6979R.f7168v.size() > 0 && ((ora) this).f6981v.f7168v.size() > 0) {
                            int i7 = (((pgw) ((ora) this).f6981v.f7168v.get(0)).c + ((ora) this).f6981v.v) - (((pgw) ((ora) this).f6979R.f7168v.get(0)).c + ((ora) this).f6979R.v);
                            gUH guh4 = ((ora) this).f6977R;
                            int i8 = guh4.X;
                            if (i7 < i8) {
                                guh4.e(i7);
                            } else {
                                guh4.e(i8);
                            }
                        }
                        if (((pgw) ((ora) this).f6977R).f7167c && ((ora) this).f6979R.f7168v.size() > 0 && ((ora) this).f6981v.f7168v.size() > 0) {
                            pgw pgw4 = (pgw) ((ora) this).f6979R.f7168v.get(0);
                            pgw pgw5 = (pgw) ((ora) this).f6981v.f7168v.get(0);
                            int i9 = pgw4.c;
                            pgw pgw6 = ((ora) this).f6979R;
                            i9 = pgw6.v + i9;
                            int i10 = pgw5.c;
                            i10 = ((ora) this).f6981v.v + i10;
                            float f4 = ((ora) this).f6978R.L;
                            if (pgw4 == pgw5) {
                                f4 = 0.5f;
                            }
                            pgw6.e((int) ((((float) ((i10 - i9) - ((pgw) ((ora) this).f6977R).c)) * f4) + ((float) i9) + 0.5f));
                            ((ora) this).f6981v.e(((ora) this).f6979R.c + ((pgw) ((ora) this).f6977R).c);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        kwo kwo4 = ((ora) this).f6978R;
        U(kwo4.f5516v, kwo4.f5512e, 1);
    }

    @Override // defpackage.ora
    public final void X() {
        pgw pgw = ((ora) this).f6979R;
        if (pgw.f7167c) {
            ((ora) this).f6978R.t = pgw.c;
        }
    }

    @Override // defpackage.ora
    public final void e() {
        kwo kwo;
        kwo kwo2;
        kwo kwo3;
        kwo kwo4;
        kwo kwo5 = ((ora) this).f6978R;
        if (kwo5.f5497R) {
            ((ora) this).f6977R.e(kwo5.m());
        }
        if (!((pgw) ((ora) this).f6977R).f7167c) {
            kwo kwo6 = ((ora) this).f6978R;
            ((ora) this).v = kwo6.f5510c[1];
            if (kwo6.f5484L) {
                this.R = new cu(this);
            }
            int i = ((ora) this).v;
            if (i != 3) {
                if (i == 4 && (kwo4 = ((ora) this).f6978R.f5495R) != null && kwo4.f5510c[1] == 1) {
                    int m = (kwo4.m() - ((ora) this).f6978R.f5516v.e()) - ((ora) this).f6978R.f5512e.e();
                    ora.v(((ora) this).f6979R, ((ora) kwo4.f5490R).f6979R, ((ora) this).f6978R.f5516v.e());
                    ora.v(((ora) this).f6981v, ((ora) kwo4.f5490R).f6981v, -((ora) this).f6978R.f5512e.e());
                    ((ora) this).f6977R.e(m);
                    return;
                } else if (i == 1) {
                    ((ora) this).f6977R.e(((ora) this).f6978R.m());
                }
            }
        } else if (((ora) this).v == 4 && (kwo3 = (kwo2 = ((ora) this).f6978R).f5495R) != null && kwo3.f5510c[1] == 1) {
            ora.v(((ora) this).f6979R, ((ora) kwo3.f5490R).f6979R, kwo2.f5516v.e());
            ora.v(((ora) this).f6981v, ((ora) kwo3.f5490R).f6981v, -((ora) this).f6978R.f5512e.e());
            return;
        }
        gUH guh = ((ora) this).f6977R;
        boolean z = ((pgw) guh).f7167c;
        if (z) {
            kwo kwo7 = ((ora) this).f6978R;
            if (kwo7.f5497R) {
                iP5[] ip5Arr = kwo7.f5500R;
                iP5 ip5 = ip5Arr[2];
                iP5 ip52 = ip5.f4581R;
                if (ip52 != null && ip5Arr[3].f4581R != null) {
                    if (kwo7.K()) {
                        ((ora) this).f6979R.v = ((ora) this).f6978R.f5500R[2].e();
                        ((ora) this).f6981v.v = -((ora) this).f6978R.f5500R[3].e();
                    } else {
                        pgw Z = ora.Z(((ora) this).f6978R.f5500R[2]);
                        if (Z != null) {
                            ora.v(((ora) this).f6979R, Z, ((ora) this).f6978R.f5500R[2].e());
                        }
                        pgw Z2 = ora.Z(((ora) this).f6978R.f5500R[3]);
                        if (Z2 != null) {
                            ora.v(((ora) this).f6981v, Z2, -((ora) this).f6978R.f5500R[3].e());
                        }
                        ((ora) this).f6979R.f7166R = true;
                        ((ora) this).f6981v.f7166R = true;
                    }
                    kwo kwo8 = ((ora) this).f6978R;
                    if (kwo8.f5484L) {
                        ora.v(this.c, ((ora) this).f6979R, kwo8.i);
                        return;
                    }
                    return;
                } else if (ip52 != null) {
                    pgw Z3 = ora.Z(ip5);
                    if (Z3 != null) {
                        ora.v(((ora) this).f6979R, Z3, ((ora) this).f6978R.f5500R[2].e());
                        ora.v(((ora) this).f6981v, ((ora) this).f6979R, ((pgw) ((ora) this).f6977R).c);
                        kwo kwo9 = ((ora) this).f6978R;
                        if (kwo9.f5484L) {
                            ora.v(this.c, ((ora) this).f6979R, kwo9.i);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    iP5 ip53 = ip5Arr[3];
                    if (ip53.f4581R != null) {
                        pgw Z4 = ora.Z(ip53);
                        if (Z4 != null) {
                            ora.v(((ora) this).f6981v, Z4, -((ora) this).f6978R.f5500R[3].e());
                            ora.v(((ora) this).f6979R, ((ora) this).f6981v, -((pgw) ((ora) this).f6977R).c);
                        }
                        kwo kwo10 = ((ora) this).f6978R;
                        if (kwo10.f5484L) {
                            ora.v(this.c, ((ora) this).f6979R, kwo10.i);
                            return;
                        }
                        return;
                    }
                    iP5 ip54 = ip5Arr[4];
                    if (ip54.f4581R != null) {
                        pgw Z5 = ora.Z(ip54);
                        if (Z5 != null) {
                            ora.v(this.c, Z5, 0);
                            ora.v(((ora) this).f6979R, this.c, -((ora) this).f6978R.i);
                            ora.v(((ora) this).f6981v, ((ora) this).f6979R, ((pgw) ((ora) this).f6977R).c);
                            return;
                        }
                        return;
                    } else if (!(kwo7 instanceof haS) && kwo7.f5495R != null && kwo7.L(icY.CENTER).f4581R == null) {
                        kwo kwo11 = ((ora) this).f6978R;
                        ora.v(((ora) this).f6979R, ((ora) kwo11.f5495R.f5490R).f6979R, kwo11.g());
                        ora.v(((ora) this).f6981v, ((ora) this).f6979R, ((pgw) ((ora) this).f6977R).c);
                        kwo kwo12 = ((ora) this).f6978R;
                        if (kwo12.f5484L) {
                            ora.v(this.c, ((ora) this).f6979R, kwo12.i);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z || ((ora) this).v != 3) {
            guh.v(this);
        } else {
            kwo kwo13 = ((ora) this).f6978R;
            int i2 = kwo13.f5482L;
            if (i2 == 2) {
                kwo kwo14 = kwo13.f5495R;
                if (kwo14 != null) {
                    gUH guh2 = ((ora) kwo14.f5490R).f6977R;
                    ((pgw) guh).f7168v.add(guh2);
                    ((pgw) guh2).f7164R.add(((ora) this).f6977R);
                    gUH guh3 = ((ora) this).f6977R;
                    ((pgw) guh3).f7166R = true;
                    ((pgw) guh3).f7164R.add(((ora) this).f6979R);
                    ((pgw) ((ora) this).f6977R).f7164R.add(((ora) this).f6981v);
                }
            } else if (i2 == 3 && !kwo13.K()) {
                kwo kwo15 = ((ora) this).f6978R;
                if (kwo15.f5485O != 3) {
                    gUH guh4 = ((ora) kwo15.f5496R).f6977R;
                    ((pgw) ((ora) this).f6977R).f7168v.add(guh4);
                    ((pgw) guh4).f7164R.add(((ora) this).f6977R);
                    gUH guh5 = ((ora) this).f6977R;
                    ((pgw) guh5).f7166R = true;
                    ((pgw) guh5).f7164R.add(((ora) this).f6979R);
                    ((pgw) ((ora) this).f6977R).f7164R.add(((ora) this).f6981v);
                }
            }
        }
        kwo kwo16 = ((ora) this).f6978R;
        iP5[] ip5Arr2 = kwo16.f5500R;
        iP5 ip55 = ip5Arr2[2];
        iP5 ip56 = ip55.f4581R;
        if (ip56 != null && ip5Arr2[3].f4581R != null) {
            if (kwo16.K()) {
                ((ora) this).f6979R.v = ((ora) this).f6978R.f5500R[2].e();
                ((ora) this).f6981v.v = -((ora) this).f6978R.f5500R[3].e();
            } else {
                pgw Z6 = ora.Z(((ora) this).f6978R.f5500R[2]);
                pgw Z7 = ora.Z(((ora) this).f6978R.f5500R[3]);
                if (Z6 != null) {
                    Z6.v(this);
                }
                if (Z7 != null) {
                    Z7.v(this);
                }
                this.e = 4;
            }
            if (((ora) this).f6978R.f5484L) {
                c(this.c, ((ora) this).f6979R, 1, this.R);
            }
        } else if (ip56 != null) {
            pgw Z8 = ora.Z(ip55);
            if (Z8 != null) {
                ora.v(((ora) this).f6979R, Z8, ((ora) this).f6978R.f5500R[2].e());
                c(((ora) this).f6981v, ((ora) this).f6979R, 1, ((ora) this).f6977R);
                if (((ora) this).f6978R.f5484L) {
                    c(this.c, ((ora) this).f6979R, 1, this.R);
                }
                if (((ora) this).v == 3) {
                    kwo kwo17 = ((ora) this).f6978R;
                    if (kwo17.X > 0.0f) {
                        nLB nlb = kwo17.f5496R;
                        if (((ora) nlb).v == 3) {
                            ((pgw) ((ora) nlb).f6977R).f7164R.add(((ora) this).f6977R);
                            ((pgw) ((ora) this).f6977R).f7168v.add(((ora) ((ora) this).f6978R.f5496R).f6977R);
                            ((pgw) ((ora) this).f6977R).f7165R = this;
                        }
                    }
                }
            }
        } else {
            iP5 ip57 = ip5Arr2[3];
            if (ip57.f4581R != null) {
                pgw Z9 = ora.Z(ip57);
                if (Z9 != null) {
                    ora.v(((ora) this).f6981v, Z9, -((ora) this).f6978R.f5500R[3].e());
                    c(((ora) this).f6979R, ((ora) this).f6981v, -1, ((ora) this).f6977R);
                    if (((ora) this).f6978R.f5484L) {
                        c(this.c, ((ora) this).f6979R, 1, this.R);
                    }
                }
            } else {
                iP5 ip58 = ip5Arr2[4];
                if (ip58.f4581R != null) {
                    pgw Z10 = ora.Z(ip58);
                    if (Z10 != null) {
                        ora.v(this.c, Z10, 0);
                        c(((ora) this).f6979R, this.c, -1, this.R);
                        c(((ora) this).f6981v, ((ora) this).f6979R, 1, ((ora) this).f6977R);
                    }
                } else if (!(kwo16 instanceof haS) && (kwo = kwo16.f5495R) != null) {
                    ora.v(((ora) this).f6979R, ((ora) kwo.f5490R).f6979R, kwo16.g());
                    c(((ora) this).f6981v, ((ora) this).f6979R, 1, ((ora) this).f6977R);
                    if (((ora) this).f6978R.f5484L) {
                        c(this.c, ((ora) this).f6979R, 1, this.R);
                    }
                    if (((ora) this).v == 3) {
                        kwo kwo18 = ((ora) this).f6978R;
                        if (kwo18.X > 0.0f) {
                            nLB nlb2 = kwo18.f5496R;
                            if (((ora) nlb2).v == 3) {
                                ((pgw) ((ora) nlb2).f6977R).f7164R.add(((ora) this).f6977R);
                                ((pgw) ((ora) this).f6977R).f7168v.add(((ora) ((ora) this).f6978R.f5496R).f6977R);
                                ((pgw) ((ora) this).f6977R).f7165R = this;
                            }
                        }
                    }
                }
            }
        }
        if (((pgw) ((ora) this).f6977R).f7168v.size() == 0) {
            ((pgw) ((ora) this).f6977R).f7170v = true;
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("VerticalRun ");
        U.append(((ora) this).f6978R.f5517v);
        return U.toString();
    }
}
