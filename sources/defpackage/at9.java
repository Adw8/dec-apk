package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: at9  reason: default package */
/* loaded from: classes.dex */
public final class at9 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ jcp R;

    public at9(jcp jcp) {
        this.R = jcp;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        jcp jcp = this.R;
        Dialog dialog = jcp.f4978R;
        if (dialog != null) {
            jcp.onCancel(dialog);
        }
    }
}
