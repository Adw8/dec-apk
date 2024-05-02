package defpackage;

import android.view.Choreographer;

/* renamed from: Ya  reason: default package */
/* loaded from: classes.dex */
public final class Ya implements Choreographer.FrameCallback {
    public final /* synthetic */ k0 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f635R;

    public Ya(xx xxVar, el elVar, kg9 kg9) {
        this.R = xxVar;
        this.f635R = kg9;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object obj;
        k0 k0Var = this.R;
        try {
            obj = this.f635R.x(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new bvw(th);
        }
        ((xx) k0Var).Y(obj);
    }
}
