package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: Cf  reason: default package */
/* loaded from: classes.dex */
public final class Cf implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout R;
    public final /* synthetic */ int e;

    public /* synthetic */ Cf(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.e = i;
        this.R = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.R.Z();
                ActionBarOverlayLayout actionBarOverlayLayout = this.R;
                actionBarOverlayLayout.f1069R = actionBarOverlayLayout.f1071R.animate().translationY(0.0f).setListener(this.R.f1065R);
                return;
            default:
                this.R.Z();
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.R;
                actionBarOverlayLayout2.f1069R = actionBarOverlayLayout2.f1071R.animate().translationY((float) (-this.R.f1071R.getHeight())).setListener(this.R.f1065R);
                return;
        }
    }
}
