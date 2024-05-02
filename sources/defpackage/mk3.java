package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: mk3  reason: default package */
/* loaded from: classes.dex */
public final class mk3 {

    /* renamed from: R  reason: collision with other field name */
    public int f6141R = 0;

    /* renamed from: v  reason: collision with other field name */
    public int f6142v = 0;
    public float R = 1.0f;
    public float v = Float.NaN;

    public final void R(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gvP.L);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.R = obtainStyledAttributes.getFloat(index, this.R);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f6141R);
                this.f6141R = i2;
                this.f6141R = nsw.f6613R[i2];
            } else if (index == 4) {
                this.f6142v = obtainStyledAttributes.getInt(index, this.f6142v);
            } else if (index == 3) {
                this.v = obtainStyledAttributes.getFloat(index, this.v);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
