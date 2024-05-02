package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iTB  reason: default package */
/* loaded from: classes.dex */
public final class iTB extends laR implements h_4, ck3, jJj {

    /* renamed from: R  reason: collision with other field name */
    public final bUo f4594R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f4596R;

    /* renamed from: v  reason: collision with other field name */
    public pdm f4599v;

    /* renamed from: R  reason: collision with other field name */
    public pdm f4598R = lCG.R;

    /* renamed from: R  reason: collision with other field name */
    public final biT f4595R = new biT(new lAs[16]);
    public final biT v = new biT(new lAs[16]);
    public long R = 0;

    /* renamed from: R  reason: collision with other field name */
    public jy_ f4597R = g8W.R;

    public iTB(bUo buo, jJj jjj) {
        this.f4594R = buo;
        this.f4596R = jjj;
    }

    @Override // defpackage.jJj
    public final int B(float f) {
        return this.f4596R.B(f);
    }

    @Override // defpackage.jJj
    public final long C(long j) {
        return this.f4596R.C(j);
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.f4596R.D();
    }

    @Override // defpackage.jJj
    public final long M(long j) {
        return this.f4596R.M(j);
    }

    public final Object g(iv7 iv7, aOO aoo) {
        xx xxVar = new xx(1, n3x.U(aoo));
        xxVar.j();
        lAs las = new lAs(this, xxVar);
        synchronized (this.f4595R) {
            this.f4595R.v(las);
            new hf6(bGR.COROUTINE_SUSPENDED, n3x.U(n3x.L(las, las, iv7))).Y(o8s.R);
        }
        xxVar.y(new _0(28, las));
        return xxVar.P();
    }

    @Override // defpackage.h_4
    public final laR k() {
        return this;
    }

    @Override // defpackage.jJj
    public final float l(int i) {
        return this.f4596R.l(i);
    }

    @Override // defpackage.laR
    public final void m() {
        boolean z;
        pdm pdm = this.f4599v;
        if (pdm != null) {
            List list = pdm.f7140R;
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= size) {
                    break;
                } else if (!(true ^ ((phU) list.get(i2)).f7175R)) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                List list2 = pdm.f7140R;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    phU phu = (phU) list2.get(i);
                    long j = phu.f7171R;
                    long j2 = phu.c;
                    long j3 = phu.v;
                    Float f = phu.f7172R;
                    float floatValue = f != null ? f.floatValue() : 0.0f;
                    long j4 = phu.c;
                    long j5 = phu.v;
                    boolean z2 = phu.f7175R;
                    arrayList.add(new phU(j, j3, j2, false, floatValue, j5, j4, z2, z2, 1, aWo.v));
                    i++;
                    list2 = list2;
                }
                pdm pdm2 = new pdm(arrayList, null);
                this.f4598R = pdm2;
                y(pdm2, gKj.Initial);
                y(pdm2, gKj.Main);
                y(pdm2, gKj.Final);
                this.f4599v = null;
            }
        }
    }

    @Override // defpackage.jJj
    public final float mZ(float f) {
        return this.f4596R.mZ(f);
    }

    @Override // defpackage.jJj
    public final float q(float f) {
        return this.f4596R.q(f);
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.f4596R.vr();
    }

    @Override // defpackage.jJj
    public final float vz(long j) {
        return this.f4596R.vz(j);
    }

    @Override // defpackage.laR
    public final void x(pdm pdm, gKj gkj, long j) {
        this.R = j;
        if (gkj == gKj.Initial) {
            this.f4598R = pdm;
        }
        y(pdm, gkj);
        List list = pdm.f7140R;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            z = true;
            if (i >= size || !n1P.H((phU) list.get(i))) {
                break;
            }
            i++;
        }
        if (!(!z)) {
            pdm = null;
        }
        this.f4599v = pdm;
    }

    public final void y(pdm pdm, gKj gkj) {
        k0 k0Var;
        k0 k0Var2;
        synchronized (this.f4595R) {
            biT bit = this.v;
            bit.c(bit.e, this.f4595R);
        }
        try {
            int ordinal = gkj.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    biT bit2 = this.v;
                    int i = bit2.e;
                    if (i > 0) {
                        int i2 = i - 1;
                        Object[] objArr = bit2.f1772R;
                        do {
                            lAs las = (lAs) objArr[i2];
                            if (gkj == las.f5605R && (k0Var2 = las.f5607R) != null) {
                                las.f5607R = null;
                                ((xx) k0Var2).Y(pdm);
                            }
                            i2--;
                        } while (i2 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            biT bit3 = this.v;
            int i3 = bit3.e;
            if (i3 > 0) {
                int i4 = 0;
                Object[] objArr2 = bit3.f1772R;
                do {
                    lAs las2 = (lAs) objArr2[i4];
                    if (gkj == las2.f5605R && (k0Var = las2.f5607R) != null) {
                        las2.f5607R = null;
                        ((xx) k0Var).Y(pdm);
                    }
                    i4++;
                } while (i4 < i3);
            }
        } finally {
            this.v.L();
        }
    }
}
