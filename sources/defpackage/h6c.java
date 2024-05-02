package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.Locale;

/* renamed from: h6c  reason: default package */
/* loaded from: classes.dex */
public final class h6c extends yp {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f4058R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f4059R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityManager f4060R;

    /* renamed from: R  reason: collision with other field name */
    public final olv f4061R;
    public int X;
    public final int e;

    public h6c(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        Context context2 = getContext();
        TypedArray w = aH9.w(context2, attributeSet, hDC.t, R.attr.autoCompleteTextViewStyle, 2132017908, new int[0]);
        if (w.hasValue(0) && w.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.e = w.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.R = (float) w.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.X = w.getColor(3, 0);
        this.f4058R = lTs.m(context2, w, 4);
        this.f4060R = (AccessibilityManager) context2.getSystemService("accessibility");
        olv olv = new olv(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f4061R = olv;
        olv.f6930e = true;
        olv.R.setFocusable(true);
        olv.f6921R = this;
        olv.R.setInputMethodMode(2);
        olv.L(getAdapter());
        olv.f6922R = new kmV(this, 1);
        if (w.hasValue(5)) {
            setSimpleItems(w.getResourceId(5, 0));
        }
        w.recycle();
    }

    public static void R(h6c h6c, Object obj) {
        h6c.setText(h6c.convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout v = v();
        return (v == null || !v.f2370X) ? super.getHint() : v.getHint();
    }

    public float getPopupElevation() {
        return this.R;
    }

    public int getSimpleItemSelectedColor() {
        return this.X;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f4058R;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout v = v();
        if (v != null && v.f2370X && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout v = v();
            int i3 = 0;
            if (!(adapter == null || v == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                olv olv = this.f4061R;
                int min = Math.min(adapter.getCount(), Math.max(0, !olv.v() ? -1 : olv.f6917R.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, v);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable x = this.f4061R.x();
                if (x != null) {
                    x.getPadding(this.f4059R);
                    Rect rect = this.f4059R;
                    i4 += rect.left + rect.right;
                }
                i3 = v.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f4061R.L(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f4061R.f6923R = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout v = v();
        if (v != null) {
            v.g();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.X = i;
        if (getAdapter() instanceof kXa) {
            ((kXa) getAdapter()).R();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f4058R = colorStateList;
        if (getAdapter() instanceof kXa) {
            ((kXa) getAdapter()).R();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f4060R;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f4061R.Z();
        }
    }

    public final TextInputLayout v() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new kXa(this, getContext(), this.e, strArr));
    }
}
