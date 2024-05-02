package defpackage;

import android.app.Activity;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: gme  reason: default package */
/* loaded from: classes.dex */
public final class gme extends dq {
    public int e;

    /* renamed from: R  reason: collision with other field name */
    public SparseIntArray[] f3928R = new SparseIntArray[9];

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3927R = new ArrayList();
    public elc R = new elc(this);

    public gme(int i) {
        super((Object) null);
        this.e = i;
    }

    public static void Q(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    public final SparseIntArray[] A() {
        int size = this.f3927R.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.f3928R;
            }
            WeakReference weakReference = (WeakReference) this.f3927R.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.R);
                this.f3927R.remove(size);
            }
        }
    }
}
