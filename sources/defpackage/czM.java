package defpackage;

import android.view.KeyEvent;

/* renamed from: czM  reason: default package */
/* loaded from: classes.dex */
public final class czM implements lHr, bpk, mij {
    public czM R;

    /* renamed from: R  reason: collision with other field name */
    public fue f2465R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f2466R;

    /* renamed from: R  reason: collision with other field name */
    public pi1 f2467R;
    public final kg9 v;

    public czM(kg9 kg9, V4 v4) {
        this.f2466R = kg9;
        this.v = v4;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        biT bit;
        biT bit2;
        pi1 pi1 = this.f2467R;
        if (!(pi1 == null || (bit2 = pi1.v) == null)) {
            bit2.U(this);
        }
        pi1 pi12 = (pi1) bs6.v(ofC.R);
        this.f2467R = pi12;
        if (!(pi12 == null || (bit = pi12.v) == null)) {
            bit.v(this);
        }
        this.R = (czM) bs6.v(khu.R);
    }

    public final boolean c(KeyEvent keyEvent) {
        kg9 kg9 = this.f2466R;
        Boolean bool = kg9 != null ? (Boolean) kg9.x(new pxb(keyEvent)) : null;
        if (n3x.v(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        czM czm = this.R;
        if (czm != null) {
            return czm.c(keyEvent);
        }
        return false;
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    @Override // defpackage.mij
    public final void j(poS pos) {
        this.f2465R = pos.f7272R;
    }

    public final boolean m(KeyEvent keyEvent) {
        czM czm = this.R;
        Boolean valueOf = czm != null ? Boolean.valueOf(czm.m(keyEvent)) : null;
        if (n3x.v(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        kg9 kg9 = this.v;
        if (kg9 != null) {
            return ((Boolean) kg9.x(new pxb(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return khu.R;
    }
}
