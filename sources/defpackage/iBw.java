package defpackage;

/* renamed from: iBw  reason: default package */
/* loaded from: classes.dex */
public final class iBw implements aOO {
    public static final iBw R = new iBw();

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.aOO
    public final nbD v() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
