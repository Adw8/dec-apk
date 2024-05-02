package defpackage;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: lNr  reason: default package */
/* loaded from: classes.dex */
public final class lNr {
    public final int L;
    public final int O;
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f5682R;

    /* renamed from: R  reason: collision with other field name */
    public final Layout.Alignment f5683R;

    /* renamed from: R  reason: collision with other field name */
    public final TextDirectionHeuristic f5684R;

    /* renamed from: R  reason: collision with other field name */
    public final TextPaint f5685R;

    /* renamed from: R  reason: collision with other field name */
    public final TextUtils.TruncateAt f5686R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f5687R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5688R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f5689R;
    public final int X;
    public final int Z;
    public final int c;
    public final int e;
    public final int m;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f5690v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f5691v;

    /* renamed from: v  reason: collision with other field name */
    public final int[] f5692v;
    public final int x;

    public lNr(CharSequence charSequence, int i, int i2, Vw vw, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.f5687R = charSequence;
        this.f5682R = i;
        this.f5690v = i2;
        this.f5685R = vw;
        this.c = i3;
        this.f5684R = textDirectionHeuristic;
        this.f5683R = alignment;
        this.e = i4;
        this.f5686R = truncateAt;
        this.X = i5;
        this.R = f;
        this.v = f2;
        this.O = i6;
        this.f5688R = z;
        this.f5691v = z2;
        this.L = i7;
        this.Z = i8;
        this.m = i9;
        this.x = i10;
        this.f5689R = iArr;
        this.f5692v = iArr2;
        boolean z3 = true;
        if (i >= 0 && i <= i2) {
            if (i2 >= 0 && i2 <= charSequence.length()) {
                if (i4 >= 0) {
                    if (i3 >= 0) {
                        if (i5 >= 0) {
                            if (!(f < 0.0f ? false : z3)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
