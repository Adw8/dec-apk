package defpackage;

import android.content.Context;
import android.os.StatFs;
import android.provider.Settings;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: k2z  reason: default package */
/* loaded from: classes.dex */
public final class k2z {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final cwX f5183R = pdD.J(new aFw(this, 0));
    public final cwX v = pdD.J(new aFw(this, 1));

    public k2z(Context context) {
        this.R = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: byte[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable R(defpackage.k2z r9, defpackage.aOO r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.jPr
            if (r0 == 0) goto L_0x0016
            r0 = r10
            jPr r0 = (defpackage.jPr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x001b
        L_0x0016:
            jPr r0 = new jPr
            r0.<init>(r9, r10)
        L_0x001b:
            java.lang.Object r9 = r0.R
            bGR r10 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r3) goto L_0x002d
            java.util.Iterator r1 = r0.f4924R
            defpackage.jjU.o(r9)     // Catch: Exception -> 0x006e
            goto L_0x0068
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = -43671254324108(0xffffd847fe662c74, double:NaN)
            java.lang.String r10 = defpackage.afN.R(r0)
            r9.<init>(r10)
            throw r9
        L_0x003c:
            defpackage.jjU.o(r9)
            java.util.List r9 = defpackage.b31.R
            java.util.Iterator r9 = r9.iterator()
            r1 = r9
        L_0x0046:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0075
            java.lang.Object r9 = r1.next()
            java.util.UUID r9 = (java.util.UUID) r9
            r4 = 3000(0xbb8, double:1.482E-320)
            bBd r6 = new bBd     // Catch: Exception -> 0x006e
            r7 = 0
            r6.<init>(r7, r9)     // Catch: Exception -> 0x006e
            r0.f4924R = r1     // Catch: Exception -> 0x006e
            r0.getClass()     // Catch: Exception -> 0x006e
            r0.e = r3     // Catch: Exception -> 0x006e
            java.lang.Object r9 = defpackage.mxC.u(r4, r6, r0)     // Catch: Exception -> 0x006e
            if (r9 != r10) goto L_0x0068
            goto L_0x0076
        L_0x0068:
            byte[] r9 = (byte[]) r9     // Catch: Exception -> 0x006e
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x0070
        L_0x006e:
            r9 = r10
            r10 = r2
        L_0x0070:
            if (r10 == 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            r10 = r9
            goto L_0x0046
        L_0x0075:
            r10 = r2
        L_0x0076:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2z.R(k2z, aOO):java.io.Serializable");
    }

    public final byte[] v(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(iH_.u(caw.P(afN.R(-43916067459980L))) + "256");
        instance.update(bArr);
        try {
            byte[] bArr2 = (byte[]) this.f5183R.getValue();
            if (bArr2 != null) {
                instance.update(bArr2);
            }
        } catch (Exception unused) {
        }
        try {
            String string = Settings.Secure.getString(this.R.getContentResolver(), afN.R(-43581060010892L));
            if (string != null) {
                F6 f6 = F6.R;
                byte[] bArr3 = kgV.c(string).f115R;
                instance.update(Arrays.copyOf(bArr3, bArr3.length));
            }
        } catch (Exception unused2) {
        }
        try {
            instance.update((byte) Runtime.getRuntime().availableProcessors());
        } catch (Exception unused3) {
        }
        try {
            instance.update(iH_.z(b31.R()));
        } catch (Exception unused4) {
        }
        try {
            long totalBytes = new StatFs(afN.R(-44367039026060L)).getTotalBytes();
            byte[] bArr4 = new byte[8];
            for (int i = 7; -1 < i; i--) {
                bArr4[i] = (byte) ((int) (255 & totalBytes));
                totalBytes >>= 8;
            }
            instance.update(bArr4);
        } catch (Exception unused5) {
        }
        return instance.digest();
    }
}
