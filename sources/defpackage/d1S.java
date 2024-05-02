package defpackage;

import java.util.Arrays;

/* renamed from: d1S  reason: default package */
/* loaded from: classes.dex */
public final class d1S extends O implements SF {
    public final byte[] R;

    public d1S(String str) {
        this.R = aPR.v(str);
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 19, this.R);
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
        if (!(o instanceof d1S)) {
            return false;
        }
        return Arrays.equals(this.R, ((d1S) o).R);
    }

    public final String toString() {
        return c();
    }

    public d1S(byte[] bArr) {
        this.R = bArr;
    }
}
