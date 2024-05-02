package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: iAq  reason: default package */
/* loaded from: classes.dex */
public final class iAq extends Observable {
    public final boolean R() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            cWJ cwj = (cWJ) ((Observable) this).mObservers.get(size);
            cwj.R.m(null);
            jP jPVar = cwj.R.f1398R;
            boolean z = false;
            if (i2 < 1) {
                jPVar.getClass();
            } else {
                jPVar.f4920R.add(jPVar.Z(null, 4, i, i2));
                jPVar.R |= 4;
                if (jPVar.f4920R.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                int[] iArr = RecyclerView.X;
                RecyclerView recyclerView = cwj.R;
                if (!recyclerView.f1413c || !recyclerView.f1425v) {
                    recyclerView.f1411Z = true;
                    recyclerView.requestLayout();
                } else {
                    lkl lkl = recyclerView.f1402R;
                    WeakHashMap weakHashMap = of5.f6887R;
                    mHC.C(recyclerView, lkl);
                }
            }
        }
    }

    public final void v() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            cWJ cwj = (cWJ) ((Observable) this).mObservers.get(size);
            cwj.R.m(null);
            RecyclerView recyclerView = cwj.R;
            recyclerView.f1385R.f1839R = true;
            recyclerView.f(true);
            if (!cwj.R.f1398R.L()) {
                cwj.R.requestLayout();
            }
        }
    }
}
