package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: j6  reason: default package */
/* loaded from: classes.dex */
public abstract class j6 extends AH {
    public j6(Zz zz) {
        super(zz);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        jG O = ((Zz) ((AH) this).f0R).O(i);
        if (O == null) {
            return null;
        }
        return O.f4895R;
    }
}
