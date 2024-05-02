package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nQ3  reason: default package */
/* loaded from: classes.dex */
public final class nQ3 extends cp2 {
    public final /* synthetic */ eFe R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6386R = false;

    public nQ3(eFe efe) {
        this.R = efe;
    }

    @Override // defpackage.cp2
    public final void R(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f6386R) {
            this.f6386R = false;
            this.R.O();
        }
    }

    @Override // defpackage.cp2
    public final void v(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.f6386R = true;
        }
    }
}
