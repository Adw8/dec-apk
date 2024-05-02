package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: a06  reason: default package */
/* loaded from: classes.dex */
public final class a06 {

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ StaggeredGridLayoutManager f712R;
    public final int e;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f713R = new ArrayList();
    public int R = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int c = 0;

    public a06(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f712R = staggeredGridLayoutManager;
        this.e = i;
    }

    public static o_h Z(View view) {
        return (o_h) view.getLayoutParams();
    }

    public final View L(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.f713R.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.f713R.get(size);
                if ((this.f712R.f1429O && kds.n(view2) >= i) || ((!this.f712R.f1429O && kds.n(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = this.f713R.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.f713R.get(i3);
                if ((this.f712R.f1429O && kds.n(view3) <= i) || ((!this.f712R.f1429O && kds.n(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int O(int i) {
        int i2 = this.v;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f713R.size() == 0) {
            return i;
        }
        R();
        return this.v;
    }

    public final void R() {
        ArrayList arrayList = this.f713R;
        View view = (View) arrayList.get(arrayList.size() - 1);
        o_h Z = Z(view);
        this.v = this.f712R.f1432R.v(view);
        Z.getClass();
    }

    public final int X(int i, int i2) {
        int Z = this.f712R.f1432R.Z();
        int O = this.f712R.f1432R.O();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f713R.get(i);
            int e = this.f712R.f1432R.e(view);
            int v = this.f712R.f1432R.v(view);
            boolean z = false;
            boolean z2 = e <= O;
            if (v >= Z) {
                z = true;
            }
            if (!z2 || !z || (e >= Z && v <= O)) {
                i += i3;
            } else {
                this.f712R.getClass();
                return kds.n(view);
            }
        }
        return -1;
    }

    public final int c() {
        return this.f712R.f1429O ? X(this.f713R.size() - 1, -1) : X(0, this.f713R.size());
    }

    public final int e() {
        return this.f712R.f1429O ? X(0, this.f713R.size()) : X(this.f713R.size() - 1, -1);
    }

    public final int m(int i) {
        int i2 = this.R;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f713R.size() == 0) {
            return i;
        }
        View view = (View) this.f713R.get(0);
        o_h Z = Z(view);
        this.R = this.f712R.f1432R.e(view);
        Z.getClass();
        return this.R;
    }

    public final void v() {
        this.f713R.clear();
        this.R = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.c = 0;
    }
}
