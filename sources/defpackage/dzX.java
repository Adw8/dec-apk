package defpackage;

import android.view.DisplayCutout;

/* renamed from: dzX  reason: default package */
/* loaded from: classes.dex */
public final class dzX {
    public final DisplayCutout R;

    public dzX(DisplayCutout displayCutout) {
        this.R = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dzX.class != obj.getClass()) {
            return false;
        }
        return cTo.R(this.R, ((dzX) obj).R);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.R;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("DisplayCutoutCompat{");
        U.append(this.R);
        U.append("}");
        return U.toString();
    }
}
