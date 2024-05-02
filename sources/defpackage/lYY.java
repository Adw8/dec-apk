package defpackage;

/* renamed from: lYY  reason: default package */
/* loaded from: classes.dex */
public final class lYY implements g4j {
    public final SD R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f5771R;

    public lYY(SD sd, kg9 kg9) {
        this.R = sd;
        this.f5771R = kg9;
    }

    @Override // defpackage.g4j
    public final void A(ohT oht) {
        this.R.f505R.R.x(oht);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lYY)) {
            return false;
        }
        lYY lyy = (lYY) obj;
        return n3x.v(this.R, lyy.R) && n3x.v(this.f5771R, lyy.f5771R);
    }

    public final int hashCode() {
        return this.f5771R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("DrawContentCacheModifier(cacheDrawScope=");
        U.append(this.R);
        U.append(", onBuildDrawCache=");
        U.append(this.f5771R);
        U.append(')');
        return U.toString();
    }
}
