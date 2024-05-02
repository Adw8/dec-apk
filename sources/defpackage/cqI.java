package defpackage;

/* renamed from: cqI  reason: default package */
/* loaded from: classes.dex */
public final class cqI {
    public final b1t R = new b1t();

    public final void R(Exception exc) {
        b1t b1t = this.R;
        synchronized (b1t.R) {
            if (!b1t.f1511R) {
                b1t.f1511R = true;
                b1t.e = exc;
                ((aAx) b1t.v).c(b1t);
            }
        }
    }

    public final void v(Object obj) {
        b1t b1t = this.R;
        synchronized (b1t.R) {
            if (!b1t.f1511R) {
                b1t.f1511R = true;
                b1t.c = obj;
                ((aAx) b1t.v).c(b1t);
            }
        }
    }
}
