package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dUW  reason: default package */
/* loaded from: classes.dex */
public final class dUW {
    public static final HashMap R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final aFp f2640R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f2641R;

    /* renamed from: R  reason: collision with other field name */
    public final Intent f2642R;

    /* renamed from: R  reason: collision with other field name */
    public IInterface f2643R;

    /* renamed from: R  reason: collision with other field name */
    public eG5 f2644R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2646R;

    /* renamed from: R  reason: collision with other field name */
    public final zI f2652R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2653R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2648R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f2649R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public final Object f2645R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final nue f2651R = new nue(this);

    /* renamed from: R  reason: collision with other field name */
    public final AtomicInteger f2650R = new AtomicInteger(0);

    /* renamed from: R  reason: collision with other field name */
    public final WeakReference f2647R = new WeakReference(null);

    public dUW(Context context, zI zIVar, String str, Intent intent, aFp afp) {
        this.f2641R = context;
        this.f2652R = zIVar;
        this.f2646R = str;
        this.f2642R = intent;
        this.f2640R = afp;
    }

    public final Handler R() {
        Handler handler;
        HashMap hashMap = R;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f2646R)) {
                HandlerThread handlerThread = new HandlerThread(this.f2646R, 10);
                handlerThread.start();
                hashMap.put(this.f2646R, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f2646R);
        }
        return handler;
    }

    public final void c(cqI cqi) {
        synchronized (this.f2645R) {
            this.f2649R.remove(cqi);
        }
        synchronized (this.f2645R) {
            if (this.f2650R.get() <= 0 || this.f2650R.decrementAndGet() <= 0) {
                R().post(new lrz(0, this));
                return;
            }
            this.f2652R.m("Leaving the connection open for other ongoing calls.", new Object[0]);
        }
    }

    public final void e() {
        synchronized (this.f2645R) {
            Iterator it = this.f2649R.iterator();
            while (it.hasNext()) {
                ((cqI) it.next()).R(new RemoteException(String.valueOf(this.f2646R).concat(" : Binder has died.")));
            }
            this.f2649R.clear();
        }
    }

    public final void v(cho cho, cqI cqi) {
        synchronized (this.f2645R) {
            this.f2649R.add(cqi);
            b1t b1t = cqi.R;
            h5 h5Var = new h5(this, 24, cqi);
            b1t.getClass();
            ((aAx) b1t.v).v(new kVh(nk8.R, h5Var));
            b1t.m();
        }
        synchronized (this.f2645R) {
            if (this.f2650R.getAndIncrement() > 0) {
                this.f2652R.X("Already connected to the service.", new Object[0]);
            }
        }
        R().post(new cGu(this, cho.R, cho, 1));
    }
}
