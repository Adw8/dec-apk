package defpackage;

import android.view.ActionMode;
import android.view.View;

/* renamed from: nJS  reason: default package */
/* loaded from: classes.dex */
public final class nJS {
    public static final nJS R = new nJS();

    public final void R(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode v(View view, ActionMode.Callback callback, int i) {
        return view.startActionMode(callback, i);
    }
}
