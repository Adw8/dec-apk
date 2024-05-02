package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* loaded from: classes.dex */
public class ActionMenuItemView extends TC implements jd5, View.OnClickListener, vI {
    public int O;
    public Drawable R;

    /* renamed from: R  reason: collision with other field name */
    public ca f1027R;

    /* renamed from: R  reason: collision with other field name */
    public cc f1028R;

    /* renamed from: R  reason: collision with other field name */
    public ikD f1029R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f1030R;

    /* renamed from: R  reason: collision with other field name */
    public pce f1031R;
    public boolean c;
    public int e;
    public boolean v = X();
    public int X = -1;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iTI.c, 0, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.O = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setSaveEnabled(false);
    }

    public final void O() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1030R);
        if (this.R != null) {
            if (!((this.f1031R.m & 4) == 4) || (!this.v && !this.c)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1030R : null);
        CharSequence charSequence2 = this.f1031R.f7119c;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z3 ? null : this.f1031R.f7116R);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.f1031R.f7121e;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f1031R.f7116R;
            }
            cFY.R(this, charSequence);
            return;
        }
        cFY.R(this, charSequence3);
    }

    @Override // defpackage.vI
    public final boolean R() {
        return e() && this.f1031R.getIcon() == null;
    }

    public final boolean X() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // defpackage.jd5
    public final void c(pce pce) {
        this.f1031R = pce;
        setIcon(pce.getIcon());
        setTitle(pce.getTitleCondensed());
        setId(pce.f7106R);
        setVisibility(pce.isVisible() ? 0 : 8);
        setEnabled(pce.isEnabled());
        if (pce.hasSubMenu() && this.f1028R == null) {
            this.f1028R = new cc(this);
        }
    }

    public final boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.jd5
    public pce getItemData() {
        return this.f1031R;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ikD ikd = this.f1029R;
        if (ikd != null) {
            ikd.R(this.f1031R);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v = X();
        O();
    }

    @Override // defpackage.TC, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean e = e();
        if (e && (i3 = this.X) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.e) : this.e;
        if (mode != 1073741824 && this.e > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!e && this.R != null) {
            super.setPadding((getMeasuredWidth() - this.R.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cc ccVar;
        if (!this.f1031R.hasSubMenu() || (ccVar = this.f1028R) == null || !ccVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.c != z) {
            this.c = z;
            pce pce = this.f1031R;
            if (pce != null) {
                lRG lrg = pce.f7117R;
                lrg.f5739e = true;
                lrg.j(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.R = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.O;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        O();
    }

    public void setItemInvoker(ikD ikd) {
        this.f1029R = ikd;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.X = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(ca caVar) {
        this.f1027R = caVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1030R = charSequence;
        O();
    }

    @Override // defpackage.vI
    public final boolean v() {
        return e();
    }
}
