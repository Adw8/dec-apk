package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] R = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R  reason: collision with other field name */
    public ImageView.ScaleType f2240R;

    /* renamed from: R  reason: collision with other field name */
    public Boolean f2241R;

    /* renamed from: R  reason: collision with other field name */
    public Integer f2242R;
    public boolean X;
    public boolean e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.toolbarStyle, 2132018251), attributeSet, 0);
        int i = 0;
        Context context2 = getContext();
        TypedArray w = aH9.w(context2, attributeSet, hDC.Q, R.attr.toolbarStyle, 2132018251, new int[0]);
        if (w.hasValue(2)) {
            setNavigationIconTint(w.getColor(2, -1));
        }
        this.e = w.getBoolean(4, false);
        this.X = w.getBoolean(3, false);
        int i2 = w.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = R;
            if (i2 < scaleTypeArr.length) {
                this.f2240R = scaleTypeArr[i2];
            }
        }
        if (w.hasValue(0)) {
            this.f2241R = Boolean.valueOf(w.getBoolean(0, false));
        }
        w.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            c18 c18 = new c18();
            c18.C(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i));
            c18.x(context2);
            WeakHashMap weakHashMap = of5.f6887R;
            c18.U(m18.m(this));
            mHC.g(this, c18);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2240R;
    }

    public Integer getNavigationIconTint() {
        return this.f2242R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof c18) {
            hDC.k(this, (c18) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.e || this.X) {
            ArrayList u = dTl.u(this, getTitle());
            TextView textView = u.isEmpty() ? null : (TextView) Collections.min(u, dTl.f2620R);
            ArrayList u2 = dTl.u(this, getSubtitle());
            TextView textView2 = u2.isEmpty() ? null : (TextView) Collections.max(u2, dTl.f2620R);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.e && textView != null) {
                    y(textView, pair);
                }
                if (this.X && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2241R;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2240R;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof c18) {
            ((c18) background).U(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f2241R;
        if (bool == null || bool.booleanValue() != z) {
            this.f2241R = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2240R != scaleType) {
            this.f2240R = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f2242R == null)) {
            drawable = drawable.mutate();
            cAO.L(drawable, this.f2242R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f2242R = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.X != z) {
            this.X = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.e != z) {
            this.e = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
