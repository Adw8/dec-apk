package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: q  reason: default package */
/* loaded from: classes.dex */
public abstract class q extends O implements Iterable {
    public static final Y R = new Y(16, 17, q.class);

    /* renamed from: R  reason: collision with other field name */
    public b[] f7346R;

    public q() {
        this.f7346R = W.v;
    }

    public q(W w) {
        if (w != null) {
            this.f7346R = w.e();
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public q(b bVar) {
        if (bVar != null) {
            this.f7346R = new b[]{bVar};
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public q(b[] bVarArr) {
        boolean z = true;
        if (bVarArr != null) {
            int length = bVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (bVarArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            this.f7346R = W.v(bVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public q(b[] bVarArr, int i) {
        this.f7346R = bVarArr;
    }

    public static q A(Object obj) {
        if (obj == null || (obj instanceof q)) {
            return (q) obj;
        }
        if (obj instanceof b) {
            O v = ((b) obj).v();
            if (v instanceof q) {
                return (q) v;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (q) R.X((byte[]) obj);
            } catch (IOException e) {
                StringBuilder U = opT.U("failed to construct sequence from byte[]: ");
                U.append(e.getMessage());
                throw new IllegalArgumentException(U.toString());
            }
        }
        StringBuilder U2 = opT.U("unknown object in getInstance: ");
        U2.append(obj.getClass().getName());
        throw new IllegalArgumentException(U2.toString());
    }

    @Override // defpackage.O
    public final boolean J() {
        return true;
    }

    public final F[] Q() {
        int size = size();
        F[] fArr = new F[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = F.n(this.f7346R[i]);
        }
        return fArr;
    }

    public b S(int i) {
        return this.f7346R[i];
    }

    public abstract _L T();

    public abstract e W();

    public Enumeration d() {
        return new k(this);
    }

    @Override // defpackage.O, defpackage.t
    public int hashCode() {
        int length = this.f7346R.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f7346R[length].v().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new zJ(this.f7346R);
    }

    public final e[] n() {
        int size = size();
        e[] eVarArr = new e[size];
        for (int i = 0; i < size; i++) {
            eVarArr[i] = e.Q(this.f7346R[i]);
        }
        return eVarArr;
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof q)) {
            return false;
        }
        q qVar = (q) o;
        int size = size();
        if (qVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            O v = this.f7346R[i].v();
            O v2 = qVar.f7346R[i].v();
            if (!(v == v2 || v.o(v2))) {
                return false;
            }
        }
        return true;
    }

    public abstract F s();

    public int size() {
        return this.f7346R.length;
    }

    @Override // java.lang.Object
    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f7346R[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // defpackage.O
    public O u() {
        return new iuV(this.f7346R, 0);
    }

    @Override // defpackage.O
    public O z() {
        return new fSU(this.f7346R);
    }
}
