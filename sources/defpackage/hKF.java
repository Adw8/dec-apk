package defpackage;

import java.util.Map;

/* renamed from: hKF  reason: default package */
/* loaded from: classes.dex */
public final class hKF implements cRR {
    public final dH9 R;

    public hKF(gHm ghm) {
        this.R = ghm;
    }

    @Override // defpackage.cRR
    public final int L() {
        return ((cRR) this.R.getValue()).L();
    }

    @Override // defpackage.cRR
    public final Map O() {
        return ((cRR) this.R.getValue()).O();
    }

    @Override // defpackage.cRR
    public final Object R(int i) {
        return ((cRR) this.R.getValue()).R(i);
    }

    @Override // defpackage.cRR
    public final void X(int i, m88 m88, int i2) {
        int i3;
        jr_ jr_ = (jr_) m88;
        jr_.q(1633511187);
        if ((i2 & 14) == 0) {
            i3 = (jr_.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= jr_.O(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !jr_.J()) {
            ((cRR) this.R.getValue()).X(i, jr_, i3 & 14);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fbD(this, i, i2, 1);
        }
    }

    @Override // defpackage.cRR
    public final Object v(int i) {
        return ((cRR) this.R.getValue()).v(i);
    }
}
