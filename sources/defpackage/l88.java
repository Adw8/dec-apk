package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: l88  reason: default package */
/* loaded from: classes.dex */
public class l88 extends ViewGroup.MarginLayoutParams {

    /* renamed from: R  reason: collision with other field name */
    public h9X f5601R;
    public final Rect R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public boolean f5602R = true;
    public boolean v = false;

    public l88(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int R() {
        return this.f5601R.c();
    }

    public final boolean c() {
        return this.f5601R.m();
    }

    public final boolean v() {
        return (this.f5601R.X & 2) != 0;
    }

    public l88(int i, int i2) {
        super(i, i2);
    }

    public l88(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public l88(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public l88(l88 l88) {
        super((ViewGroup.LayoutParams) l88);
    }
}
