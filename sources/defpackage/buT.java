package defpackage;

import java.util.Set;

/* renamed from: buT  reason: default package */
/* loaded from: classes.dex */
public abstract class buT extends aux implements ltB {
    public buT(Object obj, Class cls) {
        super(obj, cls, "netPortForwards", "getNetPortForwards()Ljava/util/Set;", 0);
    }

    @Override // defpackage.f_c
    public final Object g() {
        doT dot = (doT) ((Z5) ((ghA) this)).f660R;
        return (Set) dot.e.v(dot, doT.v[2]);
    }

    @Override // defpackage.Z5
    public final goX v() {
        g8d.R.getClass();
        return this;
    }
}
