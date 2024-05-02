package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: tR  reason: default package */
/* loaded from: classes.dex */
public final class tR {
    public static final tR R = new tR();

    public final void R(View view, oSj osj) {
        PointerIcon pointerIcon;
        if (osj instanceof Kf) {
            Context context = view.getContext();
            ((Kf) osj).getClass();
            pointerIcon = PointerIcon.getSystemIcon(context, 0);
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!n3x.v(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
