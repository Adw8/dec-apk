package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* renamed from: _Q  reason: default package */
/* loaded from: classes.dex */
public final class _Q extends Spinner {
    public static final int[] R = {16843505};

    /* renamed from: R  reason: collision with other field name */
    public G6 f697R;

    /* renamed from: R  reason: collision with other field name */
    public M7 f699R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f700R;

    /* renamed from: R  reason: collision with other field name */
    public SpinnerAdapter f702R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f703R;
    public int e;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f701R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final Jd f698R = new Jd(this);

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r5 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public _Q(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130904032(0x7f0303e0, float:1.7414899E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f701R = r1
            android.content.Context r1 = r11.getContext()
            defpackage.lM2.R(r11, r1)
            int[] r1 = defpackage.iTI.o
            r2 = 0
            CV r1 = defpackage.CV.h(r12, r13, r1, r0, r2)
            Jd r3 = new Jd
            r3.<init>(r11)
            r11.f698R = r3
            r3 = 4
            int r3 = r1.y(r3, r2)
            if (r3 == 0) goto L_0x0031
            iOa r4 = new iOa
            r4.<init>(r12, r3)
            r11.f700R = r4
            goto L_0x0033
        L_0x0031:
            r11.f700R = r12
        L_0x0033:
            r3 = 0
            r4 = -1
            int[] r5 = defpackage._Q.R     // Catch: Exception -> 0x004f, all -> 0x004c
            android.content.res.TypedArray r5 = r12.obtainStyledAttributes(r13, r5, r0, r2)     // Catch: Exception -> 0x004f, all -> 0x004c
            boolean r6 = r5.hasValue(r2)     // Catch: Exception -> 0x004a, all -> 0x0046
            if (r6 == 0) goto L_0x005b
            int r4 = r5.getInt(r2, r2)     // Catch: Exception -> 0x004a, all -> 0x0046
            goto L_0x005b
        L_0x0046:
            r11 = move-exception
            r3 = r5
            goto L_0x00d6
        L_0x004a:
            r6 = move-exception
            goto L_0x0052
        L_0x004c:
            r11 = move-exception
            goto L_0x00d6
        L_0x004f:
            r5 = move-exception
            r6 = r5
            r5 = r3
        L_0x0052:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: all -> 0x0046
            if (r5 == 0) goto L_0x005e
        L_0x005b:
            r5.recycle()
        L_0x005e:
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x009a
            if (r4 == r6) goto L_0x0065
            goto L_0x00a7
        L_0x0065:
            j3 r4 = new j3
            android.content.Context r7 = r11.f700R
            r4.<init>(r11, r7, r13)
            android.content.Context r7 = r11.f700R
            int[] r8 = defpackage.iTI.o
            CV r7 = defpackage.CV.h(r7, r13, r8, r0, r2)
            r8 = 3
            r9 = -2
            java.lang.Object r10 = r7.v
            android.content.res.TypedArray r10 = (android.content.res.TypedArray) r10
            int r8 = r10.getLayoutDimension(r8, r9)
            r11.e = r8
            android.graphics.drawable.Drawable r8 = r7.U(r6)
            r4.P(r8)
            java.lang.String r5 = r1.t(r5)
            r4.f4805R = r5
            r7.z()
            r11.f697R = r4
            M7 r5 = new M7
            r5.<init>(r11, r11, r4, r6)
            r11.f699R = r5
            goto L_0x00a7
        L_0x009a:
            kI r4 = new kI
            r4.<init>(r11)
            r11.f697R = r4
            java.lang.String r5 = r1.t(r5)
            r4.f5246R = r5
        L_0x00a7:
            java.lang.Object r4 = r1.v
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.lang.CharSequence[] r2 = r4.getTextArray(r2)
            if (r2 == 0) goto L_0x00c2
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r4.<init>(r12, r5, r2)
            r12 = 2131493009(0x7f0c0091, float:1.8609486E38)
            r4.setDropDownViewResource(r12)
            r11.setAdapter(r4)
        L_0x00c2:
            r1.z()
            r11.f703R = r6
            android.widget.SpinnerAdapter r12 = r11.f702R
            if (r12 == 0) goto L_0x00d0
            r11.setAdapter(r12)
            r11.f702R = r3
        L_0x00d0:
            Jd r11 = r11.f698R
            r11.X(r13, r0)
            return
        L_0x00d6:
            if (r3 == 0) goto L_0x00db
            r3.recycle()
        L_0x00db:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage._Q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int R(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f701R);
        Rect rect = this.f701R;
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Jd jd = this.f698R;
        if (jd != null) {
            jd.R();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        G6 g6 = this.f697R;
        return g6 != null ? g6.O() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        G6 g6 = this.f697R;
        return g6 != null ? g6.N() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f697R != null ? this.e : super.getDropDownWidth();
    }

    public final G6 getInternalPopup() {
        return this.f697R;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        G6 g6 = this.f697R;
        return g6 != null ? g6.x() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f700R;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        G6 g6 = this.f697R;
        return g6 != null ? g6.m() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        Jd jd = this.f698R;
        if (jd != null) {
            return jd.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Jd jd = this.f698R;
        if (jd != null) {
            return jd.e();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.view.View, android.widget.AdapterView, android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        G6 g6 = this.f697R;
        if (g6 != null && g6.v()) {
            this.f697R.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f697R != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), R(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AG ag = (AG) parcelable;
        super.onRestoreInstanceState(ag.getSuperState());
        if (ag.R && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new Cx(2, this));
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AG ag = new AG(super.onSaveInstanceState());
        G6 g6 = this.f697R;
        ag.R = g6 != null && g6.v();
        return ag;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        M7 m7 = this.f699R;
        if (m7 == null || !m7.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        G6 g6 = this.f697R;
        if (g6 == null) {
            return super.performClick();
        }
        if (g6.v()) {
            return true;
        }
        this.f697R.U(M9.v(this), M9.R(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Jd jd = this.f698R;
        if (jd != null) {
            jd.O();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Jd jd = this.f698R;
        if (jd != null) {
            jd.L(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        G6 g6 = this.f697R;
        if (g6 != null) {
            g6.H(i);
            this.f697R.c(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        G6 g6 = this.f697R;
        if (g6 != null) {
            g6.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f697R != null) {
            this.e = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        G6 g6 = this.f697R;
        if (g6 != null) {
            g6.P(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(aH9.p(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        G6 g6 = this.f697R;
        if (g6 != null) {
            g6.C(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Jd jd = this.f698R;
        if (jd != null) {
            jd.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Jd jd = this.f698R;
        if (jd != null) {
            jd.x(mode);
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f703R) {
            this.f702R = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f697R != null) {
            Context context = this.f700R;
            if (context == null) {
                context = getContext();
            }
            this.f697R.L(new PM(spinnerAdapter, context.getTheme()));
        }
    }
}
