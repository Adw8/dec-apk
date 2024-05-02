package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hYl  reason: default package */
/* loaded from: classes.dex */
public final class hYl {

    /* renamed from: R  reason: collision with other field name */
    public Interpolator f4297R;

    /* renamed from: R  reason: collision with other field name */
    public eIH f4298R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4301R;
    public long R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final fGk f4299R = new fGk(this);

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4300R = new ArrayList();

    public final void R() {
        if (this.f4301R) {
            Iterator it = this.f4300R.iterator();
            while (it.hasNext()) {
                ((ozg) it.next()).v();
            }
            this.f4301R = false;
        }
    }

    public final void v() {
        View view;
        if (!this.f4301R) {
            Iterator it = this.f4300R.iterator();
            while (it.hasNext()) {
                ozg ozg = (ozg) it.next();
                long j = this.R;
                if (j >= 0) {
                    ozg.c(j);
                }
                Interpolator interpolator = this.f4297R;
                if (!(interpolator == null || (view = (View) ozg.R.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f4298R != null) {
                    ozg.e(this.f4299R);
                }
                View view2 = (View) ozg.R.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f4301R = true;
        }
    }
}
