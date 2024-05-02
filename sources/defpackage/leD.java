package defpackage;

/* renamed from: leD  reason: default package */
/* loaded from: classes.dex */
public final class leD extends IllegalStateException {
    public final String R;

    public leD(String str) {
        this.R = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.R;
    }
}
