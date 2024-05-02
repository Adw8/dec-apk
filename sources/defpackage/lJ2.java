package defpackage;

import android.view.View;

/* renamed from: lJ2  reason: default package */
/* loaded from: classes.dex */
public final class lJ2 extends aFk implements iv7 {
    public final /* synthetic */ int L;
    public int O;
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f5652R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lJ2(View view, nhg nhg, int i, aOO aoo) {
        super(2, aoo);
        this.R = view;
        this.f5652R = nhg;
        this.L = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lJ2) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r8) {
        /*
            r7 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r7.O
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            int r1 = r7.X
            defpackage.jjU.o(r8)
            goto L_0x002a
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001b:
            int r1 = r7.X
            defpackage.jjU.o(r8)
            goto L_0x003e
        L_0x0021:
            defpackage.jjU.o(r8)
            android.view.View r8 = r7.R
            r8.performHapticFeedback(r2)
            r1 = r4
        L_0x002a:
            nhg r8 = r7.f5652R
            int r5 = r7.L
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r7.X = r1
            r7.O = r4
            java.lang.Object r8 = r8.R(r6, r7)
            if (r8 != r0) goto L_0x003e
            return r0
        L_0x003e:
            if (r1 != 0) goto L_0x0046
            android.view.View r8 = r7.R
            r1 = 4
            r8.performHapticFeedback(r1)
        L_0x0046:
            r5 = 100
            r7.X = r2
            r7.O = r3
            java.lang.Object r8 = defpackage.n3x.Z(r5, r7)
            if (r8 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r1 = r2
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lJ2.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new lJ2(this.R, this.f5652R, this.L, aoo);
    }
}
