package defpackage;

/* renamed from: B9  reason: default package */
/* loaded from: classes.dex */
public final class B9 extends Throwable {
    public B9() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
