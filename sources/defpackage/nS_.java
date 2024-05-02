package defpackage;

import android.view.MotionEvent;
import com.termux.view.TerminalView;

/* renamed from: nS_  reason: default package */
/* loaded from: classes.dex */
public final class nS_ implements Runnable {
    public Object R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6390R;
    public int e = 0;
    public final /* synthetic */ Object v;

    public nS_(lTo lto, boolean z, MotionEvent motionEvent) {
        this.v = lto;
        this.f6390R = z;
        this.R = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6390R != ((TerminalView) ((lTo) this.v).R).f2428R.N()) {
            ((TerminalView) ((lTo) this.v).R).f2424R.abortAnimation();
        } else if (!((TerminalView) ((lTo) this.v).R).f2424R.isFinished()) {
            boolean computeScrollOffset = ((TerminalView) ((lTo) this.v).R).f2424R.computeScrollOffset();
            int currY = ((TerminalView) ((lTo) this.v).R).f2424R.getCurrY();
            ((TerminalView) ((lTo) this.v).R).v((MotionEvent) this.R, currY - (this.f6390R ? this.e : ((TerminalView) ((lTo) this.v).R).e));
            this.e = currY;
            if (computeScrollOffset) {
                ((TerminalView) ((lTo) this.v).R).post(this);
            }
        }
    }
}
