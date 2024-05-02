package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ctQ  reason: default package */
/* loaded from: classes.dex */
public final class ctQ extends Enum implements Executor {
    public static final ctQ R;

    /* renamed from: R  reason: collision with other field name */
    public static final /* synthetic */ ctQ[] f2446R;

    static {
        ctQ ctq = new ctQ();
        R = ctq;
        f2446R = new ctQ[]{ctq};
    }

    public static ctQ valueOf(String str) {
        return (ctQ) Enum.valueOf(ctQ.class, str);
    }

    public static ctQ[] values() {
        return (ctQ[]) f2446R.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return "DirectExecutor";
    }
}
