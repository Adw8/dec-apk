package defpackage;

/* renamed from: jyH  reason: default package */
/* loaded from: classes.dex */
public final class jyH implements ddq {
    public final Nx R = new Nx(this);

    /* renamed from: R  reason: collision with other field name */
    public final eUu f5166R;

    /* renamed from: R  reason: collision with other field name */
    public final ncu f5167R;

    /* renamed from: R  reason: collision with other field name */
    public ojR f5168R;
    public ncu c;
    public ncu v;

    public jyH(eUu euu) {
        this.f5166R = euu;
        aff aff = aff.R;
        this.f5167R = g4x.u(aH9.S(msU.a(aff, 0.0f, 0.0f, null, false, 65535), new cag(this, 2)), new cag(this, 0));
        this.v = cU5.N(aff, false, new V4(euu.f3120R.f2508R, 10, this));
        this.c = aff;
    }

    public static final boolean e(jyH jyh, long j, long j2) {
        iRR irr = jyh.f5166R.f3122R;
        if (irr == null) {
            return false;
        }
        int length = irr.f4590R.f4165R.R.length();
        int U = irr.U(j);
        int U2 = irr.U(j2);
        int i = length - 1;
        return (U >= i && U2 >= i) || (U < 0 && U2 < 0);
    }

    @Override // defpackage.ddq
    public final void R() {
        this.f5166R.getClass();
    }

    public final void X(dgv dgv) {
        ncu ncu;
        if (dgv != null) {
            eod eod = new eod(this, dgv);
            this.f5168R = eod;
            ncu = lCG.R(aff.R, eod, new hHb(this, null));
        } else {
            ncu = aff.R;
        }
        this.c = ncu;
    }

    @Override // defpackage.ddq
    public final void c() {
        this.f5166R.getClass();
    }

    @Override // defpackage.ddq
    public final void v() {
    }
}
