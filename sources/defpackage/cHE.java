package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: cHE  reason: default package */
/* loaded from: classes.dex */
public final class cHE extends Drawable implements Drawable.Callback {
    public Drawable R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2057R;

    public cHE(Drawable drawable) {
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f2057R = true;
    }

    /* renamed from: C */
    public final boolean isStateful() {
        return this.R.isStateful();
    }

    /* renamed from: H */
    public final Region getTransparentRegion() {
        return this.R.getTransparentRegion();
    }

    /* renamed from: I */
    public final void setTintList(ColorStateList colorStateList) {
        cAO.Z(this.R, colorStateList);
    }

    public final void J(int i, int i2, int i3, int i4) {
        cAO.O(this.R, i, i2, i3, i4);
    }

    public final void K(float f, float f2) {
        cAO.X(this.R, f, f2);
    }

    /* renamed from: L */
    public final int getMinimumWidth() {
        return this.R.getMinimumWidth();
    }

    /* renamed from: N */
    public final void jumpToCurrentState() {
        this.R.jumpToCurrentState();
    }

    /* renamed from: O */
    public final int getMinimumHeight() {
        return this.R.getMinimumHeight();
    }

    /* renamed from: P */
    public final void onBoundsChange(Rect rect) {
        this.R.setBounds(rect);
    }

    public final void R(Canvas canvas) {
        this.R.draw(canvas);
    }

    /* renamed from: U */
    public final boolean isAutoMirrored() {
        return iep.e(this.R);
    }

    /* renamed from: V */
    public final void setDither(boolean z) {
        this.R.setDither(z);
    }

    /* renamed from: X */
    public final int getIntrinsicWidth() {
        return this.R.getIntrinsicWidth();
    }

    public final boolean Y(int[] iArr) {
        return this.R.setState(iArr);
    }

    /* renamed from: Z */
    public final int getOpacity() {
        return this.R.getOpacity();
    }

    /* renamed from: c */
    public final Drawable getCurrent() {
        return this.R.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2057R) {
            R(canvas);
        }
    }

    /* renamed from: e */
    public final int getIntrinsicHeight() {
        return this.R.getIntrinsicHeight();
    }

    /* renamed from: g */
    public final void setAlpha(int i) {
        this.R.setAlpha(i);
    }

    /* renamed from: h */
    public final void setTint(int i) {
        cAO.L(this.R, i);
    }

    /* renamed from: i */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.R.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* renamed from: j */
    public final boolean onLevelChange(int i) {
        return this.R.setLevel(i);
    }

    /* renamed from: m */
    public final boolean getPadding(Rect rect) {
        return this.R.getPadding(rect);
    }

    /* renamed from: o */
    public final void setFilterBitmap(boolean z) {
        this.R.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f2057R) {
            K(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f2057R) {
            J(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f2057R) {
            return Y(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f2057R) {
            return z(z, z2);
        }
        return false;
    }

    /* renamed from: t */
    public final void setChangingConfigurations(int i) {
        this.R.setChangingConfigurations(i);
    }

    /* renamed from: u */
    public final void setTintMode(PorterDuff.Mode mode) {
        cAO.m(this.R, mode);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: v */
    public final int getChangingConfigurations() {
        return this.R.getChangingConfigurations();
    }

    /* renamed from: x */
    public final int[] getState() {
        return this.R.getState();
    }

    /* renamed from: y */
    public final void setAutoMirrored(boolean z) {
        iep.X(this.R, z);
    }

    public final boolean z(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.R.setVisible(z, z2);
    }
}
