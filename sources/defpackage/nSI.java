package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nSI  reason: default package */
/* loaded from: classes.dex */
public final class nSI extends LinearLayoutManager {
    public final /* synthetic */ hSy R;
    public final /* synthetic */ int x;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nSI(hSy hsy, int i, int i2) {
        super(i);
        this.R = hsy;
        this.x = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void KZ(btj btj, int[] iArr) {
        if (this.x == 0) {
            iArr[0] = this.R.f4271v.getWidth();
            iArr[1] = this.R.f4271v.getWidth();
            return;
        }
        iArr[0] = this.R.f4271v.getHeight();
        iArr[1] = this.R.f4271v.getHeight();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final void yf(RecyclerView recyclerView, int i) {
        hOJ hoj = new hOJ(this, recyclerView.getContext(), 1);
        ((nvs) hoj).f6628R = i;
        JD(hoj);
    }
}
