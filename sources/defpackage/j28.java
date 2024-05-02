package defpackage;

/* renamed from: j28  reason: default package */
/* loaded from: classes.dex */
public abstract class j28 implements kTd {
    public j28 R = this;

    /* renamed from: R  reason: collision with other field name */
    public poS f4791R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4792R;
    public int X;
    public j28 c;
    public int e;
    public j28 v;

    public void L() {
    }

    public void O() {
    }

    public final void X() {
        if (this.f4792R) {
            if (this.f4791R != null) {
                L();
                this.f4792R = false;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
