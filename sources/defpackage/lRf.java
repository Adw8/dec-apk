package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: lRf  reason: default package */
/* loaded from: classes.dex */
public final class lRf extends aW_ {
    public static final RectF R = new RectF();
    public float O;

    /* renamed from: R  reason: collision with other field name */
    public float f5742R;
    public float X;
    public float c;
    public float e;
    public float v;

    public lRf(float f, float f2, float f3, float f4) {
        this.f5742R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    @Override // defpackage.aW_
    public final void R(Matrix matrix, Path path) {
        Matrix matrix2 = super.R;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = R;
        rectF.set(this.f5742R, this.v, this.c, this.e);
        path.arcTo(rectF, this.X, this.O, false);
        path.transform(matrix);
    }
}
