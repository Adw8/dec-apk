package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockFaceView extends dkU implements _T {
    public final int C;
    public final int H;
    public final int N;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final ColorStateList f2389R;

    /* renamed from: R  reason: collision with other field name */
    public final ClockHandView f2392R;

    /* renamed from: R  reason: collision with other field name */
    public final Y f2393R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f2395R;

    /* renamed from: R  reason: collision with other field name */
    public String[] f2396R;
    public final int U;
    public final SparseArray c;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f2390R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final RectF f2391R = new RectF();

    /* renamed from: R  reason: collision with other field name */
    public final float[] f2394R = {0.0f, 0.9f, 1.0f};

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.c = sparseArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.U, R.attr.materialClockStyle, 2132018243);
        Resources resources = getResources();
        ColorStateList m = lTs.m(context, obtainStyledAttributes, 1);
        this.f2389R = m;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2392R = clockHandView;
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m.getColorForState(new int[]{16842913}, m.getDefaultColor());
        this.f2395R = new int[]{colorForState, colorForState, m.getDefaultColor()};
        clockHandView.f2400R.add(this);
        int defaultColor = C1.v(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m2 = lTs.m(context, obtainStyledAttributes, 0);
        setBackgroundColor(m2 != null ? m2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new c(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2393R = new Y(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2396R = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.f2396R.length, size); i++) {
            TextView textView = (TextView) this.c.get(i);
            if (i >= this.f2396R.length) {
                removeView(textView);
                this.c.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.c.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f2396R[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                of5.O(textView, this.f2393R);
                textView.setTextColor(this.f2389R);
            }
        }
        this.U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.N = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void N() {
        RectF rectF = this.f2392R.f2399R;
        for (int i = 0; i < this.c.size(); i++) {
            TextView textView = (TextView) this.c.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f2390R);
                offsetDescendantRectToMyCoords(textView, this.f2390R);
                textView.setSelected(rectF.contains((float) this.f2390R.centerX(), (float) this.f2390R.centerY()));
                this.f2391R.set(this.f2390R);
                this.f2391R.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f2391R) ? null : new RadialGradient(rectF.centerX() - this.f2391R.left, rectF.centerY() - this.f2391R.top, 0.5f * rectF.width(), this.f2395R, this.f2394R, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2396R.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.N) / Math.max(Math.max(((float) this.U) / ((float) displayMetrics.heightPixels), ((float) this.C) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
