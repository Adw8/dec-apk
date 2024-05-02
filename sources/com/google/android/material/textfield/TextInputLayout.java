package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] R = {new int[]{16842919}, new int[0]};
    public int C;
    public int H;

    /* renamed from: H  reason: collision with other field name */
    public boolean f2342H;
    public int I;
    public int J;
    public int K;

    /* renamed from: L  reason: collision with other field name */
    public boolean f2343L;
    public int N;

    /* renamed from: O  reason: collision with other field name */
    public ColorStateList f2344O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f2345O;
    public int P;

    /* renamed from: R  reason: collision with other field name */
    public final QL f2346R;

    /* renamed from: R  reason: collision with other field name */
    public TC f2347R;

    /* renamed from: R  reason: collision with other field name */
    public ValueAnimator f2348R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f2349R;

    /* renamed from: R  reason: collision with other field name */
    public Typeface f2352R;

    /* renamed from: R  reason: collision with other field name */
    public ColorDrawable f2353R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f2354R;

    /* renamed from: R  reason: collision with other field name */
    public StateListDrawable f2355R;

    /* renamed from: R  reason: collision with other field name */
    public EditText f2356R;

    /* renamed from: R  reason: collision with other field name */
    public final FrameLayout f2357R;

    /* renamed from: R  reason: collision with other field name */
    public c18 f2358R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f2359R;

    /* renamed from: R  reason: collision with other field name */
    public final doZ f2360R;

    /* renamed from: R  reason: collision with other field name */
    public fkN f2361R;

    /* renamed from: R  reason: collision with other field name */
    public final iOp f2362R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f2363R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2367R;
    public final int U;

    /* renamed from: U  reason: collision with other field name */
    public boolean f2368U;
    public int V;

    /* renamed from: X  reason: collision with other field name */
    public ColorStateList f2369X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f2370X;
    public int Y;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f2371Z;
    public ColorStateList c;

    /* renamed from: c  reason: collision with other field name */
    public c18 f2372c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f2373c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2374c;

    /* renamed from: e  reason: collision with other field name */
    public ColorStateList f2375e;

    /* renamed from: e  reason: collision with other field name */
    public c18 f2376e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f2377e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f2378m;
    public int o;
    public int t;
    public int u;
    public TC v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f2379v;

    /* renamed from: v  reason: collision with other field name */
    public ColorDrawable f2381v;

    /* renamed from: v  reason: collision with other field name */
    public c18 f2382v;

    /* renamed from: v  reason: collision with other field name */
    public fkN f2383v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f2384v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2385v;
    public int x;

    /* renamed from: x  reason: collision with other field name */
    public boolean f2386x;
    public int y;
    public int z;
    public int e = -1;
    public int X = -1;
    public int O = -1;
    public int L = -1;

    /* renamed from: R  reason: collision with other field name */
    public final nje f2365R = new nje(this);

    /* renamed from: R  reason: collision with other field name */
    public obf f2366R = new gkL(0);

    /* renamed from: R  reason: collision with other field name */
    public final Rect f2350R = new Rect();

    /* renamed from: v  reason: collision with other field name */
    public final Rect f2380v = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final RectF f2351R = new RectF();

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f2364R = new LinkedHashSet();

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: CV */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r19, android.util.AttributeSet r20) {
        /*
        // Method dump skipped, instructions count: 916
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.f2356R;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int t = vd.t(this.f2356R, R.attr.colorControlHighlight);
                int i2 = this.C;
                if (i2 == 2) {
                    Context context = getContext();
                    c18 c18 = this.f2358R;
                    int[][] iArr = R;
                    TypedValue r = hDC.r(R.attr.colorSurface, context, "TextInputLayout");
                    int i3 = r.resourceId;
                    if (i3 != 0) {
                        Object obj = C1.R;
                        i = dmD.R(context, i3);
                    } else {
                        i = r.data;
                    }
                    c18 c182 = new c18(c18.f1920R.f6907R);
                    int Y = vd.Y(t, i, 0.1f);
                    c182.C(new ColorStateList(iArr, new int[]{Y, 0}));
                    c182.setTint(i);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{Y, i});
                    c18 c183 = new c18(c18.f1920R.f6907R);
                    c183.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c182, c183), c18});
                } else if (i2 != 1) {
                    return null;
                } else {
                    c18 c184 = this.f2358R;
                    int i4 = this.t;
                    return new RippleDrawable(new ColorStateList(R, new int[]{vd.Y(t, i4, 0.1f), i4}), c184, c184);
                }
            }
        }
        return this.f2358R;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2355R == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2355R = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2355R.addState(new int[0], X(false));
        }
        return this.f2355R;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2382v == null) {
            this.f2382v = X(true);
        }
        return this.f2382v;
    }

    private void setEditText(EditText editText) {
        if (this.f2356R == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f2356R = editText;
            int i = this.e;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.O);
            }
            int i2 = this.X;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.L);
            }
            this.f2345O = false;
            Z();
            setTextInputAccessibilityDelegate(new dq6(this));
            QL ql = this.f2346R;
            Typeface typeface = this.f2356R.getTypeface();
            boolean C = ql.C(typeface);
            boolean P = ql.P(typeface);
            if (C || P) {
                ql.m(false);
            }
            QL ql2 = this.f2346R;
            float textSize = this.f2356R.getTextSize();
            if (ql2.e != textSize) {
                ql2.e = textSize;
                ql2.m(false);
            }
            QL ql3 = this.f2346R;
            float letterSpacing = this.f2356R.getLetterSpacing();
            if (ql3.J != letterSpacing) {
                ql3.J = letterSpacing;
                ql3.m(false);
            }
            int gravity = this.f2356R.getGravity();
            this.f2346R.U((gravity & -113) | 48);
            QL ql4 = this.f2346R;
            if (ql4.f458v != gravity) {
                ql4.f458v = gravity;
                ql4.m(false);
            }
            this.f2356R.addTextChangedListener(new jG2(this, 1));
            if (this.f2375e == null) {
                this.f2375e = this.f2356R.getHintTextColors();
            }
            if (this.f2377e) {
                if (TextUtils.isEmpty(this.f2373c)) {
                    CharSequence hint = this.f2356R.getHint();
                    this.f2363R = hint;
                    setHint(hint);
                    this.f2356R.setHint((CharSequence) null);
                }
                this.f2370X = true;
            }
            if (this.f2347R != null) {
                C(this.f2356R.getText());
            }
            j();
            this.f2365R.v();
            this.f2360R.bringToFront();
            this.f2362R.bringToFront();
            Iterator it = this.f2364R.iterator();
            while (it.hasNext()) {
                ((iOh) it.next()).R(this);
            }
            this.f2362R.U();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f2373c)) {
            this.f2373c = charSequence;
            QL ql = this.f2346R;
            if (charSequence == null || !TextUtils.equals(ql.f444R, charSequence)) {
                ql.f444R = charSequence;
                ql.f465v = null;
                Bitmap bitmap = ql.f436R;
                if (bitmap != null) {
                    bitmap.recycle();
                    ql.f436R = null;
                }
                ql.m(false);
            }
            if (!this.f2371Z) {
                m();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f2374c != z) {
            if (z) {
                TC tc = this.v;
                if (tc != null) {
                    this.f2357R.addView(tc);
                    this.v.setVisibility(0);
                }
            } else {
                TC tc2 = this.v;
                if (tc2 != null) {
                    tc2.setVisibility(8);
                }
                this.v = null;
            }
            this.f2374c = z;
        }
    }

    public static void x(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt, z);
            }
        }
    }

    public final void C(Editable editable) {
        ((gkL) this.f2366R).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f2385v;
        int i = this.Z;
        String str = null;
        if (i == -1) {
            this.f2347R.setText(String.valueOf(length));
            this.f2347R.setContentDescription(null);
            this.f2385v = false;
        } else {
            this.f2385v = length > i;
            Context context = getContext();
            this.f2347R.setContentDescription(context.getString(this.f2385v ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.Z)));
            if (z != this.f2385v) {
                N();
            }
            nL c = nL.c();
            TC tc = this.f2347R;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.Z));
            imt imt = c.f6373R;
            if (string != null) {
                str = c.e(string, imt).toString();
            }
            tc.setText(str);
        }
        if (this.f2356R != null && z != this.f2385v) {
            t(false, false);
            o();
            j();
        }
    }

    public final void H(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2132017576);
            Context context = getContext();
            Object obj = C1.R;
            textView.setTextColor(dmD.R(context, R.color.design_error));
        }
    }

    public final int L(int i, boolean z) {
        int compoundPaddingRight = i - this.f2356R.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final void N() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TC tc = this.f2347R;
        if (tc != null) {
            H(tc, this.f2385v ? this.m : this.x);
            if (!this.f2385v && (colorStateList2 = this.f2379v) != null) {
                this.f2347R.setTextColor(colorStateList2);
            }
            if (this.f2385v && (colorStateList = this.c) != null) {
                this.f2347R.setTextColor(colorStateList);
            }
        }
    }

    public final int O(int i, boolean z) {
        int compoundPaddingLeft = this.f2356R.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r6.c() != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (r10.f2362R.f4572R != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P() {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.P():boolean");
    }

    public final void R(float f) {
        if (this.f2346R.R != f) {
            if (this.f2348R == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f2348R = valueAnimator;
                valueAnimator.setInterpolator(My.f300R);
                this.f2348R.setDuration(167L);
                this.f2348R.addUpdateListener(new e4(3, this));
            }
            this.f2348R.setFloatValues(this.f2346R.R, f);
            this.f2348R.start();
        }
    }

    public final boolean U() {
        nje nje = this.f2365R;
        return nje.c == 1 && nje.f6519R != null && !TextUtils.isEmpty(nje.f6527R);
    }

    public final void V(boolean z, boolean z2) {
        int defaultColor = this.f2344O.getDefaultColor();
        int colorForState = this.f2344O.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f2344O.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.y = colorForState2;
        } else if (z2) {
            this.y = colorForState;
        } else {
            this.y = defaultColor;
        }
    }

    public final c18 X(boolean z) {
        int i;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2356R;
        float popupElevation = editText instanceof h6c ? ((h6c) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        nBP nbp = new nBP();
        nbp.f6342R = new SO(f);
        nbp.f6348v = new SO(f);
        nbp.f6346e = new SO(dimensionPixelOffset);
        nbp.f6344c = new SO(dimensionPixelOffset);
        dOE doe = new dOE(nbp);
        Context context = getContext();
        String str = c18.R;
        TypedValue r = hDC.r(R.attr.colorSurface, context, c18.class.getSimpleName());
        int i2 = r.resourceId;
        if (i2 != 0) {
            Object obj = C1.R;
            i = dmD.R(context, i2);
        } else {
            i = r.data;
        }
        c18 c18 = new c18();
        c18.x(context);
        c18.C(ColorStateList.valueOf(i));
        c18.U(popupElevation);
        c18.setShapeAppearanceModel(doe);
        oku oku = c18.f1920R;
        if (oku.f6906R == null) {
            oku.f6906R = new Rect();
        }
        c18.f1920R.f6906R.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c18.invalidateSelf();
        return c18;
    }

    public final void Z() {
        int i = this.C;
        if (i == 0) {
            this.f2358R = null;
            this.f2372c = null;
            this.f2376e = null;
        } else if (i == 1) {
            this.f2358R = new c18(this.f2359R);
            this.f2372c = new c18();
            this.f2376e = new c18();
        } else if (i == 2) {
            if (!this.f2377e || (this.f2358R instanceof fqr)) {
                this.f2358R = new c18(this.f2359R);
            } else {
                this.f2358R = new fqr(this.f2359R);
            }
            this.f2372c = null;
            this.f2376e = null;
        } else {
            throw new IllegalArgumentException(jQ.j(new StringBuilder(), this.C, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        g();
        o();
        boolean z = false;
        if (this.C == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.N = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (lTs.N(getContext())) {
                this.N = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2356R != null && this.C == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z = true;
            }
            if (z) {
                EditText editText = this.f2356R;
                WeakHashMap weakHashMap = of5.f6887R;
                eHQ.H(editText, eHQ.O(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), eHQ.X(this.f2356R), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (lTs.N(getContext())) {
                EditText editText2 = this.f2356R;
                WeakHashMap weakHashMap2 = of5.f6887R;
                eHQ.H(editText2, eHQ.O(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), eHQ.X(this.f2356R), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.C != 0) {
            y();
        }
        EditText editText3 = this.f2356R;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.C;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i2 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f2357R.addView(view, layoutParams2);
            this.f2357R.setLayoutParams(layoutParams);
            y();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final int c() {
        float X;
        if (!this.f2377e) {
            return 0;
        }
        int i = this.C;
        if (i == 0) {
            X = this.f2346R.X();
        } else if (i != 2) {
            return 0;
        } else {
            X = this.f2346R.X() / 2.0f;
        }
        return (int) X;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2356R;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2363R != null) {
            boolean z = this.f2370X;
            this.f2370X = false;
            CharSequence hint = editText.getHint();
            this.f2356R.setHint(this.f2363R);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f2356R.setHint(hint);
                this.f2370X = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f2357R.getChildCount());
            for (int i2 = 0; i2 < this.f2357R.getChildCount(); i2++) {
                View childAt = this.f2357R.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f2356R) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2368U = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2368U = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        c18 c18;
        super.draw(canvas);
        if (this.f2377e) {
            this.f2346R.e(canvas);
        }
        if (this.f2376e != null && (c18 = this.f2372c) != null) {
            c18.draw(canvas);
            if (this.f2356R.isFocused()) {
                Rect bounds = this.f2376e.getBounds();
                Rect bounds2 = this.f2372c.getBounds();
                float f = this.f2346R.R;
                int centerX = bounds2.centerX();
                int i = bounds2.left;
                LinearInterpolator linearInterpolator = My.f298R;
                bounds.left = Math.round(((float) (i - centerX)) * f) + centerX;
                bounds.right = Math.round(f * ((float) (bounds2.right - centerX))) + centerX;
                this.f2376e.draw(canvas);
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void drawableStateChanged() {
        if (!this.f2342H) {
            boolean z = true;
            this.f2342H = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            QL ql = this.f2346R;
            boolean y = ql != null ? ql.y(drawableState) | false : false;
            if (this.f2356R != null) {
                WeakHashMap weakHashMap = of5.f6887R;
                if (!d6y.c(this) || !isEnabled()) {
                    z = false;
                }
                t(z, false);
            }
            j();
            o();
            if (y) {
                invalidate();
            }
            this.f2342H = false;
        }
    }

    public final boolean e() {
        return this.f2377e && !TextUtils.isEmpty(this.f2373c) && (this.f2358R instanceof fqr);
    }

    public final void g() {
        EditText editText = this.f2356R;
        if (editText != null && this.f2358R != null) {
            if ((this.f2345O || editText.getBackground() == null) && this.C != 0) {
                EditText editText2 = this.f2356R;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.g(editText2, editTextBoxBackground);
                this.f2345O = true;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2356R;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return c() + getPaddingTop() + baseline;
    }

    public c18 getBoxBackground() {
        int i = this.C;
        if (i == 1 || i == 2) {
            return this.f2358R;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.t;
    }

    public int getBoxBackgroundMode() {
        return this.C;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return vd.J(this) ? this.f2359R.f2595e.R(this.f2351R) : this.f2359R.f2593c.R(this.f2351R);
    }

    public float getBoxCornerRadiusBottomStart() {
        return vd.J(this) ? this.f2359R.f2593c.R(this.f2351R) : this.f2359R.f2595e.R(this.f2351R);
    }

    public float getBoxCornerRadiusTopEnd() {
        return vd.J(this) ? this.f2359R.f2591R.R(this.f2351R) : this.f2359R.f2597v.R(this.f2351R);
    }

    public float getBoxCornerRadiusTopStart() {
        return vd.J(this) ? this.f2359R.f2597v.R(this.f2351R) : this.f2359R.f2591R.R(this.f2351R);
    }

    public int getBoxStrokeColor() {
        return this.J;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2344O;
    }

    public int getBoxStrokeWidth() {
        return this.j;
    }

    public int getBoxStrokeWidthFocused() {
        return this.g;
    }

    public int getCounterMaxLength() {
        return this.Z;
    }

    public CharSequence getCounterOverflowDescription() {
        TC tc;
        if (!this.f2367R || !this.f2385v || (tc = this.f2347R) == null) {
            return null;
        }
        return tc.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2379v;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2379v;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2375e;
    }

    public EditText getEditText() {
        return this.f2356R;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2362R.f4577v.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2362R.f4577v.getDrawable();
    }

    public int getEndIconMode() {
        return this.f2362R.e;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2362R.f4577v;
    }

    public CharSequence getError() {
        nje nje = this.f2365R;
        if (nje.f6528R) {
            return nje.f6527R;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2365R.f6532v;
    }

    public int getErrorCurrentTextColors() {
        TC tc = this.f2365R.f6519R;
        if (tc != null) {
            return tc.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2362R.f4569R.getDrawable();
    }

    public CharSequence getHelperText() {
        nje nje = this.f2365R;
        if (nje.f6533v) {
            return nje.f6529c;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TC tc = this.f2365R.f6530v;
        if (tc != null) {
            return tc.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2377e) {
            return this.f2373c;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2346R.X();
    }

    public final int getHintCurrentCollapsedTextColor() {
        QL ql = this.f2346R;
        return ql.O(ql.f461v);
    }

    public ColorStateList getHintTextColor() {
        return this.f2369X;
    }

    public obf getLengthCounter() {
        return this.f2366R;
    }

    public int getMaxEms() {
        return this.X;
    }

    public int getMaxWidth() {
        return this.L;
    }

    public int getMinEms() {
        return this.e;
    }

    public int getMinWidth() {
        return this.O;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2362R.f4577v.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2362R.f4577v.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2374c) {
            return this.f2384v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.H;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2349R;
    }

    public CharSequence getPrefixText() {
        return this.f2360R.f2872R;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2360R.R.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2360R.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2360R.f2870R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2360R.f2870R.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f2362R.f4572R;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2362R.f4561R.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2362R.f4561R;
    }

    public Typeface getTypeface() {
        return this.f2352R;
    }

    public final void i(Editable editable) {
        ((gkL) this.f2366R).getClass();
        if ((editable != null ? editable.length() : 0) != 0 || this.f2371Z) {
            TC tc = this.v;
            if (tc != null && this.f2374c) {
                tc.setText((CharSequence) null);
                pnB.R(this.f2357R, this.f2383v);
                this.v.setVisibility(4);
            }
        } else if (this.v != null && this.f2374c && !TextUtils.isEmpty(this.f2384v)) {
            this.v.setText(this.f2384v);
            pnB.R(this.f2357R, this.f2361R);
            this.v.setVisibility(0);
            this.v.bringToFront();
            announceForAccessibility(this.f2384v);
        }
    }

    public final void j() {
        Drawable background;
        TC tc;
        PorterDuffColorFilter L;
        PorterDuffColorFilter L2;
        EditText editText = this.f2356R;
        if (editText != null && this.C == 0 && (background = editText.getBackground()) != null) {
            Rect rect = mTA.R;
            Drawable mutate = background.mutate();
            if (U()) {
                int errorCurrentTextColors = getErrorCurrentTextColors();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                PorterDuff.Mode mode2 = pp.R;
                synchronized (pp.class) {
                    L2 = gNS.L(errorCurrentTextColors, mode);
                }
                mutate.setColorFilter(L2);
            } else if (!this.f2385v || (tc = this.f2347R) == null) {
                mutate.clearColorFilter();
                this.f2356R.refreshDrawableState();
            } else {
                int currentTextColor = tc.getCurrentTextColor();
                PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
                PorterDuff.Mode mode4 = pp.R;
                synchronized (pp.class) {
                    L = gNS.L(currentTextColor, mode3);
                }
                mutate.setColorFilter(L);
            }
        }
    }

    public final void m() {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        int i2;
        if (e()) {
            RectF rectF = this.f2351R;
            QL ql = this.f2346R;
            int width = this.f2356R.getWidth();
            int gravity = this.f2356R.getGravity();
            boolean v = ql.v(ql.f444R);
            ql.f466v = v;
            if (gravity == 17 || (gravity & 7) == 1) {
                f4 = ((float) width) / 2.0f;
                f3 = ql.h / 2.0f;
            } else {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (v) {
                        i2 = ql.f462v.left;
                        f = (float) i2;
                    } else {
                        f4 = (float) ql.f462v.right;
                        f3 = ql.h;
                    }
                } else if (v) {
                    f4 = (float) ql.f462v.right;
                    f3 = ql.h;
                } else {
                    i2 = ql.f462v.left;
                    f = (float) i2;
                }
                float max = Math.max(f, (float) ql.f462v.left);
                rectF.left = max;
                Rect rect = ql.f462v;
                rectF.top = (float) rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f2 = (((float) width) / 2.0f) + (ql.h / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (ql.f466v) {
                        f2 = ql.h + max;
                    } else {
                        i = rect.right;
                        f2 = (float) i;
                    }
                } else if (ql.f466v) {
                    i = rect.right;
                    f2 = (float) i;
                } else {
                    f2 = ql.h + max;
                }
                rectF.right = Math.min(f2, (float) rect.right);
                rectF.bottom = ql.X() + ((float) ql.f462v.top);
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    float f5 = rectF.left;
                    float f6 = (float) this.U;
                    rectF.left = f5 - f6;
                    rectF.right += f6;
                    rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.P));
                    fqr fqr = (fqr) this.f2358R;
                    fqr.getClass();
                    fqr.V(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f = f4 - f3;
            float max = Math.max(f, (float) ql.f462v.left);
            rectF.left = max;
            Rect rect = ql.f462v;
            rectF.top = (float) rect.top;
            if (gravity != 17) {
            }
            f2 = (((float) width) / 2.0f) + (ql.h / 2.0f);
            rectF.right = Math.min(f2, (float) rect.right);
            rectF.bottom = ql.X() + ((float) ql.f462v.top);
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void o() {
        TC tc;
        EditText editText;
        EditText editText2;
        if (this.f2358R != null && this.C != 0) {
            boolean z = false;
            boolean z2 = isFocused() || ((editText2 = this.f2356R) != null && editText2.hasFocus());
            if (isHovered() || ((editText = this.f2356R) != null && editText.isHovered())) {
                z = true;
            }
            if (!isEnabled()) {
                this.y = this.z;
            } else if (U()) {
                if (this.f2344O != null) {
                    V(z2, z);
                } else {
                    this.y = getErrorCurrentTextColors();
                }
            } else if (!this.f2385v || (tc = this.f2347R) == null) {
                if (z2) {
                    this.y = this.J;
                } else if (z) {
                    this.y = this.K;
                } else {
                    this.y = this.o;
                }
            } else if (this.f2344O != null) {
                V(z2, z);
            } else {
                this.y = tc.getCurrentTextColor();
            }
            iOp iop = this.f2362R;
            iop.H();
            mxC.Y(iop.f4570R, iop.f4569R, iop.f4562R);
            mxC.Y(iop.f4570R, iop.f4577v, iop.v);
            if (iop.v() instanceof heD) {
                if (!iop.f4570R.U() || iop.f4577v.getDrawable() == null) {
                    mxC.Z(iop.f4570R, iop.f4577v, iop.v, iop.f4575v);
                } else {
                    Drawable mutate = iop.f4577v.getDrawable().mutate();
                    cAO.L(mutate, iop.f4570R.getErrorCurrentTextColors());
                    iop.f4577v.setImageDrawable(mutate);
                }
            }
            doZ doz = this.f2360R;
            mxC.Y(doz.f2871R, doz.f2870R, doz.f2867R);
            if (this.C == 2) {
                int i = this.P;
                if (!z2 || !isEnabled()) {
                    this.P = this.j;
                } else {
                    this.P = this.g;
                }
                if (this.P != i && e() && !this.f2371Z) {
                    if (e()) {
                        ((fqr) this.f2358R).V(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    m();
                }
            }
            if (this.C == 1) {
                if (!isEnabled()) {
                    this.t = this.h;
                } else if (z && !z2) {
                    this.t = this.u;
                } else if (z2) {
                    this.t = this.I;
                } else {
                    this.t = this.Y;
                }
            }
            v();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2346R.Z(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f2356R;
        if (editText != null) {
            Rect rect = this.f2350R;
            ThreadLocal threadLocal = ljV.R;
            rect.set(0, 0, editText.getWidth(), editText.getHeight());
            ljV.v(this, editText, rect);
            c18 c18 = this.f2372c;
            if (c18 != null) {
                int i5 = rect.bottom;
                c18.setBounds(rect.left, i5 - this.j, rect.right, i5);
            }
            c18 c182 = this.f2376e;
            if (c182 != null) {
                int i6 = rect.bottom;
                c182.setBounds(rect.left, i6 - this.g, rect.right, i6);
            }
            if (this.f2377e) {
                QL ql = this.f2346R;
                float textSize = this.f2356R.getTextSize();
                if (ql.e != textSize) {
                    ql.e = textSize;
                    ql.m(false);
                }
                int gravity = this.f2356R.getGravity();
                this.f2346R.U((gravity & -113) | 48);
                QL ql2 = this.f2346R;
                if (ql2.f458v != gravity) {
                    ql2.f458v = gravity;
                    ql2.m(false);
                }
                QL ql3 = this.f2346R;
                if (this.f2356R != null) {
                    Rect rect2 = this.f2380v;
                    boolean J = vd.J(this);
                    rect2.bottom = rect.bottom;
                    int i7 = this.C;
                    if (i7 == 1) {
                        rect2.left = O(rect.left, J);
                        rect2.top = rect.top + this.N;
                        rect2.right = L(rect.right, J);
                    } else if (i7 != 2) {
                        rect2.left = O(rect.left, J);
                        rect2.top = getPaddingTop();
                        rect2.right = L(rect.right, J);
                    } else {
                        rect2.left = this.f2356R.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.f2356R.getPaddingRight();
                    }
                    ql3.getClass();
                    int i8 = rect2.left;
                    int i9 = rect2.top;
                    int i10 = rect2.right;
                    int i11 = rect2.bottom;
                    Rect rect3 = ql3.f462v;
                    if (!(rect3.left == i8 && rect3.top == i9 && rect3.right == i10 && rect3.bottom == i11)) {
                        rect3.set(i8, i9, i10, i11);
                        ql3.f457e = true;
                    }
                    QL ql4 = this.f2346R;
                    if (this.f2356R != null) {
                        Rect rect4 = this.f2380v;
                        TextPaint textPaint = ql4.f464v;
                        textPaint.setTextSize(ql4.e);
                        textPaint.setTypeface(ql4.f456e);
                        textPaint.setLetterSpacing(ql4.J);
                        float f = -ql4.f464v.ascent();
                        rect4.left = this.f2356R.getCompoundPaddingLeft() + rect.left;
                        rect4.top = this.C == 1 && this.f2356R.getMinLines() <= 1 ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f2356R.getCompoundPaddingTop();
                        rect4.right = rect.right - this.f2356R.getCompoundPaddingRight();
                        int compoundPaddingBottom = this.C == 1 && this.f2356R.getMinLines() <= 1 ? (int) (((float) rect4.top) + f) : rect.bottom - this.f2356R.getCompoundPaddingBottom();
                        rect4.bottom = compoundPaddingBottom;
                        int i12 = rect4.left;
                        int i13 = rect4.top;
                        int i14 = rect4.right;
                        Rect rect5 = ql4.f437R;
                        if (!(rect5.left == i12 && rect5.top == i13 && rect5.right == i14 && rect5.bottom == compoundPaddingBottom)) {
                            rect5.set(i12, i13, i14, compoundPaddingBottom);
                            ql4.f457e = true;
                        }
                        this.f2346R.m(false);
                        if (e() && !this.f2371Z) {
                            m();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.f2356R != null && this.f2356R.getMeasuredHeight() < (max = Math.max(this.f2362R.getMeasuredHeight(), this.f2360R.getMeasuredHeight()))) {
            this.f2356R.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean P = P();
        if (z || P) {
            this.f2356R.post(new o8d(this, 1));
        }
        if (!(this.v == null || (editText = this.f2356R) == null)) {
            this.v.setGravity(editText.getGravity());
            this.v.setPadding(this.f2356R.getCompoundPaddingLeft(), this.f2356R.getCompoundPaddingTop(), this.f2356R.getCompoundPaddingRight(), this.f2356R.getCompoundPaddingBottom());
        }
        this.f2362R.U();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fDC)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fDC fdc = (fDC) parcelable;
        super.onRestoreInstanceState(((OG) fdc).f327R);
        setError(fdc.R);
        if (fdc.f3353R) {
            post(new o8d(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f2343L;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float R2 = this.f2359R.f2591R.R(this.f2351R);
            float R3 = this.f2359R.f2597v.R(this.f2351R);
            float R4 = this.f2359R.f2595e.R(this.f2351R);
            float R5 = this.f2359R.f2593c.R(this.f2351R);
            float f = z ? R2 : R3;
            if (z) {
                R2 = R3;
            }
            float f2 = z ? R4 : R5;
            if (z) {
                R4 = R5;
            }
            boolean J = vd.J(this);
            this.f2343L = J;
            float f3 = J ? R2 : f;
            if (!J) {
                f = R2;
            }
            float f4 = J ? R4 : f2;
            if (!J) {
                f2 = R4;
            }
            c18 c18 = this.f2358R;
            if (c18 != null && c18.m() == f3) {
                c18 c182 = this.f2358R;
                if (c182.f1920R.f6907R.f2597v.R(c182.Z()) == f) {
                    c18 c183 = this.f2358R;
                    if (c183.f1920R.f6907R.f2595e.R(c183.Z()) == f4) {
                        c18 c184 = this.f2358R;
                        if (c184.f1920R.f6907R.f2593c.R(c184.Z()) == f2) {
                            return;
                        }
                    }
                }
            }
            dOE doe = this.f2359R;
            doe.getClass();
            nBP nbp = new nBP(doe);
            nbp.f6342R = new SO(f3);
            nbp.f6348v = new SO(f);
            nbp.f6346e = new SO(f4);
            nbp.f6344c = new SO(f2);
            this.f2359R = new dOE(nbp);
            v();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        fDC fdc = new fDC(super.onSaveInstanceState());
        if (U()) {
            fdc.R = getError();
        }
        iOp iop = this.f2362R;
        boolean z = true;
        if (!(iop.e != 0) || !iop.f4577v.isChecked()) {
            z = false;
        }
        fdc.f3353R = z;
        return fdc;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.t != i) {
            this.t = i;
            this.Y = i;
            this.I = i;
            this.u = i;
            v();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = C1.R;
        setBoxBackgroundColor(dmD.R(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.Y = defaultColor;
        this.t = defaultColor;
        this.h = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.I = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.u = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        v();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.C) {
            this.C = i;
            if (this.f2356R != null) {
                Z();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.N = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.J != i) {
            this.J = i;
            o();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.o = colorStateList.getDefaultColor();
            this.z = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.K = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.J = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.J != colorStateList.getDefaultColor()) {
            this.J = colorStateList.getDefaultColor();
        }
        o();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2344O != colorStateList) {
            this.f2344O = colorStateList;
            o();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.j = i;
        o();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.g = i;
        o();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f2367R != z) {
            Editable editable = null;
            if (z) {
                TC tc = new TC(getContext(), null);
                this.f2347R = tc;
                tc.setId(R.id.textinput_counter);
                Typeface typeface = this.f2352R;
                if (typeface != null) {
                    this.f2347R.setTypeface(typeface);
                }
                this.f2347R.setMaxLines(1);
                this.f2365R.R(this.f2347R, 2);
                j2q.Z((ViewGroup.MarginLayoutParams) this.f2347R.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                N();
                if (this.f2347R != null) {
                    EditText editText = this.f2356R;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    C(editable);
                }
            } else {
                this.f2365R.L(this.f2347R, 2);
                this.f2347R = null;
            }
            this.f2367R = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.Z != i) {
            if (i > 0) {
                this.Z = i;
            } else {
                this.Z = -1;
            }
            if (this.f2367R && this.f2347R != null) {
                EditText editText = this.f2356R;
                C(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.m != i) {
            this.m = i;
            N();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            N();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.x != i) {
            this.x = i;
            N();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2379v != colorStateList) {
            this.f2379v = colorStateList;
            N();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2375e = colorStateList;
        this.f2369X = colorStateList;
        if (this.f2356R != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        x(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f2362R.f4577v.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f2362R.f4577v.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        iOp iop = this.f2362R;
        CharSequence text = i != 0 ? iop.getResources().getText(i) : null;
        if (iop.f4577v.getContentDescription() != text) {
            iop.f4577v.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        iOp iop = this.f2362R;
        Drawable p = i != 0 ? aH9.p(iop.getContext(), i) : null;
        iop.f4577v.setImageDrawable(p);
        if (p != null) {
            mxC.Z(iop.f4570R, iop.f4577v, iop.v, iop.f4575v);
            mxC.Y(iop.f4570R, iop.f4577v, iop.v);
        }
    }

    public void setEndIconMode(int i) {
        this.f2362R.O(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        iOp iop = this.f2362R;
        CheckableImageButton checkableImageButton = iop.f4577v;
        View.OnLongClickListener onLongClickListener = iop.f4576v;
        checkableImageButton.setOnClickListener(onClickListener);
        mxC.h(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        iOp iop = this.f2362R;
        iop.f4576v = onLongClickListener;
        CheckableImageButton checkableImageButton = iop.f4577v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        mxC.h(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        iOp iop = this.f2362R;
        if (iop.v != colorStateList) {
            iop.v = colorStateList;
            mxC.Z(iop.f4570R, iop.f4577v, colorStateList, iop.f4575v);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        iOp iop = this.f2362R;
        if (iop.f4575v != mode) {
            iop.f4575v = mode;
            mxC.Z(iop.f4570R, iop.f4577v, iop.v, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f2362R.L(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f2365R.f6528R) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            nje nje = this.f2365R;
            nje.c();
            nje.f6527R = charSequence;
            nje.f6519R.setText(charSequence);
            int i = nje.v;
            if (i != 1) {
                nje.c = 1;
            }
            nje.m(i, nje.c, nje.Z(nje.f6519R, charSequence));
            return;
        }
        this.f2365R.O();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        nje nje = this.f2365R;
        nje.f6532v = charSequence;
        TC tc = nje.f6519R;
        if (tc != null) {
            tc.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        nje nje = this.f2365R;
        if (nje.f6528R != z) {
            nje.c();
            if (z) {
                TC tc = new TC(nje.f6521R, null);
                nje.f6519R = tc;
                tc.setId(R.id.textinput_error);
                nje.f6519R.setTextAlignment(5);
                Typeface typeface = nje.f6523R;
                if (typeface != null) {
                    nje.f6519R.setTypeface(typeface);
                }
                int i = nje.e;
                nje.e = i;
                TC tc2 = nje.f6519R;
                if (tc2 != null) {
                    nje.f6526R.H(tc2, i);
                }
                ColorStateList colorStateList = nje.f6522R;
                nje.f6522R = colorStateList;
                TC tc3 = nje.f6519R;
                if (!(tc3 == null || colorStateList == null)) {
                    tc3.setTextColor(colorStateList);
                }
                CharSequence charSequence = nje.f6532v;
                nje.f6532v = charSequence;
                TC tc4 = nje.f6519R;
                if (tc4 != null) {
                    tc4.setContentDescription(charSequence);
                }
                nje.f6519R.setVisibility(4);
                TC tc5 = nje.f6519R;
                WeakHashMap weakHashMap = of5.f6887R;
                d6y.O(tc5, 1);
                nje.R(nje.f6519R, 0);
            } else {
                nje.O();
                nje.L(nje.f6519R, 0);
                nje.f6519R = null;
                nje.f6526R.j();
                nje.f6526R.o();
            }
            nje.f6528R = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        iOp iop = this.f2362R;
        iop.Z(i != 0 ? aH9.p(iop.getContext(), i) : null);
        mxC.Y(iop.f4570R, iop.f4569R, iop.f4562R);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        iOp iop = this.f2362R;
        CheckableImageButton checkableImageButton = iop.f4569R;
        View.OnLongClickListener onLongClickListener = iop.f4564R;
        checkableImageButton.setOnClickListener(onClickListener);
        mxC.h(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        iOp iop = this.f2362R;
        iop.f4564R = onLongClickListener;
        CheckableImageButton checkableImageButton = iop.f4569R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        mxC.h(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        iOp iop = this.f2362R;
        if (iop.f4562R != colorStateList) {
            iop.f4562R = colorStateList;
            mxC.Z(iop.f4570R, iop.f4569R, colorStateList, iop.f4563R);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        iOp iop = this.f2362R;
        if (iop.f4563R != mode) {
            iop.f4563R = mode;
            mxC.Z(iop.f4570R, iop.f4569R, iop.f4562R, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        nje nje = this.f2365R;
        nje.e = i;
        TC tc = nje.f6519R;
        if (tc != null) {
            nje.f6526R.H(tc, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        nje nje = this.f2365R;
        nje.f6522R = colorStateList;
        TC tc = nje.f6519R;
        if (tc != null && colorStateList != null) {
            tc.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f2378m != z) {
            this.f2378m = z;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f2365R.f6533v) {
                setHelperTextEnabled(true);
            }
            nje nje = this.f2365R;
            nje.c();
            nje.f6529c = charSequence;
            nje.f6530v.setText(charSequence);
            int i = nje.v;
            if (i != 2) {
                nje.c = 2;
            }
            nje.m(i, nje.c, nje.Z(nje.f6530v, charSequence));
        } else if (this.f2365R.f6533v) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        nje nje = this.f2365R;
        nje.f6531v = colorStateList;
        TC tc = nje.f6530v;
        if (tc != null && colorStateList != null) {
            tc.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        nje nje = this.f2365R;
        if (nje.f6533v != z) {
            nje.c();
            if (z) {
                TC tc = new TC(nje.f6521R, null);
                nje.f6530v = tc;
                tc.setId(R.id.textinput_helper_text);
                nje.f6530v.setTextAlignment(5);
                Typeface typeface = nje.f6523R;
                if (typeface != null) {
                    nje.f6530v.setTypeface(typeface);
                }
                nje.f6530v.setVisibility(4);
                TC tc2 = nje.f6530v;
                WeakHashMap weakHashMap = of5.f6887R;
                d6y.O(tc2, 1);
                int i = nje.X;
                nje.X = i;
                TC tc3 = nje.f6530v;
                if (tc3 != null) {
                    tc3.setTextAppearance(i);
                }
                ColorStateList colorStateList = nje.f6531v;
                nje.f6531v = colorStateList;
                TC tc4 = nje.f6530v;
                if (!(tc4 == null || colorStateList == null)) {
                    tc4.setTextColor(colorStateList);
                }
                nje.R(nje.f6530v, 1);
                nje.f6530v.setAccessibilityDelegate(new iH4(nje));
            } else {
                nje.c();
                int i2 = nje.v;
                if (i2 == 2) {
                    nje.c = 0;
                }
                nje.m(i2, nje.c, nje.Z(nje.f6530v, ""));
                nje.L(nje.f6530v, 1);
                nje.f6530v = null;
                nje.f6526R.j();
                nje.f6526R.o();
            }
            nje.f6533v = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        nje nje = this.f2365R;
        nje.X = i;
        TC tc = nje.f6530v;
        if (tc != null) {
            tc.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2377e) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f2386x = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f2377e) {
            this.f2377e = z;
            if (!z) {
                this.f2370X = false;
                if (!TextUtils.isEmpty(this.f2373c) && TextUtils.isEmpty(this.f2356R.getHint())) {
                    this.f2356R.setHint(this.f2373c);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f2356R.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2373c)) {
                        setHint(hint);
                    }
                    this.f2356R.setHint((CharSequence) null);
                }
                this.f2370X = true;
            }
            if (this.f2356R != null) {
                y();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f2346R.x(i);
        this.f2369X = this.f2346R.f461v;
        if (this.f2356R != null) {
            t(false, false);
            y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2369X != colorStateList) {
            if (this.f2375e == null) {
                this.f2346R.H(colorStateList);
            }
            this.f2369X = colorStateList;
            if (this.f2356R != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(obf obf) {
        this.f2366R = obf;
    }

    public void setMaxEms(int i) {
        this.X = i;
        EditText editText = this.f2356R;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.L = i;
        EditText editText = this.f2356R;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.e = i;
        EditText editText = this.f2356R;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.O = i;
        EditText editText = this.f2356R;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        iOp iop = this.f2362R;
        iop.f4577v.setContentDescription(i != 0 ? iop.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        iOp iop = this.f2362R;
        iop.f4577v.setImageDrawable(i != 0 ? aH9.p(iop.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        iOp iop = this.f2362R;
        if (z && iop.e != 1) {
            iop.O(1);
        } else if (!z) {
            iop.O(0);
        } else {
            iop.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        iOp iop = this.f2362R;
        iop.v = colorStateList;
        mxC.Z(iop.f4570R, iop.f4577v, colorStateList, iop.f4575v);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        iOp iop = this.f2362R;
        iop.f4575v = mode;
        mxC.Z(iop.f4570R, iop.f4577v, iop.v, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.v == null) {
            TC tc = new TC(getContext(), null);
            this.v = tc;
            tc.setId(R.id.textinput_placeholder);
            TC tc2 = this.v;
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.t(tc2, 2);
            fkN fkn = new fkN();
            ((hFt) fkn).f4184v = 87;
            LinearInterpolator linearInterpolator = My.f298R;
            ((hFt) fkn).f4174R = linearInterpolator;
            this.f2361R = fkn;
            ((hFt) fkn).f4173R = 67;
            fkN fkn2 = new fkN();
            ((hFt) fkn2).f4184v = 87;
            ((hFt) fkn2).f4174R = linearInterpolator;
            this.f2383v = fkn2;
            setPlaceholderTextAppearance(this.H);
            setPlaceholderTextColor(this.f2349R);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2374c) {
                setPlaceholderTextEnabled(true);
            }
            this.f2384v = charSequence;
        }
        EditText editText = this.f2356R;
        if (editText != null) {
            editable = editText.getText();
        }
        i(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.H = i;
        TC tc = this.v;
        if (tc != null) {
            tc.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2349R != colorStateList) {
            this.f2349R = colorStateList;
            TC tc = this.v;
            if (tc != null && colorStateList != null) {
                tc.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        doZ doz = this.f2360R;
        doz.getClass();
        doz.f2872R = TextUtils.isEmpty(charSequence) ? null : charSequence;
        doz.R.setText(charSequence);
        doz.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2360R.R.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2360R.R.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f2360R.f2870R.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? aH9.p(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        doZ doz = this.f2360R;
        CheckableImageButton checkableImageButton = doz.f2870R;
        View.OnLongClickListener onLongClickListener = doz.f2869R;
        checkableImageButton.setOnClickListener(onClickListener);
        mxC.h(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        doZ doz = this.f2360R;
        doz.f2869R = onLongClickListener;
        CheckableImageButton checkableImageButton = doz.f2870R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        mxC.h(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        doZ doz = this.f2360R;
        if (doz.f2867R != colorStateList) {
            doz.f2867R = colorStateList;
            mxC.Z(doz.f2871R, doz.f2870R, colorStateList, doz.f2868R);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        doZ doz = this.f2360R;
        if (doz.f2868R != mode) {
            doz.f2868R = mode;
            mxC.Z(doz.f2871R, doz.f2870R, doz.f2867R, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f2360R.v(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        iOp iop = this.f2362R;
        iop.getClass();
        iop.f4572R = TextUtils.isEmpty(charSequence) ? null : charSequence;
        iop.f4561R.setText(charSequence);
        iop.C();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2362R.f4561R.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2362R.f4561R.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(dq6 dq6) {
        EditText editText = this.f2356R;
        if (editText != null) {
            of5.O(editText, dq6);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2352R) {
            this.f2352R = typeface;
            QL ql = this.f2346R;
            boolean C = ql.C(typeface);
            boolean P = ql.P(typeface);
            if (C || P) {
                ql.m(false);
            }
            nje nje = this.f2365R;
            if (typeface != nje.f6523R) {
                nje.f6523R = typeface;
                TC tc = nje.f6519R;
                if (tc != null) {
                    tc.setTypeface(typeface);
                }
                TC tc2 = nje.f6530v;
                if (tc2 != null) {
                    tc2.setTypeface(typeface);
                }
            }
            TC tc3 = this.f2347R;
            if (tc3 != null) {
                tc3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TC tc;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2356R;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f2356R;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2375e;
        if (colorStateList2 != null) {
            this.f2346R.H(colorStateList2);
            QL ql = this.f2346R;
            ColorStateList colorStateList3 = this.f2375e;
            if (ql.f435R != colorStateList3) {
                ql.f435R = colorStateList3;
                ql.m(false);
            }
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f2375e;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.z) : this.z;
            this.f2346R.H(ColorStateList.valueOf(colorForState));
            QL ql2 = this.f2346R;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (ql2.f435R != valueOf) {
                ql2.f435R = valueOf;
                ql2.m(false);
            }
        } else if (U()) {
            QL ql3 = this.f2346R;
            TC tc2 = this.f2365R.f6519R;
            ql3.H(tc2 != null ? tc2.getTextColors() : null);
        } else if (this.f2385v && (tc = this.f2347R) != null) {
            this.f2346R.H(tc.getTextColors());
        } else if (z4 && (colorStateList = this.f2369X) != null) {
            this.f2346R.H(colorStateList);
        }
        if (z3 || !this.f2378m || (isEnabled() && z4)) {
            if (z2 || this.f2371Z) {
                ValueAnimator valueAnimator = this.f2348R;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2348R.cancel();
                }
                if (!z || !this.f2386x) {
                    this.f2346R.j(1.0f);
                } else {
                    R(1.0f);
                }
                this.f2371Z = false;
                if (e()) {
                    m();
                }
                EditText editText3 = this.f2356R;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                i(editable);
                doZ doz = this.f2360R;
                doz.f2873R = false;
                doz.e();
                iOp iop = this.f2362R;
                iop.f4574R = false;
                iop.C();
            }
        } else if (z2 || !this.f2371Z) {
            ValueAnimator valueAnimator2 = this.f2348R;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2348R.cancel();
            }
            if (!z || !this.f2386x) {
                this.f2346R.j(0.0f);
            } else {
                R(0.0f);
            }
            if (e() && (!((fqr) this.f2358R).e.isEmpty()) && e()) {
                ((fqr) this.f2358R).V(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2371Z = true;
            TC tc3 = this.v;
            if (tc3 != null && this.f2374c) {
                tc3.setText((CharSequence) null);
                pnB.R(this.f2357R, this.f2383v);
                this.v.setVisibility(4);
            }
            doZ doz2 = this.f2360R;
            doz2.f2873R = true;
            doz2.e();
            iOp iop2 = this.f2362R;
            iop2.f4574R = true;
            iop2.C();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r7 = this;
            c18 r0 = r7.f2358R
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            oku r1 = r0.f1920R
            dOE r1 = r1.f6907R
            dOE r2 = r7.f2359R
            if (r1 == r2) goto L_0x0010
            r0.setShapeAppearanceModel(r2)
        L_0x0010:
            int r0 = r7.C
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0027
            int r0 = r7.P
            if (r0 <= r2) goto L_0x0022
            int r0 = r7.y
            if (r0 == 0) goto L_0x0022
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x0027
            r0 = r4
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x003f
            c18 r0 = r7.f2358R
            int r1 = r7.P
            float r1 = (float) r1
            int r5 = r7.y
            oku r6 = r0.f1920R
            r6.c = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            r0.g(r1)
        L_0x003f:
            int r0 = r7.t
            int r1 = r7.C
            if (r1 != r4) goto L_0x0056
            r0 = 2130903308(0x7f03010c, float:1.741343E38)
            android.content.Context r1 = r7.getContext()
            int r0 = defpackage.vd.y(r1, r0, r3)
            int r1 = r7.t
            int r0 = defpackage.B7.v(r1, r0)
        L_0x0056:
            r7.t = r0
            c18 r1 = r7.f2358R
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.C(r0)
            c18 r0 = r7.f2372c
            if (r0 == 0) goto L_0x009b
            c18 r1 = r7.f2376e
            if (r1 != 0) goto L_0x006a
            goto L_0x009b
        L_0x006a:
            int r1 = r7.P
            if (r1 <= r2) goto L_0x0073
            int r1 = r7.y
            if (r1 == 0) goto L_0x0073
            r3 = r4
        L_0x0073:
            if (r3 == 0) goto L_0x0098
            android.widget.EditText r1 = r7.f2356R
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x0084
            int r1 = r7.o
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L_0x008a
        L_0x0084:
            int r1 = r7.y
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x008a:
            r0.C(r1)
            c18 r0 = r7.f2376e
            int r1 = r7.y
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.C(r1)
        L_0x0098:
            r7.invalidate()
        L_0x009b:
            r7.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v():void");
    }

    public final void y() {
        if (this.C != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2357R.getLayoutParams();
            int c = c();
            if (c != layoutParams.topMargin) {
                layoutParams.topMargin = c;
                this.f2357R.requestLayout();
            }
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        doZ doz = this.f2360R;
        if (doz.f2870R.getContentDescription() != charSequence) {
            doz.f2870R.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2360R.R(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2362R.f4577v.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2362R.f4577v.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2362R.Z(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        iOp iop = this.f2362R;
        if (iop.f4577v.getContentDescription() != charSequence) {
            iop.f4577v.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        iOp iop = this.f2362R;
        iop.f4577v.setImageDrawable(drawable);
        if (drawable != null) {
            mxC.Z(iop.f4570R, iop.f4577v, iop.v, iop.f4575v);
            mxC.Y(iop.f4570R, iop.f4577v, iop.v);
        }
    }
}
