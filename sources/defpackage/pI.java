package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: pI  reason: default package */
/* loaded from: classes.dex */
public final class pI extends Handler {
    public final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public Object f7076R;

    public pI(DialogInterface dialogInterface) {
        this.f7076R = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.R) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f7076R).get(), message.what);
                    return;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                } else {
                    return;
                }
            default:
                int i2 = message.what;
                if (i2 == 1) {
                    jQ.Y(this.f7076R);
                    throw null;
                } else if (i2 == 2) {
                    jQ.Y(this.f7076R);
                    throw null;
                } else if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                } else {
                    jQ.Y(this.f7076R);
                    throw null;
                }
        }
    }
}
