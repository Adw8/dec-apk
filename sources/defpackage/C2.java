package defpackage;

import java.io.Serializable;

/* renamed from: C2  reason: default package */
/* loaded from: classes.dex */
public abstract class C2 implements aOO, k5j, Serializable {
    public final aOO R;

    public C2(aOO aoo) {
        this.R = aoo;
    }

    public void L() {
    }

    public abstract Object O(Object obj);

    public aOO X(Object obj, aOO aoo) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: aOO */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aOO
    public final void Y(Object obj) {
        while (true) {
            C2 c2 = this;
            aOO aoo = c2.R;
            try {
                obj = c2.O(obj);
                if (obj == bGR.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new bvw(th);
            }
            c2.L();
            if (aoo instanceof C2) {
                this = aoo;
            } else {
                aoo.Y(obj);
                return;
            }
        }
    }

    @Override // defpackage.k5j
    public k5j i() {
        aOO aoo = this.R;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder U = opT.U("Continuation at ");
        U.append((Object) getClass().getName());
        return U.toString();
    }
}
