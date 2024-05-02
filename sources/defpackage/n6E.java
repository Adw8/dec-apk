package defpackage;

import android.view.View;

/* renamed from: n6E  reason: default package */
/* loaded from: classes.dex */
public final class n6E implements Runnable, mpM, View.OnAttachStateChangeListener {
    public gWM R;

    /* renamed from: R  reason: collision with other field name */
    public final kHc f6305R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6306R;
    public final int e;

    public n6E(kHc khc) {
        this.e = !khc.f5239R ? 1 : 0;
        this.f6305R = khc;
    }

    public final void R(oyr oyr) {
        this.f6306R = false;
        gWM gwm = this.R;
        if (!(oyr.R.I() == 0 || gwm == null)) {
            this.f6305R.R(gwm, oyr.R.u());
        }
        this.R = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6306R) {
            this.f6306R = false;
            gWM gwm = this.R;
            if (gwm != null) {
                this.f6305R.R(gwm, 0);
                this.R = null;
            }
        }
    }

    @Override // defpackage.mpM
    public final gWM v(View view, gWM gwm) {
        if (this.f6306R) {
            this.R = gwm;
            return gwm;
        }
        this.f6305R.R(gwm, 0);
        return this.f6305R.f5239R ? gWM.R : gwm;
    }
}
