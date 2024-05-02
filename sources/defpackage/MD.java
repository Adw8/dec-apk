package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* renamed from: MD  reason: default package */
/* loaded from: classes.dex */
public final class MD implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final P_ R;

    public MD(P_ p_) {
        this.R = p_;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MD)) {
            return false;
        }
        return this.R.equals(((MD) obj).R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        heD hed = (heD) ((nxC) this.R).R;
        AutoCompleteTextView autoCompleteTextView = hed.f4332R;
        if (autoCompleteTextView != null) {
            int i = 1;
            if (!(autoCompleteTextView.getInputType() != 0)) {
                CheckableImageButton checkableImageButton = ((kst) hed).f5453R;
                if (z) {
                    i = 2;
                }
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.t(checkableImageButton, i);
            }
        }
    }
}
