package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements kOC {
    public static final String R = kfk.P("ConstraintTrkngWrkr");

    /* renamed from: R  reason: collision with other field name */
    public ListenableWorker f1465R;
    public WorkerParameters v;

    /* renamed from: R  reason: collision with other field name */
    public final Object f1467R = new Object();
    public volatile boolean c = false;

    /* renamed from: R  reason: collision with other field name */
    public gXD f1466R = new gXD();

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.v = workerParameters;
    }

    @Override // defpackage.kOC
    public final void R(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final gXD X() {
        ((ListenableWorker) this).f1445R.f1451R.execute(new k0f(13, this));
        return this.f1466R;
    }

    @Override // defpackage.kOC
    public final void c(ArrayList arrayList) {
        kfk.U().x(R, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f1467R) {
            this.c = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final void e() {
        ListenableWorker listenableWorker = this.f1465R;
        if (listenableWorker != null && !listenableWorker.f1446R) {
            this.f1465R.O();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean v() {
        ListenableWorker listenableWorker = this.f1465R;
        return listenableWorker != null && listenableWorker.v();
    }
}
