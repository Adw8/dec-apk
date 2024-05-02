package defpackage;

import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: oJN  reason: default package */
/* loaded from: classes.dex */
public abstract class oJN {

    /* renamed from: R  reason: collision with other field name */
    public l3L f6742R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6743R = false;
    public HashSet R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public UUID f6741R = UUID.randomUUID();

    public oJN(Class cls) {
        this.f6742R = new l3L(this.f6741R.toString(), cls.getName());
        this.R.add(cls.getName());
        c();
    }

    public final lyz R() {
        lyz v = v();
        csc csc = this.f6742R.f5559R;
        boolean z = true;
        if (!(csc.f2440R.R.size() > 0) && !csc.c && !csc.f2442R && !csc.f2443v) {
            z = false;
        }
        l3L l3l = this.f6742R;
        if (l3l.f5563R) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            } else if (l3l.f5558R > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f6741R = UUID.randomUUID();
        l3L l3l2 = new l3L(this.f6742R);
        this.f6742R = l3l2;
        l3l2.f5562R = this.f6741R.toString();
        return v;
    }

    public abstract oJN c();

    public final void e(long j, TimeUnit timeUnit) {
        this.f6743R = true;
        l3L l3l = this.f6742R;
        l3l.v = 1;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            kfk.U().g(l3L.e, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            millis = 18000000;
        }
        if (millis < 10000) {
            kfk.U().g(l3L.e, "Backoff delay duration less than minimum value", new Throwable[0]);
            millis = 10000;
        }
        l3l.f5566e = millis;
        c();
    }

    public abstract lyz v();
}
