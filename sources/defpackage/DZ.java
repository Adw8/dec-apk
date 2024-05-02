package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: DZ  reason: default package */
/* loaded from: classes.dex */
public final class DZ extends Handler {
    public static final DZ R = new DZ();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        CopyOnWriteArraySet copyOnWriteArraySet = _r.f708R;
        String loggerName = logRecord.getLoggerName();
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = (String) _r.R.get(loggerName);
        if (str == null) {
            str = an2.cr(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int W = iH_.W(message, '\n', i2, false, 4);
                if (W == -1) {
                    W = length;
                }
                while (true) {
                    min = Math.min(W, i2 + 4000);
                    Log.println(i, str, message.substring(i2, min));
                    if (min >= W) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
