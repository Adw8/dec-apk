package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: db0  reason: default package */
/* loaded from: classes.dex */
public final class db0 {
    public static final Matrix v = new Matrix();
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f2677R;

    /* renamed from: R  reason: collision with other field name */
    public final FK f2678R;

    /* renamed from: R  reason: collision with other field name */
    public final Matrix f2679R;

    /* renamed from: R  reason: collision with other field name */
    public Paint f2680R;

    /* renamed from: R  reason: collision with other field name */
    public final Path f2681R;

    /* renamed from: R  reason: collision with other field name */
    public PathMeasure f2682R;

    /* renamed from: R  reason: collision with other field name */
    public Boolean f2683R;

    /* renamed from: R  reason: collision with other field name */
    public String f2684R;

    /* renamed from: R  reason: collision with other field name */
    public final oc5 f2685R;
    public float c;
    public float e;

    /* renamed from: v  reason: collision with other field name */
    public float f2686v;

    /* renamed from: v  reason: collision with other field name */
    public Paint f2687v;

    /* renamed from: v  reason: collision with other field name */
    public final Path f2688v;

    public db0() {
        this.f2679R = new Matrix();
        this.R = 0.0f;
        this.f2686v = 0.0f;
        this.c = 0.0f;
        this.e = 0.0f;
        this.f2677R = 255;
        this.f2684R = null;
        this.f2683R = null;
        this.f2678R = new FK();
        this.f2685R = new oc5();
        this.f2681R = new Path();
        this.f2688v = new Path();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: android.graphics.PathMeasure */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(defpackage.oc5 r20, android.graphics.Matrix r21, android.graphics.Canvas r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 608
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db0.R(oc5, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2677R;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f2677R = i;
    }

    public db0(db0 db0) {
        this.f2679R = new Matrix();
        this.R = 0.0f;
        this.f2686v = 0.0f;
        this.c = 0.0f;
        this.e = 0.0f;
        this.f2677R = 255;
        this.f2684R = null;
        this.f2683R = null;
        FK fk = new FK();
        this.f2678R = fk;
        this.f2685R = new oc5(db0.f2685R, fk);
        this.f2681R = new Path(db0.f2681R);
        this.f2688v = new Path(db0.f2688v);
        this.R = db0.R;
        this.f2686v = db0.f2686v;
        this.c = db0.c;
        this.e = db0.e;
        this.f2677R = db0.f2677R;
        this.f2684R = db0.f2684R;
        String str = db0.f2684R;
        if (str != null) {
            fk.put(str, this);
        }
        this.f2683R = db0.f2683R;
    }
}
