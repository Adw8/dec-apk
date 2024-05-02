package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: iwe  reason: default package */
/* loaded from: classes.dex */
public final class iwe implements Runnable {
    public static final String c = kfk.P("WorkerWrapper");
    public CV R;

    /* renamed from: R  reason: collision with other field name */
    public Context f4761R;

    /* renamed from: R  reason: collision with other field name */
    public ListenableWorker f4762R;

    /* renamed from: R  reason: collision with other field name */
    public WorkDatabase f4763R;

    /* renamed from: R  reason: collision with other field name */
    public cpn f4764R;

    /* renamed from: R  reason: collision with other field name */
    public String f4767R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f4768R;

    /* renamed from: R  reason: collision with other field name */
    public List f4769R;

    /* renamed from: R  reason: collision with other field name */
    public l3L f4770R;

    /* renamed from: R  reason: collision with other field name */
    public l_s f4771R;

    /* renamed from: R  reason: collision with other field name */
    public ndl f4773R;

    /* renamed from: R  reason: collision with other field name */
    public ptn f4774R;

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f4775R;
    public String v;

    /* renamed from: v  reason: collision with other field name */
    public ndl f4776v;

    /* renamed from: R  reason: collision with other field name */
    public g9z f4765R = new fgz();

    /* renamed from: R  reason: collision with other field name */
    public gXD f4766R = new gXD();

    /* renamed from: R  reason: collision with other field name */
    public nA8 f4772R = null;

    public iwe(jal jal) {
        this.f4761R = (Context) jal.f4975R;
        this.R = (CV) jal.c;
        this.f4764R = (cpn) jal.v;
        this.f4767R = (String) jal.O;
        this.f4769R = (List) jal.L;
        CV cv = jal.f4973R;
        this.f4762R = (ListenableWorker) jal.f4974R;
        this.f4771R = (l_s) jal.e;
        WorkDatabase workDatabase = (WorkDatabase) jal.X;
        this.f4763R = workDatabase;
        this.f4774R = workDatabase.N();
        this.f4773R = this.f4763R.m();
        this.f4776v = this.f4763R.P();
    }

    public final void L() {
        gDn L = this.f4774R.L(this.f4767R);
        if (L == gDn.RUNNING) {
            kfk.U().x(c, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f4767R), new Throwable[0]);
            O(true);
            return;
        }
        kfk.U().x(c, String.format("Status for %s is %s; not doing any work", this.f4767R, L), new Throwable[0]);
        O(false);
    }

    /* JADX INFO: finally extract failed */
    public final void O(boolean z) {
        ListenableWorker listenableWorker;
        this.f4763R.c();
        try {
            if (!this.f4763R.N().H()) {
                aGH.R(this.f4761R, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f4774R.g(gDn.ENQUEUED, this.f4767R);
                this.f4774R.C(this.f4767R, -1);
            }
            if (!(this.f4770R == null || (listenableWorker = this.f4762R) == null || !listenableWorker.v())) {
                cpn cpn = this.f4764R;
                String str = this.f4767R;
                gH5 gh5 = (gH5) cpn;
                synchronized (gh5.f3708R) {
                    gh5.f3710R.remove(str);
                    gh5.O();
                }
            }
            this.f4763R.Z();
            this.f4763R.O();
            this.f4766R.m(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f4763R.O();
            throw th;
        }
    }

    public final void R(g9z g9z) {
        if (g9z instanceof n6o) {
            kfk.U().C(c, String.format("Worker result SUCCESS for %s", this.v), new Throwable[0]);
            if (this.f4770R.c()) {
                X();
                return;
            }
            this.f4763R.c();
            try {
                this.f4774R.g(gDn.SUCCEEDED, this.f4767R);
                this.f4774R.P(this.f4767R, ((n6o) this.f4765R).R);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = this.f4773R.R(this.f4767R).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (this.f4774R.L(str) == gDn.BLOCKED && this.f4773R.e(str)) {
                        kfk.U().C(c, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                        this.f4774R.g(gDn.ENQUEUED, str);
                        this.f4774R.j(str, currentTimeMillis);
                    }
                }
                this.f4763R.Z();
            } finally {
                this.f4763R.O();
                O(false);
            }
        } else if (g9z instanceof oBL) {
            kfk.U().C(c, String.format("Worker result RETRY for %s", this.v), new Throwable[0]);
            e();
        } else {
            kfk.U().C(c, String.format("Worker result FAILURE for %s", this.v), new Throwable[0]);
            if (this.f4770R.c()) {
                X();
            } else {
                Z();
            }
        }
    }

    public final void X() {
        this.f4763R.c();
        try {
            this.f4774R.j(this.f4767R, System.currentTimeMillis());
            this.f4774R.g(gDn.ENQUEUED, this.f4767R);
            this.f4774R.N(this.f4767R);
            this.f4774R.C(this.f4767R, -1);
            this.f4763R.Z();
        } finally {
            this.f4763R.O();
            O(false);
        }
    }

    public final void Z() {
        this.f4763R.c();
        try {
            v(this.f4767R);
            this.f4774R.P(this.f4767R, ((fgz) this.f4765R).R);
            this.f4763R.Z();
        } finally {
            this.f4763R.O();
            O(false);
        }
    }

    public final void c() {
        if (!m()) {
            this.f4763R.c();
            try {
                gDn L = this.f4774R.L(this.f4767R);
                this.f4763R.C().Z(this.f4767R);
                if (L == null) {
                    O(false);
                } else if (L == gDn.RUNNING) {
                    R(this.f4765R);
                } else if (!L.R()) {
                    e();
                }
                this.f4763R.Z();
            } finally {
                this.f4763R.O();
            }
        }
        List<fjo> list = this.f4769R;
        if (list != null) {
            for (fjo fjo : list) {
                fjo.O(this.f4767R);
            }
            hak.R(this.f4771R, this.f4763R, this.f4769R);
        }
    }

    public final void e() {
        this.f4763R.c();
        try {
            this.f4774R.g(gDn.ENQUEUED, this.f4767R);
            this.f4774R.j(this.f4767R, System.currentTimeMillis());
            this.f4774R.C(this.f4767R, -1);
            this.f4763R.Z();
        } finally {
            this.f4763R.O();
            O(true);
        }
    }

    public final boolean m() {
        if (!this.f4775R) {
            return false;
        }
        kfk.U().x(c, String.format("Work interrupted for %s", this.v), new Throwable[0]);
        gDn L = this.f4774R.L(this.f4767R);
        if (L == null) {
            O(false);
        } else {
            O(!L.R());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        if ((r1.f5561R == r0 && r1.R > 0) != false) goto L_0x00bd;
     */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 726
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwe.run():void");
    }

    public final void v(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4774R.L(str2) != gDn.CANCELLED) {
                this.f4774R.g(gDn.FAILED, str2);
            }
            linkedList.addAll(this.f4773R.R(str2));
        }
    }
}
