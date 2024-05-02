package defpackage;

/* renamed from: lE  reason: default package */
/* loaded from: classes.dex */
public final class lE {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public Gp f5618R;

    /* renamed from: R  reason: collision with other field name */
    public jJj f5619R;

    /* renamed from: R  reason: collision with other field name */
    public mdz f5620R;

    public lE() {
        i4B i4b = msU.f6214R;
        mdz mdz = mdz.Ltr;
        aCo aco = new aCo();
        long j = nqW.v;
        this.f5619R = i4b;
        this.f5620R = mdz;
        this.f5618R = aco;
        this.R = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lE)) {
            return false;
        }
        lE lEVar = (lE) obj;
        return n3x.v(this.f5619R, lEVar.f5619R) && this.f5620R == lEVar.f5620R && n3x.v(this.f5618R, lEVar.f5618R) && nqW.R(this.R, lEVar.R);
    }

    public final int hashCode() {
        int hashCode = this.f5620R.hashCode();
        int hashCode2 = this.f5618R.hashCode();
        long j = this.R;
        int i = nqW.R;
        return Long.hashCode(j) + ((hashCode2 + ((hashCode + (this.f5619R.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("DrawParams(density=");
        U.append(this.f5619R);
        U.append(", layoutDirection=");
        U.append(this.f5620R);
        U.append(", canvas=");
        U.append(this.f5618R);
        U.append(", size=");
        U.append((Object) nqW.O(this.R));
        U.append(')');
        return U.toString();
    }
}
