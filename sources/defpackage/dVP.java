package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: dVP  reason: default package */
/* loaded from: classes.dex */
public final class dVP extends ByteArrayOutputStream {
    public dVP() {
        super(8193);
    }

    public final byte[] R() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
