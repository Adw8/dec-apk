package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: i54  reason: default package */
/* loaded from: classes.dex */
public final class i54 extends hw1 {
    public Window R;

    /* renamed from: R  reason: collision with other field name */
    public final WindowInsetsController f4452R;

    public i54(Window window) {
        this.f4452R = window.getInsetsController();
        this.R = window;
    }

    @Override // defpackage.hw1
    public final void K(boolean z) {
        if (z) {
            Window window = this.R;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f4452R.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.R;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f4452R.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.hw1
    public final void o(boolean z) {
        if (z) {
            Window window = this.R;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f4452R.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.R;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f4452R.setSystemBarsAppearance(0, 16);
    }
}
