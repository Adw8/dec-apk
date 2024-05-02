package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: miq  reason: default package */
/* loaded from: classes.dex */
public final class miq extends Drawable {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6127R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuffColorFilter f6130R;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f6134v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6133R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6135v = true;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f6129R = PorterDuff.Mode.SRC_IN;

    /* renamed from: R  reason: collision with other field name */
    public final Paint f6128R = new Paint(5);

    /* renamed from: R  reason: collision with other field name */
    public final RectF f6132R = new RectF();

    /* renamed from: R  reason: collision with other field name */
    public final Rect f6131R = new Rect();

    public miq(float f, ColorStateList colorStateList) {
        this.R = f;
        v(colorStateList);
    }

    public final PorterDuffColorFilter R(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f6132R.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f6131R.set(rect);
        if (this.f6133R) {
            float v = lsR.v(this.v, this.R, this.f6135v);
            this.f6131R.inset((int) Math.ceil((double) lsR.R(this.v, this.R, this.f6135v)), (int) Math.ceil((double) v));
            this.f6132R.set(this.f6131R);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f6128R;
        if (this.f6130R == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f6130R);
            z = true;
        }
        RectF rectF = this.f6132R;
        float f = this.R;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f6131R, this.R);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f6134v;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f6127R) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f6127R;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f6128R.getColor();
        if (z) {
            this.f6128R.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f6134v;
        if (colorStateList2 == null || (mode = this.f6129R) == null) {
            return z;
        }
        this.f6130R = R(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f6128R.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6128R.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6134v = colorStateList;
        this.f6130R = R(colorStateList, this.f6129R);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6129R = mode;
        this.f6130R = R(this.f6134v, mode);
        invalidateSelf();
    }

    public final void v(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f6127R = colorStateList;
        this.f6128R.setColor(colorStateList.getColorForState(getState(), this.f6127R.getDefaultColor()));
    }
}
