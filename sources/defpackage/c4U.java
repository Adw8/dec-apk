package defpackage;

/* renamed from: c4U  reason: default package */
/* loaded from: classes.dex */
public final class c4U extends mjG implements lHr, bpk {

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f1959R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f1960R = l6.n(null);
    public final bsy R = hcI.R;

    public c4U(kg9 kg9) {
        this.f1959R = kg9;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        this.f1960R.R((c4U) bs6.v(hcI.R));
    }

    public final void U(cX2 cx2) {
        this.f1959R.x(cx2);
        c4U c4u = (c4U) this.f1960R.getValue();
        if (c4u != null) {
            c4u.U(cx2);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c4U) && n3x.v(this.f1959R, ((c4U) obj).f1959R);
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    public final int hashCode() {
        return this.f1959R.hashCode();
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return this.R;
    }
}
