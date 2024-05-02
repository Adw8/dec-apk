package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: mPw  reason: default package */
/* loaded from: classes.dex */
public abstract class mPw {
    public static boolean R(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode v(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
