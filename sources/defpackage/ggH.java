package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: ggH  reason: default package */
/* loaded from: classes.dex */
public final class ggH extends AppCompatCheckBox {

    /* renamed from: R  reason: collision with other field name */
    public final EH f3845R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f3846R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f3847R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f3848R;

    /* renamed from: R  reason: collision with other field name */
    public CompoundButton.OnCheckedChangeListener f3849R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f3851R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3853R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f3854R;

    /* renamed from: X  reason: collision with other field name */
    public boolean f3855X;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f3856c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f3857c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f3858e;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f3860v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f3861v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3863v;
    public static final int[] v = {R.attr.state_indeterminate};
    public static final int[] c = {R.attr.state_error};
    public static final int[][] R = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int X = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f3852R = new LinkedHashSet();

    /* renamed from: v  reason: collision with other field name */
    public final LinkedHashSet f3862v = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public final ePR f3850R = new ePR(this);

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f3859v = getSuperButtonTintList();

    public ggH(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.checkboxStyle, 2132018176), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        EH eh = new EH(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = cu3.f2452R;
        Drawable R2 = fDQ.R(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        ((et7) eh).R = R2;
        R2.setCallback(eh.f86R);
        new Er(((et7) eh).R.getConstantState());
        this.f3845R = eh;
        Context context3 = getContext();
        this.f3848R = kwz.R(this);
        setSupportButtonTintList(null);
        int[] iArr = hDC.Y;
        aH9.J(context3, attributeSet, R.attr.checkboxStyle, 2132018176);
        aH9.Y(context3, attributeSet, iArr, R.attr.checkboxStyle, 2132018176, new int[0]);
        CV h = CV.h(context3, attributeSet, iArr, R.attr.checkboxStyle, 2132018176);
        this.f3860v = h.U(2);
        if (this.f3848R != null && hDC.s(context3, R.attr.isMaterial3Theme, false)) {
            if (h.y(0, 0) == X && h.y(1, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f3848R = aH9.p(context3, R.drawable.mtrl_checkbox_button);
                this.f3858e = true;
                if (this.f3860v == null) {
                    this.f3860v = aH9.p(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f3856c = lTs.Z(context3, h, 3);
        this.f3847R = vd.u(h.P(4, -1), PorterDuff.Mode.SRC_IN);
        this.f3853R = h.Z(10, false);
        this.f3863v = h.Z(6, true);
        this.f3857c = h.Z(9, false);
        this.f3851R = h.V(8);
        if (h.o(7)) {
            setCheckedState(h.P(7, 0));
        }
        h.z();
        R();
    }

    private String getButtonStateDescription() {
        int i = this.e;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3846R == null) {
            int[][] iArr = R;
            int t = vd.t(this, R.attr.colorControlActivated);
            int t2 = vd.t(this, R.attr.colorError);
            int t3 = vd.t(this, R.attr.colorSurface);
            int t4 = vd.t(this, R.attr.colorOnSurface);
            this.f3846R = new ColorStateList(iArr, new int[]{vd.Y(t3, t2, 1.0f), vd.Y(t3, t, 1.0f), vd.Y(t3, t4, 0.54f), vd.Y(t3, t4, 0.38f), vd.Y(t3, t4, 0.38f)});
        }
        return this.f3846R;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f3859v;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void R() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        EH eh;
        XM xm;
        this.f3848R = cpc.J(this.f3848R, this.f3859v, oZQ.v(this));
        this.f3860v = cpc.J(this.f3860v, this.f3856c, this.f3847R);
        if (this.f3858e) {
            EH eh2 = this.f3845R;
            if (eh2 != null) {
                ePR epr = this.f3850R;
                Drawable drawable = ((et7) eh2).R;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (epr.R == null) {
                        epr.R = new GK(epr);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(epr.R);
                }
                ArrayList arrayList = eh2.f85R;
                if (!(arrayList == null || epr == null)) {
                    arrayList.remove(epr);
                    if (eh2.f85R.size() == 0 && (xm = eh2.R) != null) {
                        eh2.f84R.f2525R.removeListener(xm);
                        eh2.R = null;
                    }
                }
                EH eh3 = this.f3845R;
                ePR epr2 = this.f3850R;
                Drawable drawable2 = ((et7) eh3).R;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (epr2.R == null) {
                        epr2.R = new GK(epr2);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(epr2.R);
                } else if (epr2 != null) {
                    if (eh3.f85R == null) {
                        eh3.f85R = new ArrayList();
                    }
                    if (!eh3.f85R.contains(epr2)) {
                        eh3.f85R.add(epr2);
                        if (eh3.R == null) {
                            eh3.R = new XM(2, eh3);
                        }
                        eh3.f84R.f2525R.addListener(eh3.R);
                    }
                }
            }
            Drawable drawable3 = this.f3848R;
            if ((drawable3 instanceof AnimatedStateListDrawable) && (eh = this.f3845R) != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eh, false);
                ((AnimatedStateListDrawable) this.f3848R).addTransition(R.id.indeterminate, R.id.unchecked, this.f3845R, false);
            }
        }
        Drawable drawable4 = this.f3848R;
        if (!(drawable4 == null || (colorStateList2 = this.f3859v) == null)) {
            cAO.Z(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f3860v;
        if (!(drawable5 == null || (colorStateList = this.f3856c) == null)) {
            cAO.Z(drawable5, colorStateList);
        }
        super.setButtonDrawable(cpc.o(this.f3848R, this.f3860v));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f3848R;
    }

    public Drawable getButtonIconDrawable() {
        return this.f3860v;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f3856c;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f3847R;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f3859v;
    }

    public int getCheckedState() {
        return this.e;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f3851R;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.e == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3853R && this.f3859v == null && this.f3856c == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (this.f3857c) {
            View.mergeDrawableStates(onCreateDrawableState, c);
        }
        this.f3854R = cpc.n(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable R2;
        if (!this.f3863v || !TextUtils.isEmpty(getText()) || (R2 = kwz.R(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - R2.getIntrinsicWidth()) / 2) * (vd.J(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = R2.getBounds();
            cAO.O(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f3857c) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f3851R));
        }
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ooN)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ooN oon = (ooN) parcelable;
        super.onRestoreInstanceState(oon.getSuperState());
        setCheckedState(oon.e);
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final Parcelable onSaveInstanceState() {
        ooN oon = new ooN(super.onSaveInstanceState());
        oon.e = getCheckedState();
        return oon;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(aH9.p(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f3860v = drawable;
        R();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(aH9.p(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f3856c != colorStateList) {
            this.f3856c = colorStateList;
            R();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f3847R != mode) {
            this.f3847R = mode;
            R();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f3859v != colorStateList) {
            this.f3859v = colorStateList;
            R();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        R();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f3863v = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.e != i) {
            this.e = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (this.f3861v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f3855X) {
                this.f3855X = true;
                LinkedHashSet linkedHashSet = this.f3862v;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((oHH) it.next()).R();
                    }
                }
                if (!(this.e == 2 || (onCheckedChangeListener = this.f3849R) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f3855X = false;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f3851R = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f3857c != z) {
            this.f3857c = z;
            refreshDrawableState();
            Iterator it = this.f3852R.iterator();
            while (it.hasNext()) {
                ((gFg) it.next()).R();
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3849R = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f3861v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3853R = z;
        if (z) {
            oZQ.c(this, getMaterialThemeColorsTintList());
        } else {
            oZQ.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f3848R = drawable;
        this.f3858e = false;
        R();
    }
}
