package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z7  reason: default package */
/* loaded from: classes.dex */
public final class z7 {

    /* renamed from: R  reason: collision with other field name */
    public final Context f7494R;

    /* renamed from: R  reason: collision with other field name */
    public final TextView f7495R;

    /* renamed from: R  reason: collision with other field name */
    public int f7493R = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7496R = false;
    public float R = -1.0f;
    public float v = -1.0f;
    public float c = -1.0f;

    /* renamed from: R  reason: collision with other field name */
    public int[] f7497R = new int[0];

    /* renamed from: v  reason: collision with other field name */
    public boolean f7498v = false;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public z7(TextView textView) {
        this.f7495R = textView;
        this.f7494R = textView.getContext();
        new dY();
    }

    public static int[] R(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final void X(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f7493R = 1;
            this.v = f;
            this.c = f2;
            this.R = f3;
            this.f7498v = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    public final boolean c() {
        int[] iArr = this.f7497R;
        int length = iArr.length;
        boolean z = length > 0;
        this.f7498v = z;
        if (z) {
            this.f7493R = 1;
            this.v = (float) iArr[0];
            this.c = (float) iArr[length - 1];
            this.R = -1.0f;
        }
        return z;
    }

    public final boolean e() {
        return !(this.f7495R instanceof Fx);
    }

    public final boolean v() {
        if (!e() || this.f7493R != 1) {
            this.f7496R = false;
        } else {
            if (!this.f7498v || this.f7497R.length == 0) {
                int floor = ((int) Math.floor((double) ((this.c - this.v) / this.R))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.R) + this.v);
                }
                this.f7497R = R(iArr);
            }
            this.f7496R = true;
        }
        return this.f7496R;
    }
}
