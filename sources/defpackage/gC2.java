package defpackage;

/* renamed from: gC2  reason: default package */
/* loaded from: classes.dex */
public final class gC2 extends jJG {
    public Object R;

    public gC2(Object obj) {
        this.R = obj;
    }

    @Override // defpackage.jJG
    public final void R(jJG jjg) {
        this.R = ((gC2) jjg).R;
    }

    @Override // defpackage.jJG
    public final jJG v() {
        return new gC2(this.R);
    }
}
