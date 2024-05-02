package defpackage;

import java.util.concurrent.Executor;

/* renamed from: i2_  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i2_ implements Executor {
    public final /* synthetic */ int e;

    public /* synthetic */ i2_(int i) {
        this.e = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
