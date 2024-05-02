package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;

/* renamed from: hLU  reason: default package */
/* loaded from: classes.dex */
public final class hLU implements lF5 {
    public final /* synthetic */ Toolbar R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f4213R;

    /* renamed from: R  reason: collision with other field name */
    public pce f4214R;

    public hLU(Toolbar toolbar) {
        this.R = toolbar;
    }

    @Override // defpackage.lF5
    public final boolean H(go1 go1) {
        return false;
    }

    @Override // defpackage.lF5
    public final void O(Context context, lRG lrg) {
        pce pce;
        lRG lrg2 = this.f4213R;
        if (!(lrg2 == null || (pce = this.f4214R) == null)) {
            lrg2.e(pce);
        }
        this.f4213R = lrg;
    }

    @Override // defpackage.lF5
    public final void R(lRG lrg, boolean z) {
    }

    @Override // defpackage.lF5
    public final boolean X(pce pce) {
        View view = this.R.f1162R;
        if (view instanceof _z) {
            ((_z) view).onActionViewCollapsed();
        }
        Toolbar toolbar = this.R;
        toolbar.removeView(toolbar.f1162R);
        Toolbar toolbar2 = this.R;
        toolbar2.removeView(toolbar2.f1178v);
        Toolbar toolbar3 = this.R;
        toolbar3.f1162R = null;
        int size = toolbar3.f1180v.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.f1180v.get(size));
            } else {
                toolbar3.f1180v.clear();
                this.f4214R = null;
                this.R.requestLayout();
                pce.f7122e = false;
                pce.f7117R.j(false);
                return true;
            }
        }
    }

    @Override // defpackage.lF5
    public final boolean c() {
        return false;
    }

    @Override // defpackage.lF5
    public final void m() {
        if (this.f4214R != null) {
            lRG lrg = this.f4213R;
            boolean z = false;
            if (lrg != null) {
                int size = lrg.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f4213R.getItem(i) == this.f4214R) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z) {
                X(this.f4214R);
            }
        }
    }

    @Override // defpackage.lF5
    public final boolean x(pce pce) {
        this.R.c();
        ViewParent parent = this.R.f1178v.getParent();
        Toolbar toolbar = this.R;
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1178v);
            }
            Toolbar toolbar2 = this.R;
            toolbar2.addView(toolbar2.f1178v);
        }
        this.R.f1162R = pce.getActionView();
        this.f4214R = pce;
        ViewParent parent2 = this.R.f1162R.getParent();
        Toolbar toolbar3 = this.R;
        if (parent2 != toolbar3) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar3.f1162R);
            }
            this.R.getClass();
            fCm fcm = new fCm();
            Toolbar toolbar4 = this.R;
            fcm.R = 8388611 | (toolbar4.L & 112);
            fcm.v = 2;
            toolbar4.f1162R.setLayoutParams(fcm);
            Toolbar toolbar5 = this.R;
            toolbar5.addView(toolbar5.f1162R);
        }
        Toolbar toolbar6 = this.R;
        int childCount = toolbar6.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar6.getChildAt(childCount);
            if (!(((fCm) childAt.getLayoutParams()).v == 2 || childAt == toolbar6.f1163R)) {
                toolbar6.removeViewAt(childCount);
                toolbar6.f1180v.add(childAt);
            }
        }
        this.R.requestLayout();
        pce.f7122e = true;
        pce.f7117R.j(false);
        View view = this.R.f1162R;
        if (view instanceof _z) {
            ((_z) view).onActionViewExpanded();
        }
        return true;
    }
}
