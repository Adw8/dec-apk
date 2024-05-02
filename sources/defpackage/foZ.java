package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: foZ  reason: default package */
/* loaded from: classes.dex */
public final class foZ extends aW_ {
    public float R;
    public float v;

    @Override // defpackage.aW_
    public final void R(Matrix matrix, Path path) {
        Matrix matrix2 = super.R;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.R, this.v);
        path.transform(matrix);
    }
}
