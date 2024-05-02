package defpackage;

import androidx.appcompat.widget.SearchView;

/* renamed from: ljY  reason: default package */
/* loaded from: classes.dex */
public final class ljY implements Runnable {
    public final /* synthetic */ SearchView R;
    public final /* synthetic */ int e;

    public /* synthetic */ ljY(SearchView searchView, int i) {
        this.e = i;
        this.R = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.R.y();
                return;
            default:
                eQg eqg = this.R.f1106R;
                if (eqg instanceof lmc) {
                    eqg.v(null);
                    return;
                }
                return;
        }
    }
}
