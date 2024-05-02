package defpackage;

import android.content.Context;
import java.util.Collection;

/* renamed from: idW  reason: default package */
/* loaded from: classes.dex */
public final class idW implements gvZ {
    public static final String R = kfk.P("WorkConstraintsTracker");

    /* renamed from: R  reason: collision with other field name */
    public final Object f4674R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final kOC f4675R;

    /* renamed from: R  reason: collision with other field name */
    public final m9V[] f4676R;

    public idW(Context context, CV cv, kOC koc) {
        Context applicationContext = context.getApplicationContext();
        this.f4675R = koc;
        this.f4676R = new m9V[]{new qo(applicationContext, cv, 0), new qo(applicationContext, cv, 1), new qo(applicationContext, cv, 4), new qo(applicationContext, cv, 2), new qo(applicationContext, cv, 3), new a4r(applicationContext, cv), new g3b(applicationContext, cv)};
    }

    public final boolean R(String str) {
        synchronized (this.f4674R) {
            m9V[] m9vArr = this.f4676R;
            for (m9V m9v : m9vArr) {
                Object obj = m9v.f5951R;
                if (obj != null && m9v.v(obj) && m9v.f5952R.contains(str)) {
                    kfk.U().x(R, String.format("Work %s constrained by %s", str, m9v.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void c() {
        synchronized (this.f4674R) {
            m9V[] m9vArr = this.f4676R;
            for (m9V m9v : m9vArr) {
                if (!m9v.f5952R.isEmpty()) {
                    m9v.f5952R.clear();
                    d72 d72 = m9v.R;
                    synchronized (d72.f2493R) {
                        if (d72.f2494R.remove(m9v) && d72.f2494R.isEmpty()) {
                            d72.e();
                        }
                    }
                }
            }
        }
    }

    public final void v(Collection collection) {
        synchronized (this.f4674R) {
            m9V[] m9vArr = this.f4676R;
            for (m9V m9v : m9vArr) {
                if (m9v.f5950R != null) {
                    m9v.f5950R = null;
                    m9v.e(null, m9v.f5951R);
                }
            }
            for (m9V m9v2 : this.f4676R) {
                m9v2.c(collection);
            }
            m9V[] m9vArr2 = this.f4676R;
            for (m9V m9v3 : m9vArr2) {
                if (m9v3.f5950R != this) {
                    m9v3.f5950R = this;
                    m9v3.e(this, m9v3.f5951R);
                }
            }
        }
    }
}
