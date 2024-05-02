package defpackage;

/* renamed from: h4l  reason: default package */
/* loaded from: classes.dex */
public final class h4l extends KZ {
    public final c81 R;

    public h4l(c81 c81) {
        this.R = c81;
    }

    @Override // defpackage.KZ
    public final lmI c(Object obj) {
        hgO hgo = (hgO) obj;
        c81 c81 = this.R;
        if (c81.N() == c81) {
            return null;
        }
        return mxC.f6250v;
    }

    @Override // defpackage.KZ
    public final void v(Object obj, Object obj2) {
        hgO.R.compareAndSet((hgO) obj, this, obj2 == null ? mxC.v : this.R);
    }
}
