package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: bqw  reason: default package */
/* loaded from: classes.dex */
public final class bqw implements i_c {
    public final hHo R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1824R;

    public bqw(View view) {
        hHo hho = new hHo(view);
        if (hho.f4201R) {
            WeakHashMap weakHashMap = of5.f6887R;
            m18.h(view);
        }
        hho.f4201R = true;
        this.R = hho;
        this.f1824R = new int[2];
        WeakHashMap weakHashMap2 = of5.f6887R;
        m18.i(view, true);
    }

    @Override // defpackage.i_c
    public final long H(int i, long j, long j2) {
        int i2 = 0;
        if (!this.R.L(gQc.x(j2), (i == 1 ? 1 : 0) ^ 1)) {
            return aWo.v;
        }
        int[] iArr = this.f1824R;
        Arrays.fill(iArr, 0, iArr.length, 0);
        hHo hho = this.R;
        int t = gQc.t(aWo.e(j));
        int t2 = gQc.t(aWo.X(j));
        int t3 = gQc.t(aWo.e(j2));
        int t4 = gQc.t(aWo.X(j2));
        if (i == 1) {
            i2 = 1;
        }
        hho.e(t, t2, t3, t4, i2 ^ 1, this.f1824R);
        return gQc.H(this.f1824R, j2);
    }

    public final void R() {
        boolean z = false;
        if (this.R.O(0) != null) {
            this.R.Z(0);
        }
        if (this.R.O(1) != null) {
            z = true;
        }
        if (z) {
            this.R.Z(1);
        }
    }

    @Override // defpackage.i_c
    public final long c(long j, int i) {
        int i2 = 0;
        if (!this.R.L(gQc.x(j), (i == 1 ? 1 : 0) ^ 1)) {
            return aWo.v;
        }
        int[] iArr = this.f1824R;
        Arrays.fill(iArr, 0, iArr.length, 0);
        hHo hho = this.R;
        int t = gQc.t(aWo.e(j));
        int t2 = gQc.t(aWo.X(j));
        int[] iArr2 = this.f1824R;
        if (i == 1) {
            i2 = 1;
        }
        hho.c(t, t2, i2 ^ 1, iArr2, null);
        return gQc.H(this.f1824R, j);
    }

    @Override // defpackage.i_c
    public final Object m(long j, long j2, aOO aoo) {
        if (!this.R.R(d_E.v(j2) * -1.0f, d_E.c(j2) * -1.0f, true)) {
            int i = d_E.R;
            j2 = d_E.v;
        }
        R();
        return new d_E(j2);
    }

    @Override // defpackage.i_c
    public final Object x(long j, aOO aoo) {
        if (!this.R.v(d_E.v(j) * -1.0f, d_E.c(j) * -1.0f)) {
            int i = d_E.R;
            j = d_E.v;
        }
        R();
        return new d_E(j);
    }
}
