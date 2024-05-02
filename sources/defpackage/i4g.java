package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: i4g  reason: default package */
/* loaded from: classes.dex */
public final class i4g implements h {
    public final gWT R;
    public int e = 0;

    public i4g(gWT gwt) {
        this.R = gwt;
    }

    @Override // defpackage.h
    public final InputStream H() {
        gWT gwt = this.R;
        int i = gwt.O;
        if (i >= 1) {
            int read = gwt.read();
            this.e = read;
            if (read > 0) {
                if (i < 2) {
                    throw new IllegalStateException("zero length data with non-zero pad bits");
                } else if (read > 7) {
                    throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
                }
            }
            return this.R;
        }
        throw new IllegalStateException("content octets cannot be empty");
    }

    @Override // defpackage.fXm
    public final O P() {
        return e.n(this.R.c());
    }

    @Override // defpackage.h
    public final int R() {
        return this.e;
    }

    @Override // defpackage.b
    public final O v() {
        try {
            return P();
        } catch (IOException e) {
            StringBuilder U = opT.U("IOException converting stream to byte array: ");
            U.append(e.getMessage());
            throw new _(0, U.toString(), e);
        }
    }
}
