package defpackage;

import android.view.View;

/* renamed from: jBM  reason: default package */
/* loaded from: classes.dex */
public abstract class jBM {
    public static CharSequence R(View view) {
        return view.getStateDescription();
    }

    public static void v(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
