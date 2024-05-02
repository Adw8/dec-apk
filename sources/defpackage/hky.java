package defpackage;

import android.text.Layout;
import java.util.ArrayList;

/* renamed from: hky  reason: default package */
/* loaded from: classes.dex */
public final class hky {
    public final Layout R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4372R;

    /* renamed from: R  reason: collision with other field name */
    public char[] f4373R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean[] f4374R;
    public final ArrayList v;

    public hky(Layout layout) {
        this.R = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int W = iH_.W(this.R.getText(), '\n', i, false, 4);
            i = W < 0 ? this.R.getText().length() : W + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.R.getText().length());
        this.f4372R = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.v = arrayList2;
        this.f4374R = new boolean[this.f4372R.size()];
        this.f4372R.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0163, code lost:
        if (r8.getRunCount() == 1) goto L_0x0167;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float R(int r23, boolean r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 697
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hky.R(int, boolean, boolean):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r0 != 8199) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        if (r0 == 12288) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(int r5) {
        /*
            r4 = this;
        L_0x0000:
            if (r5 <= 0) goto L_0x003b
            android.text.Layout r0 = r4.R
            java.lang.CharSequence r0 = r0.getText()
            int r1 = r5 + -1
            char r0 = r0.charAt(r1)
            r1 = 0
            r2 = 32
            r3 = 1
            if (r0 == r2) goto L_0x0035
            r2 = 10
            if (r0 == r2) goto L_0x0035
            r2 = 5760(0x1680, float:8.071E-42)
            if (r0 == r2) goto L_0x0035
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r2 > r0) goto L_0x0026
            r2 = 8203(0x200b, float:1.1495E-41)
            if (r0 >= r2) goto L_0x0026
            r2 = r3
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x002d
            r2 = 8199(0x2007, float:1.1489E-41)
            if (r0 != r2) goto L_0x0035
        L_0x002d:
            r2 = 8287(0x205f, float:1.1613E-41)
            if (r0 == r2) goto L_0x0035
            r2 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r2) goto L_0x0036
        L_0x0035:
            r1 = r3
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            int r5 = r5 + -1
            goto L_0x0000
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hky.v(int):int");
    }
}
