package defpackage;

/* renamed from: lia  reason: default package */
/* loaded from: classes.dex */
public final class lia implements hv5 {
    public final jLq[] R;

    public lia(jLq... jlqArr) {
        this.R = jlqArr;
    }

    @Override // defpackage.hv5
    public final kvj v(Class cls, o0y o0y) {
        jLq[] jlqArr = this.R;
        kvj kvj = null;
        for (jLq jlq : jlqArr) {
            if (n3x.v(jlq.R, cls)) {
                Object x = jlq.f4903R.x(o0y);
                kvj = x instanceof kvj ? (kvj) x : null;
            }
        }
        if (kvj != null) {
            return kvj;
        }
        StringBuilder U = opT.U("No initializer set for given class ");
        U.append(cls.getName());
        throw new IllegalArgumentException(U.toString());
    }
}
