package defpackage;

import java.util.Map;

/* renamed from: orf  reason: default package */
/* loaded from: classes.dex */
public class orf {
    public final biT R = new biT(new coj[16]);

    public final void O() {
        int i = 0;
        while (true) {
            biT bit = this.R;
            if (i < bit.e) {
                coj coj = (coj) bit.f1772R[i];
                if (!msU.D(coj.f2204R)) {
                    this.R.N(i);
                    coj.c();
                } else {
                    i++;
                    coj.O();
                }
            } else {
                return;
            }
        }
    }

    public boolean R(Map map, hjM hjm, aAx aax, boolean z) {
        biT bit = this.R;
        int i = bit.e;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = bit.f1772R;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((coj) objArr[i2]).R(map, hjm, aax, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public boolean X(Map map, hjM hjm, aAx aax, boolean z) {
        biT bit = this.R;
        int i = bit.e;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = bit.f1772R;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((coj) objArr[i2]).X(map, hjm, aax, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public void c() {
        biT bit = this.R;
        int i = bit.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = bit.f1772R;
            do {
                ((coj) objArr[i2]).c();
                i2++;
            } while (i2 < i);
        }
    }

    public boolean e(aAx aax) {
        biT bit = this.R;
        int i = bit.e;
        boolean z = false;
        if (i > 0) {
            Object[] objArr = bit.f1772R;
            int i2 = 0;
            boolean z2 = false;
            do {
                z2 = ((coj) objArr[i2]).e(aax) || z2;
                i2++;
            } while (i2 < i);
            z = z2;
        }
        v(aax);
        return z;
    }

    public void v(aAx aax) {
        int i = this.R.e;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((coj) this.R.f1772R[i]).v.x()) {
                this.R.N(i);
            }
        }
    }
}
