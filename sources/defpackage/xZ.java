package defpackage;

/* renamed from: xZ  reason: default package */
/* loaded from: classes.dex */
public abstract class xZ implements hdJ {
    public final e86 R;

    public xZ(e86 e86) {
        this.R = e86;
    }

    @Override // defpackage.nbD
    public nbD H(e86 e86) {
        return dTl.d(this, e86);
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.hdJ, defpackage.nbD
    public hdJ O(e86 e86) {
        return dTl.J(this, e86);
    }

    @Override // defpackage.hdJ
    public final e86 R() {
        return this.R;
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }
}
