package defpackage;

import java.util.Iterator;

/* renamed from: kLl  reason: default package */
/* loaded from: classes.dex */
public final class kLl extends ora {
    public kLl(kwo kwo) {
        super(kwo);
    }

    public final void C(pgw pgw) {
        ((ora) this).f6979R.f7164R.add(pgw);
        pgw.f7168v.add(((ora) this).f6979R);
    }

    @Override // defpackage.ora
    public final boolean H() {
        return false;
    }

    @Override // defpackage.ora
    public final void O() {
        ((ora) this).f6976R = null;
        ((ora) this).f6979R.c();
    }

    @Override // defpackage.ora, defpackage.ccT
    public final void R(ccT cct) {
        xP xPVar = (xP) ((ora) this).f6978R;
        int i = xPVar.z;
        Iterator it = ((ora) this).f6979R.f7168v.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((pgw) it.next()).c;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            ((ora) this).f6979R.e(i3 + xPVar.n);
        } else {
            ((ora) this).f6979R.e(i2 + xPVar.n);
        }
    }

    @Override // defpackage.ora
    public final void X() {
        kwo kwo = ((ora) this).f6978R;
        if (kwo instanceof xP) {
            int i = ((xP) kwo).z;
            if (i == 0 || i == 1) {
                kwo.y = ((ora) this).f6979R.c;
            } else {
                kwo.t = ((ora) this).f6979R.c;
            }
        }
    }

    @Override // defpackage.ora
    public final void e() {
        kwo kwo = ((ora) this).f6978R;
        if (kwo instanceof xP) {
            pgw pgw = ((ora) this).f6979R;
            pgw.f7166R = true;
            xP xPVar = (xP) kwo;
            int i = xPVar.z;
            boolean z = xPVar.Z;
            int i2 = 0;
            if (i == 0) {
                pgw.R = 4;
                while (i2 < xPVar.u) {
                    kwo kwo2 = ((lGG) xPVar).c[i2];
                    if (z || kwo2.K != 8) {
                        pgw pgw2 = ((ora) kwo2.f5496R).f6979R;
                        pgw2.f7164R.add(((ora) this).f6979R);
                        ((ora) this).f6979R.f7168v.add(pgw2);
                    }
                    i2++;
                }
                C(((ora) ((ora) this).f6978R.f5496R).f6979R);
                C(((ora) ((ora) this).f6978R.f5496R).f6981v);
            } else if (i == 1) {
                pgw.R = 5;
                while (i2 < xPVar.u) {
                    kwo kwo3 = ((lGG) xPVar).c[i2];
                    if (z || kwo3.K != 8) {
                        pgw pgw3 = ((ora) kwo3.f5496R).f6981v;
                        pgw3.f7164R.add(((ora) this).f6979R);
                        ((ora) this).f6979R.f7168v.add(pgw3);
                    }
                    i2++;
                }
                C(((ora) ((ora) this).f6978R.f5496R).f6979R);
                C(((ora) ((ora) this).f6978R.f5496R).f6981v);
            } else if (i == 2) {
                pgw.R = 6;
                while (i2 < xPVar.u) {
                    kwo kwo4 = ((lGG) xPVar).c[i2];
                    if (z || kwo4.K != 8) {
                        pgw pgw4 = ((ora) kwo4.f5490R).f6979R;
                        pgw4.f7164R.add(((ora) this).f6979R);
                        ((ora) this).f6979R.f7168v.add(pgw4);
                    }
                    i2++;
                }
                C(((ora) ((ora) this).f6978R.f5490R).f6979R);
                C(((ora) ((ora) this).f6978R.f5490R).f6981v);
            } else if (i == 3) {
                pgw.R = 7;
                while (i2 < xPVar.u) {
                    kwo kwo5 = ((lGG) xPVar).c[i2];
                    if (z || kwo5.K != 8) {
                        pgw pgw5 = ((ora) kwo5.f5490R).f6981v;
                        pgw5.f7164R.add(((ora) this).f6979R);
                        ((ora) this).f6979R.f7168v.add(pgw5);
                    }
                    i2++;
                }
                C(((ora) ((ora) this).f6978R.f5490R).f6979R);
                C(((ora) ((ora) this).f6978R.f5490R).f6981v);
            }
        }
    }
}
