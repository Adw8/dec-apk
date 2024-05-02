package defpackage;

/* renamed from: jE4  reason: default package */
/* loaded from: classes.dex */
public final class jE4 {

    /* renamed from: R  reason: collision with other field name */
    public fbt f4861R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f4862R;

    /* renamed from: R  reason: collision with other field name */
    public nog f4863R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4864R;

    /* renamed from: R  reason: collision with other field name */
    public final bkx f4860R = new bkx(3, this);
    public final _0 R = new _0(22, this);

    /* renamed from: R  reason: collision with other field name */
    public final biT f4859R = new biT(new nog[16]);

    public jE4(kg9 kg9) {
        this.f4862R = kg9;
    }

    public final void R() {
        synchronized (this.f4859R) {
            biT bit = this.f4859R;
            int i = bit.e;
            if (i > 0) {
                Object[] objArr = bit.f1772R;
                int i2 = 0;
                do {
                    nog nog = (nog) objArr[i2];
                    nog.f6599R.v();
                    mAv mav = nog.f6600R;
                    mav.R = 0;
                    P7.G((Object[]) mav.f5962R, null);
                    P7.G((Object[]) mav.v, null);
                    nog.f6602v.v();
                    nog.f6596R.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(java.lang.Object r9, defpackage.kg9 r10, defpackage.f_c r11) {
        /*
            r8 = this;
            biT r0 = r8.f4859R
            monitor-enter(r0)
            biT r1 = r8.f4859R     // Catch: all -> 0x0081
            int r2 = r1.e     // Catch: all -> 0x0081
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0021
            java.lang.Object[] r1 = r1.f1772R     // Catch: all -> 0x0081
            r5 = r3
        L_0x000e:
            r6 = r1[r5]     // Catch: all -> 0x0081
            r7 = r6
            nog r7 = (defpackage.nog) r7     // Catch: all -> 0x0081
            kg9 r7 = r7.f6597R     // Catch: all -> 0x0081
            if (r7 != r10) goto L_0x0019
            r7 = r4
            goto L_0x001a
        L_0x0019:
            r7 = r3
        L_0x001a:
            if (r7 == 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            int r5 = r5 + 1
            if (r5 < r2) goto L_0x000e
        L_0x0021:
            r6 = 0
        L_0x0022:
            nog r6 = (defpackage.nog) r6     // Catch: all -> 0x0081
            if (r6 != 0) goto L_0x0033
            nog r6 = new nog     // Catch: all -> 0x0081
            defpackage.gvP.L(r4, r10)     // Catch: all -> 0x0081
            r6.<init>(r10)     // Catch: all -> 0x0081
            biT r10 = r8.f4859R     // Catch: all -> 0x0081
            r10.v(r6)     // Catch: all -> 0x0081
        L_0x0033:
            monitor-exit(r0)
            boolean r10 = r8.f4864R
            nog r0 = r8.f4863R
            r8.f4864R = r3     // Catch: all -> 0x007b
            r8.f4863R = r6     // Catch: all -> 0x007b
            java.lang.Object r1 = r6.f6595R     // Catch: all -> 0x007b
            eJ5 r2 = r6.f6594R     // Catch: all -> 0x007b
            int r3 = r6.R     // Catch: all -> 0x007b
            r6.f6595R = r9     // Catch: all -> 0x007b
            mAv r4 = r6.f6600R     // Catch: all -> 0x007b
            java.lang.Object r9 = r4.c(r9)     // Catch: all -> 0x007b
            eJ5 r9 = (defpackage.eJ5) r9     // Catch: all -> 0x007b
            r6.f6594R = r9     // Catch: all -> 0x007b
            int r9 = r6.R     // Catch: all -> 0x007b
            r4 = -1
            if (r9 != r4) goto L_0x005d
            dR6 r9 = defpackage.jwU.L()     // Catch: all -> 0x007b
            int r9 = r9.e()     // Catch: all -> 0x007b
            r6.R = r9     // Catch: all -> 0x007b
        L_0x005d:
            pmk r9 = r6.f6601R     // Catch: all -> 0x007b
            pmk r4 = r6.f6603v     // Catch: all -> 0x007b
            _c r5 = new _c     // Catch: all -> 0x007b
            r7 = 9
            r5.<init>(r8, r7, r11)     // Catch: all -> 0x007b
            defpackage.l6.A(r9, r4, r5)     // Catch: all -> 0x007b
            java.lang.Object r9 = r6.f6595R     // Catch: all -> 0x007b
            defpackage.nog.R(r6, r9)     // Catch: all -> 0x007b
            r6.f6595R = r1     // Catch: all -> 0x007b
            r6.f6594R = r2     // Catch: all -> 0x007b
            r6.R = r3     // Catch: all -> 0x007b
            r8.f4863R = r0
            r8.f4864R = r10
            return
        L_0x007b:
            r9 = move-exception
            r8.f4863R = r0
            r8.f4864R = r10
            throw r9
        L_0x0081:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jE4.v(java.lang.Object, kg9, f_c):void");
    }
}
