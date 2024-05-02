package androidx.lifecycle;

import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements k3P {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final y4 f1327R;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.R = obj;
        this.f1327R = Sl.R.v(obj.getClass());
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        y4 y4Var = this.f1327R;
        Object obj = this.R;
        y4.R((List) y4Var.R.get(alx), nu_, alx, obj);
        y4.R((List) y4Var.R.get(alX.ON_ANY), nu_, alx, obj);
    }
}
