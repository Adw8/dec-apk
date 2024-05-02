package defpackage;

import java.util.Arrays;

/* renamed from: lo  reason: default package */
/* loaded from: classes.dex */
public abstract class lo {
    public cro R;

    /* renamed from: R  reason: collision with other field name */
    public rS[] f5834R;
    public int X;
    public int e;

    public abstract rS L();

    public final rS O() {
        rS rSVar;
        cro cro;
        synchronized (this) {
            rS[] rSVarArr = this.f5834R;
            if (rSVarArr == null) {
                rSVarArr = Z();
                this.f5834R = rSVarArr;
            } else if (this.e >= rSVarArr.length) {
                Object[] copyOf = Arrays.copyOf(rSVarArr, rSVarArr.length * 2);
                this.f5834R = (rS[]) copyOf;
                rSVarArr = (rS[]) copyOf;
            }
            int i = this.X;
            do {
                rSVar = rSVarArr[i];
                if (rSVar == null) {
                    rSVar = L();
                    rSVarArr[i] = rSVar;
                }
                i++;
                if (i >= rSVarArr.length) {
                    i = 0;
                }
            } while (!rSVar.R(this));
            this.X = i;
            this.e++;
            cro = this.R;
        }
        if (cro != null) {
            synchronized (cro) {
                Object[] objArr = ((bLS) cro).f1608R;
                cro.c(Integer.valueOf(((Number) objArr[((int) ((((bLS) cro).R + ((long) ((int) ((cro.j() + ((long) cro.Z)) - ((bLS) cro).R)))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return rSVar;
    }

    public abstract rS[] Z();

    public final void m(rS rSVar) {
        cro cro;
        int i;
        aOO[] v;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            cro = this.R;
            if (i2 == 0) {
                this.X = 0;
            }
            v = rSVar.v(this);
        }
        for (aOO aoo : v) {
            if (aoo != null) {
                aoo.Y(o8s.R);
            }
        }
        if (cro != null) {
            synchronized (cro) {
                Object[] objArr = ((bLS) cro).f1608R;
                cro.c(Integer.valueOf(((Number) objArr[((int) ((((bLS) cro).R + ((long) ((int) ((cro.j() + ((long) cro.Z)) - ((bLS) cro).R)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }
}
