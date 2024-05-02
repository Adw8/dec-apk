package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: b0  reason: default package */
/* loaded from: classes.dex */
public abstract class b0 implements Iterable, Serializable {
    public static final CN R;

    /* renamed from: R  reason: collision with other field name */
    public static final MH f1499R = new MH(ibk.f4663R);
    public int e = 0;

    static {
        R = Om.R() ? new CN(1, 0) : new CN(0, 0);
    }

    public static MH H(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = i + i2;
        v(i, i3, bArr.length);
        switch (R.R) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i, i3);
                break;
            default:
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                bArr2 = bArr3;
                break;
        }
        return new MH(bArr2);
    }

    public static MH c(byte[] bArr) {
        return H(bArr, 0, bArr.length);
    }

    public static int v(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(opT.m("Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(jQ.U("Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(jQ.U("End index: ", i2, " >= ", i3));
        }
    }

    public abstract void C(int i, byte[] bArr);

    public abstract byte P(int i);

    public abstract byte R(int i);

    @Override // java.lang.Object
    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int size = size();
            MH mh = (MH) this;
            byte[] bArr = mh.R;
            int V = mh.V() + 0;
            int i2 = size;
            for (int i3 = V; i3 < V + size; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.e = i;
        }
        return i;
    }

    public final String i() {
        Charset charset = ibk.v;
        if (size() == 0) {
            return "";
        }
        MH mh = (MH) this;
        return new String(mh.R, mh.V(), mh.size(), charset);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Th(this);
    }

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return ibk.f4663R;
        }
        byte[] bArr = new byte[size];
        C(size, bArr);
        return bArr;
    }

    @Override // java.lang.Object
    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = iWF.p(this);
        } else {
            StringBuilder sb = new StringBuilder();
            MH mh = (MH) this;
            int v = v(0, 47, mh.size());
            sb.append(iWF.p(v == 0 ? f1499R : new Kn(mh.R, mh.V() + 0, v)));
            sb.append("...");
            str = sb.toString();
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
