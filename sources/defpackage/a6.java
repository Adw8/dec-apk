package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: a6  reason: default package */
/* loaded from: classes.dex */
public abstract class a6 extends pdD {
    public static final int B(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static final pvc G(Iterator it) {
        pn pnVar = new pn(4, it);
        return pnVar instanceof nux ? pnVar : new nux(pnVar);
    }

    public static final pvc M(Object... objArr) {
        boolean z = true;
        if (objArr.length == 0) {
            return ac6.R;
        }
        if (objArr.length != 0) {
            z = false;
        }
        return z ? ac6.R : new pn(0, objArr);
    }

    public static final pvc l(Object obj, kg9 kg9) {
        return obj == null ? ac6.R : new k0v(new bBd(7, obj), kg9);
    }
}
