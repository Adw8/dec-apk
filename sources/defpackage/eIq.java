package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: eIq  reason: default package */
/* loaded from: classes.dex */
public final class eIq {
    public int O;
    public int R;
    public int X;
    public int c;
    public int e;
    public int m;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3047v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3046R = true;
    public int L = 0;
    public int Z = 0;

    /* renamed from: R  reason: collision with other field name */
    public List f3045R = null;

    public final void R(View view) {
        int R;
        int size = this.f3045R.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((h9X) this.f3045R.get(i2)).f4097R;
            l88 l88 = (l88) view3.getLayoutParams();
            if (view3 != view && !l88.c() && (R = (l88.R() - this.c) * this.e) >= 0 && R < i) {
                view2 = view3;
                if (R == 0) {
                    break;
                }
                i = R;
            }
        }
        if (view2 == null) {
            this.c = -1;
        } else {
            this.c = ((l88) view2.getLayoutParams()).R();
        }
    }

    public final View v(fgh fgh) {
        List list = this.f3045R;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((h9X) this.f3045R.get(i)).f4097R;
                l88 l88 = (l88) view.getLayoutParams();
                if (!l88.c() && this.c == l88.R()) {
                    R(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = fgh.m(this.c, Long.MAX_VALUE).f4097R;
        this.c += this.e;
        return view2;
    }
}
