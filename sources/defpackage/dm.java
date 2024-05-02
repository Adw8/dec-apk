package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: dm  reason: default package */
/* loaded from: classes.dex */
public final class dm implements cnO {

    /* renamed from: R  reason: collision with other field name */
    public final Path f2856R;

    /* renamed from: R  reason: collision with other field name */
    public final RectF f2857R = new RectF();

    /* renamed from: R  reason: collision with other field name */
    public final float[] f2858R = new float[8];
    public final Matrix R = new Matrix();

    public dm(Path path) {
        this.f2856R = path;
    }

    public final boolean c(dm dmVar, dm dmVar2, int i) {
        Path.Op op;
        boolean z = false;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    op = z ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        return this.f2856R.op(dmVar.f2856R, dmVar2.f2856R, op);
    }

    public final void e() {
        this.f2856R.reset();
    }

    public final void v(bwp bwp) {
        this.f2857R.set(bwp.R, bwp.v, bwp.c, bwp.e);
        this.f2858R[0] = buB.v(bwp.f1859R);
        this.f2858R[1] = buB.c(bwp.f1859R);
        this.f2858R[2] = buB.v(bwp.f1862v);
        this.f2858R[3] = buB.c(bwp.f1862v);
        this.f2858R[4] = buB.v(bwp.f1860c);
        this.f2858R[5] = buB.c(bwp.f1860c);
        this.f2858R[6] = buB.v(bwp.f1861e);
        this.f2858R[7] = buB.c(bwp.f1861e);
        this.f2856R.addRoundRect(this.f2857R, this.f2858R, Path.Direction.CCW);
    }
}
