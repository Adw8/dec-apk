package defpackage;

import java.io.InputStream;

/* renamed from: cKc  reason: default package */
/* loaded from: classes.dex */
public abstract class cKc extends InputStream {
    public final InputStream R;
    public int e;

    public cKc(InputStream inputStream, int i) {
        this.R = inputStream;
        this.e = i;
    }

    public final void R() {
        InputStream inputStream = this.R;
        if (inputStream instanceof bNV) {
            bNV bnv = (bNV) inputStream;
            bnv.v = true;
            bnv.c();
        }
    }
}
