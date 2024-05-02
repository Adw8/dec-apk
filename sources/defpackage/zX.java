package defpackage;

import android.graphics.PathMeasure;

/* renamed from: zX  reason: default package */
/* loaded from: classes.dex */
public final class zX {
    public final PathMeasure R;

    public zX(PathMeasure pathMeasure) {
        this.R = pathMeasure;
    }

    public final void R(float f, float f2, cnO cno) {
        PathMeasure pathMeasure = this.R;
        if (cno instanceof dm) {
            pathMeasure.getSegment(f, f2, ((dm) cno).f2856R, true);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
