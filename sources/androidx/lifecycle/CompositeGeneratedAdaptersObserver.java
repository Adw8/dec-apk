package androidx.lifecycle;

import java.util.HashMap;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements k3P {
    public final mag[] R;

    public CompositeGeneratedAdaptersObserver(mag[] magArr) {
        this.R = magArr;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        new HashMap();
        for (mag mag : this.R) {
            mag.R();
        }
        for (mag mag2 : this.R) {
            mag2.R();
        }
    }
}
