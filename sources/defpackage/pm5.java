package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pm5  reason: default package */
/* loaded from: classes.dex */
public final class pm5 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f7256R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f7257R;

    /* renamed from: R  reason: collision with other field name */
    public final oq3 f7258R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f7259R;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f7260v;

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f7261v;

    public pm5(oq3 oq3, long j, int i, boolean z) {
        boolean z2;
        int i2;
        this.f7258R = oq3;
        this.f7256R = i;
        if (oys.x(j) == 0 && oys.m(j) == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = oq3.f6969R;
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (i3 < size) {
                bGA bga = (bGA) arrayList2.get(i3);
                l9J l9j = bga.f1584R;
                int Z = oys.Z(j);
                if (oys.c(j)) {
                    i2 = oys.L(j) - ((int) ((float) Math.ceil((double) f)));
                    if (i2 < 0) {
                        i2 = 0;
                    }
                } else {
                    i2 = oys.L(j);
                }
                lz lzVar = new lz((aA) l9j, this.f7256R - i4, z, dtx.c(Z, i2, 5));
                float v = lzVar.v() + f;
                int i5 = i4 + lzVar.f5879R.f6397R;
                arrayList.add(new pps(lzVar, bga.R, bga.v, i4, i5, f, v));
                if (lzVar.f5879R.f6404c || (i5 == this.f7256R && i3 != pdD.i(this.f7258R.f6969R))) {
                    i4 = i5;
                    f = v;
                    z2 = true;
                    break;
                }
                i3++;
                i4 = i5;
                f = v;
                arrayList2 = arrayList2;
            }
            z2 = false;
            this.v = f;
            this.f7260v = i4;
            this.f7259R = z2;
            this.f7261v = arrayList;
            this.R = (float) oys.Z(j);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                pps pps = (pps) arrayList.get(i6);
                List list = pps.f7288R.f5878R;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    gIA gia = (gIA) list.get(i7);
                    arrayList4.add(gia != null ? gia.e(aH9.N(0.0f, pps.R)) : null);
                }
                s3.E(arrayList4, arrayList3);
            }
            if (arrayList3.size() < this.f7258R.f6970R.size()) {
                int size4 = this.f7258R.f6970R.size() - arrayList3.size();
                ArrayList arrayList5 = new ArrayList(size4);
                for (int i8 = 0; i8 < size4; i8++) {
                    arrayList5.add(null);
                }
                arrayList3 = dF.cE(arrayList5, arrayList3);
            }
            this.f7257R = arrayList3;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public final void R(Gp gp, a1 a1Var, float f, hpO hpo, ari ari) {
        gp.y();
        if (this.f7261v.size() <= 1) {
            aH9.d(this, gp, a1Var, f, hpo, ari);
        } else if (a1Var instanceof oSW) {
            aH9.d(this, gp, a1Var, f, hpo, ari);
        } else if (a1Var instanceof qD) {
            ArrayList arrayList = this.f7261v;
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                pps pps = (pps) arrayList.get(i);
                f3 += pps.f7288R.v();
                f2 = Math.max(f2, pps.f7288R.e());
            }
            n1P.e(f2, f3);
            Shader shader = ((qD) a1Var).v;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            ArrayList arrayList2 = this.f7261v;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                pps pps2 = (pps) arrayList2.get(i2);
                lz.O(pps2.f7288R, gp, new qD(shader), f, hpo, ari);
                gp.g(0.0f, pps2.f7288R.v());
                matrix.setTranslate(0.0f, -pps2.f7288R.v());
                shader.setLocalMatrix(matrix);
            }
        }
        gp.j();
    }

    public final void c(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f7258R.R.R.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder C = opT.C("offset(", i, ") is out of bounds [0, ");
            C.append(this.f7258R.R.length());
            C.append(']');
            throw new IllegalArgumentException(C.toString().toString());
        }
    }

    public final void e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f7260v) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
        }
    }

    public final void v(Gp gp, long j, hpO hpo, ari ari) {
        gp.y();
        ArrayList arrayList = this.f7261v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pps pps = (pps) arrayList.get(i);
            lz lzVar = pps.f7288R;
            Vw vw = lzVar.f5875R.f768R;
            vw.v(j);
            vw.c(hpo);
            vw.e(ari);
            lzVar.X(gp);
            gp.g(0.0f, pps.f7288R.v());
        }
        gp.j();
    }
}
