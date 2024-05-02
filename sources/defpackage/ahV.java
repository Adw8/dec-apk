package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: ahV  reason: default package */
/* loaded from: classes.dex */
public final class ahV implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ovy {
    public Db R;

    /* renamed from: R  reason: collision with other field name */
    public hwc f977R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f978R;

    public ahV(lRG lrg) {
        this.f978R = lrg;
    }

    @Override // defpackage.ovy
    public final void R(lRG lrg, boolean z) {
        Db db;
        if ((z || lrg == this.f978R) && (db = this.R) != null) {
            db.dismiss();
        }
    }

    @Override // defpackage.ovy
    public final boolean e(lRG lrg) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        lRG lrg = this.f978R;
        hwc hwc = this.f977R;
        if (hwc.f4427R == null) {
            hwc.f4427R = new lnm(hwc);
        }
        lrg.g(hwc.f4427R.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f977R.R(this.f978R, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.R.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.R.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f978R.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f978R.performShortcut(i, keyEvent, 0);
    }
}
