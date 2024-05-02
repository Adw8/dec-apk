package defpackage;

import java.io.IOException;

/* renamed from: P  reason: default package */
/* loaded from: classes.dex */
public final class P extends IOException {
    public Throwable R;

    public P(String str) {
        super(str);
    }

    public P(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.R = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.R;
    }
}
