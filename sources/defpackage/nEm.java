package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: nEm  reason: default package */
/* loaded from: classes.dex */
public final class nEm extends q {
    public byte[] R;

    public nEm(byte[] bArr) {
        this.R = bArr;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.R;
        }
        if (bArr != null) {
            zz.g(z, 48, bArr);
        } else {
            super.z().K(zz, z);
        }
    }

    @Override // defpackage.q
    public final b S(int i) {
        r();
        return super.f7346R[i];
    }

    @Override // defpackage.q
    public final _L T() {
        return ((q) z()).T();
    }

    @Override // defpackage.q
    public final e W() {
        return ((q) z()).W();
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.R;
        }
        return bArr != null ? Zz.x(bArr.length, z) : super.z().Y(z);
    }

    @Override // defpackage.q
    public final Enumeration d() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.R;
        }
        return bArr != null ? new nX7(bArr) : new k(this);
    }

    @Override // defpackage.q, defpackage.O, defpackage.t
    public final int hashCode() {
        r();
        return super.hashCode();
    }

    @Override // defpackage.q, java.lang.Iterable
    public final Iterator iterator() {
        r();
        return super.iterator();
    }

    public final synchronized void r() {
        W w;
        if (this.R != null) {
            N n = new N(this.R);
            try {
                O Z = n.Z();
                if (Z == null) {
                    w = new W(0);
                } else {
                    W w2 = new W();
                    do {
                        w2.R(Z);
                        Z = n.Z();
                    } while (Z != null);
                    w = w2;
                }
                n.close();
                super.f7346R = w.e();
                this.R = null;
            } catch (IOException e) {
                throw new _(0, "malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // defpackage.q
    public final F s() {
        return ((q) z()).s();
    }

    @Override // defpackage.q
    public final int size() {
        r();
        return super.f7346R.length;
    }

    @Override // defpackage.q, defpackage.O
    public final O u() {
        r();
        return super.u();
    }

    @Override // defpackage.q, defpackage.O
    public final O z() {
        r();
        return super.z();
    }
}
