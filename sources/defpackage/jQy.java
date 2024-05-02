package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: jQy  reason: default package */
/* loaded from: classes.dex */
public final class jQy implements fjo, kOC, kYJ {
    public static final String R = kfk.P("GreedyScheduler");

    /* renamed from: R  reason: collision with other field name */
    public final Context f4926R;

    /* renamed from: R  reason: collision with other field name */
    public final idW f4927R;

    /* renamed from: R  reason: collision with other field name */
    public final jFe f4928R;

    /* renamed from: R  reason: collision with other field name */
    public Boolean f4929R;

    /* renamed from: R  reason: collision with other field name */
    public ome f4932R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4933R;

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f4931R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public final Object f4930R = new Object();

    public jQy(Context context, l_s l_s, CV cv, jFe jfe) {
        this.f4926R = context;
        this.f4928R = jfe;
        this.f4927R = new idW(context, cv, this);
        this.f4932R = new ome(this, l_s.f5785R);
    }

    @Override // defpackage.fjo
    public final void O(String str) {
        Runnable runnable;
        if (this.f4929R == null) {
            this.f4929R = Boolean.valueOf(j9n.R(this.f4926R, this.f4928R.f4890R));
        }
        if (!this.f4929R.booleanValue()) {
            kfk.U().C(R, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f4933R) {
            this.f4928R.f4888R.R(this);
            this.f4933R = true;
        }
        kfk.U().x(R, String.format("Cancelling work ID %s", str), new Throwable[0]);
        ome ome = this.f4932R;
        if (!(ome == null || (runnable = (Runnable) ome.f6936R.remove(str)) == null)) {
            ((Handler) ome.f6934R.R).removeCallbacks(runnable);
        }
        jFe jfe = this.f4928R;
        jfe.f4884R.X(new nTd(jfe, str, false));
    }

    @Override // defpackage.kOC
    public final void R(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            kfk.U().x(R, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f4928R.X(str, null);
        }
    }

    @Override // defpackage.fjo
    public final void X(l3L... l3lArr) {
        if (this.f4929R == null) {
            this.f4929R = Boolean.valueOf(j9n.R(this.f4926R, this.f4928R.f4890R));
        }
        if (!this.f4929R.booleanValue()) {
            kfk.U().C(R, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f4933R) {
            this.f4928R.f4888R.R(this);
            this.f4933R = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (l3L l3l : l3lArr) {
            long R2 = l3l.R();
            long currentTimeMillis = System.currentTimeMillis();
            if (l3l.f5561R == gDn.ENQUEUED) {
                if (currentTimeMillis < R2) {
                    ome ome = this.f4932R;
                    if (ome != null) {
                        Runnable runnable = (Runnable) ome.f6936R.remove(l3l.f5562R);
                        if (runnable != null) {
                            ((Handler) ome.f6934R.R).removeCallbacks(runnable);
                        }
                        bx bxVar = new bx(ome, 6, l3l);
                        ome.f6936R.put(l3l.f5562R, bxVar);
                        ((Handler) ome.f6934R.R).postDelayed(bxVar, l3l.R() - System.currentTimeMillis());
                    }
                } else if (l3l.v()) {
                    csc csc = l3l.f5559R;
                    if (csc.f2443v) {
                        kfk.U().x(R, String.format("Ignoring WorkSpec %s, Requires device idle.", l3l), new Throwable[0]);
                    } else if (csc.f2440R.R.size() > 0) {
                        kfk.U().x(R, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", l3l), new Throwable[0]);
                    } else {
                        hashSet.add(l3l);
                        hashSet2.add(l3l.f5562R);
                    }
                } else {
                    kfk.U().x(R, String.format("Starting work for %s", l3l.f5562R), new Throwable[0]);
                    this.f4928R.X(l3l.f5562R, null);
                }
            }
        }
        synchronized (this.f4930R) {
            if (!hashSet.isEmpty()) {
                kfk.U().x(R, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f4931R.addAll(hashSet);
                this.f4927R.v(this.f4931R);
            }
        }
    }

    @Override // defpackage.kOC
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            kfk.U().x(R, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            jFe jfe = this.f4928R;
            jfe.f4884R.X(new nTd(jfe, str, false));
        }
    }

    @Override // defpackage.fjo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        synchronized (this.f4930R) {
            Iterator it = this.f4931R.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l3L l3l = (l3L) it.next();
                if (l3l.f5562R.equals(str)) {
                    kfk.U().x(R, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f4931R.remove(l3l);
                    this.f4927R.v(this.f4931R);
                    break;
                }
            }
        }
    }
}
