package defpackage;

/* renamed from: oSW  reason: default package */
/* loaded from: classes.dex */
public final class oSW extends a1 {
    public final long R;

    public oSW(long j) {
        this.R = j;
    }

    @Override // defpackage.a1
    public final void R(float f, long j, gw gwVar) {
        long j2;
        gwVar.e(1.0f);
        if (!(f == 1.0f)) {
            long j3 = this.R;
            j2 = n3.v(j3, n3.e(j3) * f);
        } else {
            j2 = this.R;
        }
        gwVar.X(j2);
        if (gwVar.f3992R != null) {
            gwVar.f3992R = null;
            gwVar.f3991R.setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oSW) && n3.c(this.R, ((oSW) obj).R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(j);
    }

    public final String toString() {
        StringBuilder U = opT.U("SolidColor(value=");
        U.append((Object) n3.m(this.R));
        U.append(')');
        return U.toString();
    }
}
