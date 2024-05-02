package defpackage;

/* renamed from: y8  reason: default package */
/* loaded from: classes.dex */
public final class y8 implements o3t {
    public final long R;

    public y8(long j) {
        this.R = j;
        if (!(j != n3.O)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // defpackage.o3t
    public final a1 R() {
        return null;
    }

    @Override // defpackage.o3t
    public final long c() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8) && n3.c(this.R, ((y8) obj).R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(j);
    }

    public final String toString() {
        StringBuilder U = opT.U("ColorStyle(value=");
        U.append((Object) n3.m(this.R));
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.o3t
    public final float v() {
        return n3.e(this.R);
    }
}
