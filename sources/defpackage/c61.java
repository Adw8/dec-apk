package defpackage;

/* renamed from: c61  reason: default package */
/* loaded from: classes.dex */
public final class c61 extends vd {
    public final Throwable R;

    public c61(Throwable th) {
        this.R = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.R.getMessage());
    }
}
