package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: R_  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class R_ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AndroidComposeView R;

    public /* synthetic */ R_(AndroidComposeView androidComposeView) {
        this.R = androidComposeView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AndroidComposeView androidComposeView = this.R;
        Class cls = AndroidComposeView.R;
        androidComposeView.K();
    }
}
