package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ftS  reason: default package */
/* loaded from: classes.dex */
public abstract class ftS extends knf {
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public hJL f3575R;

    public ftS() {
    }

    @Override // defpackage.knf
    public boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
        i(coordinatorLayout, view, i);
        if (this.f3575R == null) {
            this.f3575R = new hJL(view);
        }
        hJL hjl = this.f3575R;
        hjl.R = hjl.f4207R.getTop();
        hjl.v = hjl.f4207R.getLeft();
        this.f3575R.R();
        int i2 = this.R;
        if (i2 == 0) {
            return true;
        }
        this.f3575R.v(i2);
        this.R = 0;
        return true;
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.g(view, i);
    }

    public final int t() {
        hJL hjl = this.f3575R;
        if (hjl != null) {
            return hjl.c;
        }
        return 0;
    }

    public ftS(int i) {
        super(0);
    }
}
