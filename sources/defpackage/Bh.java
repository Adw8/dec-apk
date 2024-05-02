package defpackage;

/* renamed from: Bh  reason: default package */
/* loaded from: classes.dex */
public final class Bh {

    /* renamed from: R  reason: collision with other field name */
    public aCQ f37R = null;

    /* renamed from: R  reason: collision with other field name */
    public Gp f36R = null;
    public FC R = null;

    /* renamed from: R  reason: collision with other field name */
    public cnO f38R = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bh)) {
            return false;
        }
        Bh bh = (Bh) obj;
        return n3x.v(this.f37R, bh.f37R) && n3x.v(this.f36R, bh.f36R) && n3x.v(this.R, bh.R) && n3x.v(this.f38R, bh.f38R);
    }

    public final int hashCode() {
        aCQ acq = this.f37R;
        int i = 0;
        int hashCode = (acq == null ? 0 : acq.hashCode()) * 31;
        Gp gp = this.f36R;
        int hashCode2 = (hashCode + (gp == null ? 0 : gp.hashCode())) * 31;
        FC fc = this.R;
        int hashCode3 = (hashCode2 + (fc == null ? 0 : fc.hashCode())) * 31;
        cnO cno = this.f38R;
        if (cno != null) {
            i = cno.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("BorderCache(imageBitmap=");
        U.append(this.f37R);
        U.append(", canvas=");
        U.append(this.f36R);
        U.append(", canvasDrawScope=");
        U.append(this.R);
        U.append(", borderPath=");
        U.append(this.f38R);
        U.append(')');
        return U.toString();
    }
}
