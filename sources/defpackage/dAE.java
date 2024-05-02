package defpackage;

import android.graphics.Matrix;

/* renamed from: dAE  reason: default package */
/* loaded from: classes.dex */
public final class dAE {
    public Matrix R;

    /* renamed from: R  reason: collision with other field name */
    public final iv7 f2517R;

    /* renamed from: R  reason: collision with other field name */
    public float[] f2519R;
    public Matrix v;

    /* renamed from: v  reason: collision with other field name */
    public float[] f2521v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2518R = true;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2520v = true;
    public boolean c = true;

    public dAE(ky1 ky1) {
        this.f2517R = ky1;
    }

    public final float[] R(Object obj) {
        float[] fArr = this.f2521v;
        if (fArr == null) {
            fArr = l1r.R();
            this.f2521v = fArr;
        }
        if (this.f2520v) {
            this.c = aH9.E(v(obj), fArr);
            this.f2520v = false;
        }
        if (this.c) {
            return fArr;
        }
        return null;
    }

    public final void c() {
        this.f2518R = true;
        this.f2520v = true;
    }

    public final float[] v(Object obj) {
        float[] fArr = this.f2519R;
        if (fArr == null) {
            fArr = l1r.R();
            this.f2519R = fArr;
        }
        if (!this.f2518R) {
            return fArr;
        }
        Matrix matrix = this.R;
        if (matrix == null) {
            matrix = new Matrix();
            this.R = matrix;
        }
        this.f2517R.J(obj, matrix);
        Matrix matrix2 = this.v;
        if (matrix2 == null || !n3x.v(matrix, matrix2)) {
            aH9.cE(matrix, fArr);
            this.R = matrix2;
            this.v = matrix;
        }
        this.f2518R = false;
        return fArr;
    }
}
