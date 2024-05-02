package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: iFq  reason: default package */
/* loaded from: classes.dex */
public final class iFq extends Exception {
    public Throwable R;

    public iFq(String str, GeneralSecurityException generalSecurityException) {
        super(str);
        this.R = generalSecurityException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.R;
    }
}
