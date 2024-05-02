package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: F  reason: default package */
/* loaded from: classes.dex */
public abstract class F extends O implements A {
    public static final Y R = new Y(4, 14, F.class);
    public static final byte[] v = new byte[0];

    /* renamed from: R  reason: collision with other field name */
    public byte[] f112R;

    public F(byte[] bArr) {
        if (bArr != null) {
            this.f112R = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public static F n(Object obj) {
        if (obj == null || (obj instanceof F)) {
            return (F) obj;
        }
        if (obj instanceof b) {
            O v2 = ((b) obj).v();
            if (v2 instanceof F) {
                return (F) v2;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (F) R.X((byte[]) obj);
            } catch (IOException e) {
                StringBuilder U = opT.U("failed to construct OCTET STRING from byte[]: ");
                U.append(e.getMessage());
                throw new IllegalArgumentException(U.toString());
            }
        }
        StringBuilder U2 = opT.U("illegal object in getInstance: ");
        U2.append(obj.getClass().getName());
        throw new IllegalArgumentException(U2.toString());
    }

    @Override // defpackage.A
    public final InputStream C() {
        return new ByteArrayInputStream(this.f112R);
    }

    @Override // defpackage.fXm
    public final O P() {
        return this;
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return mLz.L(this.f112R);
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof F)) {
            return false;
        }
        return Arrays.equals(this.f112R, ((F) o).f112R);
    }

    public final String toString() {
        StringBuilder U = opT.U("#");
        byte[] bArr = this.f112R;
        mF9 mf9 = kPv.R;
        U.append(aPR.R(kPv.R(bArr, bArr.length)));
        return U.toString();
    }

    @Override // defpackage.O
    public O u() {
        return new nP9(this.f112R);
    }

    @Override // defpackage.O
    public O z() {
        return new nP9(this.f112R);
    }
}
