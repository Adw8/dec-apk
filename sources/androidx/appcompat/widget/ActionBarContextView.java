package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public int L;
    public int O;
    public final Id R = new Id(this);

    /* renamed from: R  reason: collision with other field name */
    public RR f1051R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f1052R;

    /* renamed from: R  reason: collision with other field name */
    public View f1053R;

    /* renamed from: R  reason: collision with other field name */
    public LinearLayout f1054R;

    /* renamed from: R  reason: collision with other field name */
    public TextView f1055R;

    /* renamed from: R  reason: collision with other field name */
    public ActionMenuView f1056R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f1057R;

    /* renamed from: R  reason: collision with other field name */
    public ozg f1058R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1059R;
    public int X;
    public View c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1060c;
    public int e;
    public View v;

    /* renamed from: v  reason: collision with other field name */
    public TextView f1061v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f1062v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1063v;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1052R = context;
        } else {
            this.f1052R = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        CV h = CV.h(context, attributeSet, iTI.e, R.attr.actionModeStyle, 0);
        Drawable U = h.U(0);
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(this, U);
        this.X = h.y(5, 0);
        this.O = h.y(4, 0);
        this.e = ((TypedArray) h.v).getLayoutDimension(3, 0);
        this.L = h.y(2, R.layout.abc_action_mode_close_item_material);
        h.z();
    }

    public static int O(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public static int x(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: H */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ozg ozg = this.f1058R;
            if (ozg != null) {
                ozg.v();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: L */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, iTI.f4603R, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        RR rr = this.f1051R;
        if (rr != null) {
            rr.Z = new gL6(1, rr.f494v).C();
            lRG lrg = rr.f489R;
            if (lrg != null) {
                lrg.j(true);
            }
        }
    }

    public final ozg U(long j, int i) {
        ozg ozg = this.f1058R;
        if (ozg != null) {
            ozg.v();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ozg R = of5.R(this);
            R.R(1.0f);
            R.c(j);
            Id id = this.R;
            id.f186R.f1058R = R;
            id.R = i;
            R.e(id);
            return R;
        }
        ozg R2 = of5.R(this);
        R2.R(0.0f);
        R2.c(j);
        Id id2 = this.R;
        id2.f186R.f1058R = R2;
        id2.R = i;
        R2.e(id2);
        return R2;
    }

    public final void X() {
        removeAllViews();
        this.c = null;
        this.f1056R = null;
        this.f1051R = null;
        View view = this.v;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: Z */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1063v = false;
        }
        if (!this.f1063v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1063v = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1063v = false;
        }
        return true;
    }

    public final void c(UF uf) {
        View view = this.f1053R;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.L, (ViewGroup) this, false);
            this.f1053R = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1053R);
        }
        View findViewById = this.f1053R.findViewById(R.id.action_mode_close_button);
        this.v = findViewById;
        findViewById.setOnClickListener(new MX(this, uf));
        lRG X = uf.X();
        RR rr = this.f1051R;
        if (rr != null) {
            rr.e();
            Ni ni = rr.v;
            if (ni != null && ni.v()) {
                ((h6s) ni).f4068R.dismiss();
            }
        }
        RR rr2 = new RR(getContext());
        this.f1051R = rr2;
        rr2.f495v = true;
        rr2.c = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        X.v(this.f1051R, this.f1052R);
        RR rr3 = this.f1051R;
        ehR ehr = rr3.f487R;
        if (ehr == null) {
            ehR ehr2 = (ehR) rr3.f485R.inflate(rr3.e, (ViewGroup) this, false);
            rr3.f487R = ehr2;
            ehr2.v(rr3.f489R);
            rr3.m();
        }
        ehR ehr3 = rr3.f487R;
        if (ehr != ehr3) {
            ((ActionMenuView) ehr3).setPresenter(rr3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) ehr3;
        this.f1056R = actionMenuView;
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(actionMenuView, null);
        addView(this.f1056R, layoutParams);
    }

    public final void e() {
        if (this.f1054R == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1054R = linearLayout;
            this.f1055R = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1061v = (TextView) this.f1054R.findViewById(R.id.action_bar_subtitle);
            if (this.X != 0) {
                this.f1055R.setTextAppearance(getContext(), this.X);
            }
            if (this.O != 0) {
                this.f1061v.setTextAppearance(getContext(), this.O);
            }
        }
        this.f1055R.setText(this.f1057R);
        this.f1061v.setText(this.f1062v);
        boolean z = !TextUtils.isEmpty(this.f1057R);
        boolean z2 = !TextUtils.isEmpty(this.f1062v);
        int i = 0;
        this.f1061v.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1054R;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1054R.getParent() == null) {
            addView(this.f1054R);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1058R != null ? this.R.R : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.f1062v;
    }

    public CharSequence getTitle() {
        return this.f1057R;
    }

    /* renamed from: m */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1059R = false;
        }
        if (!this.f1059R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1059R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1059R = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RR rr = this.f1051R;
        if (rr != null) {
            rr.e();
            Ni ni = this.f1051R.v;
            if (ni != null && ni.v()) {
                ((h6s) ni).f4068R.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean R = oJF.R(this);
        int paddingRight = R ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1053R;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1053R.getLayoutParams();
            int i5 = R ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = R ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = R ? paddingRight - i5 : paddingRight + i5;
            int x = x(this.f1053R, i7, paddingTop, paddingTop2, R) + i7;
            paddingRight = R ? x - i6 : x + i6;
        }
        LinearLayout linearLayout = this.f1054R;
        if (!(linearLayout == null || this.c != null || linearLayout.getVisibility() == 8)) {
            paddingRight += x(this.f1054R, paddingRight, paddingTop, paddingTop2, R);
        }
        View view2 = this.c;
        if (view2 != null) {
            x(view2, paddingRight, paddingTop, paddingTop2, R);
        }
        int paddingLeft = R ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1056R;
        if (actionMenuView != null) {
            x(actionMenuView, paddingLeft, paddingTop, paddingTop2, !R);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.e;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1053R;
            if (view != null) {
                int O = O(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1053R.getLayoutParams();
                paddingLeft = O - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1056R;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = O(this.f1056R, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1054R;
            if (linearLayout != null && this.c == null) {
                if (this.f1060c) {
                    this.f1054R.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1054R.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1054R.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = O(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.c;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.e <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.c;
        if (view2 != null) {
            removeView(view2);
        }
        this.c = view;
        if (!(view == null || (linearLayout = this.f1054R) == null)) {
            removeView(linearLayout);
            this.f1054R = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1062v = charSequence;
        e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1057R = charSequence;
        e();
        of5.L(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1060c) {
            requestLayout();
        }
        this.f1060c = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
