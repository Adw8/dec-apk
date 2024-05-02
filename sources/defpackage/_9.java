package defpackage;

import android.view.Choreographer;
import java.util.List;

/* renamed from: _9  reason: default package */
/* loaded from: classes.dex */
public final class _9 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ hk R;

    public _9(hk hkVar) {
        this.R = hkVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.R.f4361R.removeCallbacks(this);
        hk.vl(this.R);
        hk hkVar = this.R;
        synchronized (hkVar.f4365R) {
            if (hkVar.f4368v) {
                hkVar.f4368v = false;
                List list = hkVar.f4366R;
                hkVar.f4366R = hkVar.v;
                hkVar.v = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        hk.vl(this.R);
        hk hkVar = this.R;
        synchronized (hkVar.f4365R) {
            if (hkVar.f4366R.isEmpty()) {
                hkVar.f4362R.removeFrameCallback(this);
                hkVar.f4368v = false;
            }
        }
    }
}
