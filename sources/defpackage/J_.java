package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: J_  reason: default package */
/* loaded from: classes.dex */
public final class J_ extends PopupWindow {
    public J_(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        CV h = CV.h(context, attributeSet, iTI.t, i, i2);
        if (h.o(2)) {
            m44.c(this, h.Z(2, false));
        }
        setBackgroundDrawable(h.U(0));
        h.z();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }
}
