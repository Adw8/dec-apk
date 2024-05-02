package defpackage;

/* renamed from: blF  reason: default package */
/* loaded from: classes.dex */
public final class blF {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public biT f1805R;

    /* renamed from: R  reason: collision with other field name */
    public j28 f1806R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jal f1807R;
    public biT v;

    public blF(jal jal, j28 j28, int i, biT bit, biT bit2) {
        this.f1807R = jal;
        this.f1806R = j28;
        this.R = i;
        this.f1805R = bit;
        this.v = bit2;
    }

    public final void R(int i, int i2) {
        j28 j28 = this.f1806R;
        this.f1807R.getClass();
        e7 e7Var = new e7((eo1) this.v.f1772R[i2]);
        j28 j282 = j28.v;
        if (j282 != null) {
            j282.c = e7Var;
            ((j28) e7Var).v = j282;
        }
        j28.v = e7Var;
        e7Var.c = j28;
        this.f1806R = e7Var;
        gFQ gfq = (gFQ) this.f1807R.f4973R;
        if (gfq != null) {
            eo1 eo1 = (eo1) this.v.f1772R[i2];
            gfq.e();
        }
        int i3 = this.R;
        j28 j283 = this.f1806R;
        int i4 = i3 | j283.e;
        this.R = i4;
        j283.X = i4;
    }

    public final void v(int i) {
        this.f1806R = this.f1806R.v;
        gFQ gfq = (gFQ) this.f1807R.f4973R;
        if (gfq != null) {
            eo1 eo1 = (eo1) this.f1805R.f1772R[i];
            gfq.v();
        }
        jal jal = this.f1807R;
        j28 j28 = this.f1806R;
        jal.getClass();
        if (j28.f4792R) {
            j28.X();
        }
        j28 j282 = j28.c;
        j28 j283 = j28.v;
        if (j282 != null) {
            j282.v = j283;
            j28.c = null;
        }
        if (j283 != null) {
            j283.c = j282;
            j28.v = null;
        }
        this.f1806R = j282;
    }
}
