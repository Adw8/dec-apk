package defpackage;

import android.widget.PopupWindow;

/* renamed from: iCh  reason: default package */
/* loaded from: classes.dex */
public final class iCh implements PopupWindow.OnDismissListener {
    public final /* synthetic */ h6s R;

    public iCh(h6s h6s) {
        this.R = h6s;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.R.c();
    }
}
