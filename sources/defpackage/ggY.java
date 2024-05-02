package defpackage;

import java.util.ArrayList;

/* renamed from: ggY  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ggY implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ ggY(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                L2 l2 = lPe.Z;
                m3m m3m = aOn.R;
                ((ab) this.R).v(l2, mzR.R);
                return;
            case 1:
                ((ab) this.R).R(lPe.Z, new ArrayList());
                return;
            default:
                oZ5 oz5 = (oZ5) this.R;
                oz5.R.R = 0;
                oz5.R.f2043R = null;
                oz5.R(lPe.Z);
                return;
        }
    }
}
