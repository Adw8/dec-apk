package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* renamed from: o8d  reason: default package */
/* loaded from: classes.dex */
public final class o8d implements Runnable {
    public final /* synthetic */ TextInputLayout R;
    public final /* synthetic */ int e;

    public /* synthetic */ o8d(TextInputLayout textInputLayout, int i) {
        this.e = i;
        this.R = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                iOp iop = this.R.f2362R;
                iop.f4577v.performClick();
                iop.f4577v.jumpDrawablesToCurrentState();
                return;
            default:
                this.R.f2356R.requestLayout();
                return;
        }
    }
}
