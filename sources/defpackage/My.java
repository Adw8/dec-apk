package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: My  reason: default package */
/* loaded from: classes.dex */
public abstract class My {

    /* renamed from: R  reason: collision with other field name */
    public static final LinearInterpolator f298R = new LinearInterpolator();

    /* renamed from: R  reason: collision with other field name */
    public static final lUH f300R = new lUH();
    public static final a_B R = new a_B();

    /* renamed from: R  reason: collision with other field name */
    public static final g10 f299R = new g10();

    /* renamed from: R  reason: collision with other field name */
    public static final DecelerateInterpolator f297R = new DecelerateInterpolator();

    public static float R(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : jQ.v(f2, f, (f5 - f3) / (f4 - f3), f);
    }
}
