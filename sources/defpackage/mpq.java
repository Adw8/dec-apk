package defpackage;

/* renamed from: mpq  reason: default package */
/* loaded from: classes.dex */
public abstract class mpq extends kE9 {
    public static final /* synthetic */ int e = 0;
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public nhs f6173R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6174R;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ZW() {
        /*
            r6 = this;
            nhs r6 = r6.f6173R
            r0 = 0
            if (r6 != 0) goto L_0x0006
            goto L_0x002a
        L_0x0006:
            int r1 = r6.R
            int r2 = r6.v
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x000f
            goto L_0x0021
        L_0x000f:
            java.lang.Object r2 = r6.f6515R
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r5 = r2[r1]
            r2[r1] = r3
            int r1 = r1 + r4
            int r2 = r2.length
            int r2 = r2 + -1
            r1 = r1 & r2
            r6.R = r1
            if (r5 == 0) goto L_0x002b
            r3 = r5
        L_0x0021:
            eZV r3 = (defpackage.eZV) r3
            if (r3 != 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            r3.run()
            r0 = r4
        L_0x002a:
            return r0
        L_0x002b:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpq.ZW():boolean");
    }

    public final void cE(boolean z) {
        this.R = (z ? 4294967296L : 1) + this.R;
        if (!z) {
            this.f6174R = true;
        }
    }

    public abstract Thread cr();

    public final boolean iE() {
        return this.R >= 4294967296L;
    }

    public abstract void shutdown();

    public final void vl(boolean z) {
        long j = this.R - (z ? 4294967296L : 1);
        this.R = j;
        if (j <= 0 && this.f6174R) {
            shutdown();
        }
    }

    public final void vr(eZV ezv) {
        nhs nhs = this.f6173R;
        if (nhs == null) {
            nhs = new nhs(1);
            this.f6173R = nhs;
        }
        Object[] objArr = (Object[]) nhs.f6515R;
        int i = nhs.v;
        objArr[i] = ezv;
        int length = (i + 1) & (objArr.length - 1);
        nhs.v = length;
        int i2 = nhs.R;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            P7.r(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = (Object[]) nhs.f6515R;
            int length3 = objArr3.length;
            int i3 = nhs.R;
            P7.r(objArr3, objArr2, length3 - i3, 0, i3, 4);
            nhs.f6515R = objArr2;
            nhs.R = 0;
            nhs.v = length2;
        }
    }

    public void vz(long j, fpB fpb) {
        ohJ.R.wm(j, fpb);
    }

    public abstract long xN();
}
