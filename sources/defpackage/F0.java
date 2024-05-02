package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: F0  reason: default package */
/* loaded from: classes.dex */
public final class F0 extends FrameLayout.LayoutParams {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f113R;

    public F0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113R = 0;
        this.R = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.P);
        this.f113R = obtainStyledAttributes.getInt(0, 0);
        this.R = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public F0() {
        super(-1, -1);
        this.f113R = 0;
        this.R = 0.5f;
    }

    public F0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f113R = 0;
        this.R = 0.5f;
    }
}
