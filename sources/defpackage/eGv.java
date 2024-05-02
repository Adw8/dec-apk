package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: eGv  reason: default package */
/* loaded from: classes.dex */
public final class eGv implements ThreadFactory {
    public static final eGv R = new eGv();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "kronos-android");
    }
}
