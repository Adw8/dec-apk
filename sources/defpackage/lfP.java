package defpackage;

import java.util.Arrays;

/* renamed from: lfP  reason: default package */
/* loaded from: classes.dex */
public final class lfP extends O implements SF {
    public final byte[] R;

    static {
        new Y(25, 7, lfP.class);
    }

    public lfP(byte[] bArr) {
        if (bArr != null) {
            this.R = bArr;
            return;
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 25, this.R);
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
        if (!(o instanceof lfP)) {
            return false;
        }
        return Arrays.equals(this.R, ((lfP) o).R);
    }
}
