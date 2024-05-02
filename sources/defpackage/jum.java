package defpackage;

/* renamed from: jum  reason: default package */
/* loaded from: classes.dex */
public final class jum {
    public Object R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f5111R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5112R;
    public final oST v;

    public jum(int i, int i2) {
        this.f5111R = l6.n(new hNA(i));
        this.v = l6.n(Integer.valueOf(i2));
    }

    public final void R(int i, int i2) {
        boolean z = true;
        if (((float) i) >= 0.0f) {
            if (i != ((hNA) this.f5111R.getValue()).R) {
                z = false;
            }
            if (!z) {
                this.f5111R.R(new hNA(i));
            }
            if (i2 != ((Number) this.v.getValue()).intValue()) {
                this.v.R(Integer.valueOf(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
