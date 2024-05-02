package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.Chip;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements n7, kOI {
    public boolean O;

    /* renamed from: R  reason: collision with other field name */
    public final H0 f2306R;

    /* renamed from: R  reason: collision with other field name */
    public OW f2307R;

    /* renamed from: R  reason: collision with other field name */
    public InsetDrawable f2310R;

    /* renamed from: R  reason: collision with other field name */
    public RippleDrawable f2311R;

    /* renamed from: R  reason: collision with other field name */
    public View.OnClickListener f2312R;

    /* renamed from: R  reason: collision with other field name */
    public CompoundButton.OnCheckedChangeListener f2313R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f2314R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2316R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f2317X;
    public boolean c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f2318e;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2319v;
    public static final Rect v = new Rect();
    public static final int[] R = {16842913};

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f2305v = {16842911};

    /* renamed from: R  reason: collision with other field name */
    public final Rect f2308R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final RectF f2309R = new RectF();

    /* renamed from: R  reason: collision with other field name */
    public final zt f2315R = new zt(0, this);

    public Chip(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.chipStyle, 2132018166), attributeSet, R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        OW ow = new OW(context2, attributeSet);
        Context context3 = ow.f341R;
        int[] iArr = hDC.H;
        TypedArray w = aH9.w(context3, attributeSet, iArr, R.attr.chipStyle, 2132018166, new int[0]);
        ow.f333H = w.hasValue(37);
        ColorStateList m = lTs.m(ow.f341R, w, 24);
        if (ow.f342R != m) {
            ow.f342R = m;
            ow.onStateChange(ow.getState());
        }
        ColorStateList m2 = lTs.m(ow.f341R, w, 11);
        if (ow.f376v != m2) {
            ow.f376v = m2;
            ow.onStateChange(ow.getState());
        }
        float dimension = w.getDimension(19, 0.0f);
        if (ow.f340R != dimension) {
            ow.f340R = dimension;
            ow.invalidateSelf();
            ow.u();
        }
        if (w.hasValue(12)) {
            ow.d(w.getDimension(12, 0.0f));
        }
        ow.k(lTs.m(ow.f341R, w, 22));
        ow.p(w.getDimension(23, 0.0f));
        ow.D(lTs.m(ow.f341R, w, 36));
        String text = w.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(ow.f352R, text)) {
            ow.f352R = text;
            ow.f354R.f7028R = true;
            ow.invalidateSelf();
            ow.u();
        }
        gm9 gm9 = null;
        cod cod = (!w.hasValue(0) || (resourceId3 = w.getResourceId(0, 0)) == 0) ? null : new cod(ow.f341R, resourceId3);
        cod.X = w.getDimension(1, cod.X);
        ow.f354R.v(cod, ow.f341R);
        int i = w.getInt(3, 0);
        if (i == 1) {
            ow.f350R = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            ow.f350R = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            ow.f350R = TextUtils.TruncateAt.END;
        }
        ow.r(w.getBoolean(18, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            ow.r(w.getBoolean(15, false));
        }
        ow.W(lTs.x(ow.f341R, w, 14));
        if (w.hasValue(17)) {
            ow.T(lTs.m(ow.f341R, w, 17));
        }
        ow.s(w.getDimension(16, -1.0f));
        ow.f(w.getBoolean(31, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            ow.f(w.getBoolean(26, false));
        }
        ow.G(lTs.x(ow.f341R, w, 25));
        ow.E(lTs.m(ow.f341R, w, 30));
        ow.l(w.getDimension(28, 0.0f));
        ow.n(w.getBoolean(6, false));
        ow.S(w.getBoolean(10, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            ow.S(w.getBoolean(8, false));
        }
        ow.Q(lTs.x(ow.f341R, w, 7));
        if (w.hasValue(9)) {
            ow.A(lTs.m(ow.f341R, w, 9));
        }
        ow.f351R = (!w.hasValue(39) || (resourceId2 = w.getResourceId(39, 0)) == 0) ? null : gm9.R(ow.f341R, resourceId2);
        Context context4 = ow.f341R;
        if (w.hasValue(33) && (resourceId = w.getResourceId(33, 0)) != 0) {
            gm9 = gm9.R(context4, resourceId);
        }
        ow.f378v = gm9;
        float dimension2 = w.getDimension(21, 0.0f);
        if (ow.O != dimension2) {
            ow.O = dimension2;
            ow.invalidateSelf();
            ow.u();
        }
        ow.F(w.getDimension(35, 0.0f));
        ow.a(w.getDimension(34, 0.0f));
        float dimension3 = w.getDimension(41, 0.0f);
        if (ow.m != dimension3) {
            ow.m = dimension3;
            ow.invalidateSelf();
            ow.u();
        }
        float dimension4 = w.getDimension(40, 0.0f);
        if (ow.x != dimension4) {
            ow.x = dimension4;
            ow.invalidateSelf();
            ow.u();
        }
        ow.M(w.getDimension(29, 0.0f));
        ow.B(w.getDimension(27, 0.0f));
        float dimension5 = w.getDimension(13, 0.0f);
        if (ow.C != dimension5) {
            ow.C = dimension5;
            ow.invalidateSelf();
            ow.u();
        }
        ow.f331C = w.getDimensionPixelSize(4, Integer.MAX_VALUE);
        w.recycle();
        TypedArray w2 = aH9.w(context2, attributeSet, iArr, R.attr.chipStyle, 2132018166, new int[0]);
        this.f2317X = w2.getBoolean(32, false);
        this.X = (int) Math.ceil((double) w2.getDimension(20, (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 48, getContext().getResources().getDisplayMetrics()))));
        w2.recycle();
        setChipDrawable(ow);
        WeakHashMap weakHashMap = of5.f6887R;
        ow.U(m18.m(this));
        TypedArray w3 = aH9.w(context2, attributeSet, iArr, R.attr.chipStyle, 2132018166, new int[0]);
        boolean hasValue = w3.hasValue(37);
        w3.recycle();
        this.f2306R = new H0(this, this);
        X();
        if (!hasValue) {
            setOutlineProvider(new u8(this));
        }
        setChecked(this.f2316R);
        setText(ow.f352R);
        setEllipsize(ow.f350R);
        Z();
        if (!this.f2307R.f380x) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        L();
        if (this.f2317X) {
            setMinHeight(this.X);
        }
        this.e = eHQ.e(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Fy
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = Chip.this;
                chip.getClass();
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f2313R;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f2309R.setEmpty();
        if (e() && this.f2312R != null) {
            OW ow = this.f2307R;
            RectF rectF = this.f2309R;
            Rect bounds = ow.getBounds();
            rectF.setEmpty();
            if (ow.q()) {
                float f = ow.C + ow.U + ow.X + ow.H + ow.x;
                if (f4J.R(ow) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.f2309R;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f2308R.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f2308R;
    }

    private cod getTextAppearance() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f354R.f7025R;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.c != z) {
            this.c = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f2319v != z) {
            this.f2319v = z;
            refreshDrawableState();
        }
    }

    public final void L() {
        OW ow;
        if (!TextUtils.isEmpty(getText()) && (ow = this.f2307R) != null) {
            int J = (int) (ow.J() + ow.C + ow.x);
            OW ow2 = this.f2307R;
            int K = (int) (ow2.K() + ow2.O + ow2.m);
            if (this.f2310R != null) {
                Rect rect = new Rect();
                this.f2310R.getPadding(rect);
                K += rect.left;
                J += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = of5.f6887R;
            eHQ.H(this, K, paddingTop, J, paddingBottom);
        }
    }

    public final void O() {
        ColorStateList colorStateList = this.f2307R.f368e;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2311R = new RippleDrawable(colorStateList, getBackgroundDrawable(), null);
        OW ow = this.f2307R;
        if (ow.f374m) {
            ow.f374m = false;
            ow.f373m = null;
            ow.onStateChange(ow.getState());
        }
        RippleDrawable rippleDrawable = this.f2311R;
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(this, rippleDrawable);
        L();
    }

    public final void X() {
        if (e()) {
            OW ow = this.f2307R;
            if ((ow != null && ow.f359X) && this.f2312R != null) {
                of5.O(this, this.f2306R);
                this.O = true;
                return;
            }
        }
        of5.O(this, null);
        this.O = false;
    }

    public final void Z() {
        TextPaint paint = getPaint();
        OW ow = this.f2307R;
        if (ow != null) {
            paint.drawableState = ow.getState();
        }
        cod textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.X(getContext(), paint, this.f2315R);
        }
    }

    public final void c(int i) {
        this.X = i;
        int i2 = 0;
        if (!this.f2317X) {
            InsetDrawable insetDrawable = this.f2310R;
            if (insetDrawable == null) {
                O();
            } else if (insetDrawable != null) {
                this.f2310R = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                O();
            }
        } else {
            int max = Math.max(0, i - ((int) this.f2307R.f340R));
            int max2 = Math.max(0, i - this.f2307R.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i3 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i2 = max / 2;
                }
                if (this.f2310R != null) {
                    Rect rect = new Rect();
                    this.f2310R.getPadding(rect);
                    if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                        O();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.f2310R = new InsetDrawable((Drawable) this.f2307R, i3, i2, i3, i2);
                O();
                return;
            }
            InsetDrawable insetDrawable2 = this.f2310R;
            if (insetDrawable2 == null) {
                O();
            } else if (insetDrawable2 != null) {
                this.f2310R = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                O();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.O ? super.dispatchHoverEvent(motionEvent) : this.f2306R.C(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.O) {
            return super.dispatchKeyEvent(keyEvent);
        }
        H0 h0 = this.f2306R;
        h0.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                z = false;
                                while (i < repeatCount && h0.g(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = ((dMS) h0).v;
                    if (i3 != Integer.MIN_VALUE) {
                        h0.t(i3, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = h0.g(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = h0.g(1, null);
            }
        }
        if (!z || ((dMS) this.f2306R).v == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView, android.widget.CompoundButton, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r5 = this;
            super.drawableStateChanged()
            OW r0 = r5.f2307R
            r1 = 0
            if (r0 == 0) goto L_0x0085
            android.graphics.drawable.Drawable r0 = r0.f377v
            boolean r0 = defpackage.OW.I(r0)
            if (r0 == 0) goto L_0x0085
            OW r0 = r5.f2307R
            boolean r2 = r5.isEnabled()
            boolean r3 = r5.f2318e
            if (r3 == 0) goto L_0x001c
            int r2 = r2 + 1
        L_0x001c:
            boolean r3 = r5.c
            if (r3 == 0) goto L_0x0022
            int r2 = r2 + 1
        L_0x0022:
            boolean r3 = r5.f2319v
            if (r3 == 0) goto L_0x0028
            int r2 = r2 + 1
        L_0x0028:
            boolean r3 = r5.isChecked()
            if (r3 == 0) goto L_0x0030
            int r2 = r2 + 1
        L_0x0030:
            int[] r2 = new int[r2]
            boolean r3 = r5.isEnabled()
            if (r3 == 0) goto L_0x003f
            r3 = 16842910(0x101009e, float:2.3694E-38)
            r2[r1] = r3
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = r1
        L_0x0040:
            boolean r4 = r5.f2318e
            if (r4 == 0) goto L_0x004b
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r3] = r4
            int r3 = r3 + 1
        L_0x004b:
            boolean r4 = r5.c
            if (r4 == 0) goto L_0x0056
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r2[r3] = r4
            int r3 = r3 + 1
        L_0x0056:
            boolean r4 = r5.f2319v
            if (r4 == 0) goto L_0x0061
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            r2[r3] = r4
            int r3 = r3 + 1
        L_0x0061:
            boolean r4 = r5.isChecked()
            if (r4 == 0) goto L_0x006c
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r3] = r4
        L_0x006c:
            int[] r3 = r0.f355R
            boolean r3 = java.util.Arrays.equals(r3, r2)
            if (r3 != 0) goto L_0x0085
            r0.f355R = r2
            boolean r3 = r0.q()
            if (r3 == 0) goto L_0x0085
            int[] r1 = r0.getState()
            boolean r0 = r0.z(r1, r2)
            r1 = r0
        L_0x0085:
            if (r1 == 0) goto L_0x008a
            r5.invalidate()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.drawableStateChanged():void");
    }

    public final boolean e() {
        OW ow = this.f2307R;
        if (ow != null) {
            Drawable drawable = ow.f377v;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof i2s) {
                ndA nda = (ndA) ((i2s) drawable);
                drawable = null;
                nda.getClass();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.CheckBox, android.widget.TextView, android.widget.CompoundButton, android.widget.Button, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2314R)) {
            return this.f2314R;
        }
        OW ow = this.f2307R;
        if (!(ow != null && ow.f339O)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2310R;
        return insetDrawable == null ? this.f2307R : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f366c;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f335L;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f376v;
        }
        return null;
    }

    public float getChipCornerRadius() {
        OW ow = this.f2307R;
        if (ow != null) {
            return Math.max(0.0f, ow.Y());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2307R;
    }

    public float getChipEndPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.C;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        OW ow = this.f2307R;
        if (ow == null || (drawable = ow.f347R) == null) {
            return null;
        }
        if (!(drawable instanceof i2s)) {
            return drawable;
        }
        ((ndA) ((i2s) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.e;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f358X;
        }
        return null;
    }

    public float getChipMinHeight() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f340R;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.O;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f363c;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.c;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        OW ow = this.f2307R;
        if (ow == null || (drawable = ow.f377v) == null) {
            return null;
        }
        if (!(drawable instanceof i2s)) {
            return drawable;
        }
        ((ndA) ((i2s) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f349R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.U;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.X;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.H;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f338O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f350R;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.O) {
            H0 h0 = this.f2306R;
            if (((dMS) h0).v == 1 || ((dMS) h0).f2572R == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public gm9 getHideMotionSpec() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f378v;
        }
        return null;
    }

    public float getIconEndPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.L;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f368e;
        }
        return null;
    }

    public dOE getShapeAppearanceModel() {
        return ((c18) this.f2307R).f1920R.f6907R;
    }

    public gm9 getShowMotionSpec() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.f351R;
        }
        return null;
    }

    public float getTextEndPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.x;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        OW ow = this.f2307R;
        if (ow != null) {
            return ow.m;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hDC.k(this, this.f2307R);
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, R);
        }
        OW ow = this.f2307R;
        if (ow != null && ow.f339O) {
            View.mergeDrawableStates(onCreateDrawableState, f2305v);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.O) {
            H0 h0 = this.f2306R;
            int i2 = ((dMS) h0).v;
            if (i2 != Integer.MIN_VALUE) {
                h0.x(i2);
            }
            if (z) {
                h0.g(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        OW ow = this.f2307R;
        accessibilityNodeInfo.setCheckable(ow != null && ow.f339O);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.TextView, android.widget.Button, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.e != i) {
            this.e = i;
            L();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    @Override // android.widget.TextView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f2319v
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x004e
            r5.setCloseIconPressed(r3)
            goto L_0x004e
        L_0x002b:
            boolean r0 = r5.f2319v
            if (r0 == 0) goto L_0x0044
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f2312R
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            boolean r0 = r5.O
            if (r0 == 0) goto L_0x0042
            H0 r0 = r5.f2306R
            r0.J(r2, r2)
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            r5.setCloseIconPressed(r3)
            goto L_0x0051
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r2)
        L_0x004e:
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2314R = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2311R) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2311R) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.n(z);
        }
    }

    public void setCheckableResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.n(ow.f341R.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        OW ow = this.f2307R;
        if (ow == null) {
            this.f2316R = z;
        } else if (ow.f339O) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.Q(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.Q(aH9.p(ow.f341R, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.A(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.A(C1.v(ow.f341R, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.S(ow.f341R.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        OW ow = this.f2307R;
        if (ow != null && ow.f376v != colorStateList) {
            ow.f376v = colorStateList;
            ow.onStateChange(ow.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList v2;
        OW ow = this.f2307R;
        if (ow != null && ow.f376v != (v2 = C1.v(ow.f341R, i))) {
            ow.f376v = v2;
            ow.onStateChange(ow.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.d(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.d(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(OW ow) {
        OW ow2 = this.f2307R;
        if (ow2 != ow) {
            if (ow2 != null) {
                ow2.f353R = new WeakReference(null);
            }
            this.f2307R = ow;
            ow.f380x = false;
            ow.f353R = new WeakReference(this);
            c(this.X);
        }
    }

    public void setChipEndPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null && ow.C != f) {
            ow.C = f;
            ow.invalidateSelf();
            ow.u();
        }
    }

    public void setChipEndPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            float dimension = ow.f341R.getResources().getDimension(i);
            if (ow.C != dimension) {
                ow.C = dimension;
                ow.invalidateSelf();
                ow.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.W(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.W(aH9.p(ow.f341R, i));
        }
    }

    public void setChipIconSize(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.s(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.s(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.T(C1.v(ow.f341R, i));
        }
    }

    public void setChipIconVisible(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.r(ow.f341R.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        OW ow = this.f2307R;
        if (ow != null && ow.f340R != f) {
            ow.f340R = f;
            ow.invalidateSelf();
            ow.u();
        }
    }

    public void setChipMinHeightResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            float dimension = ow.f341R.getResources().getDimension(i);
            if (ow.f340R != dimension) {
                ow.f340R = dimension;
                ow.invalidateSelf();
                ow.u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null && ow.O != f) {
            ow.O = f;
            ow.invalidateSelf();
            ow.u();
        }
    }

    public void setChipStartPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            float dimension = ow.f341R.getResources().getDimension(i);
            if (ow.O != dimension) {
                ow.O = dimension;
                ow.invalidateSelf();
                ow.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.k(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.k(C1.v(ow.f341R, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.p(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.p(ow.f341R.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.G(drawable);
        }
        X();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        OW ow = this.f2307R;
        if (ow != null && ow.f349R != charSequence) {
            nL c = nL.c();
            ow.f349R = c.e(charSequence, c.f6373R);
            ow.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.B(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.B(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.G(aH9.p(ow.f341R, i));
        }
        X();
    }

    public void setCloseIconSize(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.l(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.l(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.M(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.M(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.E(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.E(C1.v(ow.f341R, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OW ow = this.f2307R;
        if (ow != null) {
            ow.U(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2307R != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                OW ow = this.f2307R;
                if (ow != null) {
                    ow.f350R = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f2317X = z;
        c(this.X);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(gm9 gm9) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f378v = gm9;
        }
    }

    public void setHideMotionSpecResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f378v = gm9.R(ow.f341R, i);
        }
    }

    public void setIconEndPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.a(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.a(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.F(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.F(ow.f341R.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(bX2 bx2) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f2307R != null) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f331C = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2313R = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2312R = onClickListener;
        X();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.D(colorStateList);
        }
        if (!this.f2307R.f374m) {
            O();
        }
    }

    public void setRippleColorResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.D(C1.v(ow.f341R, i));
            if (!this.f2307R.f374m) {
                O();
            }
        }
    }

    @Override // defpackage.kOI
    public void setShapeAppearanceModel(dOE doe) {
        this.f2307R.setShapeAppearanceModel(doe);
    }

    public void setShowMotionSpec(gm9 gm9) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f351R = gm9;
        }
    }

    public void setShowMotionSpecResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f351R = gm9.R(ow.f341R, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        OW ow = this.f2307R;
        if (ow != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(ow.f380x ? null : charSequence, bufferType);
            OW ow2 = this.f2307R;
            if (ow2 != null && !TextUtils.equals(ow2.f352R, charSequence)) {
                ow2.f352R = charSequence;
                ow2.f354R.f7028R = true;
                ow2.invalidateSelf();
                ow2.u();
            }
        }
    }

    public void setTextAppearance(cod cod) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f354R.v(cod, ow.f341R);
        }
        Z();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null && ow.x != f) {
            ow.x = f;
            ow.invalidateSelf();
            ow.u();
        }
    }

    public void setTextEndPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            float dimension = ow.f341R.getResources().getDimension(i);
            if (ow.x != dimension) {
                ow.x = dimension;
                ow.invalidateSelf();
                ow.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        OW ow = this.f2307R;
        if (ow != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            ovn ovn = ow.f354R;
            cod cod = ovn.f7025R;
            if (cod != null) {
                cod.X = applyDimension;
                ovn.f7024R.setTextSize(applyDimension);
                ow.R();
            }
        }
        Z();
    }

    public void setTextStartPadding(float f) {
        OW ow = this.f2307R;
        if (ow != null && ow.m != f) {
            ow.m = f;
            ow.invalidateSelf();
            ow.u();
        }
    }

    public void setTextStartPaddingResource(int i) {
        OW ow = this.f2307R;
        if (ow != null) {
            float dimension = ow.f341R.getResources().getDimension(i);
            if (ow.m != dimension) {
                ow.m = dimension;
                ow.invalidateSelf();
                ow.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f(z);
        }
        X();
    }

    public void setCheckedIconVisible(boolean z) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.S(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        OW ow = this.f2307R;
        if (ow != null) {
            ow.r(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f354R.v(new cod(ow.f341R, i), ow.f341R);
        }
        Z();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        OW ow = this.f2307R;
        if (ow != null) {
            ow.f354R.v(new cod(ow.f341R, i), ow.f341R);
        }
        Z();
    }
}
