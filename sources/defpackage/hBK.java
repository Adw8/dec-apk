package defpackage;

import android.view.animation.Interpolator;

/* renamed from: hBK  reason: default package */
/* loaded from: classes.dex */
public abstract class hBK implements Interpolator {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final float[] f4159R;

    public hBK(float[] fArr) {
        this.f4159R = fArr;
        this.R = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4159R;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.R;
        float[] fArr2 = this.f4159R;
        float f3 = fArr2[min];
        return jQ.v(fArr2[min + 1], f3, (f - (((float) min) * f2)) / f2, f3);
    }
}
