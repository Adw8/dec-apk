package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: fu5  reason: default package */
/* loaded from: classes.dex */
public final class fu5 implements Runnable {
    public final /* synthetic */ i97 R;

    public fu5(i97 i97) {
        this.R = i97;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mGS c;
        while (true) {
            i97 i97 = this.R;
            synchronized (i97) {
                try {
                    c = i97.c();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c != null) {
                i97 i972 = this.R;
                Logger logger = i972.f4475R;
                hiT hit = c.f5990R;
                long j = -1;
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    hit.R.f4473R.getClass();
                    j = System.nanoTime();
                    jjU.c(logger, c, hit, "starting");
                }
                try {
                    i97.R(i972, c);
                    if (isLoggable) {
                        hit.R.f4473R.getClass();
                        StringBuilder U = opT.U("finished run in ");
                        U.append(jjU.H(System.nanoTime() - j));
                        jjU.c(logger, c, hit, U.toString());
                    }
                } catch (Throwable th2) {
                    try {
                        synchronized (i972) {
                            i972.f4473R.R.execute(this);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        if (isLoggable) {
                            hit.R.f4473R.getClass();
                            StringBuilder U2 = opT.U("failed a run in ");
                            U2.append(jjU.H(System.nanoTime() - j));
                            jjU.c(logger, c, hit, U2.toString());
                        }
                        throw th3;
                    }
                }
            } else {
                return;
            }
        }
    }
}
