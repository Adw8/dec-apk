package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e  reason: default package */
/* loaded from: classes.dex */
public abstract class e extends O implements SF, h {
    public static final Y R = new Y(3, 1, e.class);

    /* renamed from: R  reason: collision with other field name */
    public static final char[] f2931R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f2932R;

    public e(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            int length = bArr.length;
            byte[] bArr2 = new byte[length + 1];
            System.arraycopy(bArr, 0, bArr2, 1, length);
            bArr2[0] = (byte) i;
            this.f2932R = bArr2;
        }
    }

    public e(boolean z, byte[] bArr) {
        if (z) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            } else if (bArr.length >= 1) {
                int i = bArr[0] & 255;
                if (i > 0) {
                    if (bArr.length < 2) {
                        throw new IllegalArgumentException("zero length data with non-zero pad bits");
                    } else if (i > 7) {
                        throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                    }
                }
            } else {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
        }
        this.f2932R = bArr;
    }

    public static e Q(b bVar) {
        if (bVar == null || (bVar instanceof e)) {
            return (e) bVar;
        }
        O v = bVar.v();
        if (v instanceof e) {
            return (e) v;
        }
        StringBuilder U = opT.U("illegal object in getInstance: ");
        U.append(bVar.getClass().getName());
        throw new IllegalArgumentException(U.toString());
    }

    public static e n(byte[] bArr) {
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i > 7 || length < 2) {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
                byte b = bArr[length - 1];
                if (b != ((byte) ((255 << i) & b))) {
                    return new o7z(bArr);
                }
            }
            return new f9y(false, bArr);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    @Override // defpackage.h
    public final InputStream H() {
        byte[] bArr = this.f2932R;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // defpackage.fXm
    public final O P() {
        return this;
    }

    @Override // defpackage.h
    public final int R() {
        return this.f2932R[0] & 255;
    }

    @Override // defpackage.SF
    public final String c() {
        try {
            byte[] i = i();
            StringBuffer stringBuffer = new StringBuffer((i.length * 2) + 1);
            stringBuffer.append('#');
            for (int i2 = 0; i2 != i.length; i2++) {
                byte b = i[i2];
                char[] cArr = f2931R;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder U = opT.U("Internal error encoding BitString: ");
            U.append(e.getMessage());
            throw new _(0, U.toString(), e);
        }
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        byte[] bArr = this.f2932R;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int length = bArr.length - 1;
        byte b = (byte) (bArr[length] & (255 << (bArr[0] & 255)));
        if (bArr != null) {
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ bArr[0 + length];
            }
            i = i2;
        }
        return (i * 257) ^ b;
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof e)) {
            return false;
        }
        byte[] bArr = this.f2932R;
        byte[] bArr2 = ((e) o).f2932R;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    public final String toString() {
        return c();
    }

    @Override // defpackage.O
    public O u() {
        return new f9y(false, this.f2932R);
    }

    @Override // defpackage.O
    public O z() {
        return new o7z(this.f2932R);
    }
}
