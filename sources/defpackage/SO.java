package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: SO  reason: default package */
/* loaded from: classes.dex */
public final class SO implements jfq {
    public final float R;

    public SO(float f) {
        this.R = f;
    }

    @Override // defpackage.jfq
    public final float R(RectF rectF) {
        return this.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SO) && this.R == ((SO) obj).R;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.R)});
    }
}
