package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: lc6  reason: default package */
/* loaded from: classes.dex */
public final class lc6 extends lLA {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final foZ f5793R;
    public final float v;

    public lc6(foZ foz, float f, float f2) {
        this.f5793R = foz;
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.lLA
    public final void R(Matrix matrix, juL jul, int i, Canvas canvas) {
        foZ foz = this.f5793R;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (foz.v - this.v), (double) (foz.R - this.R)), 0.0f);
        ((lLA) this).R.set(matrix);
        ((lLA) this).R.preTranslate(this.R, this.v);
        ((lLA) this).R.preRotate(v());
        Matrix matrix2 = ((lLA) this).R;
        jul.getClass();
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = juL.f5096R;
        iArr[0] = jul.c;
        iArr[1] = jul.f5102v;
        iArr[2] = jul.f5098R;
        Paint paint = jul.f5101c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, juL.R, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, jul.f5101c);
        canvas.restore();
    }

    public final float v() {
        foZ foz = this.f5793R;
        return (float) Math.toDegrees(Math.atan((double) ((foz.v - this.v) / (foz.R - this.R))));
    }
}
