package defpackage;

import dev.kdrag0n.app.data.SettingsUpdateWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: ok4  reason: default package */
/* loaded from: classes.dex */
public final class ok4 extends oJN {
    public ok4(TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(SettingsUpdateWorker.class);
        l3L l3l = ((oJN) this).f6742R;
        long millis = timeUnit.toMillis(6);
        long millis2 = timeUnit2.toMillis(1);
        l3l.getClass();
        if (millis < 900000) {
            kfk.U().g(l3L.e, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            millis = 900000;
        }
        if (millis2 < 300000) {
            kfk.U().g(l3L.e, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            millis2 = 300000;
        }
        if (millis2 > millis) {
            kfk.U().g(l3L.e, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(millis)), new Throwable[0]);
            millis2 = millis;
        }
        l3l.f5567v = millis;
        l3l.f5564c = millis2;
    }

    @Override // defpackage.oJN
    public final oJN c() {
        return this;
    }

    @Override // defpackage.oJN
    public final lyz v() {
        if (((oJN) this).f6743R && ((oJN) this).f6742R.f5559R.f2443v) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        } else if (!((oJN) this).f6742R.f5563R) {
            return new e2x(this);
        } else {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
    }
}
