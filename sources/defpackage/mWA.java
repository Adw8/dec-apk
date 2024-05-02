package defpackage;

import android.view.animation.Interpolator;

/* renamed from: mWA  reason: default package */
/* loaded from: classes.dex */
public final class mWA implements Interpolator {
    public final /* synthetic */ int R;

    public /* synthetic */ mWA(int i) {
        this.R = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.R) {
            case 0:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
