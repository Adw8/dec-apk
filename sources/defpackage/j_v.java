package defpackage;

import android.view.View;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: j_v  reason: default package */
/* loaded from: classes.dex */
public abstract class j_v extends ooA {
    public static void I(View view, oyr oyr) {
        n6E u = u(view);
        if (u != null) {
            u.R(oyr);
            if (u.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                I(viewGroup.getChildAt(i), oyr);
            }
        }
    }

    public static n6E u(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (!(tag instanceof bF0)) {
            return null;
        }
        ((bF0) tag).getClass();
        return null;
    }
}
