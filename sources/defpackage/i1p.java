package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: i1p  reason: default package */
/* loaded from: classes.dex */
public final class i1p implements iXM, jeO {
    public final CountDownLatch R = new CountDownLatch(1);

    @Override // defpackage.iXM
    public final void R(Object obj) {
        this.R.countDown();
    }

    @Override // defpackage.jeO
    public final void c(Exception exc) {
        this.R.countDown();
    }
}
