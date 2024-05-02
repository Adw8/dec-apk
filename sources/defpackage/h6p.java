package defpackage;

/* renamed from: h6p  reason: default package */
/* loaded from: classes.dex */
public final class h6p implements aOO, k5j {
    public final aOO R;

    /* renamed from: R  reason: collision with other field name */
    public final nbD f4062R;

    public h6p(aOO aoo, nbD nbd) {
        this.R = aoo;
        this.f4062R = nbd;
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        this.R.Y(obj);
    }

    @Override // defpackage.k5j
    public final k5j i() {
        aOO aoo = this.R;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return this.f4062R;
    }
}
