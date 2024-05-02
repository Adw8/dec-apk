package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: oeZ  reason: default package */
/* loaded from: classes.dex */
public final class oeZ {
    public static SparseIntArray R;

    /* renamed from: R  reason: collision with other field name */
    public int f6866R = -1;

    /* renamed from: v  reason: collision with other field name */
    public int f6869v = 0;

    /* renamed from: c  reason: collision with other field name */
    public int f6868c = -1;

    /* renamed from: R  reason: collision with other field name */
    public float f6865R = Float.NaN;
    public float v = Float.NaN;
    public float c = Float.NaN;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public String f6867R = null;
    public int X = -3;
    public int O = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.append(3, 1);
        R.append(5, 2);
        R.append(9, 3);
        R.append(2, 4);
        R.append(1, 5);
        R.append(0, 6);
        R.append(4, 7);
        R.append(8, 8);
        R.append(7, 9);
        R.append(6, 10);
    }

    public final void R(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gvP.O);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (R.get(index)) {
                case 1:
                    this.v = obtainStyledAttributes.getFloat(index, this.v);
                    break;
                case 2:
                    this.f6868c = obtainStyledAttributes.getInt(index, this.f6868c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = l1r.f5542R[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                    this.f6866R = nsw.O(obtainStyledAttributes, index, this.f6866R);
                    break;
                case 6:
                    this.f6869v = obtainStyledAttributes.getInteger(index, this.f6869v);
                    break;
                case 7:
                    this.f6865R = obtainStyledAttributes.getFloat(index, this.f6865R);
                    break;
                case VmNativeCallback.$stable:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 9:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f6867R = string;
                            if (string.indexOf("/") > 0) {
                                this.O = obtainStyledAttributes.getResourceId(index, -1);
                                this.X = -2;
                                break;
                            } else {
                                this.X = -1;
                                break;
                            }
                        } else {
                            this.X = obtainStyledAttributes.getInteger(index, this.O);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.O = resourceId;
                        if (resourceId != -1) {
                            this.X = -2;
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
