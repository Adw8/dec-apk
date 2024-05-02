package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: csz  reason: default package */
/* loaded from: classes.dex */
public abstract class csz implements Closeable {
    public int e;
    public int[] R = new int[32];

    /* renamed from: R  reason: collision with other field name */
    public String[] f2445R = new String[32];
    public int[] v = new int[32];

    public abstract void B();

    public abstract double C();

    public abstract int G(jsT jst);

    public abstract boolean H();

    public final void M(String str) {
        StringBuilder t = jQ.t(str, " at path ");
        t.append(Z());
        throw new iH7(t.toString());
    }

    public abstract void O();

    public abstract void R();

    public abstract int W();

    public abstract void X();

    public final String Z() {
        return biy.N(this.e, this.R, this.f2445R, this.v);
    }

    public abstract void c();

    public abstract String d();

    public abstract int j();

    public final void k(int i) {
        int i2 = this.e;
        int[] iArr = this.R;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.R = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f2445R;
                this.f2445R = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.v;
                this.v = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder U = opT.U("Nesting too deep at ");
                U.append(Z());
                throw new j8f(U.toString(), 0);
            }
        }
        int[] iArr3 = this.R;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void l();

    public abstract void o();

    public abstract long t();
}
