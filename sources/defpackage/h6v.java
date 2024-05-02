package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: h6v  reason: default package */
/* loaded from: classes.dex */
public final class h6v implements Runnable {

    /* renamed from: R  reason: collision with other field name */
    public long f4075R;
    public long v;

    /* renamed from: R  reason: collision with other field name */
    public static final ThreadLocal f4074R = new ThreadLocal();
    public static gvk R = new gvk(4);

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f4076R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f4077v = new ArrayList();

    public static h9X c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int Z = recyclerView.f1378R.Z();
        int i2 = 0;
        while (true) {
            if (i2 >= Z) {
                z = false;
                break;
            }
            h9X W = RecyclerView.W(recyclerView.f1378R.L(i2));
            if (W.R == i && !W.L()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        fgh fgh = recyclerView.f1391R;
        try {
            recyclerView.G();
            h9X m = fgh.m(i, j);
            if (m != null) {
                if (!m.O() || m.L()) {
                    fgh.R(m, false);
                } else {
                    fgh.O(m.f4097R);
                }
            }
            return m;
        } finally {
            recyclerView.B(false);
        }
    }

    public final void R(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4075R == 0) {
            this.f4075R = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        ma7 ma7 = recyclerView.f1403R;
        ma7.v = i;
        ma7.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            eug.R("RV Prefetch");
            if (!this.f4076R.isEmpty()) {
                int size = this.f4076R.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f4076R.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    v(TimeUnit.MILLISECONDS.toNanos(j) + this.v);
                }
            }
        } finally {
            this.f4075R = 0;
            eug.v();
        }
    }

    public final void v(long j) {
        ekT ekt;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ekT ekt2;
        int size = this.f4076R.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) this.f4076R.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f1403R.G(recyclerView3, false);
                i += recyclerView3.f1403R.e;
            }
        }
        this.f4077v.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) this.f4076R.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                ma7 ma7 = recyclerView4.f1403R;
                int abs = Math.abs(ma7.c) + Math.abs(ma7.v);
                for (int i5 = 0; i5 < ma7.e * 2; i5 += 2) {
                    if (i3 >= this.f4077v.size()) {
                        ekt2 = new ekT();
                        this.f4077v.add(ekt2);
                    } else {
                        ekt2 = (ekT) this.f4077v.get(i3);
                    }
                    int[] iArr = (int[]) ma7.f6078R;
                    int i6 = iArr[i5 + 1];
                    ekt2.f3191R = i6 <= abs;
                    ekt2.R = abs;
                    ekt2.v = i6;
                    ekt2.f3190R = recyclerView4;
                    ekt2.c = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4077v, R);
        int i7 = 0;
        while (i7 < this.f4077v.size() && (recyclerView = (ekt = (ekT) this.f4077v.get(i7)).f3190R) != null) {
            h9X c = c(recyclerView, ekt.c, ekt.f3191R ? Long.MAX_VALUE : j);
            if (!(c == null || c.f4102R == null || !c.O() || c.L() || (recyclerView2 = (RecyclerView) c.f4102R.get()) == null)) {
                if (recyclerView2.f1419m && recyclerView2.f1378R.Z() != 0) {
                    recyclerView2.F();
                }
                ma7 ma72 = recyclerView2.f1403R;
                ma72.G(recyclerView2, true);
                if (ma72.e != 0) {
                    try {
                        eug.R("RV Nested Prefetch");
                        btj btj = recyclerView2.f1385R;
                        gEY gey = recyclerView2.f1392R;
                        btj.e = 1;
                        btj.X = gey.R();
                        btj.f1843v = false;
                        btj.f1841c = false;
                        btj.f1842e = false;
                        for (int i8 = 0; i8 < ma72.e * 2; i8 += 2) {
                            c(recyclerView2, ((int[]) ma72.f6078R)[i8], j);
                        }
                    } finally {
                        eug.v();
                    }
                } else {
                    continue;
                }
            }
            ekt.f3191R = false;
            ekt.R = 0;
            ekt.v = 0;
            ekt.f3190R = null;
            ekt.c = 0;
            i7++;
        }
    }
}
