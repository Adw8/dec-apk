package defpackage;

/* renamed from: aD4  reason: default package */
/* loaded from: classes.dex */
public final class aD4 {
    public final f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f793R;
    public final f_c v;

    public aD4(f_c f_c, f_c f_c2, boolean z) {
        this.R = f_c;
        this.v = f_c2;
        this.f793R = z;
    }

    public final String toString() {
        StringBuilder U = opT.U("ScrollAxisRange(value=");
        U.append(((Number) this.R.g()).floatValue());
        U.append(", maxValue=");
        U.append(((Number) this.v.g()).floatValue());
        U.append(", reverseScrolling=");
        U.append(this.f793R);
        U.append(')');
        return U.toString();
    }
}
