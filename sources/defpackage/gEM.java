package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/* renamed from: gEM  reason: default package */
/* loaded from: classes.dex */
public final class gEM extends k8G implements f_c {
    public final /* synthetic */ Context R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gEM(Context context, int i) {
        super(0);
        this.X = i;
        this.R = context;
    }

    public final void R() {
        switch (this.X) {
            case 2:
                mxC.K(this.R);
                return;
            case 3:
                mxC.K(this.R);
                return;
            case 4:
                vd.I(this.R, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", null);
                return;
            default:
                mxC.J(this.R, "https://docs.google.com/forms/d/e/1FAIpQLSfRhwXkTzZJ-nIHhtqRxduG1HMxwNl217pyDa_-HkTiXMGZvg/viewform");
                return;
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return (InputMethodManager) this.R.getSystemService("input_method");
            case 1:
                return jFe.R(this.R);
            case 2:
                R();
                return o8s.R;
            case 3:
                R();
                return o8s.R;
            case 4:
                R();
                return o8s.R;
            default:
                R();
                return o8s.R;
        }
    }
}
