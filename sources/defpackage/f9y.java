package defpackage;

/* renamed from: f9y  reason: default package */
/* loaded from: classes.dex */
public final class f9y extends e {
    public f9y(boolean z, byte[] bArr) {
        super(z, bArr);
    }

    public f9y(byte[] bArr) {
        super(0, bArr);
    }

    public static f9y A(Vz vz) {
        if (128 == vz.X) {
            O v = vz.R.v();
            return v instanceof f9y ? S(v) : new f9y(true, F.n(v).f112R);
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public static f9y S(Object obj) {
        if (obj == null || (obj instanceof f9y)) {
            return (f9y) obj;
        }
        if (obj instanceof e) {
            return (f9y) ((e) obj).u();
        }
        if (obj instanceof byte[]) {
            try {
                return (f9y) ((e) O.I((byte[]) obj)).u();
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
        byte[] bArr = this.f2932R;
        int length = bArr.length - 1;
        byte b = bArr[length];
        byte b2 = (byte) ((255 << (bArr[0] & 255)) & b);
        if (b == b2) {
            zz.g(z, 3, bArr);
            return;
        }
        zz.i(3, z);
        zz.P(length + 1);
        zz.N(bArr, 0, length);
        zz.C(b2);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.f2932R.length, z);
    }

    @Override // defpackage.e, defpackage.O
    public final O u() {
        return this;
    }

    @Override // defpackage.e, defpackage.O
    public final O z() {
        return this;
    }
}
