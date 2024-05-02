package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: o0  reason: default package */
/* loaded from: classes.dex */
public abstract class o0 extends FrameLayout {
    public static final Y9 R = new Y9();
    public final int O;

    /* renamed from: R  reason: collision with other field name */
    public final float f6647R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6648R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f6649R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f6650R;
    public final int X;
    public int e;
    public final float v;

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: c18 */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, hDC.s);
        if (obtainStyledAttributes.hasValue(6)) {
            WeakHashMap weakHashMap = of5.f6887R;
            m18.t(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.e = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f6650R = new dOE(dOE.v(context2, attributeSet, 0, 0));
        }
        this.f6647R = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(lTs.m(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(vd.u(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.v = obtainStyledAttributes.getFloat(1, 1.0f);
        this.X = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.O = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(R);
        setFocusable(true);
        if (getBackground() == null) {
            int Y = vd.Y(vd.t(this, R.attr.colorSurface), vd.t(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            dOE doe = this.f6650R;
            if (doe != null) {
                int i = EG.R;
                c18 c18 = new c18(doe);
                c18.C(ColorStateList.valueOf(Y));
                gradientDrawable = c18;
            } else {
                Resources resources = getResources();
                int i2 = EG.R;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(Y);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f6648R;
            if (colorStateList != null) {
                cAO.Z(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.g(this, gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(EG eg) {
    }

    public float getActionTextColorAlpha() {
        return this.v;
    }

    public int getAnimationMode() {
        return this.e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6647R;
    }

    public int getMaxInlineActionWidth() {
        return this.O;
    }

    public int getMaxWidth() {
        return this.X;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = of5.f6887R;
        fv7.c(this);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.X > 0 && getMeasuredWidth() > (i3 = this.X)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f6648R == null)) {
            drawable = drawable.mutate();
            cAO.Z(drawable, this.f6648R);
            cAO.m(drawable, this.f6649R);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6648R = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            cAO.Z(mutate, colorStateList);
            cAO.m(mutate, this.f6649R);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6649R = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            cAO.m(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : R);
        super.setOnClickListener(onClickListener);
    }
}
