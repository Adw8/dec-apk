package defpackage;

/* renamed from: fky  reason: default package */
/* loaded from: classes.dex */
public abstract class fky {

    /* renamed from: R  reason: collision with other field name */
    public static final owM f3541R = new owM(fzi.P);
    public static final float R = (float) 16;

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.ncu r28, defpackage.iv7 r29, defpackage.iv7 r30, defpackage.iv7 r31, defpackage.iv7 r32, int r33, long r34, long r36, defpackage.iUy r38, defpackage.lR3 r39, defpackage.m88 r40, int r41, int r42) {
        /*
        // Method dump skipped, instructions count: 648
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fky.R(ncu, iv7, iv7, iv7, iv7, int, long, long, iUy, lR3, m88, int, int):void");
    }

    public static final void v(int i, iv7 iv7, lR3 lr3, iv7 iv72, iv7 iv73, iUy iuy, iv7 iv74, m88 m88, int i2) {
        jr_ jr_;
        boolean z;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(-975511942);
        int i3 = (i2 & 14) == 0 ? (jr_2.e(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= jr_2.O(iv7) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= jr_2.O(lr3) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= jr_2.O(iv72) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= jr_2.O(iv73) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= jr_2.O(iuy) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= jr_2.O(iv74) ? 1048576 : 524288;
        }
        if ((i3 & 2995931) != 599186 || !jr_2.J()) {
            Object[] objArr = {iv7, iv72, iuy, iv73, new oHE(i), iv74, lr3};
            jr_2.w(-568225417);
            boolean z2 = false;
            for (int i4 = 0; i4 < 7; i4++) {
                z2 |= jr_2.O(objArr[i4]);
            }
            Object I = jr_2.I();
            if (z2 || I == ppN.R) {
                jr_ = jr_2;
                iF1 if1 = new iF1(iv7, iv72, iv73, i, iuy, iv74, i3, lr3);
                jr_.ZW(if1);
                I = if1;
                z = false;
            } else {
                z = false;
                jr_ = jr_2;
            }
            jr_.g(z);
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            aH9.j(null, (iv7) I, jr_, i5, 1);
        } else {
            jr_2.E();
            jr_ = jr_2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new iF1(i, iv7, lr3, iv72, iv73, iuy, iv74, i2, 2);
        }
    }
}
