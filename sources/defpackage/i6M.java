package defpackage;

/* renamed from: i6M  reason: default package */
/* loaded from: classes.dex */
public final class i6M {
    public final fue R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4461R = l6.n(null);

    public i6M(fue fue) {
        this.R = fue;
    }

    public final bF9 R() {
        bF9 bf9 = (bF9) this.f4461R.getValue();
        if (bf9 != null) {
            return bf9;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }
}
