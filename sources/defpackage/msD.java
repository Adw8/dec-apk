package defpackage;

import android.database.Cursor;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: msD  reason: default package */
/* loaded from: classes.dex */
public abstract class msD {

    /* renamed from: R  reason: collision with other field name */
    public fIY f6207R;

    /* renamed from: R  reason: collision with other field name */
    public volatile gEL f6208R;

    /* renamed from: R  reason: collision with other field name */
    public List f6210R;

    /* renamed from: R  reason: collision with other field name */
    public Executor f6211R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6213R;
    public boolean v;

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantReadWriteLock f6212R = new ReentrantReadWriteLock();

    /* renamed from: R  reason: collision with other field name */
    public final ThreadLocal f6209R = new ThreadLocal();
    public final bBO R = e();

    public msD() {
        new ConcurrentHashMap();
    }

    public final Cursor L(kj3 kj3) {
        R();
        v();
        return ((iUj) this.f6207R.L()).O(kj3);
    }

    public final void O() {
        ((iUj) this.f6207R.L()).c();
        if (!((iUj) this.f6207R.L()).f4620R.inTransaction()) {
            bBO bbo = this.R;
            if (bbo.f1558R.compareAndSet(false, true)) {
                bbo.f1561R.f6211R.execute(bbo.f1559R);
            }
        }
    }

    public final void R() {
        if (!this.f6213R) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public abstract fIY X(aDq adq);

    public final void Z() {
        ((iUj) this.f6207R.L()).H();
    }

    public final void c() {
        R();
        gEL L = this.f6207R.L();
        this.R.c(L);
        ((iUj) L).R();
    }

    public abstract bBO e();

    public final void v() {
        if (!((iUj) this.f6207R.L()).f4620R.inTransaction() && this.f6209R.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
}
