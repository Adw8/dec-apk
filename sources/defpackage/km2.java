package defpackage;

import android.graphics.Paint;

/* renamed from: km2  reason: default package */
/* loaded from: classes.dex */
public final class km2 extends kcd {
    public float L;
    public float O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public Paint.Cap f5413R;

    /* renamed from: R  reason: collision with other field name */
    public Paint.Join f5414R;

    /* renamed from: R  reason: collision with other field name */
    public mAv f5415R;
    public float X;
    public float c;
    public float e;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public mAv f5416v;

    public km2() {
        this.R = 0.0f;
        this.v = 1.0f;
        this.c = 1.0f;
        this.e = 0.0f;
        this.X = 1.0f;
        this.O = 0.0f;
        this.f5413R = Paint.Cap.BUTT;
        this.f5414R = Paint.Join.MITER;
        this.L = 4.0f;
    }

    @Override // defpackage.njT
    public final boolean R() {
        return this.f5416v.X() || this.f5415R.X();
    }

    public float getFillAlpha() {
        return this.c;
    }

    public int getFillColor() {
        return this.f5416v.R;
    }

    public float getStrokeAlpha() {
        return this.v;
    }

    public int getStrokeColor() {
        return this.f5415R.R;
    }

    public float getStrokeWidth() {
        return this.R;
    }

    public float getTrimPathEnd() {
        return this.X;
    }

    public float getTrimPathOffset() {
        return this.O;
    }

    public float getTrimPathStart() {
        return this.e;
    }

    public void setFillAlpha(float f) {
        this.c = f;
    }

    public void setFillColor(int i) {
        this.f5416v.R = i;
    }

    public void setStrokeAlpha(float f) {
        this.v = f;
    }

    public void setStrokeColor(int i) {
        this.f5415R.R = i;
    }

    public void setStrokeWidth(float f) {
        this.R = f;
    }

    public void setTrimPathEnd(float f) {
        this.X = f;
    }

    public void setTrimPathOffset(float f) {
        this.O = f;
    }

    public void setTrimPathStart(float f) {
        this.e = f;
    }

    @Override // defpackage.njT
    public final boolean v(int[] iArr) {
        return this.f5415R.L(iArr) | this.f5416v.L(iArr);
    }

    public km2(km2 km2) {
        super(km2);
        this.R = 0.0f;
        this.v = 1.0f;
        this.c = 1.0f;
        this.e = 0.0f;
        this.X = 1.0f;
        this.O = 0.0f;
        this.f5413R = Paint.Cap.BUTT;
        this.f5414R = Paint.Join.MITER;
        this.L = 4.0f;
        this.f5415R = km2.f5415R;
        this.R = km2.R;
        this.v = km2.v;
        this.f5416v = km2.f5416v;
        ((kcd) this).R = ((kcd) km2).R;
        this.c = km2.c;
        this.e = km2.e;
        this.X = km2.X;
        this.O = km2.O;
        this.f5413R = km2.f5413R;
        this.f5414R = km2.f5414R;
        this.L = km2.L;
    }
}
