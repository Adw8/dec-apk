package defpackage;

import java.util.Arrays;

/* renamed from: l  reason: default package */
/* loaded from: classes.dex */
public final class l extends O {
    public static final l[] R = new l[12];

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f5539R;

    public l(boolean z, byte[] bArr) {
        Y y = X.R;
        int length = bArr.length;
        boolean z2 = true;
        int i = 0;
        if (length != 0 && (length == 1 || bArr[0] != (bArr[1] >> 7) || a8w.v("org.bouncycastle.asn1.allow_unsafe_integer"))) {
            z2 = false;
        }
        if (z2) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.f5539R = z ? mLz.e(bArr) : bArr;
            int length2 = bArr.length - 1;
            while (i < length2) {
                byte b = bArr[i];
                i++;
                if (b != (bArr[i] >> 7)) {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 10, this.f5539R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.f5539R.length, z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return mLz.L(this.f5539R);
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof l)) {
            return false;
        }
        return Arrays.equals(this.f5539R, ((l) o).f5539R);
    }
}
