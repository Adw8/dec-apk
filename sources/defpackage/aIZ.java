package defpackage;

/* renamed from: aIZ  reason: default package */
/* loaded from: classes.dex */
public final class aIZ implements bpk, lHr, ioS {
    public static final ppN X = new ppN();
    public final dAd R;

    /* renamed from: R  reason: collision with other field name */
    public ioS f824R;

    /* renamed from: R  reason: collision with other field name */
    public final oey f825R;

    public aIZ(oey oey, dAd dad) {
        this.f825R = oey;
        this.R = dad;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        this.f824R = (ioS) bs6.v(fQO.R);
    }

    public final kz5 c() {
        dAd dad = this.R;
        if (dad.R.H()) {
            return new fFN(this, dad);
        }
        ioS ios = this.f824R;
        return ios != null ? ((aIZ) ios).c() : X;
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return fQO.R;
    }
}
