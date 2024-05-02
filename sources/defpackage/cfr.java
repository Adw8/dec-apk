package defpackage;

import android.view.Choreographer;

/* renamed from: cfr  reason: default package */
/* loaded from: classes.dex */
public final class cfr implements Choreographer.FrameCallback {
    public final /* synthetic */ k0 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f2174R;

    public cfr(xx xxVar, kg9 kg9) {
        this.R = xxVar;
        this.f2174R = kg9;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object obj;
        k0 k0Var = this.R;
        jlG jlg = jlG.f5013R;
        try {
            obj = this.f2174R.x(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new bvw(th);
        }
        ((xx) k0Var).Y(obj);
    }
}
