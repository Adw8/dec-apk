package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ovT  reason: default package */
/* loaded from: classes.dex */
public final class ovT implements cwX, Serializable {
    public static final AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(ovT.class, Object.class, "R");

    /* renamed from: R  reason: collision with other field name */
    public volatile f_c f7018R;

    /* renamed from: R  reason: collision with other field name */
    public volatile Object f7019R = ppN.H;

    public ovT(f_c f_c) {
        this.f7018R = f_c;
    }

    @Override // defpackage.cwX
    public final Object getValue() {
        Object obj = this.f7019R;
        ppN ppn = ppN.H;
        if (obj != ppn) {
            return obj;
        }
        f_c f_c = this.f7018R;
        if (f_c != null) {
            Object g = f_c.g();
            if (R.compareAndSet(this, ppn, g)) {
                this.f7018R = null;
                return g;
            }
        }
        return this.f7019R;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.f7019R != ppN.H ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
