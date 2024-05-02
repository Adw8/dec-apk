package defpackage;

/* renamed from: hm8  reason: default package */
/* loaded from: classes.dex */
public final class hm8 extends aux implements koj {
    public hm8(Class cls, String str, String str2, int i) {
        super(OV.R, cls, str, str2, i);
    }

    @Override // defpackage.h_P
    public final Object get(Object obj) {
        return yG().call();
    }

    @Override // defpackage.Z5
    public final goX v() {
        g8d.R.getClass();
        return this;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return get(obj);
    }

    @Override // defpackage.h_P
    public final gv7 yG() {
        goX R = R();
        if (R != this) {
            return ((hm8) ((koj) ((icv) R))).yG();
        }
        throw new bMv();
    }
}
