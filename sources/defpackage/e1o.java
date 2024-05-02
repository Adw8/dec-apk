package defpackage;

import android.util.SparseArray;

/* renamed from: e1o  reason: default package */
/* loaded from: classes.dex */
public final class e1o {
    public final SparseArray R;

    /* renamed from: R  reason: collision with other field name */
    public iYb f2939R;

    public e1o(int i) {
        this.R = new SparseArray(i);
    }

    public final void R(iYb iyb, int i, int i2) {
        int R = iyb.R(i);
        SparseArray sparseArray = this.R;
        e1o e1o = sparseArray == null ? null : (e1o) sparseArray.get(R);
        if (e1o == null) {
            e1o = new e1o(1);
            this.R.put(iyb.R(i), e1o);
        }
        if (i2 > i) {
            e1o.R(iyb, i + 1, i2);
        } else {
            e1o.f2939R = iyb;
        }
    }
}
