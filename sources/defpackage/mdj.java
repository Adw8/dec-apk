package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: mdj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mdj implements ThreadFactory {
    public static final /* synthetic */ mdj R = new mdj();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
