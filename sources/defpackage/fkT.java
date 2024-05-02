package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: fkT  reason: default package */
/* loaded from: classes.dex */
public final class fkT implements m9D, cRR {
    public final bmu R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ g1m f3540R;

    public fkT(gLn gln, heu heu, bmu bmu) {
        this.R = bmu;
        this.f3540R = new g1m(gln, aH9.u(new noW(0, bmu), true, -1230121334), heu);
    }

    @Override // defpackage.cRR
    public final int L() {
        return this.f3540R.L();
    }

    @Override // defpackage.cRR
    public final Map O() {
        return this.f3540R.f3652R;
    }

    @Override // defpackage.cRR
    public final Object R(int i) {
        return this.f3540R.R(i);
    }

    @Override // defpackage.cRR
    public final void X(int i, m88 m88, int i2) {
        int i3;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1645068522);
        if ((i2 & 14) == 0) {
            i3 = (jr_.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= jr_.O(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !jr_.J()) {
            this.f3540R.X(i, jr_, i3 & 14);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fbD(this, i, i2, 0);
        }
    }

    @Override // defpackage.m9D
    public final List c() {
        return fcD.R;
    }

    @Override // defpackage.m9D
    public final bmu e() {
        return this.R;
    }

    @Override // defpackage.cRR
    public final Object v(int i) {
        return this.f3540R.v(i);
    }
}
