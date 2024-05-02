package defpackage;

/* renamed from: oZ  reason: default package */
/* loaded from: classes.dex */
public final class oZ extends pl2 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ oZ(int r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = ")"
            r2 = 0
            r3 = 2
            r4 = 1
            if (r9 == r4) goto L_0x006c
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r9[r2] = r3
            java.util.HashMap r2 = defpackage.kOV.R
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            boolean r5 = r2.containsKey(r3)
            if (r5 != 0) goto L_0x001e
            goto L_0x0056
        L_0x001e:
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r2 = defpackage.kOV.v
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 113
            int r3 = r3 + r5
            r6.<init>(r3)
            r6.append(r0)
            java.lang.String r0 = " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"
            r6.append(r0)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
        L_0x0056:
            r9[r4] = r0
            java.lang.String r0 = "Asset Pack Download Error(%d): %s"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r7.<init>(r9)
            if (r8 == 0) goto L_0x0064
            return
        L_0x0064:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "errorCode should not be 0."
            r7.<init>(r8)
            throw r7
        L_0x006c:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3[r2] = r5
            java.util.HashMap r2 = defpackage.eU6.R
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r5 = r2.containsKey(r8)
            if (r5 != 0) goto L_0x0085
            goto L_0x00bd
        L_0x0085:
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r2 = defpackage.eU6.v
            java.lang.Object r8 = r2.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r2 + 106
            int r2 = r2 + r5
            r6.<init>(r2)
            r6.append(r0)
            java.lang.String r0 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            r6.append(r0)
            r6.append(r8)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
        L_0x00bd:
            r3[r4] = r0
            java.lang.String r8 = "Review Error(%d): %s"
            java.lang.String r8 = java.lang.String.format(r9, r8, r3)
            r7.<init>(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oZ.<init>(int, int):void");
    }

    public /* synthetic */ oZ(Exception exc) {
        super(exc);
    }
}
