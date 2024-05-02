package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: g3  reason: default package */
/* loaded from: classes.dex */
public final class g3 {
    public final Context R;

    public g3(Context context) {
        this.R = context.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(defpackage.pa3 r7, defpackage.aOO r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.i9
            if (r0 == 0) goto L_0x0013
            r0 = r8
            i9 r0 = (defpackage.i9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            i9 r0 = new i9
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f4468R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            if (r2 == 0) goto L_0x003a
            r6 = 1
            if (r2 == r6) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            pa3 r7 = r0.f4469R
            g3 r6 = r0.R
            defpackage.jjU.o(r8)
            goto L_0x005b
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            defpackage.jjU.o(r8)
            return r8
        L_0x003a:
            defpackage.jjU.o(r8)
            boolean r8 = r7 instanceof defpackage.b8Y
            if (r8 == 0) goto L_0x0068
            r8 = r7
            b8Y r8 = (defpackage.b8Y) r8
            android.content.Context r2 = r6.R
            r0.R = r6
            r0.f4469R = r7
            r0.e = r3
            lsf r3 = defpackage.iFn.f4518R
            qu r4 = new qu
            r5 = 0
            r4.<init>(r8, r2, r5)
            java.lang.Object r8 = defpackage.l6.a(r3, r4, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            b8Y r7 = (defpackage.b8Y) r7
            aKW r7 = r7.f1539R
            android.content.Context r6 = r6.R
            android.graphics.Typeface r6 = defpackage.gQc.B(r8, r7, r6)
            return r6
        L_0x0068:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unknown font type: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3.R(pa3, aOO):java.lang.Object");
    }

    public final Typeface v(pa3 pa3) {
        Typeface typeface;
        Object obj;
        Object obj2 = null;
        if (!(pa3 instanceof b8Y)) {
            return null;
        }
        b8Y b8y = (b8Y) pa3;
        int i = b8y.c;
        boolean z = false;
        if (i == 0) {
            typeface = onH.R.R(this.R, (b8Y) pa3);
        } else {
            if (i == 1) {
                try {
                    obj = onH.R.R(this.R, (b8Y) pa3);
                } catch (Throwable th) {
                    obj = new bvw(th);
                }
                if (!(obj instanceof bvw)) {
                    obj2 = obj;
                }
                typeface = (Typeface) obj2;
            } else {
                if (i == 2) {
                    z = true;
                }
                if (z) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                StringBuilder U = opT.U("Unknown loading type ");
                U.append((Object) pip.c(b8y.c));
                throw new IllegalArgumentException(U.toString());
            }
        }
        return gQc.B(typeface, ((b8Y) pa3).f1539R, this.R);
    }
}
