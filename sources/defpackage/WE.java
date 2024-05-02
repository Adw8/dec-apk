package defpackage;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: WE  reason: default package */
/* loaded from: classes.dex */
public final class WE implements kH {
    public final /* synthetic */ Q8 R;

    /* renamed from: R  reason: collision with other field name */
    public kH f601R;

    public WE(Q8 q8, piu piu) {
        this.R = q8;
        this.f601R = piu;
    }

    @Override // defpackage.kH
    public final boolean R(UF uf, lRG lrg) {
        ViewGroup viewGroup = this.R.f404R;
        WeakHashMap weakHashMap = of5.f6887R;
        fv7.c(viewGroup);
        return this.f601R.R(uf, lrg);
    }

    @Override // defpackage.kH
    public final void c(UF uf) {
        this.f601R.c(uf);
        Q8 q8 = this.R;
        if (q8.f406R != null) {
            q8.f405R.getDecorView().removeCallbacks(this.R.f395R);
        }
        Q8 q82 = this.R;
        if (q82.f408R != null) {
            ozg ozg = q82.f414R;
            if (ozg != null) {
                ozg.v();
            }
            Q8 q83 = this.R;
            ozg R = of5.R(q83.f408R);
            R.R(0.0f);
            q83.f414R = R;
            this.R.f414R.e(new GA(2, this));
        }
        Lb lb = this.R.f396R;
        if (lb != null) {
            lb.v();
        }
        Q8 q84 = this.R;
        q84.f399R = null;
        ViewGroup viewGroup = q84.f404R;
        WeakHashMap weakHashMap = of5.f6887R;
        fv7.c(viewGroup);
    }

    @Override // defpackage.kH
    public final boolean e(UF uf, lRG lrg) {
        return this.f601R.e(uf, lrg);
    }

    @Override // defpackage.kH
    public final boolean v(UF uf, MenuItem menuItem) {
        return this.f601R.v(uf, menuItem);
    }
}
