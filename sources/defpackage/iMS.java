package defpackage;

/* renamed from: iMS  reason: default package */
/* loaded from: classes.dex */
public final class iMS extends RuntimeException {
    public Object R;
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iMS(String str, Exception exc) {
        super(str);
        this.e = 3;
        this.R = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.e) {
            case 2:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.e) {
            case 3:
                return (Throwable) this.R;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        switch (this.e) {
            case 2:
                return ((nbD) this.R).toString();
            default:
                return super.getLocalizedMessage();
        }
    }

    public iMS(nbD nbd) {
        this.e = 2;
        this.R = nbd;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iMS() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.e = 0;
        this.R = null;
    }
}
