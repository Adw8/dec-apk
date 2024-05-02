package defpackage;

import java.io.Serializable;

/* renamed from: iA3  reason: default package */
/* loaded from: classes.dex */
public final class iA3 implements cwX, Serializable {
    public f_c R;

    /* renamed from: R  reason: collision with other field name */
    public Object f4480R = ppN.H;

    public iA3(f_c f_c) {
        this.R = f_c;
    }

    @Override // defpackage.cwX
    public final Object getValue() {
        if (this.f4480R == ppN.H) {
            this.f4480R = this.R.g();
            this.R = null;
        }
        return this.f4480R;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.f4480R != ppN.H ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
