package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: jn7  reason: default package */
/* loaded from: classes.dex */
public final class jn7 implements Handler.Callback {
    public final /* synthetic */ piu R;

    public jn7(piu piu) {
        this.R = piu;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        piu piu = this.R;
        jQ.Y(message.obj);
        synchronized (piu.f7202R) {
            jQ.Y(piu.c);
            throw null;
        }
    }
}
