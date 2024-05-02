package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: KZ  reason: default package */
/* loaded from: classes.dex */
public abstract class KZ extends a7C {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(KZ.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = me6.f6098R;

    @Override // defpackage.a7C
    public final Object R(Object obj) {
        Object obj2 = this._consensus;
        lmI lmi = me6.f6098R;
        if (obj2 == lmi) {
            obj2 = c(obj);
            Object obj3 = this._consensus;
            if (obj3 != lmi) {
                obj2 = obj3;
            } else if (!R.compareAndSet(this, lmi, obj2)) {
                obj2 = this._consensus;
            }
        }
        v(obj, obj2);
        return obj2;
    }

    public abstract lmI c(Object obj);

    public abstract void v(Object obj, Object obj2);
}
