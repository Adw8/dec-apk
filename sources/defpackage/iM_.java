package defpackage;

import java.util.Arrays;

/* renamed from: iM_  reason: default package */
/* loaded from: classes.dex */
public final class iM_ extends O implements SF {
    public final byte[] R;

    public iM_(byte[] bArr) {
        this.R = bArr;
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 21, this.R);
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
        if (!(o instanceof iM_)) {
            return false;
        }
        return Arrays.equals(this.R, ((iM_) o).R);
    }
}
