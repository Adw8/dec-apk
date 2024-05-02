package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;

/* renamed from: ML  reason: default package */
/* loaded from: classes.dex */
public abstract class ML implements Runnable {
    public final h5 R = new h5(17);

    public static void R(jFe jfe, String str) {
        boolean z;
        WorkDatabase workDatabase = jfe.f4887R;
        ptn N = workDatabase.N();
        ndl m = workDatabase.m();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            gDn L = N.L(str2);
            if (!(L == gDn.SUCCEEDED || L == gDn.FAILED)) {
                N.g(gDn.CANCELLED, str2);
            }
            linkedList.addAll(m.R(str2));
        }
        gH5 gh5 = jfe.f4888R;
        synchronized (gh5.f3708R) {
            kfk.U().x(gH5.R, String.format("Processor cancelling %s", str), new Throwable[0]);
            gh5.f3711R.add(str);
            iwe iwe = (iwe) gh5.f3710R.remove(str);
            if (iwe != null) {
                z = true;
            }
            if (iwe == null) {
                iwe = (iwe) gh5.v.remove(str);
            }
            gH5.c(str, iwe);
            if (z) {
                gh5.O();
            }
        }
        for (fjo fjo : jfe.f4889R) {
            fjo.O(str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            v();
            this.R.J(aSp.f892R);
        } catch (Throwable th) {
            this.R.J(new c61(th));
        }
    }

    public abstract void v();
}
