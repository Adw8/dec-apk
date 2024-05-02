package defpackage;

/* renamed from: ivi  reason: default package */
/* loaded from: classes.dex */
public final class ivi implements lHr, bpk {
    public ivi R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f4760R;

    public ivi(kmL kml) {
        bsy bsy = eD_.R;
        this.f4760R = kml;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        this.R = (ivi) bs6.v(eD_.R);
    }

    public final boolean c(jui jui) {
        kg9 kg9 = this.f4760R;
        if (kg9 != null && ((Boolean) kg9.x(jui)).booleanValue()) {
            return true;
        }
        ivi ivi = this.R;
        if (ivi != null) {
            return ivi.c(jui);
        }
        return false;
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    public final boolean m() {
        ivi ivi = this.R;
        return ivi != null && ivi.m();
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return eD_.R;
    }
}
