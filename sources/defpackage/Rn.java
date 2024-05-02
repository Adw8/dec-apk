package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: Rn  reason: default package */
/* loaded from: classes.dex */
public final class Rn extends LinearLayout.LayoutParams {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Interpolator f499R;

    /* renamed from: R  reason: collision with other field name */
    public h5 f500R;

    public Rn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h5 h5Var;
        this.R = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.Z);
        this.R = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            h5Var = null;
        } else {
            h5Var = new h5(21);
        }
        this.f500R = h5Var;
        if (obtainStyledAttributes.hasValue(2)) {
            this.f499R = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public Rn() {
        super(-1, -2);
        this.R = 1;
    }

    public Rn(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.R = 1;
    }

    public Rn(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.R = 1;
    }

    public Rn(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.R = 1;
    }
}
