package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: aXt  reason: default package */
/* loaded from: classes.dex */
public final class aXt {

    /* renamed from: R  reason: collision with other field name */
    public Cloneable f917R;
    public int c;
    public int v;
    public final /* synthetic */ int R = 2;

    /* renamed from: R  reason: collision with other field name */
    public Object f918R = new int[16];

    /* renamed from: v  reason: collision with other field name */
    public Object f919v = new int[16];

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Cloneable, int[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aXt() {
        /*
            r4 = this;
            r0 = 2
            r4.R = r0
            r4.<init>()
            r0 = 16
            int[] r1 = new int[r0]
            r4.f918R = r1
            int[] r1 = new int[r0]
            r4.f919v = r1
            int[] r1 = new int[r0]
            r2 = 0
        L_0x0013:
            if (r2 >= r0) goto L_0x001b
            int r3 = r2 + 1
            r1[r2] = r3
            r2 = r3
            goto L_0x0013
        L_0x001b:
            r4.f917R = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aXt.<init>():void");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Cloneable, int[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int R(int r8) {
        /*
            r7 = this;
            int r0 = r7.v
            int r0 = r0 + 1
            java.lang.Object r1 = r7.f918R
            int[] r1 = (int[]) r1
            int r2 = r1.length
            r3 = 14
            r4 = 0
            if (r0 > r2) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            int r2 = r2 * 2
            int[] r0 = new int[r2]
            int[] r2 = new int[r2]
            defpackage.P7.T(r1, r0, r4, r3)
            java.lang.Object r1 = r7.f919v
            int[] r1 = (int[]) r1
            defpackage.P7.T(r1, r2, r4, r3)
            r7.f918R = r0
            r7.f919v = r2
        L_0x0023:
            int r0 = r7.v
            int r1 = r0 + 1
            r7.v = r1
            java.lang.Cloneable r1 = r7.f917R
            int[] r1 = (int[]) r1
            int r1 = r1.length
            int r2 = r7.c
            if (r2 < r1) goto L_0x0048
            int r1 = r1 * 2
            int[] r2 = new int[r1]
            r5 = r4
        L_0x0037:
            if (r5 >= r1) goto L_0x003f
            int r6 = r5 + 1
            r2[r5] = r6
            r5 = r6
            goto L_0x0037
        L_0x003f:
            java.lang.Cloneable r1 = r7.f917R
            int[] r1 = (int[]) r1
            defpackage.P7.T(r1, r2, r4, r3)
            r7.f917R = r2
        L_0x0048:
            int r1 = r7.c
            java.lang.Cloneable r2 = r7.f917R
            int[] r2 = (int[]) r2
            r3 = r2[r1]
            r7.c = r3
            java.lang.Object r3 = r7.f918R
            r4 = r3
            int[] r4 = (int[]) r4
            r4[r0] = r8
            java.lang.Object r8 = r7.f919v
            int[] r8 = (int[]) r8
            r8[r0] = r1
            r2[r1] = r0
            int[] r3 = (int[]) r3
            r8 = r3[r0]
        L_0x0065:
            if (r0 <= 0) goto L_0x0076
            int r2 = r0 + 1
            int r2 = r2 >> 1
            int r2 = r2 + -1
            r4 = r3[r2]
            if (r4 <= r8) goto L_0x0076
            r7.v(r2, r0)
            r0 = r2
            goto L_0x0065
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aXt.R(int):int");
    }

    public final String toString() {
        String str;
        switch (this.R) {
            case 1:
                StringBuilder U = opT.U("ContentInfoCompat{clip=");
                U.append(((ClipData) this.f918R).getDescription());
                U.append(", source=");
                int i = this.v;
                U.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                U.append(", flags=");
                int i2 = this.c;
                U.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = "";
                if (((Uri) this.f919v) == null) {
                    str = str2;
                } else {
                    StringBuilder U2 = opT.U(", hasLinkUri(");
                    U2.append(((Uri) this.f919v).toString().length());
                    U2.append(")");
                    str = U2.toString();
                }
                U.append(str);
                if (((Bundle) this.f917R) != null) {
                    str2 = ", hasExtras";
                }
                return jQ.g(U, str2, "}");
            default:
                return super.toString();
        }
    }

    public final void v(int i, int i2) {
        int[] iArr = (int[]) this.f918R;
        int[] iArr2 = (int[]) this.f919v;
        int[] iArr3 = (int[]) this.f917R;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
