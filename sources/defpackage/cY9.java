package defpackage;

import java.util.Arrays;

/* renamed from: cY9  reason: default package */
/* loaded from: classes.dex */
public final class cY9 {
    public final oST R;
    public final oST v;

    public cY9(float f, float[] fArr) {
        this.R = l6.n(Float.valueOf(f));
        this.v = l6.n(fArr);
    }

    public final float R() {
        return ((Number) this.R.getValue()).floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cY9)) {
            return false;
        }
        cY9 cy9 = (cY9) obj;
        return ((R() > cy9.R() ? 1 : (R() == cy9.R() ? 0 : -1)) == 0) && Arrays.equals((float[]) this.v.getValue(), (float[]) cy9.v.getValue());
    }

    public final int hashCode() {
        return Arrays.hashCode((float[]) this.v.getValue()) + (Float.hashCode(R()) * 31);
    }
}
