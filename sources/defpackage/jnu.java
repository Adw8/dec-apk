package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jnu  reason: default package */
/* loaded from: classes.dex */
public final class jnu extends i2h {
    public float L;
    public float O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public dm f5018R;

    /* renamed from: R  reason: collision with other field name */
    public k7I f5022R;

    /* renamed from: R  reason: collision with other field name */
    public float[] f5024R;
    public float c;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public f_c f5025v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f5020R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public List f5021R = fcD.R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5023R = true;

    /* renamed from: R  reason: collision with other field name */
    public String f5019R = "";
    public float e = 1.0f;
    public float X = 1.0f;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5026v = true;

    public jnu() {
        int i = jnb.R;
    }

    @Override // defpackage.i2h
    public final void R(fiv fiv) {
        if (this.f5026v) {
            float[] fArr = this.f5024R;
            if (fArr == null) {
                fArr = l1r.R();
                this.f5024R = fArr;
            } else {
                l1r.X(fArr);
            }
            l1r.O(fArr, this.v + this.O, this.c + this.L);
            double d = (((double) this.R) * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = (sin * f2) + (cos * f);
            float f4 = -sin;
            float f5 = (f2 * cos) + (f * f4);
            float f6 = fArr[1];
            float f7 = fArr[5];
            float f8 = (sin * f7) + (cos * f6);
            float f9 = (f7 * cos) + (f6 * f4);
            float f10 = fArr[2];
            float f11 = fArr[6];
            float f12 = (sin * f11) + (cos * f10);
            float f13 = (f11 * cos) + (f10 * f4);
            float f14 = fArr[3];
            float f15 = fArr[7];
            float f16 = (sin * f15) + (cos * f14);
            float f17 = (cos * f15) + (f4 * f14);
            fArr[0] = f3;
            fArr[1] = f8;
            fArr[2] = f12;
            fArr[3] = f16;
            fArr[4] = f5;
            fArr[5] = f9;
            fArr[6] = f13;
            fArr[7] = f17;
            float f18 = this.e;
            float f19 = this.X;
            fArr[0] = f3 * f18;
            fArr[1] = f8 * f18;
            fArr[2] = f12 * f18;
            fArr[3] = f16 * f18;
            fArr[4] = f5 * f19;
            fArr[5] = f9 * f19;
            fArr[6] = f13 * f19;
            fArr[7] = f17 * f19;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            l1r.O(fArr, -this.v, -this.c);
            this.f5026v = false;
        }
        if (this.f5023R) {
            if (!this.f5021R.isEmpty()) {
                k7I k7i = this.f5022R;
                if (k7i == null) {
                    k7i = new k7I();
                    this.f5022R = k7i;
                } else {
                    ((List) k7i.R).clear();
                }
                dm dmVar = this.f5018R;
                if (dmVar == null) {
                    dmVar = g4x.L();
                    this.f5018R = dmVar;
                } else {
                    dmVar.e();
                }
                ((List) k7i.R).addAll(this.f5021R);
                k7i.X(dmVar);
            }
            this.f5023R = false;
        }
        JF G = fiv.G();
        long v = G.v();
        G.R().y();
        Mp mp = G.f201R;
        float[] fArr2 = this.f5024R;
        if (fArr2 != null) {
            mp.R.R().U(fArr2);
        }
        dm dmVar2 = this.f5018R;
        if ((!this.f5021R.isEmpty()) && dmVar2 != null) {
            mp.R.R().C(dmVar2, 1);
        }
        ArrayList arrayList = this.f5020R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i2h) arrayList.get(i)).R(fiv);
        }
        G.R().j();
        G.c(v);
    }

    public final void X(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f5020R.size()) {
                ((i2h) this.f5020R.get(i)).e(null);
                this.f5020R.remove(i);
            }
        }
        c();
    }

    @Override // defpackage.i2h
    public final void e(f_c f_c) {
        this.f5025v = f_c;
        ArrayList arrayList = this.f5020R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i2h) arrayList.get(i)).e(f_c);
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("VGroup: ");
        U.append(this.f5019R);
        ArrayList arrayList = this.f5020R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            U.append("\t");
            U.append(((i2h) arrayList.get(i)).toString());
            U.append("\n");
        }
        return U.toString();
    }

    @Override // defpackage.i2h
    public final f_c v() {
        return this.f5025v;
    }
}
