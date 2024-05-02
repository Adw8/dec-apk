package defpackage;

/* renamed from: hh4  reason: default package */
/* loaded from: classes.dex */
public final class hh4 {
    public final bz R;

    /* renamed from: R  reason: collision with other field name */
    public final c71 f4348R;

    public hh4(bz bzVar, c71 c71) {
        this.R = bzVar;
        this.f4348R = c71;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh4)) {
            return false;
        }
        hh4 hh4 = (hh4) obj;
        return n3x.v(this.R, hh4.R) && n3x.v(this.f4348R, hh4.f4348R);
    }

    public final int hashCode() {
        return this.f4348R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("TransformedText(text=");
        U.append((Object) this.R);
        U.append(", offsetMapping=");
        U.append(this.f4348R);
        U.append(')');
        return U.toString();
    }
}
