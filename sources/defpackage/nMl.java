package defpackage;

/* renamed from: nMl  reason: default package */
/* loaded from: classes.dex */
public class nMl {
    public final u_ R;

    /* renamed from: R  reason: collision with other field name */
    public final float[] f6378R;
    public final u_ v;

    public nMl(u_ u_Var, u_ u_Var2, float[] fArr) {
        this.R = u_Var;
        this.v = u_Var2;
        this.f6378R = fArr;
    }

    public void R(float[] fArr) {
        float[] X = this.R.X(fArr);
        float[] fArr2 = this.f6378R;
        if (fArr2 != null) {
            X[0] = X[0] * fArr2[0];
            X[1] = X[1] * fArr2[1];
            X[2] = X[2] * fArr2[2];
        }
        this.v.R(X);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nMl(defpackage.u_ r10, defpackage.u_ r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.f7426R
            long r2 = defpackage.q2.f7347R
            boolean r0 = defpackage.q2.R(r0, r2)
            if (r0 == 0) goto L_0x000f
            u_ r0 = defpackage.msU.j(r10)
            goto L_0x0010
        L_0x000f:
            r0 = r10
        L_0x0010:
            long r4 = r11.f7426R
            boolean r1 = defpackage.q2.R(r4, r2)
            if (r1 == 0) goto L_0x001d
            u_ r1 = defpackage.msU.j(r11)
            goto L_0x001e
        L_0x001d:
            r1 = r11
        L_0x001e:
            r4 = 3
            r5 = 1
            r6 = 0
            if (r12 != r4) goto L_0x0025
            r12 = r5
            goto L_0x0026
        L_0x0025:
            r12 = r6
        L_0x0026:
            if (r12 != 0) goto L_0x0029
            goto L_0x003f
        L_0x0029:
            long r7 = r10.f7426R
            boolean r12 = defpackage.q2.R(r7, r2)
            long r7 = r11.f7426R
            boolean r2 = defpackage.q2.R(r7, r2)
            if (r12 == 0) goto L_0x003a
            if (r2 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            if (r12 != 0) goto L_0x0041
            if (r2 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r10 = 0
            goto L_0x0076
        L_0x0041:
            if (r12 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r10 = r11
        L_0x0045:
            dHi r10 = (defpackage.dHi) r10
            if (r12 == 0) goto L_0x0050
            bSx r11 = r10.f2548R
            float[] r11 = r11.R()
            goto L_0x0052
        L_0x0050:
            float[] r11 = defpackage.iWF.f4626R
        L_0x0052:
            if (r2 == 0) goto L_0x005b
            bSx r10 = r10.f2548R
            float[] r10 = r10.R()
            goto L_0x005d
        L_0x005b:
            float[] r10 = defpackage.iWF.f4626R
        L_0x005d:
            float[] r12 = new float[r4]
            r2 = r11[r6]
            r3 = r10[r6]
            float r2 = r2 / r3
            r12[r6] = r2
            r2 = r11[r5]
            r3 = r10[r5]
            float r2 = r2 / r3
            r12[r5] = r2
            r2 = 2
            r11 = r11[r2]
            r10 = r10[r2]
            float r11 = r11 / r10
            r12[r2] = r11
            r10 = r12
        L_0x0076:
            r9.<init>(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nMl.<init>(u_, u_, int):void");
    }
}
