package defpackage;

import android.widget.Magnifier;

/* renamed from: jya  reason: default package */
/* loaded from: classes.dex */
public final class jya extends f30 {
    public jya(Magnifier magnifier) {
        super(magnifier);
    }

    @Override // defpackage.jUs
    public final void R(long j, long j2, float f) {
        if (!Float.isNaN(f)) {
            this.R.setZoom(f);
        }
        if (aH9.f(j2)) {
            this.R.show(aWo.e(j), aWo.X(j), aWo.e(j2), aWo.X(j2));
        } else {
            this.R.show(aWo.e(j), aWo.X(j));
        }
    }
}
