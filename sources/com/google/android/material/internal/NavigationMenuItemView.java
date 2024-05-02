package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends b9J implements jd5 {
    public static final int[] c = {16842912};
    public boolean L;
    public int N;
    public boolean O;
    public ColorStateList R;

    /* renamed from: R  reason: collision with other field name */
    public final CheckedTextView f2327R;

    /* renamed from: R  reason: collision with other field name */
    public FrameLayout f2328R;

    /* renamed from: R  reason: collision with other field name */
    public final bWR f2329R;

    /* renamed from: R  reason: collision with other field name */
    public pce f2330R;
    public boolean X;

    /* renamed from: c  reason: collision with other field name */
    public Drawable f2331c;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bWR bwr = new bWR(this, 2);
        this.f2329R = bwr;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f2327R = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        of5.O(checkedTextView, bwr);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2328R == null) {
                this.f2328R = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f2328R.removeAllViews();
            this.f2328R.addView(view);
        }
    }

    @Override // defpackage.jd5
    public final void c(pce pce) {
        StateListDrawable stateListDrawable;
        this.f2330R = pce;
        int i = pce.f7106R;
        if (i > 0) {
            setId(i);
        }
        setVisibility(pce.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(c, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.g(this, stateListDrawable);
        }
        setCheckable(pce.isCheckable());
        setChecked(pce.isChecked());
        setEnabled(pce.isEnabled());
        setTitle(pce.f7116R);
        setIcon(pce.getIcon());
        setActionView(pce.getActionView());
        setContentDescription(pce.f7119c);
        cFY.R(this, pce.f7121e);
        pce pce2 = this.f2330R;
        if (!(pce2.f7116R == null && pce2.getIcon() == null && this.f2330R.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f2327R.setVisibility(8);
            FrameLayout frameLayout = this.f2328R;
            if (frameLayout != null) {
                eGR egr = (eGR) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) egr).width = -1;
                this.f2328R.setLayoutParams(egr);
                return;
            }
            return;
        }
        this.f2327R.setVisibility(0);
        FrameLayout frameLayout2 = this.f2328R;
        if (frameLayout2 != null) {
            eGR egr2 = (eGR) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) egr2).width = -2;
            this.f2328R.setLayoutParams(egr2);
        }
    }

    @Override // defpackage.jd5
    public pce getItemData() {
        return this.f2330R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        pce pce = this.f2330R;
        if (pce != null && pce.isCheckable() && this.f2330R.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.O != z) {
            this.O = z;
            this.f2329R.Z(this.f2327R, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f2327R.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.L) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                cAO.Z(drawable, this.R);
            }
            int i = this.N;
            drawable.setBounds(0, 0, i, i);
        } else if (this.X) {
            if (this.f2331c == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = cu3.f2452R;
                Drawable R = fDQ.R(resources, R.drawable.navigation_empty_icon, theme);
                this.f2331c = R;
                if (R != null) {
                    int i2 = this.N;
                    R.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2331c;
        }
        nDi.X(this.f2327R, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f2327R.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.N = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.R = colorStateList;
        this.L = colorStateList != null;
        pce pce = this.f2330R;
        if (pce != null) {
            setIcon(pce.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2327R.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.X = z;
    }

    public void setTextAppearance(int i) {
        this.f2327R.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2327R.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2327R.setText(charSequence);
    }
}
