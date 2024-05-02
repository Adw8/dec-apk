package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: _L  reason: default package */
/* loaded from: classes.dex */
public abstract class _L extends O implements Iterable {
    public static final Y R = new Y(17, 18, _L.class);

    /* renamed from: R  reason: collision with other field name */
    public final boolean f695R;

    /* renamed from: R  reason: collision with other field name */
    public final b[] f696R;

    public _L() {
        this.f696R = W.v;
        this.f695R = true;
    }

    public _L(W w) {
        if (w != null) {
            boolean z = false;
            b[] e = w.e();
            this.f696R = e;
            this.f695R = e.length < 2 ? true : z;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public _L(iuV iuv) {
        this.f696R = new b[]{iuv};
        this.f695R = true;
    }

    public _L(boolean z, b[] bVarArr) {
        this.f696R = bVarArr;
        this.f695R = z || bVarArr.length < 2;
    }

    public static void A(b[] bVarArr) {
        int length = bVarArr.length;
        if (length >= 2) {
            b bVar = bVarArr[0];
            b bVar2 = bVarArr[1];
            byte[] n = n(bVar);
            byte[] n2 = n(bVar2);
            if (Q(n2, n)) {
                bVar2 = bVar;
                bVar = bVar2;
            } else {
                n2 = n;
                n = n2;
            }
            for (int i = 2; i < length; i++) {
                b bVar3 = bVarArr[i];
                byte[] n3 = n(bVar3);
                if (Q(n, n3)) {
                    bVarArr[i - 2] = bVar;
                    bVar = bVar2;
                    n2 = n;
                    bVar2 = bVar3;
                    n = n3;
                } else if (Q(n2, n3)) {
                    bVarArr[i - 2] = bVar;
                    bVar = bVar3;
                    n2 = n3;
                } else {
                    int i2 = i - 1;
                    while (true) {
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        b bVar4 = bVarArr[i2 - 1];
                        if (Q(n(bVar4), n3)) {
                            break;
                        }
                        bVarArr[i2] = bVar4;
                    }
                    bVarArr[i2] = bVar3;
                }
            }
            bVarArr[length - 2] = bVar;
            bVarArr[length - 1] = bVar2;
        }
    }

    public static boolean Q(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & -33;
        int i2 = bArr2[0] & -33;
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    public static byte[] n(b bVar) {
        try {
            return bVar.v().V();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    @Override // defpackage.O
    public final boolean J() {
        return true;
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        int length = this.f696R.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f696R[length].v().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zJ(W.v(this.f696R));
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof _L)) {
            return false;
        }
        _L _l = (_L) o;
        int length = this.f696R.length;
        if (_l.f696R.length != length) {
            return false;
        }
        lme lme = (lme) u();
        lme lme2 = (lme) _l.u();
        for (int i = 0; i < length; i++) {
            O v = ((_L) lme).f696R[i].v();
            O v2 = ((_L) lme2).f696R[i].v();
            if (!(v == v2 || v.o(v2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Object
    public final String toString() {
        int length = this.f696R.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f696R[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // defpackage.O
    public O u() {
        boolean z = this.f695R;
        b[] bVarArr = this.f696R;
        if (!z) {
            bVarArr = (b[]) bVarArr.clone();
            A(bVarArr);
        }
        return new lme(bVarArr, 0);
    }

    @Override // defpackage.O
    public O z() {
        return new cza(this.f695R, this.f696R);
    }

    public _L(b[] bVarArr) {
        int length = bVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (bVarArr[i] == null) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            b[] v = W.v(bVarArr);
            if (v.length >= 2) {
                A(v);
            }
            this.f696R = v;
            this.f695R = true;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
