package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: fCm  reason: default package */
/* loaded from: classes.dex */
public final class fCm extends H2 {
    public int v;

    public fCm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = 0;
    }

    public fCm() {
        this.v = 0;
        this.R = 8388627;
    }

    public fCm(fCm fcm) {
        super((H2) fcm);
        this.v = 0;
        this.v = fcm.v;
    }

    public fCm(H2 h2) {
        super(h2);
        this.v = 0;
    }

    public fCm(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.v = 0;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public fCm(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.v = 0;
    }
}
