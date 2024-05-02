package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: WF  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class WF implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ AndroidComposeView R;

    public /* synthetic */ WF(AndroidComposeView androidComposeView) {
        this.R = androidComposeView;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        AndroidComposeView androidComposeView = this.R;
        Class cls = AndroidComposeView.R;
        androidComposeView.K();
    }
}
