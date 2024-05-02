package defpackage;

/* renamed from: eod  reason: default package */
/* loaded from: classes.dex */
public final class eod implements ojR {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jyH f3203R;
    public long v;

    public eod(jyH jyh, dgv dgv) {
        this.f3203R = jyh;
        int i = aWo.R;
        long j = aWo.v;
        this.R = j;
        this.v = j;
    }

    @Override // defpackage.ojR
    public final void R() {
    }

    @Override // defpackage.ojR
    public final void X(long j) {
        jyH jyh = this.f3203R;
        hjM hjm = jyh.f5166R.f3121R;
        if (hjm != null && hjm.p() && mQg.R(null, jyh.f5166R.R)) {
            long L = aWo.L(this.v, j);
            this.v = L;
            if (!jyH.e(jyh, this.R, aWo.L(this.R, L))) {
                throw null;
            }
        }
    }

    @Override // defpackage.ojR
    public final void c() {
    }

    @Override // defpackage.ojR
    public final void e() {
        if (mQg.R(null, this.f3203R.f5166R.R)) {
            throw null;
        }
    }

    @Override // defpackage.ojR
    public final void onCancel() {
        if (mQg.R(null, this.f3203R.f5166R.R)) {
            throw null;
        }
    }

    @Override // defpackage.ojR
    public final void v(long j) {
        jyH jyh = this.f3203R;
        hjM hjm = jyh.f5166R.f3121R;
        if (hjm != null) {
            if (hjm.p()) {
                if (jyH.e(jyh, j, j)) {
                    long j2 = jyh.f5166R.R;
                    throw null;
                }
                throw null;
            }
        } else if (mQg.R(null, this.f3203R.f5166R.R)) {
            this.v = aWo.v;
        }
    }
}
