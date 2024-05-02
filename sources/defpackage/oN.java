package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.material.slider.Slider;
import dev.kdrag0n.virtcontainer.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: oN  reason: default package */
/* loaded from: classes.dex */
public abstract class oN extends View {
    public static final String R = oN.class.getSimpleName();
    public int C;
    public int H;
    public int L;
    public int N;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public final Paint f6774O;
    public int P;

    /* renamed from: R  reason: collision with other field name */
    public float f6775R;

    /* renamed from: R  reason: collision with other field name */
    public ValueAnimator f6776R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6777R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint f6778R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f6779R;

    /* renamed from: R  reason: collision with other field name */
    public MotionEvent f6780R;

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityManager f6781R;

    /* renamed from: R  reason: collision with other field name */
    public final c18 f6782R;

    /* renamed from: R  reason: collision with other field name */
    public hk0 f6783R;

    /* renamed from: R  reason: collision with other field name */
    public final mAv f6786R;

    /* renamed from: R  reason: collision with other field name */
    public final pV f6787R;

    /* renamed from: R  reason: collision with other field name */
    public float[] f6789R;
    public int U;
    public float X;

    /* renamed from: X  reason: collision with other field name */
    public int f6790X;

    /* renamed from: X  reason: collision with other field name */
    public ColorStateList f6791X;

    /* renamed from: X  reason: collision with other field name */
    public final Paint f6792X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f6793X;
    public int Z;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f6794c;

    /* renamed from: c  reason: collision with other field name */
    public final Paint f6795c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6797c;
    public float e;

    /* renamed from: e  reason: collision with other field name */
    public final int f6798e;

    /* renamed from: e  reason: collision with other field name */
    public ColorStateList f6799e;

    /* renamed from: e  reason: collision with other field name */
    public final Paint f6800e;
    public int m;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public ValueAnimator f6803v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f6804v;

    /* renamed from: v  reason: collision with other field name */
    public final Paint f6805v;
    public int x;
    public int y;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6784R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f6806v = new ArrayList();

    /* renamed from: c  reason: collision with other field name */
    public final ArrayList f6796c = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public boolean f6788R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6807v = false;

    /* renamed from: e  reason: collision with other field name */
    public ArrayList f6801e = new ArrayList();
    public int j = -1;
    public int g = -1;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6802e = false;

    /* renamed from: R  reason: collision with other field name */
    public List f6785R = Collections.emptyList();
    public int t = 0;

