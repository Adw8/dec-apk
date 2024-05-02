package de.Maxr1998.modernpreferences.preferences;

import android.app.Dialog;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class DialogPreference extends e1q implements k3P {
    public Dialog R;
    public boolean c;

    public abstract Db X(Context context);

    @Override // defpackage.k3P
    public void e(nu_ nu_, alX alx) {
        int i = k6w.R[alx.ordinal()];
        if (i != 1) {
            if (i == 3) {
                Dialog dialog = this.R;
                if (dialog != null) {
                    this.c = dialog.isShowing();
                    dialog.dismiss();
                }
                this.R = null;
            }
        } else if (this.c && (nu_ instanceof Context)) {
            this.c = false;
            Context context = (Context) nu_;
            Dialog dialog2 = this.R;
            if (dialog2 == null) {
                dialog2 = X(context);
                this.R = dialog2;
            }
            dialog2.show();
        }
    }

    @Override // defpackage.e1q
    public final void v(kS8 ks8) {
        Context context = ((h9X) ks8).f4097R.getContext();
        Dialog dialog = this.R;
        if (dialog == null) {
            dialog = X(context);
            this.R = dialog;
        }
        dialog.show();
    }
}
