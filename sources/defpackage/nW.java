package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: nW  reason: default package */
/* loaded from: classes.dex */
public final class nW implements v2 {
    public final View R;

    public nW(View view) {
        this.R = view;
    }

    @Override // defpackage.v2
    public final Object c(hjM hjm, f_c f_c, aOO aoo) {
        long i = ooA.i(hjm);
        gIA gia = (gIA) f_c.g();
        if (gia == null) {
            return o8s.R;
        }
        gIA e = gia.e(i);
        this.R.requestRectangleOnScreen(new Rect((int) e.f3720R, (int) e.v, (int) e.c, (int) e.e), false);
        return o8s.R;
    }
}
