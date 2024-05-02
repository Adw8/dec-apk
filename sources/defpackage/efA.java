package defpackage;

import android.view.View;

/* renamed from: efA  reason: default package */
/* loaded from: classes.dex */
public final class efA extends aFk implements iv7 {
    public int L;
    public int O;
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ck3 f3168R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3169R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mBH f3170R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f3171R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public efA(View view, nhg nhg, ck3 ck3, h0T h0t, mBH mbh, aOO aoo) {
        super(2, aoo);
        this.R = view;
        this.f3171R = nhg;
        this.f3168R = ck3;
        this.f3169R = h0t;
        this.f3170R = mbh;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((efA) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        r7 = r11.f3171R;
        r8 = new java.lang.Integer(r12);
        r11.X = r6;
        r11.O = r1;
        r11.L = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r7.R(r8, r11) != r0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        return r0;
     */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r12) {
        /*
            r11 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r11.L
            r2 = 1
            r3 = 2
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x0033
            if (r1 == r2) goto L_0x002b
            if (r1 == r3) goto L_0x0023
            if (r1 != r4) goto L_0x001b
            int r1 = r11.O
            int r6 = r11.X
            defpackage.jjU.o(r12)
            r10 = r6
            r6 = r1
            r1 = r10
            goto L_0x0050
        L_0x001b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0023:
            int r1 = r11.O
            int r6 = r11.X
            defpackage.jjU.o(r12)
            goto L_0x0050
        L_0x002b:
            int r1 = r11.O
            int r6 = r11.X
            defpackage.jjU.o(r12)
            goto L_0x007a
        L_0x0033:
            defpackage.jjU.o(r12)
            ck3 r12 = r11.f3168R
            mBH r1 = r11.f3170R
            h0T r6 = r11.f3169R
            float r7 = defpackage.iqx.R
            java.lang.Object r6 = r6.getValue()
            aWo r6 = (defpackage.aWo) r6
            long r6 = r6.f906R
            int r6 = defpackage.ago.Z(r12, r1, r6)
            android.view.View r12 = r11.R
            r12.performHapticFeedback(r5)
            r1 = r2
        L_0x0050:
            ck3 r12 = r11.f3168R
            mBH r7 = r11.f3170R
            h0T r8 = r11.f3169R
            float r9 = defpackage.iqx.R
            java.lang.Object r8 = r8.getValue()
            aWo r8 = (defpackage.aWo) r8
            long r8 = r8.f906R
            int r12 = defpackage.ago.Z(r12, r7, r8)
            if (r12 != r6) goto L_0x0093
            nhg r7 = r11.f3171R
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r12)
            r11.X = r6
            r11.O = r1
            r11.L = r2
            java.lang.Object r12 = r7.R(r8, r11)
            if (r12 != r0) goto L_0x007a
            return r0
        L_0x007a:
            if (r1 != 0) goto L_0x0082
            android.view.View r12 = r11.R
            r1 = 4
            r12.performHapticFeedback(r1)
        L_0x0082:
            r7 = 100
            r11.X = r6
            r11.O = r5
            r11.L = r3
            java.lang.Object r12 = defpackage.n3x.Z(r7, r11)
            if (r12 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r1 = r5
            goto L_0x0050
        L_0x0093:
            android.view.View r6 = r11.R
            r6.performHapticFeedback(r2)
            ck3 r6 = r11.f3168R
            iTB r6 = (defpackage.iTB) r6
            bUo r6 = r6.f4594R
            long r6 = r6.e()
            r11.X = r1
            r11.O = r12
            r11.L = r4
            java.lang.Object r6 = defpackage.n3x.Z(r6, r11)
            if (r6 != r0) goto L_0x00af
            return r0
        L_0x00af:
            r6 = r12
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efA.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new efA(this.R, this.f3171R, this.f3168R, this.f3169R, this.f3170R, aoo);
    }
}
