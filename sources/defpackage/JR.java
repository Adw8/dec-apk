package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: JR  reason: default package */
/* loaded from: classes.dex */
public final class JR implements jfq {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final jfq f202R;

    public JR(float f, jfq jfq) {
        while (jfq instanceof JR) {
            jfq = ((JR) jfq).f202R;
            f += ((JR) jfq).R;
        }
        this.f202R = jfq;
        this.R = f;
    }

    @Override // defpackage.jfq
    public final float R(RectF rectF) {
        return Math.max(0.0f, this.f202R.R(rectF) + this.R);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JR)) {
            return false;
        }
        JR jr = (JR) obj;
        return this.f202R.equals(jr.f202R) && this.R == jr.R;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f202R, Float.valueOf(this.R)});
    }
}
