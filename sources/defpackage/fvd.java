package defpackage;

import androidx.activity.result.d;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fvd  reason: default package */
/* loaded from: classes.dex */
public final class fvd extends hts {
    public final /* synthetic */ Sw R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ azg f3620R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ AtomicReference f3621R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mjG f3622R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pm2 f3623R;

    public fvd(pm2 pm2, Zz zz, AtomicReference atomicReference, Dk dk, nxC nxc) {
        this.f3623R = pm2;
        this.f3620R = zz;
        this.f3621R = atomicReference;
        this.f3622R = dk;
        this.R = nxc;
    }

    @Override // defpackage.hts
    public final void R() {
        pm2 pm2 = this.f3623R;
        pm2.getClass();
        this.f3621R.set(((d) this.f3620R.c()).c("fragment_" + pm2.f7238R + "_rq#" + pm2.f7240R.getAndIncrement(), this.f3623R, this.f3622R, this.R));
    }
}
