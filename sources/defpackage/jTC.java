package defpackage;

/* renamed from: jTC  reason: default package */
/* loaded from: classes.dex */
public final class jTC extends ora {
    public jTC(kwo kwo) {
        super(kwo);
        kwo.f5496R.O();
        kwo.f5490R.O();
        this.c = ((gOm) kwo).n;
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
        ((ora) this).f6979R.c();
    }

    @Override // defpackage.ora, defpackage.ccT
    public final void R(ccT cct) {
        pgw pgw = ((ora) this).f6979R;
        if (pgw.f7170v && !pgw.f7167c) {
            ((ora) this).f6979R.e((int) ((((float) ((pgw) pgw.f7168v.get(0)).c) * ((gOm) ((ora) this).f6978R).Z) + 0.5f));
        }
    }

    @Override // defpackage.ora
    public final void X() {
        kwo kwo = ((ora) this).f6978R;
        if (((gOm) kwo).n == 1) {
            kwo.y = ((ora) this).f6979R.c;
        } else {
            kwo.t = ((ora) this).f6979R.c;
        }
    }

    @Override // defpackage.ora
    public final void e() {
        kwo kwo = ((ora) this).f6978R;
        gOm gom = (gOm) kwo;
        int i = gom.u;
        int i2 = gom.z;
        if (gom.n == 1) {
            if (i != -1) {
                ((ora) this).f6979R.f7168v.add(((ora) kwo.f5495R.f5496R).f6979R);
                ((ora) ((ora) this).f6978R.f5495R.f5496R).f6979R.f7164R.add(((ora) this).f6979R);
                ((ora) this).f6979R.v = i;
            } else if (i2 != -1) {
                ((ora) this).f6979R.f7168v.add(((ora) kwo.f5495R.f5496R).f6981v);
                ((ora) ((ora) this).f6978R.f5495R.f5496R).f6981v.f7164R.add(((ora) this).f6979R);
                ((ora) this).f6979R.v = -i2;
            } else {
                pgw pgw = ((ora) this).f6979R;
                pgw.f7166R = true;
                pgw.f7168v.add(((ora) kwo.f5495R.f5496R).f6981v);
                ((ora) ((ora) this).f6978R.f5495R.f5496R).f6981v.f7164R.add(((ora) this).f6979R);
            }
            C(((ora) ((ora) this).f6978R.f5496R).f6979R);
            C(((ora) ((ora) this).f6978R.f5496R).f6981v);
            return;
        }
        if (i != -1) {
            ((ora) this).f6979R.f7168v.add(((ora) kwo.f5495R.f5490R).f6979R);
            ((ora) ((ora) this).f6978R.f5495R.f5490R).f6979R.f7164R.add(((ora) this).f6979R);
            ((ora) this).f6979R.v = i;
        } else if (i2 != -1) {
            ((ora) this).f6979R.f7168v.add(((ora) kwo.f5495R.f5490R).f6981v);
            ((ora) ((ora) this).f6978R.f5495R.f5490R).f6981v.f7164R.add(((ora) this).f6979R);
            ((ora) this).f6979R.v = -i2;
        } else {
            pgw pgw2 = ((ora) this).f6979R;
            pgw2.f7166R = true;
            pgw2.f7168v.add(((ora) kwo.f5495R.f5490R).f6981v);
            ((ora) ((ora) this).f6978R.f5495R.f5490R).f6981v.f7164R.add(((ora) this).f6979R);
        }
        C(((ora) ((ora) this).f6978R.f5490R).f6979R);
        C(((ora) ((ora) this).f6978R.f5490R).f6981v);
    }
}
