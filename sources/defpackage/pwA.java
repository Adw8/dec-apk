package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: pwA  reason: default package */
/* loaded from: classes.dex */
public final class pwA extends c2D {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ViewGroup f7319R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lsz f7320R;
    public final /* synthetic */ View v;

    public pwA(lsz lsz, ViewGroup viewGroup, View view, View view2) {
        this.f7320R = lsz;
        this.f7319R = viewGroup;
        this.R = view;
        this.v = view2;
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        this.v.setTag(R.id.save_overlay_view, null);
        h89 h89 = new h89(this.f7319R);
        ((ViewGroupOverlay) h89.R).remove(this.R);
        hft.h(this);
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void e() {
        if (this.R.getParent() == null) {
            h89 h89 = new h89(this.f7319R);
            ((ViewGroupOverlay) h89.R).add(this.R);
            return;
        }
        this.f7320R.cancel();
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void v() {
        h89 h89 = new h89(this.f7319R);
        ((ViewGroupOverlay) h89.R).remove(this.R);
    }
}
