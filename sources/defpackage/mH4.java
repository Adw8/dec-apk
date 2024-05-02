package defpackage;

import android.text.style.MetricAffectingSpan;

/* renamed from: mH4  reason: default package */
/* loaded from: classes.dex */
public final class mH4 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5999R;
    public final int v;

    public mH4(int i, int i2, MetricAffectingSpan metricAffectingSpan) {
        this.f5999R = metricAffectingSpan;
        this.R = i;
        this.v = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mH4)) {
            return false;
        }
        mH4 mh4 = (mH4) obj;
        return n3x.v(this.f5999R, mh4.f5999R) && this.R == mh4.R && this.v == mh4.v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + opT.e(this.R, this.f5999R.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("SpanRange(span=");
        U.append(this.f5999R);
        U.append(", start=");
        U.append(this.R);
        U.append(", end=");
        return jQ.P(U, this.v, ')');
    }
}
