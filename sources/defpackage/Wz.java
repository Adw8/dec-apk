package defpackage;

import java.util.ArrayList;

/* renamed from: Wz  reason: default package */
/* loaded from: classes.dex */
public class Wz {

    /* renamed from: R  reason: collision with other field name */
    public n8 f612R;

    /* renamed from: R  reason: collision with other field name */
    public aLq f610R = null;
    public float R = 0.0f;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f611R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public boolean f613R = false;

    public Wz(piu piu) {
        this.f612R = new os(this, piu);
    }

    public final void L(aLq alq) {
        aLq alq2 = this.f610R;
        if (alq2 != null) {
            this.f612R.Z(alq2, -1.0f);
            this.f610R.X = -1;
            this.f610R = null;
        }
        float O = this.f612R.O(alq, true) * -1.0f;
        this.f610R = alq;
        if (O != 1.0f) {
            this.R /= O;
            this.f612R.L(O);
        }
    }

    public final aLq O(boolean[] zArr, aLq alq) {
        int i;
        int c = this.f612R.c();
        aLq alq2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < c; i2++) {
            float m = this.f612R.m(i2);
            if (m < 0.0f) {
                aLq v = this.f612R.v(i2);
                if ((zArr == null || !zArr[v.e]) && v != alq && (((i = v.L) == 3 || i == 4) && m < f)) {
                    f = m;
                    alq2 = v;
                }
            }
        }
        return alq2;
    }

    public final void R(fhh fhh, int i) {
        this.f612R.Z(fhh.x(i), 1.0f);
        this.f612R.Z(fhh.x(i), -1.0f);
    }

    public boolean X() {
        return this.f610R == null && this.R == 0.0f && this.f612R.c() == 0;
    }

    public final void Z(fhh fhh, aLq alq, boolean z) {
        if (alq != null && alq.v) {
            float X = this.f612R.X(alq);
            this.R = (alq.R * X) + this.R;
            this.f612R.O(alq, z);
            if (z) {
                alq.v(this);
            }
            if (this.f612R.c() == 0) {
                this.f613R = true;
                fhh.f3513R = true;
            }
        }
    }

    public final void c(aLq alq, aLq alq2, aLq alq3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.R = (float) i;
        }
        if (!z) {
            this.f612R.Z(alq, -1.0f);
            this.f612R.Z(alq2, 1.0f);
            this.f612R.Z(alq3, -1.0f);
            return;
        }
        this.f612R.Z(alq, 1.0f);
        this.f612R.Z(alq2, -1.0f);
        this.f612R.Z(alq3, 1.0f);
    }

    public aLq e(boolean[] zArr) {
        return O(zArr, null);
    }

    public void m(fhh fhh, Wz wz, boolean z) {
        float R = this.f612R.R(wz, z);
        this.R = (wz.R * R) + this.R;
        if (z) {
            wz.f610R.v(this);
        }
        if (this.f610R != null && this.f612R.c() == 0) {
            this.f613R = true;
            fhh.f3513R = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            aLq r0 = r10.f610R
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = defpackage.opT.U(r0)
            aLq r1 = r10.f610R
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.opT.H(r0, r1)
            float r1 = r10.R
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = defpackage.opT.U(r0)
            float r1 = r10.R
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            n8 r5 = r10.f612R
            int r5 = r5.c()
        L_0x003b:
            if (r3 >= r5) goto L_0x009a
            n8 r6 = r10.f612R
            aLq r6 = r6.v(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            n8 r7 = r10.f612R
            float r7 = r7.m(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0074
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.opT.H(r0, r1)
            goto L_0x0073
        L_0x0064:
            if (r8 <= 0) goto L_0x006d
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.opT.H(r0, r1)
            goto L_0x0074
        L_0x006d:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.opT.H(r0, r1)
        L_0x0073:
            float r7 = r7 * r9
        L_0x0074:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = defpackage.opT.H(r0, r6)
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0096:
            r1 = r4
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009a:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r10 = "0.0"
            java.lang.String r0 = defpackage.opT.H(r0, r10)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Wz.toString():java.lang.String");
    }

    public final void v(aLq alq, aLq alq2, aLq alq3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.R = (float) i;
        }
        if (!z) {
            this.f612R.Z(alq, -1.0f);
            this.f612R.Z(alq2, 1.0f);
            this.f612R.Z(alq3, 1.0f);
            return;
        }
        this.f612R.Z(alq, 1.0f);
        this.f612R.Z(alq2, -1.0f);
        this.f612R.Z(alq3, -1.0f);
    }
}
