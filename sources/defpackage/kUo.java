package defpackage;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* renamed from: kUo  reason: default package */
/* loaded from: classes.dex */
public abstract class kUo {
    public static PathInterpolator R(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static PathInterpolator c(Path path) {
        return new PathInterpolator(path);
    }

    public static PathInterpolator v(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }
}
