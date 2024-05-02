package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: haJ  reason: default package */
/* loaded from: classes.dex */
public final class haJ extends lLA {
    public final lRf R;

    public haJ(lRf lrf) {
        this.R = lrf;
    }

    @Override // defpackage.lLA
    public final void R(Matrix matrix, juL jul, int i, Canvas canvas) {
        lRf lrf = this.R;
        float f = lrf.X;
        float f2 = lrf.O;
        lRf lrf2 = this.R;
        RectF rectF = new RectF(lrf2.f5742R, lrf2.v, lrf2.c, lrf2.e);
        boolean z = f2 < 0.0f;
        Path path = jul.f5100R;
        if (z) {
            int[] iArr = juL.f5097v;
            iArr[0] = 0;
            iArr[1] = jul.c;
            iArr[2] = jul.f5102v;
            iArr[3] = jul.f5098R;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i);
            rectF.inset(f3, f3);
            int[] iArr2 = juL.f5097v;
            iArr2[0] = 0;
            iArr2[1] = jul.f5098R;
            iArr2[2] = jul.f5102v;
            iArr2[3] = jul.c;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i) / width);
            float[] fArr = juL.v;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            jul.f5103v.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, juL.f5097v, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, jul.e);
            }
            canvas.drawArc(rectF, f, f2, true, jul.f5103v);
            canvas.restore();
        }
    }
}
