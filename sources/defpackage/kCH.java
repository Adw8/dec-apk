package defpackage;

/* renamed from: kCH  reason: default package */
/* loaded from: classes.dex */
public final class kCH implements lHr, bpk, kg9 {
    public final kg9 R;
    public kg9 v;

    public kCH(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        kg9 kg9 = (kg9) bs6.v(bwK.R);
        if (!n3x.v(kg9, this.v)) {
            this.v = kg9;
        }
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return bwK.R;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        hjM hjm = (hjM) obj;
        this.R.x(hjm);
        kg9 kg9 = this.v;
        if (kg9 != null) {
            kg9.x(hjm);
        }
        return o8s.R;
    }
}
