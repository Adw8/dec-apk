package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: fgh  reason: default package */
/* loaded from: classes.dex */
public final class fgh {

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ RecyclerView f3498R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3499R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3500R;

    /* renamed from: R  reason: collision with other field name */
    public lxt f3501R;

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f3502v = null;
    public final ArrayList c = new ArrayList();
    public int R = 2;
    public int v = 2;

    public fgh(RecyclerView recyclerView) {
        this.f3498R = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3499R = arrayList;
        this.f3500R = Collections.unmodifiableList(arrayList);
    }

    public final void H() {
        kds kds = this.f3498R.f1400R;
        this.v = this.R + (kds != null ? kds.R : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.v; size--) {
            X(size);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(defpackage.h9X r10) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.L(h9X):void");
    }

    public final void O(View view) {
        h9X W = RecyclerView.W(view);
        if (W.H()) {
            this.f3498R.removeDetachedView(view, false);
        }
        if (W.x()) {
            W.f4099R.x(W);
        } else if (W.j()) {
            W.X &= -33;
        }
        L(W);
        if (this.f3498R.f1393R != null && !W.Z()) {
            this.f3498R.f1393R.X(W);
        }
    }

    public final void R(h9X h9x, boolean z) {
        RecyclerView.x(h9x);
        View view = h9x.f4097R;
        kuM kum = this.f3498R.f1401R;
        if (kum != null) {
            i73 i73 = kum.f5476R;
            of5.O(view, i73 instanceof i73 ? (G5) i73.R.remove(view) : null);
        }
        if (z) {
            this.f3498R.getClass();
            int size = this.f3498R.f1399R.size();
            for (int i = 0; i < size; i++) {
                ((oq_) this.f3498R.f1399R.get(i)).R();
            }
            RecyclerView recyclerView = this.f3498R;
            gEY gey = recyclerView.f1392R;
            if (recyclerView.f1385R != null) {
                recyclerView.f1389R.P(h9x);
            }
        }
        h9x.f4100R = null;
        h9x.f4098R = null;
        lxt c = c();
        c.getClass();
        int i2 = h9x.c;
        ArrayList arrayList = c.R(i2).f3424R;
        if (((fSp) c.f5866R.get(i2)).R > arrayList.size()) {
            h9x.C();
            arrayList.add(h9x);
        }
    }

    public final void X(int i) {
        R((h9X) this.c.get(i), true);
        this.c.remove(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(android.view.View r5) {
        /*
            r4 = this;
            h9X r5 = androidx.recyclerview.widget.RecyclerView.W(r5)
            int r0 = r5.X
            r1 = r0 & 12
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            if (r1 != 0) goto L_0x005e
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0017
            r0 = r2
            goto L_0x0018
        L_0x0017:
            r0 = r3
        L_0x0018:
            if (r0 == 0) goto L_0x005e
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3498R
            gxa r0 = r0.f1393R
            if (r0 == 0) goto L_0x0045
            java.util.List r1 = r5.e()
            bbj r0 = (defpackage.bbj) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003f
            boolean r0 = r0.f1757R
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5.L()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = r3
            goto L_0x003a
        L_0x0039:
            r0 = r2
        L_0x003a:
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = r3
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            goto L_0x005e
        L_0x0049:
            java.util.ArrayList r0 = r4.f3502v
            if (r0 != 0) goto L_0x0054
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f3502v = r0
        L_0x0054:
            r5.f4099R = r4
            r5.f4105R = r2
            java.util.ArrayList r4 = r4.f3502v
            r4.add(r5)
            goto L_0x008e
        L_0x005e:
            boolean r0 = r5.L()
            if (r0 == 0) goto L_0x0085
            boolean r0 = r5.m()
            if (r0 != 0) goto L_0x0085
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3498R
            gEY r0 = r0.f1392R
            boolean r0 = r0.f3695R
            if (r0 == 0) goto L_0x0073
            goto L_0x0085
        L_0x0073:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            java.lang.StringBuilder r0 = defpackage.opT.U(r0)
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3498R
            java.lang.String r4 = defpackage.jQ.H(r4, r0)
            r5.<init>(r4)
            throw r5
        L_0x0085:
            r5.f4099R = r4
            r5.f4105R = r3
            java.util.ArrayList r4 = r4.f3499R
            r4.add(r5)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.Z(android.view.View):void");
    }

    public final lxt c() {
        if (this.f3501R == null) {
            this.f3501R = new lxt();
        }
        return this.f3501R;
    }

    public final void e() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            X(size);
        }
        this.c.clear();
        int[] iArr = RecyclerView.X;
        ma7 ma7 = this.f3498R.f1403R;
        int[] iArr2 = (int[]) ma7.f6078R;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        ma7.e = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x045d, code lost:
        if (r7.L() == false) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0493, code lost:
        if ((r11 == 0 || r11 + r9 < r21) == false) goto L_0x0495;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x059e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.h9X m(int r20, long r21) {
        /*
        // Method dump skipped, instructions count: 1477
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.m(int, long):h9X");
    }

    public final int v(int i) {
        if (i < 0 || i >= this.f3498R.f1385R.v()) {
            StringBuilder C = opT.C("invalid position ", i, ". State item count is ");
            C.append(this.f3498R.f1385R.v());
            throw new IndexOutOfBoundsException(jQ.H(this.f3498R, C));
        }
        RecyclerView recyclerView = this.f3498R;
        return !recyclerView.f1385R.f1843v ? i : recyclerView.f1398R.O(i, 0);
    }

    public final void x(h9X h9x) {
        if (h9x.f4105R) {
            this.f3502v.remove(h9x);
        } else {
            this.f3499R.remove(h9x);
        }
        h9x.f4099R = null;
        h9x.f4105R = false;
        h9x.X &= -33;
    }
}
