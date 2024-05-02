package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: hk0  reason: default package */
/* loaded from: classes.dex */
public final class hk0 implements Runnable {
    public final /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ int e;

    public /* synthetic */ hk0(int i, int i2, Object obj) {
        this.e = i2;
        this.R = obj;
        this.X = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((SystemForegroundService) this.R).f1461R.cancel(this.X);
                return;
            case 1:
                RecyclerView recyclerView = ((hSy) this.R).f4271v;
                int i = this.X;
                if (!recyclerView.f1375O) {
                    kds kds = recyclerView.f1400R;
                    if (kds == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        kds.yf(recyclerView, i);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((oN) this.R).f6787R.J(this.X, 4);
                return;
        }
    }

    public hk0(oN oNVar) {
        this.e = 2;
        this.R = oNVar;
        this.X = -1;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk0(oN oNVar, int i) {
        this(oNVar);
        this.e = 2;
    }
}
