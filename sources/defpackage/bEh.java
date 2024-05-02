package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: bEh  reason: default package */
/* loaded from: classes.dex */
public final class bEh extends cUF {
    public final /* synthetic */ cUF R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ThreadPoolExecutor f1581R;

    public bEh(cUF cuf, ThreadPoolExecutor threadPoolExecutor) {
        this.R = cuf;
        this.f1581R = threadPoolExecutor;
    }

    @Override // defpackage.cUF
    public final void H(Throwable th) {
        try {
            this.R.H(th);
        } finally {
            this.f1581R.shutdown();
        }
    }

    @Override // defpackage.cUF
    public final void U(piu piu) {
        try {
            this.R.U(piu);
        } finally {
            this.f1581R.shutdown();
        }
    }
}
