package androidx.work;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    public final gXD R;

    /* renamed from: R  reason: collision with other field name */
    public final peS f1444R = new peS(null);

    /* renamed from: R  reason: collision with other field name */
    public final h8R f1443R = iFn.R;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        gXD gxd = new gXD();
        this.R = gxd;
        gxd.R(new k0f(11, this), (o9L) ((ListenableWorker) this).f1445R.R.f59R);
    }

    public abstract Object L(aOO aoo);

    @Override // androidx.work.ListenableWorker
    public final gXD X() {
        h8R h8r = this.f1443R;
        peS pes = this.f1444R;
        h8r.getClass();
        l6.z(jjU.v(jjU.t(h8r, pes)), null, 0, new agR(this, null), 3);
        return this.R;
    }

    @Override // androidx.work.ListenableWorker
    public final void e() {
        this.R.cancel(false);
    }
}
