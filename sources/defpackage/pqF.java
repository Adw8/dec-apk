package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: pqF  reason: default package */
/* loaded from: classes.dex */
public final class pqF extends kU {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f7290R;

    public /* synthetic */ pqF(int i, Object obj) {
        this.R = i;
        this.f7290R = obj;
    }

    @Override // defpackage.kU
    public final void H() {
        switch (this.R) {
            case 0:
                ((lMx) this.f7290R).cancel();
                return;
            case 1:
                ((dj8) this.f7290R).X(gtp.CANCEL);
                jr5 jr5 = ((dj8) this.f7290R).f2840R;
                synchronized (jr5) {
                    long j = jr5.f5045e;
                    long j2 = jr5.f5043c;
                    if (j >= j2) {
                        jr5.f5043c = j2 + 1;
                        jr5.f5042X = System.nanoTime() + ((long) 1000000000);
                        hiT.c(jr5.f5033R, jQ.g(new StringBuilder(), jr5.f5035R, " ping"), new bBd(12, jr5));
                        return;
                    }
                    return;
                }
            default:
                try {
                    ((Socket) this.f7290R).close();
                    return;
                } catch (AssertionError e) {
                    if (mLz.m(e)) {
                        Logger logger = iaf.R;
                        Level level = Level.WARNING;
                        StringBuilder U = opT.U("Failed to close timed out socket ");
                        U.append((Socket) this.f7290R);
                        logger.log(level, U.toString(), (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    Logger logger2 = iaf.R;
                    Level level2 = Level.WARNING;
                    StringBuilder U2 = opT.U("Failed to close timed out socket ");
                    U2.append((Socket) this.f7290R);
                    logger2.log(level2, U2.toString(), (Throwable) e2);
                    return;
                }
        }
    }

    public final void U() {
        if (m()) {
            throw x(null);
        }
    }

    @Override // defpackage.kU
    public final InterruptedIOException x(IOException iOException) {
        switch (this.R) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.x(iOException);
        }
    }

    public pqF(Socket socket) {
        this.R = 2;
        this.f7290R = socket;
    }
}
