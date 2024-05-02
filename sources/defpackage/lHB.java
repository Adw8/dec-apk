package defpackage;

import android.database.DataSetObserver;

/* renamed from: lHB  reason: default package */
/* loaded from: classes.dex */
public final class lHB extends DataSetObserver {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5644R;

    public /* synthetic */ lHB(int i, Object obj) {
        this.R = i;
        this.f5644R = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.R) {
            case 0:
                if (((olv) this.f5644R).v()) {
                    ((olv) this.f5644R).Z();
                    return;
                }
                return;
            default:
                eQg eqg = (eQg) this.f5644R;
                eqg.f3084R = true;
                eqg.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.R) {
            case 0:
                ((olv) this.f5644R).dismiss();
                return;
            default:
                eQg eqg = (eQg) this.f5644R;
                eqg.f3084R = false;
                eqg.notifyDataSetInvalidated();
                return;
        }
    }
}
