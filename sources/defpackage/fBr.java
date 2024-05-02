package defpackage;

import android.content.Context;
import android.graphics.Color;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: fBr  reason: default package */
/* loaded from: classes.dex */
public final class fBr {
    public static final int e = (int) Math.round(5.1000000000000005d);
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f3351R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3352R;
    public final int c;
    public final int v;

    public fBr(Context context) {
        boolean s = hDC.s(context, R.attr.elevationOverlayEnabled, false);
        int y = vd.y(context, R.attr.elevationOverlayColor, 0);
        int y2 = vd.y(context, R.attr.elevationOverlayAccentColor, 0);
        int y3 = vd.y(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3352R = s;
        this.f3351R = y;
        this.v = y2;
        this.c = y3;
        this.R = f;
    }

    public final int R(int i, float f) {
        int i2;
        if (this.f3352R) {
            if (B7.c(i, 255) == this.c) {
                float f2 = this.R;
                float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                int alpha = Color.alpha(i);
                int Y = vd.Y(B7.c(i, 255), this.f3351R, min);
                if (min > 0.0f && (i2 = this.v) != 0) {
                    Y = B7.v(B7.c(i2, e), Y);
                }
                return B7.c(Y, alpha);
            }
        }
        return i;
    }
}
