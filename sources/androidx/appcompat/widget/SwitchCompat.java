package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final mZP R = new mZP(Float.class, "thumbPos", 0);

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f1129R = {16842912};
    public int C;
    public int H;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f1130L;
    public int N;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f1131O;
    public int P;

    /* renamed from: R  reason: collision with other field name */
    public float f1132R;

    /* renamed from: R  reason: collision with other field name */
    public aU f1133R;

    /* renamed from: R  reason: collision with other field name */
    public ObjectAnimator f1134R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f1135R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f1136R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f1137R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f1138R;

    /* renamed from: R  reason: collision with other field name */
    public StaticLayout f1139R;

    /* renamed from: R  reason: collision with other field name */
    public final TextPaint f1140R;

    /* renamed from: R  reason: collision with other field name */
    public VelocityTracker f1141R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f1142R;

    /* renamed from: R  reason: collision with other field name */
    public lOo f1143R;

    /* renamed from: R  reason: collision with other field name */
    public mM f1144R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1145R;
    public int U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1146X;
    public int Z;
    public ColorStateList c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f1147c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1148c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public CharSequence f1149e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1150e;
    public int j;
    public int m;
    public float mThumbPosition;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f1151v;

    /* renamed from: v  reason: collision with other field name */
    public PorterDuff.Mode f1152v;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f1153v;

    /* renamed from: v  reason: collision with other field name */
    public StaticLayout f1154v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f1155v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1156v;
    public int x;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    private mM getEmojiTextViewHelper() {
        if (this.f1144R == null) {
            this.f1144R = new mM(this);
        }
        return this.f1144R;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((oJF.R(this) ? 1.0f - this.mThumbPosition : this.mThumbPosition) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1153v;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1137R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1138R;
        Rect R2 = drawable2 != null ? mTA.R(drawable2) : mTA.R;
        return ((((this.x - this.U) - rect.left) - rect.right) - R2.left) - R2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1147c = charSequence;
        mM emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod n = ((dq) emojiTextViewHelper.f6008R.R).n(this.f1133R);
        if (n != null) {
            charSequence = n.getTransformation(charSequence, this);
        }
        this.f1149e = charSequence;
        this.f1154v = null;
        if (this.f1131O) {
            X();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1142R = charSequence;
        mM emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod n = ((dq) emojiTextViewHelper.f6008R.R).n(this.f1133R);
        if (n != null) {
            charSequence = n.getTransformation(charSequence, this);
        }
        this.f1155v = charSequence;
        this.f1139R = null;
        if (this.f1131O) {
            X();
        }
    }

    public final void R() {
        Drawable drawable = this.f1138R;
        if (drawable == null) {
            return;
        }
        if (this.f1145R || this.f1156v) {
            Drawable mutate = drawable.mutate();
            this.f1138R = mutate;
            if (this.f1145R) {
                cAO.Z(mutate, this.f1135R);
            }
            if (this.f1156v) {
                cAO.m(this.f1138R, this.f1136R);
            }
            if (this.f1138R.isStateful()) {
                this.f1138R.setState(getDrawableState());
            }
        }
    }

    public final void X() {
        if (this.f1143R == null && ((dq) this.f1144R.f6008R.R).J()) {
            if (dfg.R != null) {
                dfg R2 = dfg.R();
                int v = R2.v();
                if (v == 3 || v == 0) {
                    lOo loo = new lOo(this);
                    this.f1143R = loo;
                    R2.L(loo);
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        TextPaint textPaint = this.f1140R;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1137R;
        int i3 = this.C;
        int i4 = this.N;
        int i5 = this.P;
        int i6 = this.j;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1138R;
        Rect R2 = drawable != null ? mTA.R(drawable) : mTA.R;
        Drawable drawable2 = this.f1153v;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (R2 != null) {
                int i8 = R2.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = R2.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = R2.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = R2.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1153v.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1153v.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1138R;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.U + rect.right;
            this.f1138R.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                cAO.O(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1138R;
        if (drawable != null) {
            cAO.X(drawable, f, f2);
        }
        Drawable drawable2 = this.f1153v;
        if (drawable2 != null) {
            cAO.X(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1138R;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1153v;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        setTextOnInternal(this.f1142R);
        setTextOffInternal(this.f1147c);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!oJF.R(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.x;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.O : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (oJF.R(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.x;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.O : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f1131O;
    }

    public boolean getSplitTrack() {
        return this.f1146X;
    }

    public int getSwitchMinWidth() {
        return this.X;
    }

    public int getSwitchPadding() {
        return this.O;
    }

    public CharSequence getTextOff() {
        return this.f1147c;
    }

    public CharSequence getTextOn() {
        return this.f1142R;
    }

    public Drawable getThumbDrawable() {
        return this.f1138R;
    }

    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.e;
    }

    public ColorStateList getThumbTintList() {
        return this.f1135R;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1136R;
    }

    public Drawable getTrackDrawable() {
        return this.f1153v;
    }

    public ColorStateList getTrackTintList() {
        return this.f1151v;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1152v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1138R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1153v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1134R;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1134R.end();
            this.f1134R = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1129R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1137R;
        Drawable drawable = this.f1153v;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.N;
        int i3 = this.j;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1138R;
        if (drawable != null) {
            if (!this.f1146X || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect R2 = mTA.R(drawable2);
                drawable2.copyBounds(rect);
                rect.left += R2.left;
                rect.right -= R2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1139R : this.f1154v;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f1140R.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1140R.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (staticLayout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f1138R != null) {
            Rect rect = this.f1137R;
            Drawable drawable = this.f1153v;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect R2 = mTA.R(this.f1138R);
            i5 = Math.max(0, R2.left - rect.left);
            i10 = Math.max(0, R2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (oJF.R(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.x + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.x) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.H;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            i8 = i11 + height;
            i9 = height;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.H + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.H;
        }
        this.C = i7;
        this.N = i9;
        this.j = i8;
        this.P = i6;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1131O) {
            if (this.f1139R == null) {
                this.f1139R = c(this.f1155v);
            }
            if (this.f1154v == null) {
                this.f1154v = c(this.f1149e);
            }
        }
        Rect rect = this.f1137R;
        Drawable drawable = this.f1138R;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1138R.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1138R.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.U = Math.max(this.f1131O ? (this.e * 2) + Math.max(this.f1139R.getWidth(), this.f1154v.getWidth()) : 0, i4);
        Drawable drawable2 = this.f1153v;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1153v.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1138R;
        if (drawable3 != null) {
            Rect R2 = mTA.R(drawable3);
            i6 = Math.max(i6, R2.left);
            i7 = Math.max(i7, R2.right);
        }
        int max = this.f1130L ? Math.max(this.X, (this.U * 2) + i6 + i7) : this.X;
        int max2 = Math.max(i5, i3);
        this.x = max;
        this.H = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1142R : this.f1147c;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L_0x0150;
     */
    @Override // android.widget.TextView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            Object obj = this.f1142R;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = of5.f6887R;
            new g59(R.id.tag_state_description, CharSequence.class, 64, 30, 2).c(this, obj);
        } else {
            Object obj2 = this.f1147c;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = of5.f6887R;
            new g59(R.id.tag_state_description, CharSequence.class, 64, 30, 2).c(this, obj2);
        }
        float f = 1.0f;
        if (getWindowToken() == null || !d6y.c(this)) {
            ObjectAnimator objectAnimator = this.f1134R;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (!isChecked) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, f);
        this.f1134R = ofFloat;
        ofFloat.setDuration(250L);
        nmB.R(this.f1134R, true);
        this.f1134R.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.f1142R);
        setTextOffInternal(this.f1147c);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f1130L = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().R(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1131O != z) {
            this.f1131O = z;
            requestLayout();
            if (z) {
                X();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1146X = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.X = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.O = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1140R.getTypeface() != null && !this.f1140R.getTypeface().equals(typeface)) || (this.f1140R.getTypeface() == null && typeface != null)) {
            this.f1140R.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            Object obj = this.f1147c;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = of5.f6887R;
            new g59(R.id.tag_state_description, CharSequence.class, 64, 30, 2).c(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            Object obj = this.f1142R;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = of5.f6887R;
            new g59(R.id.tag_state_description, CharSequence.class, 64, 30, 2).c(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1138R;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1138R = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(aH9.p(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.e = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1135R = colorStateList;
        this.f1145R = true;
        R();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1136R = mode;
        this.f1156v = true;
        R();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1153v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1153v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(aH9.p(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1151v = colorStateList;
        this.f1148c = true;
        v();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1152v = mode;
        this.f1150e = true;
        v();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public final void v() {
        Drawable drawable = this.f1153v;
        if (drawable == null) {
            return;
        }
        if (this.f1148c || this.f1150e) {
            Drawable mutate = drawable.mutate();
            this.f1153v = mutate;
            if (this.f1148c) {
                cAO.Z(mutate, this.f1151v);
            }
            if (this.f1150e) {
                cAO.m(this.f1153v, this.f1152v);
            }
            if (this.f1153v.isStateful()) {
                this.f1153v.setState(getDrawableState());
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1138R || drawable == this.f1153v;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface typeface2;
        this.f1135R = null;
        this.f1136R = null;
        this.f1145R = false;
        this.f1156v = false;
        this.f1151v = null;
        this.f1152v = null;
        this.f1148c = false;
        this.f1150e = false;
        this.f1141R = VelocityTracker.obtain();
        boolean z = true;
        this.f1130L = true;
        this.f1137R = new Rect();
        lM2.R(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1140R = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = iTI.K;
        CV h = CV.h(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(this, context, iArr, attributeSet, typedArray, i, 0);
        Drawable U = h.U(2);
        this.f1138R = U;
        if (U != null) {
            U.setCallback(this);
        }
        Drawable U2 = h.U(11);
        this.f1153v = U2;
        if (U2 != null) {
            U2.setCallback(this);
        }
        setTextOnInternal(h.V(0));
        setTextOffInternal(h.V(1));
        this.f1131O = h.Z(3, true);
        this.e = h.H(8, 0);
        this.X = h.H(5, 0);
        this.O = h.H(6, 0);
        this.f1146X = h.Z(4, false);
        ColorStateList m = h.m(9);
        if (m != null) {
            this.f1135R = m;
            this.f1145R = true;
        }
        PorterDuff.Mode v = mTA.v(h.P(10, -1), null);
        if (this.f1136R != v) {
            this.f1136R = v;
            this.f1156v = true;
        }
        if (this.f1145R || this.f1156v) {
            R();
        }
        ColorStateList m2 = h.m(12);
        if (m2 != null) {
            this.f1151v = m2;
            this.f1148c = true;
        }
        PorterDuff.Mode v2 = mTA.v(h.P(13, -1), null);
        if (this.f1152v != v2) {
            this.f1152v = v2;
            this.f1150e = true;
        }
        if (this.f1148c || this.f1150e) {
            v();
        }
        int y = h.y(7, 0);
        if (y != 0) {
            CV cv = new CV(context, 2, context.obtainStyledAttributes(y, iTI.J));
            ColorStateList m3 = cv.m(3);
            if (m3 != null) {
                this.c = m3;
            } else {
                this.c = getTextColors();
            }
            int H = cv.H(0, 0);
            if (H != 0) {
                float f = (float) H;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int P = cv.P(1, -1);
            int P2 = cv.P(2, -1);
            if (P == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (P == 2) {
                typeface = Typeface.SERIF;
            } else if (P != 3) {
                typeface = null;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            float f2 = 0.0f;
            if (P2 > 0) {
                if (typeface == null) {
                    typeface2 = Typeface.defaultFromStyle(P2);
                } else {
                    typeface2 = Typeface.create(typeface, P2);
                }
                setSwitchTypeface(typeface2);
                int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & P2;
                textPaint.setFakeBoldText((i2 & 1) == 0 ? false : z);
                textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (cv.Z(14, false)) {
                this.f1133R = new aU(getContext());
            } else {
                this.f1133R = null;
            }
            setTextOnInternal(this.f1142R);
            setTextOffInternal(this.f1147c);
            cv.z();
        }
        new wD(this).O(attributeSet, i);
        h.z();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Z = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().v(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
