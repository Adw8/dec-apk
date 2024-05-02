package defpackage;

/* renamed from: fFN  reason: default package */
/* loaded from: classes.dex */
public final class fFN implements kz5 {
    public final /* synthetic */ aIZ R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dAd f3356R;

    /* renamed from: R  reason: collision with other field name */
    public final i4C f3357R;

    /* renamed from: R  reason: collision with other field name */
    public final kz5 f3358R;

    public fFN(aIZ aiz, dAd dad) {
        this.R = aiz;
        this.f3356R = dad;
        ioS ios = aiz.f824R;
        this.f3358R = ios != null ? ((aIZ) ios).c() : null;
        i4C i4c = new i4C(dad.v(), dad.R());
        dad.R.v(i4c);
        this.f3357R = i4c;
    }

    @Override // defpackage.kz5
    public final void v() {
        dAd dad = this.f3356R;
        dad.R.U(this.f3357R);
        kz5 kz5 = this.f3358R;
        if (kz5 != null) {
            kz5.v();
        }
        owG owg = (owG) this.R.f825R.c.getValue();
        if (owg != null) {
            owg.R();
        }
    }
}
