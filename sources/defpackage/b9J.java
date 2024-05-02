package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: b9J  reason: default package */
/* loaded from: classes.dex */
public abstract class b9J extends lYU {
    public int C;
    public boolean c;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f1541v;
    public final Rect R = new Rect();
    public final Rect v = new Rect();
    public boolean e = false;

    public b9J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.C = 119;
        this.c = true;
        TypedArray w = aH9.w(context, attributeSet, hDC.y, 0, 0, new int[0]);
        this.C = w.getInt(1, this.C);
        Drawable drawable = w.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.c = w.getBoolean(2, true);
        w.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1541v;
        if (drawable != null) {
            if (this.e) {
                this.e = false;
                Rect rect = this.R;
                Rect rect2 = this.v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.c) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.C, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1541v;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1541v;
        if (drawable != null && drawable.isStateful()) {
            this.f1541v.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1541v;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1541v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // defpackage.lYU, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = z | this.e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1541v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1541v);
            }
            this.f1541v = drawable;
            this.e = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.C == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.C != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.C = i;
            if (i == 119 && this.f1541v != null) {
                this.f1541v.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1541v;
    }
}
