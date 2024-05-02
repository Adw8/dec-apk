package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: bLT  reason: default package */
/* loaded from: classes.dex */
public final class bLT {

    /* renamed from: R  reason: collision with other field name */
    public final gzG f1609R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1610R;
    public final biT R = new biT(new kSh[16]);
    public final biT v = new biT(new kSh[16]);
    public final biT c = new biT(new kSh[16]);

    public bLT(gzG gzg) {
        this.f1609R = gzg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x006e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(defpackage.j28 r7, defpackage.bsy r8, java.util.HashSet r9) {
        /*
            j28 r7 = r7.R
            boolean r0 = r7.f4792R
            if (r0 == 0) goto L_0x0076
            r0 = 16
            biT r1 = new biT
            j28[] r0 = new defpackage.j28[r0]
            r2 = 0
            r1.<init>(r0)
            j28 r0 = r7.c
            if (r0 != 0) goto L_0x0018
            defpackage.msU.Z(r1, r7)
            goto L_0x001b
        L_0x0018:
            r1.v(r0)
        L_0x001b:
            boolean r7 = r1.H()
            if (r7 == 0) goto L_0x0075
            int r7 = r1.e
            r0 = 1
            int r7 = r7 - r0
            java.lang.Object r7 = r1.N(r7)
            j28 r7 = (defpackage.j28) r7
            int r3 = r7.X
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0071
            r3 = r7
        L_0x0032:
            if (r3 == 0) goto L_0x0071
            int r4 = r3.e
            r4 = r4 & 32
            if (r4 == 0) goto L_0x006e
            boolean r4 = r3 instanceof defpackage.e6u
            if (r4 == 0) goto L_0x006b
            r4 = r3
            e6u r4 = (defpackage.e6u) r4
            boolean r5 = r4 instanceof defpackage.e7
            if (r5 == 0) goto L_0x0059
            r5 = r4
            e7 r5 = (defpackage.e7) r5
            eo1 r6 = r5.R
            boolean r6 = r6 instanceof defpackage.lHr
            if (r6 == 0) goto L_0x0059
            java.util.HashSet r5 = r5.f2980R
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x0059
            r9.add(r4)
        L_0x0059:
            e7 r4 = (defpackage.e7) r4
            mR r4 = r4.f2981R
            if (r4 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            mcF r4 = defpackage.mcF.R
        L_0x0062:
            boolean r4 = r4.C(r8)
            if (r4 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r4 = r2
            goto L_0x006c
        L_0x006b:
            r4 = r0
        L_0x006c:
            if (r4 == 0) goto L_0x001b
        L_0x006e:
            j28 r3 = r3.c
            goto L_0x0032
        L_0x0071:
            defpackage.msU.Z(r1, r7)
            goto L_0x001b
        L_0x0075:
            return
        L_0x0076:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bLT.v(j28, bsy, java.util.HashSet):void");
    }

    public final void R() {
        if (!this.f1610R) {
            this.f1610R = true;
            gzG gzg = this.f1609R;
            q4 q4Var = new q4(12, this);
            AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
            if (!androidComposeView.f1196R.Z(q4Var)) {
                androidComposeView.f1196R.v(q4Var);
            }
        }
    }
}
