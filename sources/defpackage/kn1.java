package defpackage;

/* renamed from: kn1  reason: default package */
/* loaded from: classes.dex */
public abstract class kn1 {
    public static final byte[] R = "0123456789abcdef".getBytes(O1.R);

    public static final boolean R(h11 h11, int i, byte[] bArr, int i2) {
        int i3 = h11.v;
        byte[] bArr2 = h11.f4018R;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                h11 = h11.f4016R;
                bArr2 = h11.f4018R;
                i = h11.R;
                i3 = h11.v;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r19 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(defpackage.ME r17, defpackage.paU r18, boolean r19) {
        /*
            r0 = r17
            h11 r0 = r0.f290R
            r1 = -2
            r2 = -1
            if (r0 != 0) goto L_0x000d
            if (r19 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            return r1
        L_0x000d:
            byte[] r3 = r0.f4018R
            int r4 = r0.R
            int r5 = r0.v
            r6 = r18
            int[] r6 = r6.R
            r7 = 0
            r9 = r0
            r10 = r2
            r8 = r7
        L_0x001b:
            int r11 = r8 + 1
            r8 = r6[r8]
            int r12 = r11 + 1
            r11 = r6[r11]
            if (r11 == r2) goto L_0x0026
            r10 = r11
        L_0x0026:
            if (r9 != 0) goto L_0x0029
            goto L_0x0053
        L_0x0029:
            r11 = 0
            if (r8 >= 0) goto L_0x0070
            int r8 = r8 * -1
            int r13 = r8 + r12
        L_0x0030:
            int r8 = r4 + 1
            byte r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            r12 = r6[r12]
            if (r4 == r12) goto L_0x003d
            return r10
        L_0x003d:
            if (r14 != r13) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = r7
        L_0x0042:
            if (r8 != r5) goto L_0x005d
            h11 r3 = r9.f4016R
            int r5 = r3.R
            byte[] r8 = r3.f4018R
            int r9 = r3.v
            if (r3 != r0) goto L_0x0057
            if (r4 == 0) goto L_0x0053
            r3 = r8
            r8 = r11
            goto L_0x0063
        L_0x0053:
            if (r19 == 0) goto L_0x0056
            return r1
        L_0x0056:
            return r10
        L_0x0057:
            r16 = r8
            r8 = r3
            r3 = r16
            goto L_0x0063
        L_0x005d:
            r16 = r9
            r9 = r5
            r5 = r8
            r8 = r16
        L_0x0063:
            if (r4 == 0) goto L_0x006b
            r4 = r6[r14]
            r13 = r5
            r5 = r9
            r9 = r8
            goto L_0x0092
        L_0x006b:
            r4 = r5
            r5 = r9
            r12 = r14
            r9 = r8
            goto L_0x0030
        L_0x0070:
            int r13 = r4 + 1
            byte r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r14 = r12 + r8
        L_0x0078:
            if (r12 != r14) goto L_0x007b
            return r10
        L_0x007b:
            r15 = r6[r12]
            if (r4 != r15) goto L_0x0098
            int r12 = r12 + r8
            r4 = r6[r12]
            if (r13 != r5) goto L_0x0092
            h11 r9 = r9.f4016R
            int r3 = r9.R
            byte[] r5 = r9.f4018R
            int r8 = r9.v
            r13 = r3
            r3 = r5
            r5 = r8
            if (r9 != r0) goto L_0x0092
            r9 = r11
        L_0x0092:
            if (r4 < 0) goto L_0x0095
            return r4
        L_0x0095:
            int r8 = -r4
            r4 = r13
            goto L_0x001b
        L_0x0098:
            int r12 = r12 + 1
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn1.c(ME, paU, boolean):int");
    }

    public static final String v(ME me, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (me.j(j2) == ((byte) 13)) {
                String B = me.B(j2);
                me.J(2);
                return B;
            }
        }
        String B2 = me.B(j);
        me.J(1);
        return B2;
    }
}
