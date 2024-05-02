package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: mTl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mTl implements ThreadFactory {
    public static final /* synthetic */ mTl R = new mTl();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
