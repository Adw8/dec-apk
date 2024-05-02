package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: aN6  reason: default package */
/* loaded from: classes.dex */
public final class aN6 implements LineHeightSpan {
    public int H;
    public int L;
    public int O;
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f861R;
    public final int X;
    public int Z;
    public final int e = 0;
    public int m;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f862v;
    public int x;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r5 == -1.0f) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aN6(float r1, int r2, boolean r3, boolean r4, float r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.R = r1
            r1 = 0
            r0.e = r1
            r0.X = r2
            r0.f861R = r3
            r0.f862v = r4
            r0.v = r5
            r0 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 1
            if (r0 > 0) goto L_0x001e
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001e
            r0 = r2
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            r0 = r2
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "topRatio should be in [0..1] range or -1"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aN6.<init>(float, int, boolean, boolean, float):void");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 > 0) {
            boolean z = true;
            boolean z2 = i == this.e;
            boolean z3 = i2 == this.X;
            if (!z2 || !z3 || !this.f861R || !this.f862v) {
                if (z2) {
                    int i7 = i5 - i6;
                    int ceil = (int) ((float) Math.ceil((double) this.R));
                    int i8 = ceil - i7;
                    float f = this.v;
                    if (f != -1.0f) {
                        z = false;
                    }
                    if (z) {
                        f = Math.abs((float) fontMetricsInt.ascent) / ((float) (fontMetricsInt.descent - fontMetricsInt.ascent));
                    }
                    double ceil2 = i8 <= 0 ? Math.ceil((double) (((float) i8) * f)) : Math.ceil((double) ((1.0f - f) * ((float) i8)));
                    int i9 = fontMetricsInt.descent;
                    int i10 = ((int) ((float) ceil2)) + i9;
                    this.Z = i10;
                    int i11 = i10 - ceil;
                    this.L = i11;
                    if (this.f861R) {
                        i11 = fontMetricsInt.ascent;
                    }
                    this.O = i11;
                    if (this.f862v) {
                        i10 = i9;
                    }
                    this.m = i10;
                    this.x = fontMetricsInt.ascent - i11;
                    this.H = i10 - i9;
                }
                fontMetricsInt.ascent = z2 ? this.O : this.L;
                fontMetricsInt.descent = z3 ? this.m : this.Z;
            }
        }
    }
}
