package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: iZS  reason: default package */
/* loaded from: classes.dex */
public final class iZS implements jZi {
    public final Future R;

    public iZS(ScheduledFuture scheduledFuture) {
        this.R = scheduledFuture;
    }

    @Override // defpackage.jZi
    public final void R() {
        this.R.cancel(false);
    }

    public final String toString() {
        StringBuilder U = opT.U("DisposableFutureHandle[");
        U.append(this.R);
        U.append(']');
        return U.toString();
    }
}
