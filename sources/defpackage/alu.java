package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: alu  reason: default package */
/* loaded from: classes.dex */
public final class alu {
    public final hAW R;

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f1001R = new CopyOnWriteArrayList();

    public alu(hAW haw) {
        this.R = haw;
    }

    public final void C(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.C(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "view created");
            }
        }
    }

    public final void H(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.H(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "started");
            }
        }
    }

    public final void L(boolean z) {
        hAW haw = this.R;
        Context context = haw.f4113R.f3004R;
        pm2 pm2 = haw.f4128R;
        if (pm2 != null) {
            pm2.C().f4111R.L(true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                kpe.R.getClass();
            }
        }
    }

    public final void N(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.N(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "view destroyed");
            }
        }
    }

    public final void O(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.O(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "paused");
            }
        }
    }

    public final void R(boolean z) {
        pm2 pm2 = this.R.f4128R;
        if (pm2 != null) {
            pm2.C().f4111R.R(true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                kpe.R.getClass();
            }
        }
    }

    public final void U(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.U(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "stopped");
            }
        }
    }

    public final void X(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.X(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "detached");
            }
        }
    }

    public final void Z(boolean z) {
        pm2 pm2 = this.R.f4128R;
        if (pm2 != null) {
            pm2.C().f4111R.Z(true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                kpe.R.getClass();
            }
        }
    }

    public final void c(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.c(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                e9r e9r = (e9r) kpe.R;
                e9r.Q(pm2, "created");
                if (pm2.j()) {
                    if ((e9r.R.Z().isTracingEnabled() && e9r.v) && !e9r.f2995R.containsKey(pm2)) {
                        nWW nww = new nWW();
                        e9r.R.m(new nxC(9, nww));
                        String simpleName = pm2.getClass().getSimpleName();
                        dWn dwn = (dWn) nww.R;
                        dWn c = dwn == null ? null : dwn.c(simpleName);
                        if (c != null) {
                            e9r.f2995R.put(pm2, c);
                        }
                    }
                }
            }
        }
    }

    public final void e(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.e(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                e9r e9r = (e9r) kpe.R;
                e9r.Q(pm2, "destroyed");
                e9r.A(pm2);
            }
        }
    }

    public final void m(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.m(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                e9r e9r = (e9r) kpe.R;
                e9r.Q(pm2, "resumed");
                e9r.A(pm2);
            }
        }
    }

    public final void v(pm2 pm2, boolean z) {
        hAW haw = this.R;
        Context context = haw.f4113R.f3004R;
        pm2 pm22 = haw.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.v(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "attached");
            }
        }
    }

    public final void x(pm2 pm2, boolean z) {
        pm2 pm22 = this.R.f4128R;
        if (pm22 != null) {
            pm22.C().f4111R.x(pm2, true);
        }
        Iterator it = this.f1001R.iterator();
        while (it.hasNext()) {
            kPe kpe = (kPe) it.next();
            if (!z || kpe.f5286R) {
                ((e9r) kpe.R).Q(pm2, "save instance state");
            }
        }
    }
}
