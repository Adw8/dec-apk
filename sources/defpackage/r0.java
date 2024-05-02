package defpackage;

import java.util.concurrent.Executor;

/* renamed from: r0  reason: default package */
/* loaded from: classes.dex */
public final class r0 implements Executor {
    public final /* synthetic */ int e;

    public /* synthetic */ r0(int i) {
        this.e = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 1:
                CW.S().f61R.f1809R.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
