package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: _J  reason: default package */
/* loaded from: classes.dex */
public final class _J implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            jQ.Y(message.obj);
            throw null;
        } else if (i != 1) {
            return false;
        } else {
            jQ.Y(message.obj);
            throw null;
        }
    }
}
