package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;

/* renamed from: fqr  reason: default package */
/* loaded from: classes.dex */
public final class fqr extends c18 {
    public final RectF e;

    public fqr(dOE doe) {
        super(doe == null ? new dOE() : doe);
        this.e = new RectF();
    }

    @Override // defpackage.c18
    public final void L(Canvas canvas) {
        if (this.e.isEmpty()) {
            super.L(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.e);
        super.L(canvas);
        canvas.restore();
    }

    public final void V(float f, float f2, float f3, float f4) {
        RectF rectF = this.e;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
