package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: ao7  reason: default package */
/* loaded from: classes.dex */
public final class ao7 extends ri {
    public static final int[][] R = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f1468R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1469R;

    public ao7(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.radioButtonStyle, 2132018177), attributeSet);
        Context context2 = getContext();
        TypedArray w = aH9.w(context2, attributeSet, hDC.h, R.attr.radioButtonStyle, 2132018177, new int[0]);
        if (w.hasValue(0)) {
            oZQ.c(this, lTs.m(context2, w, 0));
        }
        this.f1469R = w.getBoolean(1, false);
        w.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1468R == null) {
            int t = vd.t(this, R.attr.colorControlActivated);
            int t2 = vd.t(this, R.attr.colorOnSurface);
            int t3 = vd.t(this, R.attr.colorSurface);
            this.f1468R = new ColorStateList(R, new int[]{vd.Y(t3, t, 1.0f), vd.Y(t3, t2, 0.54f), vd.Y(t3, t2, 0.38f), vd.Y(t3, t2, 0.38f)});
        }
        return this.f1468R;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1469R && oZQ.R(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1469R = z;
        if (z) {
            oZQ.c(this, getMaterialThemeColorsTintList());
        } else {
            oZQ.c(this, null);
        }
    }
}
