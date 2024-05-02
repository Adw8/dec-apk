package defpackage;

import android.view.ViewGroup;

/* renamed from: khS  reason: default package */
/* loaded from: classes.dex */
public final class khS extends n_R {
    public /* synthetic */ khS(pm2 pm2, String str) {
        super(pm2, "Attempting to reuse fragment " + pm2 + " with previous ID " + str);
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public khS(pm2 pm2, ViewGroup viewGroup, int i) {
        super(pm2, "Attempting to use <fragment> tag to add fragment " + pm2 + " to container " + viewGroup);
        if (i != 1) {
            return;
        }
        super(pm2, "Attempting to add fragment " + pm2 + " to container " + viewGroup + " which is not a FragmentContainerView");
    }
}
