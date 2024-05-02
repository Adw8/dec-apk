package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: gB5  reason: default package */
/* loaded from: classes.dex */
public final class gB5 extends OutputStream {
    public Signature R;

    public gB5(Signature signature) {
        this.R = signature;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        try {
            this.R.update((byte) i);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        try {
            this.R.update(bArr);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.R.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }
}
