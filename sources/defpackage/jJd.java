package defpackage;

/* renamed from: jJd  reason: default package */
/* loaded from: classes.dex */
public final class jJd implements lHr, cIc {
    public hjM R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f4902R;

    @Override // defpackage.cIc
    public final void F(hjM hjm) {
        kg9 kg9;
        this.R = hjm;
        if (((poS) hjm).p()) {
            hjM hjm2 = this.R;
            if (hjm2 != null && hjm2.p() && (kg9 = this.f4902R) != null) {
                kg9.x(this.R);
                return;
            }
            return;
        }
        kg9 kg92 = this.f4902R;
        if (kg92 != null) {
            kg92.x(null);
        }
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        kg9 kg9;
        kg9 kg92 = (kg9) bs6.v(bwK.R);
        if (kg92 == null && (kg9 = this.f4902R) != null) {
            kg9.x(null);
        }
        this.f4902R = kg92;
    }
}
