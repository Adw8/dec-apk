package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h9q  reason: default package */
/* loaded from: classes.dex */
public final class h9q {
    public final /* synthetic */ RecyclerView R;

    public /* synthetic */ h9q(RecyclerView recyclerView) {
        this.R = recyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(defpackage.h9X r8, defpackage.bzl r9, defpackage.bzl r10) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r7 = r7.R
            r7.getClass()
            r0 = 0
            r8.N(r0)
            gxa r0 = r7.f1393R
            r1 = r0
            bbj r1 = (defpackage.bbj) r1
            if (r9 == 0) goto L_0x0029
            r1.getClass()
            int r3 = r9.R
            int r5 = r10.R
            if (r3 != r5) goto L_0x001f
            int r0 = r9.v
            int r2 = r10.v
            if (r0 == r2) goto L_0x0029
        L_0x001f:
            int r4 = r9.v
            int r6 = r10.v
            r2 = r8
            boolean r8 = r1.Z(r2, r3, r4, r5, r6)
            goto L_0x0038
        L_0x0029:
            r1.C(r8)
            android.view.View r9 = r8.f4097R
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.c
            r9.add(r8)
            r8 = 1
        L_0x0038:
            if (r8 == 0) goto L_0x003d
            r7.M()
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9q.L(h9X, bzl, bzl):void");
    }

    public final void O(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.R;
        int Z = recyclerView.f1378R.Z();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < Z; i11++) {
            h9X W = RecyclerView.W(recyclerView.f1378R.L(i11));
            if (W != null && (i9 = W.R) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    W.U(i2 - i, false);
                } else {
                    W.U(i3, false);
                }
                recyclerView.f1385R.f1839R = true;
            }
        }
        fgh fgh = recyclerView.f1391R;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = fgh.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            h9X h9x = (h9X) fgh.c.get(i12);
            if (h9x != null && (i8 = h9x.R) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    h9x.U(i2 - i, false);
                } else {
                    h9x.U(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.R.f1407U = true;
    }

    public final void R(uz uzVar) {
        int i = uzVar.R;
        if (i == 1) {
            this.R.f1400R.E(uzVar.v, uzVar.c);
        } else if (i == 2) {
            this.R.f1400R.F(uzVar.v, uzVar.c);
        } else if (i == 4) {
            this.R.f1400R.D(uzVar.v, uzVar.c);
        } else if (i == 8) {
            this.R.f1400R.a(uzVar.v, uzVar.c);
        }
    }

    public final void X(int i, int i2) {
        RecyclerView recyclerView = this.R;
        int Z = recyclerView.f1378R.Z();
        for (int i3 = 0; i3 < Z; i3++) {
            h9X W = RecyclerView.W(recyclerView.f1378R.L(i3));
            if (W != null && !W.P() && W.R >= i) {
                W.U(i2, false);
                recyclerView.f1385R.f1839R = true;
            }
        }
        fgh fgh = recyclerView.f1391R;
        int size = fgh.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            h9X h9x = (h9X) fgh.c.get(i4);
            if (h9x != null && h9x.R >= i) {
                h9x.U(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.R.f1407U = true;
    }

    public final void Z(h9X h9x, bzl bzl, bzl bzl2) {
        boolean z;
        this.R.f1391R.x(h9x);
        RecyclerView recyclerView = this.R;
        recyclerView.O(h9x);
        h9x.N(false);
        bbj bbj = (bbj) recyclerView.f1393R;
        bbj.getClass();
        int i = bzl.R;
        int i2 = bzl.v;
        View view = h9x.f4097R;
        int left = bzl2 == null ? view.getLeft() : bzl2.R;
        int top = bzl2 == null ? view.getTop() : bzl2.v;
        if (h9x.m() || (i == left && i2 == top)) {
            bbj.C(h9x);
            bbj.v.add(h9x);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = bbj.Z(h9x, i, i2, left, top);
        }
        if (z) {
            recyclerView.M();
        }
    }

    public final int c() {
        return this.R.getChildCount();
    }

    public final void e(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.R;
        int Z = recyclerView.f1378R.Z();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < Z; i6++) {
            View L = recyclerView.f1378R.L(i6);
            h9X W = RecyclerView.W(L);
            if (W != null && !W.P() && (i4 = W.R) >= i && i4 < i5) {
                W.v(2);
                W.R(obj);
                ((l88) L.getLayoutParams()).f5602R = true;
            }
        }
        fgh fgh = recyclerView.f1391R;
        int size = fgh.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                h9X h9x = (h9X) fgh.c.get(size);
                if (h9x != null && (i3 = h9x.R) >= i && i3 < i5) {
                    h9x.v(2);
                    fgh.X(size);
                }
            } else {
                this.R.f1371C = true;
                return;
            }
        }
    }

    public final void m(int i) {
        View childAt = this.R.getChildAt(i);
        if (childAt != null) {
            RecyclerView recyclerView = this.R;
            recyclerView.getClass();
            RecyclerView.W(childAt);
            gEY gey = recyclerView.f1392R;
            childAt.clearAnimation();
        }
        this.R.removeViewAt(i);
    }

    public final h9X v(int i) {
        RecyclerView recyclerView = this.R;
        int Z = recyclerView.f1378R.Z();
        int i2 = 0;
        h9X h9x = null;
        while (true) {
            if (i2 >= Z) {
                break;
            }
            h9X W = RecyclerView.W(recyclerView.f1378R.L(i2));
            if (W != null && !W.m() && W.R == i) {
                if (!recyclerView.f1378R.x(W.f4097R)) {
                    h9x = W;
                    break;
                }
                h9x = W;
            }
            i2++;
        }
        if (h9x != null && !this.R.f1378R.x(h9x.f4097R)) {
            return h9x;
        }
        return null;
    }
}
