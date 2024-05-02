package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: hFd  reason: default package */
/* loaded from: classes.dex */
public final class hFd implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ mpM R;

    public hFd(View view, mpM mpm) {
        this.R = mpm;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.R.v(view, gWM.Z(view, windowInsets)).L();
    }
}
