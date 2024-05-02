package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: g2N  reason: default package */
/* loaded from: classes.dex */
public abstract class g2N {
    public int R = Integer.MIN_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f3656R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final kds f3657R;

    public g2N(kds kds) {
        this.f3657R = kds;
    }

    public static a40 R(kds kds, int i) {
        if (i == 0) {
            return new a40(kds, 0);
        }
        if (i == 1) {
            return new a40(kds, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void C(int i);

    public abstract int H(View view);

    public abstract int L();

    public abstract int O();

    public abstract int U(View view);

    public abstract int X();

    public abstract int Z();

    public abstract int c(View view);

    public abstract int e(View view);

    public abstract int m();

    public abstract int v(View view);

    public final int x() {
        if (Integer.MIN_VALUE == this.R) {
            return 0;
        }
        return m() - this.R;
    }
}
