package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: gxa  reason: default package */
/* loaded from: classes.dex */
public abstract class gxa {

    /* renamed from: R  reason: collision with other field name */
    public h9q f3999R = null;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f4000R = new ArrayList();
    public long R = 120;
    public long v = 120;
    public long c = 250;
    public long e = 250;

    public static void v(h9X h9x) {
        RecyclerView recyclerView;
        int i = h9x.X & 14;
        if (!h9x.L() && (i & 4) == 0 && (recyclerView = h9x.f4098R) != null) {
            recyclerView.A(h9x);
        }
    }

    public abstract boolean L();

    public abstract void O();

    public abstract boolean R(h9X h9x, h9X h9x2, bzl bzl, bzl bzl2);

    public abstract void X(h9X h9x);

    public final void c(h9X h9x) {
        h9q h9q = this.f3999R;
        if (h9q != null) {
            boolean z = true;
            h9x.N(true);
            if (h9x.f4101R != null && h9x.f4107v == null) {
                h9x.f4101R = null;
            }
            h9x.f4107v = null;
            if (!((h9x.X & 16) != 0)) {
                RecyclerView recyclerView = h9q.R;
                View view = h9x.f4097R;
                recyclerView.X4();
                Mk mk = recyclerView.f1378R;
                int indexOfChild = mk.R.R.indexOfChild(view);
                if (indexOfChild == -1) {
                    mk.H(view);
                } else if (mk.f296R.e(indexOfChild)) {
                    mk.f296R.O(indexOfChild);
                    mk.H(view);
                    mk.R.m(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    h9X W = RecyclerView.W(view);
                    recyclerView.f1391R.x(W);
                    recyclerView.f1391R.L(W);
                }
                recyclerView.zw(!z);
                if (!z && h9x.H()) {
                    h9q.R.removeDetachedView(h9x.f4097R, false);
                }
            }
        }
    }

    public final void e() {
        int size = this.f4000R.size();
        for (int i = 0; i < size; i++) {
            ((lkj) this.f4000R.get(i)).R();
        }
        this.f4000R.clear();
    }
}
