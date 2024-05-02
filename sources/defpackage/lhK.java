package defpackage;

import java.util.ArrayList;

/* renamed from: lhK  reason: default package */
/* loaded from: classes.dex */
public final class lhK implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object v;

    public /* synthetic */ lhK(Object obj, int i, Object obj2) {
        this.e = i;
        this.v = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ojP.R((ArrayList) this.R, 4);
                return;
            default:
                ((owe) this.R).c();
                return;
        }
    }
}
