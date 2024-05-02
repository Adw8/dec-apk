package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: erz  reason: default package */
/* loaded from: classes.dex */
public final class erz {

    /* renamed from: R  reason: collision with other field name */
    public final okT[] f3227R = new okT[4];

    /* renamed from: R  reason: collision with other field name */
    public final Matrix[] f3226R = new Matrix[4];

    /* renamed from: v  reason: collision with other field name */
    public final Matrix[] f3229v = new Matrix[4];

    /* renamed from: R  reason: collision with other field name */
    public final PointF f3222R = new PointF();
    public final Path R = new Path();
    public final Path v = new Path();

    /* renamed from: R  reason: collision with other field name */
    public final okT f3223R = new okT();

    /* renamed from: R  reason: collision with other field name */
    public final float[] f3225R = new float[2];

    /* renamed from: v  reason: collision with other field name */
    public final float[] f3228v = new float[2];
    public final Path c = new Path();
    public final Path e = new Path();

    /* renamed from: R  reason: collision with other field name */
    public boolean f3224R = true;

    public erz() {
        for (int i = 0; i < 4; i++) {
            this.f3227R[i] = new okT();
            this.f3226R[i] = new Matrix();
            this.f3229v[i] = new Matrix();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x0285 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v31, resolved type: java.util.BitSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(defpackage.dOE r19, float r20, android.graphics.RectF r21, defpackage.gL6 r22, android.graphics.Path r23) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erz.R(dOE, float, android.graphics.RectF, gL6, android.graphics.Path):void");
    }

    public final boolean v(Path path, int i) {
        this.e.reset();
        this.f3227R[i].v(this.f3226R[i], this.e);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.e.computeBounds(rectF, true);
        path.op(this.e, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
