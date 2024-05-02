package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: gdy  reason: default package */
/* loaded from: classes.dex */
public final class gdy implements lpP {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ArrayList f3831R;

    public gdy(View view, ArrayList arrayList) {
        this.R = view;
        this.f3831R = arrayList;
    }

    @Override // defpackage.lpP
    public final void R() {
    }

    @Override // defpackage.lpP
    public final void X(hFt hft) {
        hft.h(this);
        hft.v(this);
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        hft.h(this);
        this.R.setVisibility(8);
        int size = this.f3831R.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f3831R.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.lpP
    public final void e() {
    }

    @Override // defpackage.lpP
    public final void v() {
    }
}
