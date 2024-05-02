package defpackage;

/* renamed from: bvP  reason: default package */
/* loaded from: classes.dex */
public final class bvP {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public oUk f1858R;

    public bvP(Float f) {
        hiK hik = hiK.R;
        this.R = f;
        this.f1858R = hik;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvP) {
            bvP bvp = (bvP) obj;
            if (n3x.v(bvp.R, this.R) && n3x.v(bvp.f1858R, this.f1858R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.R;
        return this.f1858R.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
