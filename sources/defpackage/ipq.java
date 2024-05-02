package defpackage;

/* renamed from: ipq  reason: default package */
/* loaded from: classes.dex */
public final class ipq implements nKE {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4740R;
    public final float v;

    public ipq(float f, float f2, Object obj) {
        this.R = f;
        this.v = f2;
        this.f4740R = obj;
    }

    @Override // defpackage.jM
    public final iHW c(oHg ohg) {
        float f = this.R;
        float f2 = this.v;
        Object obj = this.f4740R;
        return new m7f(f, f2, obj == null ? null : (Pc) ohg.R.x(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ipq) {
            ipq ipq = (ipq) obj;
            if (ipq.R == this.R) {
                if ((ipq.v == this.v) && n3x.v(ipq.f4740R, this.f4740R)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4740R;
        return Float.hashCode(this.v) + jQ.c(this.R, (obj == null ? 0 : obj.hashCode()) * 31, 31);
    }

    public /* synthetic */ ipq(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
