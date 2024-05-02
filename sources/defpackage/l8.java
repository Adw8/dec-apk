package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: l8 */
/* loaded from: classes.dex */
public abstract class l8 extends FrameLayout {
    public static final int[] R = {16842801};
    public static final dq v = new dq();

    /* renamed from: R */
    public final Rect f5589R;

    /* renamed from: R */
    public final h5 f5590R;

    /* renamed from: R */
    public boolean f5591R;

    /* renamed from: v */
    public final Rect f5592v = new Rect();

    /* renamed from: v */
    public boolean f5593v;

    public l8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialCardViewStyle);
        ColorStateList colorStateList;
        Rect rect = new Rect();
        this.f5589R = rect;
        h5 h5Var = new h5(this);
        this.f5590R = h5Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dxh.f2926R, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(R);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateList = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R.color.cardview_light_background) : getResources().getColor(R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f5591R = obtainStyledAttributes.getBoolean(7, false);
        this.f5593v = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dq dqVar = v;
        miq miq = new miq(dimension, colorStateList);
        h5Var.R = miq;
        ((l8) h5Var.v).setBackgroundDrawable(miq);
        l8 l8Var = (l8) h5Var.v;
        l8Var.setClipToOutline(true);
        l8Var.setElevation(dimension2);
        dqVar.z(h5Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((miq) ((Drawable) this.f5590R.R)).f6127R;
    }

    public float getCardElevation() {
        return ((l8) this.f5590R.v).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f5589R.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5589R.left;
    }

    public int getContentPaddingRight() {
        return this.f5589R.right;
    }

    public int getContentPaddingTop() {
        return this.f5589R.top;
    }

    public float getMaxCardElevation() {
        return ((miq) ((Drawable) this.f5590R.R)).v;
    }

    public boolean getPreventCornerOverlap() {
        return this.f5593v;
    }

    public float getRadius() {
        return ((miq) ((Drawable) this.f5590R.R)).R;
    }

    public boolean getUseCompatPadding() {
        return this.f5591R;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        h5 h5Var = this.f5590R;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        miq miq = (miq) ((Drawable) h5Var.R);
        miq.v(valueOf);
        miq.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((l8) this.f5590R.v).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        v.z(this.f5590R, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f5593v) {
            this.f5593v = z;
            dq dqVar = v;
            h5 h5Var = this.f5590R;
            dqVar.z(h5Var, ((miq) ((Drawable) h5Var.R)).v);
        }
    }

    public void setRadius(float f) {
        miq miq = (miq) ((Drawable) this.f5590R.R);
        if (f != miq.R) {
            miq.R = f;
            miq.c(null);
            miq.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5591R != z) {
            this.f5591R = z;
            dq dqVar = v;
            h5 h5Var = this.f5590R;
            dqVar.z(h5Var, ((miq) ((Drawable) h5Var.R)).v);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        miq miq = (miq) ((Drawable) this.f5590R.R);
        miq.v(colorStateList);
        miq.invalidateSelf();
    }
}
