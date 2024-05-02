package defpackage;

import android.view.Choreographer;

/* renamed from: jNi  reason: default package */
/* loaded from: classes.dex */
public abstract class jNi {
    public static void R(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(runnable) { // from class: pg5
            public final /* synthetic */ Runnable R;

            {
                this.R = r1;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.R.run();
            }
        });
    }
}
