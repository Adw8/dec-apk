package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: nX7  reason: default package */
/* loaded from: classes.dex */
public final class nX7 implements Enumeration {
    public N R;

    /* renamed from: R  reason: collision with other field name */
    public O f6426R = R();

    public nX7(byte[] bArr) {
        this.R = new N(bArr);
    }

    public final O R() {
        try {
            return this.R.Z();
        } catch (IOException e) {
            throw new _(0, "malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f6426R != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        O o = this.f6426R;
        if (o != null) {
            this.f6426R = R();
            return o;
        }
        throw new NoSuchElementException();
    }
}
