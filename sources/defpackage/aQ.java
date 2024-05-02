package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: aQ  reason: default package */
/* loaded from: classes.dex */
public abstract class aQ extends gE {
    public ntZ R;

    @Override // defpackage.gE
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.content_settings, viewGroup, false);
        int i = R.id.compose_view;
        ComposeView composeView = (ComposeView) iTI.O(inflate, R.id.compose_view);
        if (composeView != null) {
            i = R.id.preferences_view;
            RecyclerView recyclerView = (RecyclerView) iTI.O(inflate, R.id.preferences_view);
            if (recyclerView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                this.R = new ntZ(frameLayout, composeView, recyclerView, 0);
                switch (z) {
                    case false:
                    default:
                        return frameLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.gE, defpackage.pm2
    public final void h() {
        super.h();
        ((RecyclerView) this.R.f6624R).setAdapter(null);
        this.R = null;
    }
}
