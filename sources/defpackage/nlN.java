package defpackage;

/* renamed from: nlN  reason: default package */
/* loaded from: classes.dex */
public final class nlN {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final deI f6573R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f6574R;

    /* renamed from: R  reason: collision with other field name */
    public final lIe f6575R;
    public final int v;

    public nlN(deI dei, lIe lie, int i, int i2, Object obj) {
        this.f6573R = dei;
        this.f6575R = lie;
        this.R = i;
        this.v = i2;
        this.f6574R = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlN)) {
            return false;
        }
        nlN nln = (nlN) obj;
        if (!n3x.v(this.f6573R, nln.f6573R) || !n3x.v(this.f6575R, nln.f6575R)) {
            return false;
        }
        if (!(this.R == nln.R)) {
            return false;
        }
        return (this.v == nln.v) && n3x.v(this.f6574R, nln.f6574R);
    }

    public final int hashCode() {
        deI dei = this.f6573R;
        int i = 0;
        int e = opT.e(this.v, opT.e(this.R, (((dei == null ? 0 : dei.hashCode()) * 31) + this.f6575R.f5651e) * 31, 31), 31);
        Object obj = this.f6574R;
        if (obj != null) {
            i = obj.hashCode();
        }
        return e + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("TypefaceRequest(fontFamily=");
        U.append(this.f6573R);
        U.append(", fontWeight=");
        U.append(this.f6575R);
        U.append(", fontStyle=");
        U.append((Object) ned.R(this.R));
        U.append(", fontSynthesis=");
        U.append((Object) hqI.R(this.v));
        U.append(", resourceLoaderCacheKey=");
        U.append(this.f6574R);
        U.append(')');
        return U.toString();
    }
}
