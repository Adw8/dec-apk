package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: eDI  reason: default package */
/* loaded from: classes.dex */
public final class eDI implements m9D, cRR {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hKF f3032R;

    public eDI(gHm ghm) {
        this.R = ghm;
        this.f3032R = new hKF(ghm);
    }

    @Override // defpackage.cRR
    public final int L() {
        return this.f3032R.L();
    }

    @Override // defpackage.cRR
    public final Map O() {
        return this.f3032R.O();
    }

    @Override // defpackage.cRR
    public final Object R(int i) {
        return this.f3032R.R(i);
    }

    @Override // defpackage.cRR
    public final void X(int i, m88 m88, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1610124706);
        this.f3032R.X(i, jr_, i2 & 14);
        jr_.g(false);
    }

    @Override // defpackage.m9D
    public final List c() {
        ((fkT) this.R.getValue()).getClass();
        return fcD.R;
    }

    @Override // defpackage.m9D
    public final bmu e() {
        return ((fkT) this.R.getValue()).R;
    }

    @Override // defpackage.cRR
    public final Object v(int i) {
        return this.f3032R.v(i);
    }
}
