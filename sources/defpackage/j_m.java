package defpackage;

import java.util.Arrays;

/* renamed from: j_m  reason: default package */
/* loaded from: classes.dex */
public final class j_m extends Wz {

    /* renamed from: R  reason: collision with other field name */
    public aLq[] f4969R = new aLq[128];
    public aLq[] v = new aLq[128];
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public CV f4968R = new CV(this, this);

    public j_m(piu piu) {
        super(piu);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.R = r2 - 1;
        r6.f843R = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.f4969R;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(defpackage.aLq r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r5.R
            if (r1 >= r2) goto L_0x0026
            aLq[] r2 = r5.f4969R
            r2 = r2[r1]
            if (r2 != r6) goto L_0x0023
        L_0x000c:
            int r2 = r5.R
            int r3 = r2 + -1
            if (r1 >= r3) goto L_0x001c
            aLq[] r2 = r5.f4969R
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto L_0x000c
        L_0x001c:
            int r2 = r2 + -1
            r5.R = r2
            r6.f843R = r0
            return
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j_m.H(aLq):void");
    }

    @Override // defpackage.Wz
    public final boolean X() {
        return this.R == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r9 < r8) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r7 = false;
     */
    @Override // defpackage.Wz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aLq e(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.R
            if (r2 >= r4) goto L_0x005b
            aLq[] r4 = r11.f4969R
            r5 = r4[r2]
            int r6 = r5.e
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0058
        L_0x0013:
            CV r6 = r11.f4968R
            r6.f59R = r5
            r5 = 8
            r7 = 1
            if (r3 != r0) goto L_0x0038
        L_0x001c:
            if (r5 < 0) goto L_0x0034
            java.lang.Object r4 = r6.f59R
            aLq r4 = (defpackage.aLq) r4
            float[] r4 = r4.f846v
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0034:
            r7 = r1
        L_0x0035:
            if (r7 == 0) goto L_0x0058
            goto L_0x0057
        L_0x0038:
            r4 = r4[r3]
        L_0x003a:
            if (r5 < 0) goto L_0x0054
            float[] r8 = r4.f846v
            r8 = r8[r5]
            java.lang.Object r9 = r6.f59R
            aLq r9 = (defpackage.aLq) r9
            float[] r9 = r9.f846v
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004f
            int r5 = r5 + -1
            goto L_0x003a
        L_0x004f:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r7 = r1
        L_0x0055:
            if (r7 == 0) goto L_0x0058
        L_0x0057:
            r3 = r2
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x005b:
            if (r3 != r0) goto L_0x005f
            r11 = 0
            return r11
        L_0x005f:
            aLq[] r11 = r11.f4969R
            r11 = r11[r3]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j_m.e(boolean[]):aLq");
    }

    @Override // defpackage.Wz
    public final void m(fhh fhh, Wz wz, boolean z) {
        aLq alq = wz.f610R;
        if (alq != null) {
            n8 n8Var = wz.f612R;
            int c = n8Var.c();
            for (int i = 0; i < c; i++) {
                aLq v = n8Var.v(i);
                float m = n8Var.m(i);
                CV cv = this.f4968R;
                cv.f59R = v;
                boolean z2 = true;
                if (v.f843R) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        float[] fArr = ((aLq) cv.f59R).f846v;
                        float f = (alq.f846v[i2] * m) + fArr[i2];
                        fArr[i2] = f;
                        if (Math.abs(f) < 1.0E-4f) {
                            ((aLq) cv.f59R).f846v[i2] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        ((j_m) cv.c).H((aLq) cv.f59R);
                    }
                    z2 = false;
                } else {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float f2 = alq.f846v[i3];
                        if (f2 != 0.0f) {
                            float f3 = f2 * m;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            ((aLq) cv.f59R).f846v[i3] = f3;
                        } else {
                            ((aLq) cv.f59R).f846v[i3] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    x(v);
                }
                ((Wz) this).R = (wz.R * m) + ((Wz) this).R;
            }
            H(alq);
        }
    }

    @Override // defpackage.Wz
    public final String toString() {
        StringBuilder t = jQ.t("", " goal -> (");
        t.append(((Wz) this).R);
        t.append(") : ");
        String sb = t.toString();
        for (int i = 0; i < this.R; i++) {
            this.f4968R.f59R = this.f4969R[i];
            StringBuilder U = opT.U(sb);
            U.append(this.f4968R);
            U.append(" ");
            sb = U.toString();
        }
        return sb;
    }

    public final void x(aLq alq) {
        int i;
        int i2 = this.R + 1;
        aLq[] alqArr = this.f4969R;
        if (i2 > alqArr.length) {
            aLq[] alqArr2 = (aLq[]) Arrays.copyOf(alqArr, alqArr.length * 2);
            this.f4969R = alqArr2;
            this.v = (aLq[]) Arrays.copyOf(alqArr2, alqArr2.length * 2);
        }
        aLq[] alqArr3 = this.f4969R;
        int i3 = this.R;
        alqArr3[i3] = alq;
        int i4 = i3 + 1;
        this.R = i4;
        if (i4 > 1 && alqArr3[i4 - 1].e > alq.e) {
            int i5 = 0;
            while (true) {
                i = this.R;
                if (i5 >= i) {
                    break;
                }
                this.v[i5] = this.f4969R[i5];
                i5++;
            }
            Arrays.sort(this.v, 0, i, new hTm(0, this));
            for (int i6 = 0; i6 < this.R; i6++) {
                this.f4969R[i6] = this.v[i6];
            }
        }
        alq.f843R = true;
        alq.R(this);
    }
}
