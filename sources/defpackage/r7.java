package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: r7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView R;

    public /* synthetic */ r7(AndroidComposeView androidComposeView) {
        this.R = androidComposeView;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView androidComposeView = this.R;
        androidComposeView.f1205R.R.R(new a_n(z ? 1 : 2));
        msU.yf(androidComposeView.f1218R.f6661R);
    }
}
