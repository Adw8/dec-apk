package defpackage;

/* renamed from: nUb  reason: default package */
/* loaded from: classes.dex */
public final class nUb extends jJG {
    public oOh R;
    public int v;

    public nUb(oOh ooh) {
        this.R = ooh;
    }

    @Override // defpackage.jJG
    public final void R(jJG jjg) {
        synchronized (nIH.R) {
            this.R = ((nUb) jjg).R;
            this.v = ((nUb) jjg).v;
        }
    }

    @Override // defpackage.jJG
    public final jJG v() {
        return new nUb(this.R);
    }
}
