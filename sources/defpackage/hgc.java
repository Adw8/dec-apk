package defpackage;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: hgc  reason: default package */
/* loaded from: classes.dex */
public final class hgc {
    public final ThreadPoolExecutor R;

    public hgc(mlq mlq) {
        this.R = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), mlq);
    }
}
