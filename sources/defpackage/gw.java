package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: gw  reason: default package */
/* loaded from: classes.dex */
public final class gw {

    /* renamed from: R  reason: collision with other field name */
    public Iw f3990R;

    /* renamed from: R  reason: collision with other field name */
    public Shader f3992R;

    /* renamed from: R  reason: collision with other field name */
    public Paint f3991R = new Paint(7);
    public int R = 3;

    public gw() {
        int i = An.v;
    }

    public final void L(int i) {
        Paint paint = this.f3991R;
        int i2 = mxC.R;
        paint.setFilterBitmap(!(i == 0));
    }

    public final void O(Iw iw) {
        this.f3990R = iw;
        this.f3991R.setColorFilter(iw != null ? iw.f196R : null);
    }

    public final int R() {
        if (!this.f3991R.isFilterBitmap()) {
            int i = mxC.R;
            return 0;
        }
        int i2 = mxC.R;
        return 1;
    }

    public final void X(long j) {
        this.f3991R.setColor(aH9.vz(j));
    }

    public final void Z(int i) {
        Paint.Cap cap;
        Paint paint = this.f3991R;
        boolean z = false;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                if (i == 0) {
                    z = true;
                }
                cap = z ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    public final int c() {
        Paint.Join strokeJoin = this.f3991R.getStrokeJoin();
        int i = strokeJoin == null ? -1 : NO.v[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void e(float f) {
        this.f3991R.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public final void m(int i) {
        Paint.Join join;
        Paint paint = this.f3991R;
        boolean z = false;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i == 2) {
                join = Paint.Join.BEVEL;
            } else {
                if (i == 1) {
                    z = true;
                }
                join = z ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    public final int v() {
        Paint.Cap strokeCap = this.f3991R.getStrokeCap();
        int i = strokeCap == null ? -1 : NO.R[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final void x(int i) {
        Paint paint = this.f3991R;
        int i2 = iWF.R;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        paint.setStyle(z ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