    public oN(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.sliderStyle, 2132018221), attributeSet, R.attr.sliderStyle);
        this.e = 0.0f;
        this.f6797c = true;
        c18 c18 = new c18();
        this.f6782R = c18;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f6778R = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f6805v = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f6795c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f6800e = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f6792X = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f6774O = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.Z = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f6790X = dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.O = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.L = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.P = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        Slider slider = (Slider) this;
        this.f6786R = new mAv(slider, attributeSet);
        TypedArray w = aH9.w(context2, attributeSet, hDC.W, R.attr.sliderStyle, 2132018221, new int[0]);
        this.v = w.getFloat(3, 0.0f);
        this.c = w.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.v));
        this.e = w.getFloat(2, 0.0f);
        int i = 18;
        boolean hasValue = w.hasValue(18);
        int i2 = hasValue ? 18 : 20;
        i = !hasValue ? 19 : i;
        ColorStateList m = lTs.m(context2, w, i2);
        setTrackInactiveTintList(m == null ? C1.v(context2, R.color.material_slider_inactive_track_color) : m);
        ColorStateList m2 = lTs.m(context2, w, i);
        setTrackActiveTintList(m2 == null ? C1.v(context2, R.color.material_slider_active_track_color) : m2);
        c18.C(lTs.m(context2, w, 9));
        if (w.hasValue(12)) {
            setThumbStrokeColor(lTs.m(context2, w, 12));
        }
        setThumbStrokeWidth(w.getDimension(13, 0.0f));
        ColorStateList m3 = lTs.m(context2, w, 5);
        setHaloTintList(m3 == null ? C1.v(context2, R.color.material_slider_halo_color) : m3);
        this.f6797c = w.getBoolean(17, true);
        int i3 = 14;
        boolean hasValue2 = w.hasValue(14);
        int i4 = hasValue2 ? 14 : 16;
        i3 = !hasValue2 ? 15 : i3;
        ColorStateList m4 = lTs.m(context2, w, i4);
        setTickInactiveTintList(m4 == null ? C1.v(context2, R.color.material_slider_inactive_tick_marks_color) : m4);
        ColorStateList m5 = lTs.m(context2, w, i3);
        setTickActiveTintList(m5 == null ? C1.v(context2, R.color.material_slider_active_tick_marks_color) : m5);
        setThumbRadius(w.getDimensionPixelSize(11, 0));
        setHaloRadius(w.getDimensionPixelSize(6, 0));
        setThumbElevation(w.getDimension(10, 0.0f));
        setTrackHeight(w.getDimensionPixelSize(21, 0));
        setLabelBehavior(w.getInt(7, 0));
        if (!w.getBoolean(0, true)) {
            setEnabled(false);
        }
        w.recycle();
        setFocusable(true);
        setClickable(true);
        c18.j();
        this.f6798e = ViewConfiguration.get(context2).getScaledTouchSlop();
        pV pVVar = new pV(slider);
        this.f6787R = pVVar;
        of5.O(this, pVVar);
        this.f6781R = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final boolean C(int i) {
        int i2 = this.g;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.f6801e.size() - 1);
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.g = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.j != -1) {
            this.j = i3;
        }
        o();
        postInvalidate();
        return true;
    }

    public final boolean H() {
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(this) == 1;
    }

    public final void J() {
        if (this.f6793X) {
            float f = this.v;
            float f2 = this.c;
            if (f >= f2) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.v), Float.valueOf(this.c)));
            } else if (f2 <= f) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.c), Float.valueOf(this.v)));
            } else if (this.e <= 0.0f || x(f2 - f)) {
                Iterator it = this.f6801e.iterator();
                while (it.hasNext()) {
                    Float f3 = (Float) it.next();
                    if (f3.floatValue() < this.v || f3.floatValue() > this.c) {
                        throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f3, Float.valueOf(this.v), Float.valueOf(this.c)));
                    } else if (this.e > 0.0f && !x(f3.floatValue() - this.v)) {
                        throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f3, Float.valueOf(this.v), Float.valueOf(this.e), Float.valueOf(this.e)));
                    }
                }
                float minSeparation = getMinSeparation();
                if (minSeparation >= 0.0f) {
                    float f4 = this.e;
                    if (f4 > 0.0f && minSeparation > 0.0f) {
                        if (this.t != 1) {
                            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.e)));
                        } else if (minSeparation < f4 || !x(minSeparation)) {
                            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.e), Float.valueOf(this.e)));
                        }
                    }
                    float f5 = this.e;
                    if (f5 != 0.0f) {
                        if (((float) ((int) f5)) != f5) {
                            Log.w(R, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f5)));
                        }
                        float f6 = this.v;
                        if (((float) ((int) f6)) != f6) {
                            Log.w(R, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f6)));
                        }
                        float f7 = this.c;
                        if (((float) ((int) f7)) != f7) {
                            Log.w(R, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f7)));
                        }
                    }
                    this.f6793X = false;
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
            } else {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.e), Float.valueOf(this.v), Float.valueOf(this.c)));
            }
        }
    }

    public final void K() {
        boolean z;
        int max = Math.max(this.Z, Math.max(this.H + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.C * 2)));
        boolean z2 = false;
        if (max == this.m) {
            z = false;
        } else {
            this.m = max;
            z = true;
        }
        int max2 = Math.max(Math.max(this.C - this.O, 0), Math.max((this.H - this.L) / 2, 0)) + this.f6790X;
        if (this.U != max2) {
            this.U = max2;
            WeakHashMap weakHashMap = of5.f6887R;
            if (d6y.c(this)) {
                this.y = Math.max(getWidth() - (this.U * 2), 0);
                U();
            }
            z2 = true;
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final float[] L() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f6801e.size() == 1) {
            floatValue2 = this.v;
        }
        float P = P(floatValue2);
        float P2 = P(floatValue);
        return H() ? new float[]{P2, P} : new float[]{P, P2};
    }

    public final void N(int i) {
        if (H()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        C(i);
    }

    public final String O(float f) {
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final float P(float f) {
        float f2 = this.v;
        float f3 = (f - f2) / (this.c - f2);
        return H() ? 1.0f - f3 : f3;
    }

    public final void R(Drawable drawable) {
        int i = this.C * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = ((float) i) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    public final void U() {
        if (this.e > 0.0f) {
            J();
            int min = Math.min((int) (((this.c - this.v) / this.e) + 1.0f), (this.y / (this.H * 2)) + 1);
            float[] fArr = this.f6789R;
            if (fArr == null || fArr.length != min * 2) {
                this.f6789R = new float[min * 2];
            }
            float f = ((float) this.y) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f6789R;
                fArr2[i] = (((float) (i / 2)) * f) + ((float) this.U);
                fArr2[i + 1] = (float) v();
            }
        }
    }

    public final void V(int i, Rect rect) {
        int P = this.U + ((int) (P(getValues().get(i).floatValue()) * ((float) this.y)));
        int v = v();
        int i2 = this.C;
        rect.set(P - i2, v - i2, P + i2, v + i2);
    }

    public final void X() {
        if (this.f6788R) {
            this.f6788R = false;
            ValueAnimator c = c(false);
            this.f6803v = c;
            this.f6776R = null;
            c.addListener(new XM(6, this));
            this.f6803v.start();
        }
    }

    public final int Z(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final ValueAnimator c(boolean z) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f6803v : this.f6776R;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.setDuration(z ? 83 : 117);
        ofFloat.setInterpolator(z ? My.f297R : My.R);
        ofFloat.addUpdateListener(new e4(2, this));
        return ofFloat;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f6787R.C(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6778R.setColor(Z(this.f6791X));
        this.f6805v.setColor(Z(this.f6799e));
        this.f6792X.setColor(Z(this.f6794c));
        this.f6774O.setColor(Z(this.f6804v));
        Iterator it = this.f6784R.iterator();
        while (it.hasNext()) {
            j3y j3y = (j3y) it.next();
            if (j3y.isStateful()) {
                j3y.setState(getDrawableState());
            }
        }
        if (this.f6782R.isStateful()) {
            this.f6782R.setState(getDrawableState());
        }
        this.f6800e.setColor(Z(this.f6777R));
        this.f6800e.setAlpha(63);
    }

    public final void e(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.U + ((int) (P(f) * ((float) i))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i2) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void g(j3y j3y, float f) {
        String O = O(f);
        if (!TextUtils.equals(j3y.f4814R, O)) {
            j3y.f4814R = O;
            j3y.f4815R.f7028R = true;
            j3y.invalidateSelf();
        }
        int P = (this.U + ((int) (P(f) * ((float) this.y)))) - (j3y.getIntrinsicWidth() / 2);
        int v = v() - (this.P + this.C);
        j3y.setBounds(P, v - j3y.getIntrinsicHeight(), j3y.getIntrinsicWidth() + P, v);
        Rect rect = new Rect(j3y.getBounds());
        ljV.v(vd.i(this), this, rect);
        j3y.setBounds(rect);
        h89 V = vd.V(this);
        switch (V.e) {
            case 18:
                ((ViewGroupOverlay) V.R).add(j3y);
                return;
            default:
                ((ViewOverlay) V.R).add(j3y);
                return;
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return ((dMS) this.f6787R).f2572R;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.f6801e);
    }

    public final void i() {
        double d;
        float f = this.X;
        float f2 = this.e;
        if (f2 > 0.0f) {
            int i = (int) ((this.c - this.v) / f2);
            d = ((double) Math.round(f * ((float) i))) / ((double) i);
        } else {
            d = (double) f;
        }
        if (H()) {
            d = 1.0d - d;
        }
        float f3 = this.c;
        float f4 = this.v;
        t(this.j, (float) ((d * ((double) (f3 - f4))) + ((double) f4)));
    }

    public final void j() {
        Iterator it = this.f6796c.iterator();
        while (it.hasNext()) {
            ((M6) it.next()).v();
        }
    }

    public final boolean m() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final void o() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int P = (int) ((P(((Float) this.f6801e.get(this.g)).floatValue()) * ((float) this.y)) + ((float) this.U));
                int v = v();
                int i = this.N;
                cAO.O(background, P - i, v - i, P + i, v + i);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f6784R.iterator();
        while (it.hasNext()) {
            j3y j3y = (j3y) it.next();
            ViewGroup i = vd.i(this);
            if (i == null) {
                j3y.getClass();
            } else {
                j3y.getClass();
                int[] iArr = new int[2];
                i.getLocationOnScreen(iArr);
                j3y.x = iArr[0];
                i.getWindowVisibleDisplayFrame(j3y.f4813R);
                i.addOnLayoutChangeListener(j3y.f4816R);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        hk0 hk0 = this.f6783R;
        if (hk0 != null) {
            removeCallbacks(hk0);
        }
        this.f6788R = false;
        Iterator it = this.f6784R.iterator();
        while (it.hasNext()) {
            j3y j3y = (j3y) it.next();
            h89 V = vd.V(this);
            if (V != null) {
                V.C(j3y);
                ViewGroup i = vd.i(this);
                if (i == null) {
                    j3y.getClass();
                } else {
                    i.removeOnLayoutChangeListener(j3y.f4816R);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        if ((r14.x == 3) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b2  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
        // Method dump skipped, instructions count: 521
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oN.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.j = -1;
            this.f6787R.x(this.g);
            return;
        }
        if (i == 1) {
            C(Integer.MAX_VALUE);
        } else if (i == 2) {
            C(Integer.MIN_VALUE);
        } else if (i == 17) {
            N(Integer.MAX_VALUE);
        } else if (i == 66) {
            N(Integer.MIN_VALUE);
        }
        this.f6787R.K(this.g);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f6801e.size() == 1) {
            this.j = 0;
        }
        Float f = null;
        Boolean bool = null;
        if (this.j == -1) {
            if (i != 61) {
                if (i != 66) {
                    if (i != 81) {
                        if (i != 69) {
                            if (i != 70) {
                                switch (i) {
                                    case 21:
                                        N(-1);
                                        bool = Boolean.TRUE;
                                        break;
                                    case 22:
                                        N(1);
                                        bool = Boolean.TRUE;
                                        break;
                                }
                            }
                        } else {
                            C(-1);
                            bool = Boolean.TRUE;
                        }
                    }
                    C(1);
                    bool = Boolean.TRUE;
                }
                this.j = this.g;
                postInvalidate();
                bool = Boolean.TRUE;
            } else {
                bool = keyEvent.hasNoModifiers() ? Boolean.valueOf(C(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(C(-1)) : Boolean.FALSE;
            }
            return bool != null ? bool.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean isLongPress = this.f6802e | keyEvent.isLongPress();
        this.f6802e = isLongPress;
        float f2 = 1.0f;
        if (isLongPress) {
            float f3 = this.e;
            if (f3 != 0.0f) {
                f2 = f3;
            }
            float f4 = (this.c - this.v) / f2;
            float f5 = (float) 20;
            if (f4 > f5) {
                f2 *= (float) Math.round(f4 / f5);
            }
        } else {
            float f6 = this.e;
            if (f6 != 0.0f) {
                f2 = f6;
            }
        }
        if (i == 21) {
            if (!H()) {
                f2 = -f2;
            }
            f = Float.valueOf(f2);
        } else if (i == 22) {
            if (H()) {
                f2 = -f2;
            }
            f = Float.valueOf(f2);
        } else if (i == 69) {
            f = Float.valueOf(-f2);
        } else if (i == 70 || i == 81) {
            f = Float.valueOf(f2);
        }
        if (f != null) {
            if (t(this.j, f.floatValue() + ((Float) this.f6801e.get(this.j)).floatValue())) {
                o();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return C(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return C(-1);
                }
                return false;
            }
        }
        this.j = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f6802e = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r6 = r4.m
            int r0 = r4.x
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x000f
            r3 = 3
            if (r0 != r3) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            if (r1 == 0) goto L_0x001b
        L_0x000f:
            java.util.ArrayList r0 = r4.f6784R
            java.lang.Object r0 = r0.get(r2)
            j3y r0 = (defpackage.j3y) r0
            int r2 = r0.getIntrinsicHeight()
        L_0x001b:
            int r6 = r6 + r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oN.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Ju ju = (Ju) parcelable;
        super.onRestoreInstanceState(ju.getSuperState());
        this.v = ju.R;
        this.c = ju.v;
        y(ju.f211R);
        this.e = ju.c;
        if (ju.f212R) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Ju ju = new Ju(super.onSaveInstanceState());
        ju.R = this.v;
        ju.v = this.c;
        ju.f211R = new ArrayList(this.f6801e);
        ju.c = this.e;
        ju.f212R = hasFocus();
        return ju;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.y = Math.max(i - (this.U * 2), 0);
        U();
        o();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.U)) / ((float) this.y);
        this.X = f;
        float max = Math.max(0.0f, f);
        this.X = max;
        this.X = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6775R = x;
            if (!m()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                Slider slider = (Slider) this;
                if (slider.getActiveThumbIndex() == -1) {
                    slider.setActiveThumbIndex(0);
                }
                requestFocus();
                this.f6807v = true;
                i();
                o();
                invalidate();
                j();
            }
        } else if (actionMasked == 1) {
            this.f6807v = false;
            MotionEvent motionEvent2 = this.f6780R;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f6780R.getX() - motionEvent.getX()) <= ((float) this.f6798e) && Math.abs(this.f6780R.getY() - motionEvent.getY()) <= ((float) this.f6798e)) {
                Slider slider2 = (Slider) this;
                if (slider2.getActiveThumbIndex() == -1) {
                    slider2.setActiveThumbIndex(0);
                }
                j();
            }
            if (this.j != -1) {
                i();
                this.j = -1;
                Iterator it = this.f6796c.iterator();
                while (it.hasNext()) {
                    ((M6) it.next()).R();
                }
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f6807v) {
                if (m() && Math.abs(x - this.f6775R) < ((float) this.f6798e)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                j();
            }
            Slider slider3 = (Slider) this;
            if (slider3.getActiveThumbIndex() == -1) {
                slider3.setActiveThumbIndex(0);
            }
            this.f6807v = true;
            i();
            o();
            invalidate();
        }
        setPressed(this.f6807v);
        this.f6780R = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        h89 V;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (V = vd.V(this)) != null) {
            Iterator it = this.f6784R.iterator();
            while (it.hasNext()) {
                V.C((j3y) it.next());
            }
        }
    }

    public void setActiveThumbIndex(int i) {
        this.j = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.t = i;
        this.f6793X = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbRadius(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        y(arrayList);
    }

    public final boolean t(int i, float f) {
        this.g = i;
        if (((double) Math.abs(f - ((Float) this.f6801e.get(i)).floatValue())) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.t == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - ((float) this.U)) / ((float) this.y);
                float f3 = this.v;
                minSeparation = jQ.v(f3, this.c, f2, f3);
            }
        }
        if (H()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        float floatValue = i2 >= this.f6801e.size() ? this.c : ((Float) this.f6801e.get(i2)).floatValue() - minSeparation;
        int i3 = i - 1;
        float floatValue2 = i3 < 0 ? this.v : minSeparation + ((Float) this.f6801e.get(i3)).floatValue();
        if (f < floatValue2) {
            f = floatValue2;
        } else if (f > floatValue) {
            f = floatValue;
        }
        this.f6801e.set(i, Float.valueOf(f));
        Iterator it = this.f6806v.iterator();
        while (it.hasNext()) {
            ((Float) this.f6801e.get(i)).floatValue();
            ((Jn) it.next()).R();
        }
        AccessibilityManager accessibilityManager = this.f6781R;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        Runnable runnable = this.f6783R;
        if (runnable == null) {
            this.f6783R = new hk0(this, 0);
        } else {
            removeCallbacks(runnable);
        }
        hk0 hk0 = this.f6783R;
        hk0.X = i;
        postDelayed(hk0, 200);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v() {
        /*
            r5 = this;
            int r0 = r5.m
            int r0 = r0 / 2
            int r1 = r5.x
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0011
            r4 = 3
            if (r1 != r4) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            if (r2 == 0) goto L_0x001d
        L_0x0011:
            java.util.ArrayList r5 = r5.f6784R
            java.lang.Object r5 = r5.get(r3)
            j3y r5 = (defpackage.j3y) r5
            int r3 = r5.getIntrinsicHeight()
        L_0x001d:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oN.v():int");
    }

    public final boolean x(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.e)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final void y(ArrayList arrayList) {
        int i;
        int i2;
        int i3;
        ViewGroup i4;
        int resourceId;
        h89 V;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f6801e.size() != arrayList.size() || !this.f6801e.equals(arrayList)) {
                this.f6801e = arrayList;
                int i5 = 1;
                this.f6793X = true;
                this.g = 0;
                o();
                if (this.f6784R.size() > this.f6801e.size()) {
                    List<j3y> subList = this.f6784R.subList(this.f6801e.size(), this.f6784R.size());
                    for (j3y j3y : subList) {
                        WeakHashMap weakHashMap = of5.f6887R;
                        if (d6y.v(this) && (V = vd.V(this)) != null) {
                            V.C(j3y);
                            ViewGroup i6 = vd.i(this);
                            if (i6 == null) {
                                j3y.getClass();
                            } else {
                                i6.removeOnLayoutChangeListener(j3y.f4816R);
                            }
                        }
                    }
                    subList.clear();
                }
                while (this.f6784R.size() < this.f6801e.size()) {
                    mAv mav = this.f6786R;
                    TypedArray w = aH9.w(((oN) mav.v).getContext(), (AttributeSet) mav.f5962R, hDC.W, mav.R, 2132018221, new int[0]);
                    Context context = ((oN) mav.v).getContext();
                    int resourceId2 = w.getResourceId(8, 2132018255);
                    j3y j3y2 = new j3y(context, resourceId2);
                    TypedArray w2 = aH9.w(j3y2.f4811R, null, hDC.B, 0, resourceId2, new int[0]);
                    j3y2.m = j3y2.f4811R.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                    dOE doe = ((c18) j3y2).f1920R.f6907R;
                    doe.getClass();
                    nBP nbp = new nBP(doe);
                    nbp.c = j3y2.o();
                    j3y2.setShapeAppearanceModel(new dOE(nbp));
                    CharSequence text = w2.getText(6);
                    if (!TextUtils.equals(j3y2.f4814R, text)) {
                        j3y2.f4814R = text;
                        j3y2.f4815R.f7028R = true;
                        j3y2.invalidateSelf();
                    }
                    cod cod = (!w2.hasValue(0) || (resourceId = w2.getResourceId(0, 0)) == 0) ? null : new cod(j3y2.f4811R, resourceId);
                    if (cod != null && w2.hasValue(1)) {
                        cod.f2202v = lTs.m(j3y2.f4811R, w2, 1);
                    }
                    j3y2.f4815R.v(cod, j3y2.f4811R);
                    Context context2 = j3y2.f4811R;
                    TypedValue r = hDC.r(R.attr.colorOnBackground, context2, j3y.class.getCanonicalName());
                    int i7 = r.resourceId;
                    if (i7 != 0) {
                        Object obj = C1.R;
                        i = dmD.R(context2, i7);
                    } else {
                        i = r.data;
                    }
                    Context context3 = j3y2.f4811R;
                    TypedValue r2 = hDC.r(16842801, context3, j3y.class.getCanonicalName());
                    int i8 = r2.resourceId;
                    if (i8 != 0) {
                        Object obj2 = C1.R;
                        i2 = dmD.R(context3, i8);
                    } else {
                        i2 = r2.data;
                    }
                    j3y2.C(ColorStateList.valueOf(w2.getColor(7, B7.v(B7.c(i, 153), B7.c(i2, 229)))));
                    Context context4 = j3y2.f4811R;
                    TypedValue r3 = hDC.r(R.attr.colorSurface, context4, j3y.class.getCanonicalName());
                    int i9 = r3.resourceId;
                    if (i9 != 0) {
                        Object obj3 = C1.R;
                        i3 = dmD.R(context4, i9);
                    } else {
                        i3 = r3.data;
                    }
                    j3y2.g(ColorStateList.valueOf(i3));
                    j3y2.X = w2.getDimensionPixelSize(2, 0);
                    j3y2.O = w2.getDimensionPixelSize(4, 0);
                    j3y2.L = w2.getDimensionPixelSize(5, 0);
                    j3y2.Z = w2.getDimensionPixelSize(3, 0);
                    w2.recycle();
                    w.recycle();
                    this.f6784R.add(j3y2);
                    WeakHashMap weakHashMap2 = of5.f6887R;
                    if (d6y.v(this) && (i4 = vd.i(this)) != null) {
                        int[] iArr = new int[2];
                        i4.getLocationOnScreen(iArr);
                        j3y2.x = iArr[0];
                        i4.getWindowVisibleDisplayFrame(j3y2.f4813R);
                        i4.addOnLayoutChangeListener(j3y2.f4816R);
                    }
                }
                if (this.f6784R.size() == 1) {
                    i5 = 0;
                }
                Iterator it = this.f6784R.iterator();
                while (it.hasNext()) {
                    j3y j3y3 = (j3y) it.next();
                    ((c18) j3y3).f1920R.c = (float) i5;
                    j3y3.invalidateSelf();
                }
                Iterator it2 = this.f6806v.iterator();
                while (it2.hasNext()) {
                    Jn jn = (Jn) it2.next();
                    Iterator it3 = this.f6801e.iterator();
                    while (it3.hasNext()) {
                        ((Float) it3.next()).floatValue();
                        jn.R();
                    }
                }
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public void setValues(List<Float> list) {
        y(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f6779R = null;
        this.f6785R = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f6785R;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            R(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
