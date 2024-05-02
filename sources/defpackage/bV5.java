package defpackage;

import java.io.Serializable;

/* renamed from: bV5  reason: default package */
/* loaded from: classes.dex */
public final class bV5 implements cwX, Serializable {
    public f_c R;

    /* renamed from: R  reason: collision with other field name */
    public volatile Object f1702R = ppN.H;
    public final Object v = this;

    public bV5(f_c f_c) {
        this.R = f_c;
    }

    @Override // defpackage.cwX
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f1702R;
        ppN ppn = ppN.H;
        if (obj2 != ppn) {
            return obj2;
        }
        synchronized (this.v) {
            obj = this.f1702R;
            if (obj == ppn) {
                obj = this.R.g();
                this.f1702R = obj;
                this.R = null;
            }
        }
        return obj;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.f1702R != ppN.H ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
