package defpackage;

/* renamed from: _  reason: default package */
/* loaded from: classes.dex */
public final class _ extends IllegalStateException {
    public Throwable R;
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _(int i, String str, Exception exc) {
        super(str);
        this.e = i;
        this.R = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.e) {
            case 0:
                return this.R;
            case 1:
                return this.R;
            default:
                return this.R;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _(String str) {
        super(str);
        this.e = 0;
    }
}
