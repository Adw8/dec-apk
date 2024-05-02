package defpackage;

import android.view.View;

/* renamed from: gC  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gC implements View.OnFocusChangeListener {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kst f3691R;

    public /* synthetic */ gC(kst kst, int i) {
        this.R = i;
        this.f3691R = kst;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.R) {
            case 0:
                UU uu = (UU) this.f3691R;
                uu.i(uu.V());
                return;
            default:
                heD hed = (heD) this.f3691R;
                hed.f4335R = z;
                hed.g();
                if (!z) {
                    hed.i(false);
                    hed.f4336v = false;
                    return;
                }
                return;
        }
    }
}
