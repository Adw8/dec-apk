package com.termux.terminal;

import android.os.Handler;
import android.os.Message;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ Y R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f2422R = new byte[4096];

    public c(Y y) {
        this.R = y;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int R = this.R.f2411R.R(false, this.f2422R);
        if (R > 0) {
            gje gje = this.R.f2413R;
            byte[] bArr = this.f2422R;
            gje.getClass();
            for (int i = 0; i < R; i++) {
                gje.t(bArr[i]);
            }
            this.R.f2416R.L();
        }
        if (message.what == 4) {
            int intValue = ((Integer) message.obj).intValue();
            Y y = this.R;
            synchronized (y) {
                y.R = -1;
            }
            _K _k = y.f2419v;
            synchronized (_k) {
                _k.f693R = false;
                _k.notify();
            }
            _K _k2 = y.f2411R;
            synchronized (_k2) {
                _k2.f693R = false;
                _k2.notify();
            }
            JNI.close(y.v);
            String str = "\r\n[Process completed";
            if (intValue > 0) {
                str = str + " (code " + intValue + ")";
            } else if (intValue < 0) {
                str = jQ.j(jQ.t(str, " (signal "), -intValue, ")");
            }
            byte[] bytes = opT.H(str, " - press Enter]").getBytes(StandardCharsets.UTF_8);
            gje gje2 = this.R.f2413R;
            gje2.getClass();
            for (byte b : bytes) {
                gje2.t(b);
            }
            this.R.f2416R.L();
            Y y2 = this.R;
            y2.f2416R.v(y2);
        }
    }
}
