package defpackage;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: MX  reason: default package */
/* loaded from: classes.dex */
public final class MX implements View.OnClickListener {
    public final Object R;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object v;

    public MX(ActionBarContextView actionBarContextView, UF uf) {
        this.v = actionBarContextView;
        this.R = uf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.e) {
            case 0:
                ((UF) this.R).v();
                return;
            default:
                muY muy = (muY) this.v;
                Window.Callback callback = muy.f6228R;
                if (callback != null && muy.f6235v) {
                    callback.onMenuItemSelected(0, (Em) this.R);
                    return;
                }
                return;
        }
    }

    public MX(muY muy) {
        this.v = muy;
        this.R = new Em(muy.f6229R.getContext(), muy.f6230R);
    }
}
