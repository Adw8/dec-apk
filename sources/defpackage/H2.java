package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: H2  reason: default package */
/* loaded from: classes.dex */
public abstract class H2 extends ViewGroup.MarginLayoutParams {
    public int R;

    public H2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iTI.v);
        this.R = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public H2() {
        super(-2, -2);
        this.R = 8388627;
    }

    public H2(H2 h2) {
        super((ViewGroup.MarginLayoutParams) h2);
        this.R = 0;
        this.R = h2.R;
    }

    public H2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.R = 0;
    }
}
