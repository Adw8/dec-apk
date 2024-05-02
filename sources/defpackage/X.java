package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X  reason: default package */
/* loaded from: classes.dex */
public final class X extends O {
    public static final Y R = new Y(2, 9, X.class);

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f614R;
    public final int e;

    public X(long j) {
        this.f614R = BigInteger.valueOf(j).toByteArray();
        this.e = 0;
    }

    public X(BigInteger bigInteger) {
        this.f614R = bigInteger.toByteArray();
        this.e = 0;
    }

    public X(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        boolean z = true;
        if (length != 0 && (length == 1 || bArr[0] != (bArr[1] >> 7) || a8w.v("org.bouncycastle.asn1.allow_unsafe_integer"))) {
            z = false;
        }
        if (!z) {
            this.f614R = bArr;
            int length2 = bArr.length - 1;
            while (i < length2) {
                int i2 = i + 1;
                if (bArr[i] != (bArr[i2] >> 7)) {
                    break;
                }
                i = i2;
            }
            this.e = i;
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    public static X n(Object obj) {
        if (obj == null || (obj instanceof X)) {
            return (X) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (X) R.X((byte[]) obj);
            } catch (Exception e) {
                StringBuilder U = opT.U("encoding error in getInstance: ");
                U.append(e.toString());
                throw new IllegalArgumentException(U.toString());
            }
        } else {
            StringBuilder U2 = opT.U("illegal object in getInstance: ");
            U2.append(obj.getClass().getName());
            throw new IllegalArgumentException(U2.toString());
        }
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 2, this.f614R);
    }

    public final boolean Q(int i) {
        byte[] bArr = this.f614R;
        int length = bArr.length;
        int i2 = this.e;
        if (length - i2 <= 4) {
            int length2 = bArr.length;
            int max = Math.max(i2, length2 - 4);
            int i3 = bArr[max] & -1;
            while (true) {
                max++;
                if (max >= length2) {
                    break;
                }
                i3 = (i3 << 8) | (bArr[max] & 255);
            }
            if (i3 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.f614R.length, z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return mLz.L(this.f614R);
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof X)) {
            return false;
        }
        return Arrays.equals(this.f614R, ((X) o).f614R);
    }

    public final String toString() {
        return new BigInteger(this.f614R).toString();
    }
}
