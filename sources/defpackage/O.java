package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: O  reason: default package */
/* loaded from: classes.dex */
public abstract class O extends t {
    public static O I(byte[] bArr) {
        N n = new N(new ByteArrayInputStream(bArr), bArr.length, false);
        try {
            O Z = n.Z();
            if (n.available() == 0) {
                return Z;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract boolean J();

    public abstract void K(Zz zz, boolean z);

    public abstract int Y(boolean z);

    @Override // defpackage.t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && o(((b) obj).v());
    }

    public final boolean h(O o) {
        return this == o || o(o);
    }

    @Override // defpackage.t
    public abstract int hashCode();

    public abstract boolean o(O o);

    @Override // defpackage.t
    public final void t(OutputStream outputStream) {
        new fTU(outputStream).V(this);
    }

    public O u() {
        return this;
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        return this;
    }

    public O z() {
        return this;
    }
}
