package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oP1  reason: default package */
/* loaded from: classes.dex */
public final class oP1 implements Runnable {
    public final /* synthetic */ bbj R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ArrayList f6817R;
    public final /* synthetic */ int e;

    public /* synthetic */ oP1(bbj bbj, ArrayList arrayList, int i) {
        this.e = i;
        this.R = bbj;
        this.f6817R = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Iterator it = this.f6817R.iterator();
                while (it.hasNext()) {
                    aD0 ad0 = (aD0) it.next();
                    bbj bbj = this.R;
                    h9X h9x = ad0.f792R;
                    int i = ad0.R;
                    int i2 = ad0.v;
                    int i3 = ad0.c;
                    int i4 = ad0.e;
                    bbj.getClass();
                    View view = h9x.f4097R;
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    bbj.x.add(h9x);
                    animate.setDuration(((gxa) bbj).c).setListener(new g5l(bbj, h9x, i5, view, i6, animate)).start();
                }
                this.f6817R.clear();
                this.R.L.remove(this.f6817R);
                return;
            case 1:
                Iterator it2 = this.f6817R.iterator();
                while (it2.hasNext()) {
                    lh7 lh7 = (lh7) it2.next();
                    bbj bbj2 = this.R;
                    bbj2.getClass();
                    h9X h9x2 = lh7.f5801R;
                    View view2 = h9x2 == null ? null : h9x2.f4097R;
                    h9X h9x3 = lh7.f5802v;
                    View view3 = h9x3 != null ? h9x3.f4097R : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(((gxa) bbj2).e);
                        bbj2.U.add(lh7.f5801R);
                        duration.translationX((float) (lh7.c - lh7.R));
                        duration.translationY((float) (lh7.e - lh7.v));
                        duration.alpha(0.0f).setListener(new gqM(bbj2, lh7, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        bbj2.U.add(lh7.f5802v);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(((gxa) bbj2).e).alpha(1.0f).setListener(new gqM(bbj2, lh7, animate2, view3, 1)).start();
                    }
                }
                this.f6817R.clear();
                this.R.Z.remove(this.f6817R);
                return;
            default:
                Iterator it3 = this.f6817R.iterator();
                while (it3.hasNext()) {
                    h9X h9x4 = (h9X) it3.next();
                    bbj bbj3 = this.R;
                    bbj3.getClass();
                    View view4 = h9x4.f4097R;
                    ViewPropertyAnimator animate3 = view4.animate();
                    bbj3.m.add(h9x4);
                    animate3.alpha(1.0f).setDuration(((gxa) bbj3).R).setListener(new i0l(bbj3, h9x4, view4, animate3)).start();
                }
                this.f6817R.clear();
                this.R.O.remove(this.f6817R);
                return;
        }
    }
}
