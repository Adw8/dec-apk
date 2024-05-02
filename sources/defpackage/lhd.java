package defpackage;

import java.util.Arrays;

/* renamed from: lhd  reason: default package */
/* loaded from: classes.dex */
public final class lhd extends O implements SF {
    public final byte[] R;

    public lhd(byte[] bArr) {
        this.R = bArr;
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 26, this.R);
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
        if (!(o instanceof lhd)) {
            return false;
        }
        return Arrays.equals(this.R, ((lhd) o).R);
    }

    public final String toString() {
        return c();
    }
}
