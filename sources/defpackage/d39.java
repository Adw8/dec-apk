package defpackage;

/* renamed from: d39  reason: default package */
/* loaded from: classes.dex */
public final class d39 extends jJG {
    public g2d R;
    public int v;

    public d39(g2d g2d) {
        this.R = g2d;
    }

    @Override // defpackage.jJG
    public final void R(jJG jjg) {
        d39 d39 = (d39) jjg;
        synchronized (fk4.R) {
            this.R = d39.R;
            this.v = d39.v;
        }
    }

    @Override // defpackage.jJG
    public final jJG v() {
        return new d39(this.R);
    }
}
