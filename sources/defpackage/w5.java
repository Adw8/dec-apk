package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: w5  reason: default package */
/* loaded from: classes.dex */
public final class w5 implements hq {
    public final Matrix R = new Matrix();

    /* renamed from: R  reason: collision with other field name */
    public final int[] f7448R = new int[2];

    @Override // defpackage.hq
    public void R(View view, float[] fArr) {
        this.R.reset();
        view.transformMatrixToGlobal(this.R);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f7448R);
        int[] iArr = this.f7448R;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f7448R;
        this.R.postTranslate((float) (iArr2[0] - i), (float) (iArr2[1] - i2));
        aH9.cE(this.R, fArr);
    }
}
