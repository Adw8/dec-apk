package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: gE  reason: default package */
/* loaded from: classes.dex */
public abstract class gE extends Ms {
    public lqV R;
    public final int x = 0;

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f3694R = new pr9(g8d.R(bB5.class), new mT(0, this), new mT(1, this), new pL(this, 0));

    public View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.x;
        if (i == 0) {
            return null;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    @Override // defpackage.Ms, defpackage.pm2
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_fragment, viewGroup, false);
        int i = R.id.app_bar_layout;
        if (((AppBarLayout) iTI.O(inflate, R.id.app_bar_layout)) != null) {
            i = R.id.collapsing_toolbar;
            if (((CollapsingToolbarLayout) iTI.O(inflate, R.id.collapsing_toolbar)) != null) {
                i = R.id.content_frame;
                FrameLayout frameLayout = (FrameLayout) iTI.O(inflate, R.id.content_frame);
                if (frameLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                    MaterialToolbar materialToolbar = (MaterialToolbar) iTI.O(inflate, R.id.toolbar);
                    if (materialToolbar != null) {
                        this.R = new lqV(coordinatorLayout, frameLayout, materialToolbar);
                        this.R.R.addView(E(layoutInflater, frameLayout));
                        return this.R.f5844R;
                    }
                    i = R.id.toolbar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.Ms
    public final void M() {
    }

    @Override // defpackage.pm2
    public void W(View view, Bundle bundle) {
        lqV lqv = this.R;
        mpr Z = iTI.Z(this);
        e9E O = Z.O();
        lqv.f5845R.setTitle(O.f2985R);
        int i = ((e9E) iTI.Z(this).Z()).e;
        int i2 = O.e;
        if (i == R.id.nav_graph_main && (i2 == R.id.overview || i2 == R.id.settings_root)) {
            lqv.f5845R.setNavigationIcon((Drawable) null);
        }
        lqv.f5845R.setNavigationOnClickListener(new D8(3, Z));
        mxC.y(((bB5) this.f3694R.getValue()).R, gQc.Q(this), new hki(2, this));
    }

    @Override // defpackage.pm2
    public void h() {
        this.U = true;
        this.R = null;
    }
}
