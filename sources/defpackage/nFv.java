package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: nFv  reason: default package */
/* loaded from: classes.dex */
public final class nFv implements jfq {
    public final float R;

    public nFv(float f) {
        this.R = f;
    }

    @Override // defpackage.jfq
    public final float R(RectF rectF) {
        return rectF.height() * this.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nFv) && this.R == ((nFv) obj).R;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.R)});
    }
}
