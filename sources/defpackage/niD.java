package defpackage;

import java.util.Arrays;

/* renamed from: niD  reason: default package */
/* loaded from: classes.dex */
public final class niD extends O implements SF {
    public final byte[] R;

    public niD(byte[] bArr) {
        this.R = bArr;
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 20, this.R);
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
        if (!(o instanceof niD)) {
            return false;
        }
        return Arrays.equals(this.R, ((niD) o).R);
    }

    public final String toString() {
        return c();
    }
}
