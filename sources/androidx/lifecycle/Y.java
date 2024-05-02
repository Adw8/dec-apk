package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public class Y {
    public static final Object e = new Object();

    /* renamed from: R  reason: collision with other field name */
    public boolean f1338R;
    public volatile Object c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1339c;

    /* renamed from: v  reason: collision with other field name */
    public volatile Object f1340v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1341v;

    /* renamed from: R  reason: collision with other field name */
    public final Object f1336R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public cWy f1335R = new cWy();
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final k0f f1337R = new k0f(7, this);
    public int v = -1;

    public Y() {
        Object obj = e;
        this.c = obj;
        this.f1340v = obj;
    }

    public static void R(String str) {
        CW.S().f61R.getClass();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(jQ.C("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void X(Object obj) {
        R("setValue");
        this.v++;
        this.f1340v = obj;
        c(null);
    }

    public final void c(obI obi) {
        if (this.f1341v) {
            this.f1339c = true;
            return;
        }
        this.f1341v = true;
        do {
            this.f1339c = false;
            if (obi == null) {
                cWy cwy = this.f1335R;
                cwy.getClass();
                aCg acg = new aCg(cwy);
                cwy.R.put(acg, Boolean.FALSE);
                while (acg.hasNext()) {
                    v((obI) ((Map.Entry) acg.next()).getValue());
                    if (this.f1339c) {
                        break;
                    }
                }
            } else {
                v(obi);
                obi = null;
            }
        } while (this.f1339c);
        this.f1341v = false;
    }

    public final void e(aXc axc) {
        Object obj;
        R("observeForever");
        m56 m56 = new m56(this, axc);
        cWy cwy = this.f1335R;
        lVU R = cwy.R(axc);
        if (R != null) {
            obj = R.v;
        } else {
            lVU lvu = new lVU(axc, m56);
            cwy.e++;
            lVU lvu2 = cwy.v;
            if (lvu2 == null) {
                cwy.f2123R = lvu;
                cwy.v = lvu;
            } else {
                lvu2.f5763R = lvu;
                lvu.f5764v = lvu2;
                cwy.v = lvu;
            }
            obj = null;
        }
        obI obi = (obI) obj;
        if (obi instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (obi == null) {
            m56.R(true);
        }
    }

    public final void v(obI obi) {
        if (obi.f6853R) {
            if (!obi.c()) {
                obi.R(false);
                return;
            }
            int i = obi.e;
            int i2 = this.v;
            if (i < i2) {
                obi.e = i2;
                obi.R.v(this.f1340v);
            }
        }
    }
}
