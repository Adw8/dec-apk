package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: h53  reason: default package */
/* loaded from: classes.dex */
public final class h53 extends CancellationException {
    public final transient pd2 R;

    public h53(String str, Throwable th, pd2 pd2) {
        super(str);
        this.R = pd2;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h53) {
                h53 h53 = (h53) obj;
                if (!n3x.v(h53.getMessage(), getMessage()) || !n3x.v(h53.R, this.R) || !n3x.v(h53.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = (this.R.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable, java.lang.Object
    public final String toString() {
        return super.toString() + "; job=" + this.R;
    }
}
