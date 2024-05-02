package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: lkt  reason: default package */
/* loaded from: classes.dex */
public abstract class lkt {
    public int R() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            p12 p12 = new p12(stringWriter);
            p12.f7054R = true;
            n0h.R.Z(p12, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final jRo v() {
        if (this instanceof jRo) {
            return (jRo) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }
}
