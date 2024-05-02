package defpackage;

import java.util.Arrays;

/* renamed from: hP2  reason: default package */
/* loaded from: classes.dex */
public final class hP2 extends O implements SF {
    public final byte[] R;

    public hP2(String str) {
        if (str != null) {
            this.R = aPR.v(str);
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 22, this.R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.R.length, z);
    }

    @Override // defpackage.SF
    public final String c() {
        return aPR.R(this.R);
    }

    /* renamed from: n */
    public final int hashCode() {
        return mLz.L(this.R);
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof hP2)) {
            return false;
        }
        return Arrays.equals(this.R, ((hP2) o).R);
    }

    public final String toString() {
        return c();
    }

    public hP2(byte[] bArr) {
        this.R = bArr;
    }
}
