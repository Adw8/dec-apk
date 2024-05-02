package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: hVq  reason: default package */
/* loaded from: classes.dex */
public abstract class hVq extends d9C {
    public hVq(gWM gwm, WindowInsets windowInsets) {
        super(gwm, windowInsets);
    }

    @Override // defpackage.ibz
    public gWM R() {
        return gWM.Z(null, ((fhi) this).R.consumeDisplayCutout());
    }

    @Override // defpackage.ibz
    public dzX X() {
        DisplayCutout displayCutout = ((fhi) this).R.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new dzX(displayCutout);
    }

    @Override // defpackage.ibz
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hVq)) {
            return false;
        }
        hVq hvq = (hVq) obj;
        if (Objects.equals(((fhi) this).R, ((fhi) hvq).R)) {
            hvq.getClass();
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ibz
    public int hashCode() {
        return ((fhi) this).R.hashCode();
    }
}
