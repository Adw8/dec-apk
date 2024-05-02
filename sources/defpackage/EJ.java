package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: EJ  reason: default package */
/* loaded from: classes.dex */
public final class EJ {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ BottomSheetBehavior f87R;

    /* renamed from: R  reason: collision with other field name */
    public final k0f f88R = new k0f(14, this);

    /* renamed from: R  reason: collision with other field name */
    public boolean f89R;

    public EJ(BottomSheetBehavior bottomSheetBehavior) {
        this.f87R = bottomSheetBehavior;
    }

    public final void R(int i) {
        WeakReference weakReference = this.f87R.f2270R;
        if (weakReference != null && weakReference.get() != null) {
            this.R = i;
            if (!this.f89R) {
                k0f k0f = this.f88R;
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.C((View) this.f87R.f2270R.get(), k0f);
                this.f89R = true;
            }
        }
    }
}
