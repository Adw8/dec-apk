package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: hHu  reason: default package */
/* loaded from: classes.dex */
public final class hHu {
    public static SparseIntArray R;

    /* renamed from: R  reason: collision with other field name */
    public float f4203R = 0.0f;
    public float v = 0.0f;
    public float c = 0.0f;
    public float e = 1.0f;
    public float X = 1.0f;
    public float O = Float.NaN;
    public float L = Float.NaN;

    /* renamed from: R  reason: collision with other field name */
    public int f4204R = -1;
    public float Z = 0.0f;
    public float m = 0.0f;
    public float x = 0.0f;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4205R = false;
    public float H = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.append(6, 1);
        R.append(7, 2);
        R.append(8, 3);
        R.append(4, 4);
        R.append(5, 5);
        R.append(0, 6);
        R.append(1, 7);
        R.append(2, 8);
        R.append(3, 9);
        R.append(9, 10);
        R.append(10, 11);
        R.append(11, 12);
    }

    public final void R(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gvP.m);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (R.get(index)) {
                case 1:
                    this.f4203R = obtainStyledAttributes.getFloat(index, this.f4203R);
                    break;
                case 2:
                    this.v = obtainStyledAttributes.getFloat(index, this.v);
                    break;
                case 3:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    this.X = obtainStyledAttributes.getFloat(index, this.X);
                    break;
                case 6:
                    this.O = obtainStyledAttributes.getDimension(index, this.O);
                    break;
                case 7:
                    this.L = obtainStyledAttributes.getDimension(index, this.L);
                    break;
                case VmNativeCallback.$stable:
                    this.Z = obtainStyledAttributes.getDimension(index, this.Z);
                    break;
                case 9:
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 10:
                    this.x = obtainStyledAttributes.getDimension(index, this.x);
                    break;
                case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                    this.f4205R = true;
                    this.H = obtainStyledAttributes.getDimension(index, this.H);
                    break;
                case 12:
                    this.f4204R = nsw.O(obtainStyledAttributes, index, this.f4204R);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
