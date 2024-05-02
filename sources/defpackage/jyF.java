package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: jyF  reason: default package */
/* loaded from: classes.dex */
public abstract class jyF {
    public static final float R = (float) 16;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014b A[LOOP:0: B:65:0x0148->B:67:0x014b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(boolean r22, defpackage.kg9 r23, defpackage.ncu r24, defpackage.lR3 r25, defpackage.m88 r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyF.R(boolean, kg9, ncu, lR3, m88, int, int):void");
    }

    public static final void v(View view, hjM hjm, int i, n2R n2r) {
        if (hjm != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            float f = ooA.C(hjm).v;
            int i2 = rect.top;
            n2r.x(Integer.valueOf(((int) Math.max(f - ((float) i2), ((float) (rect.bottom - i2)) - ooA.C(hjm).e)) - i));
        }
    }
}
