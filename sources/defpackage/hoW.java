package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: hoW  reason: default package */
/* loaded from: classes.dex */
public final class hoW implements DialogInterface.OnDismissListener {
    public final /* synthetic */ jcp R;

    public hoW(jcp jcp) {
        this.R = jcp;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        jcp jcp = this.R;
        Dialog dialog = jcp.f4978R;
        if (dialog != null) {
            jcp.onDismiss(dialog);
        }
    }
}
