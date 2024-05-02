package dagger.hilt.android.internal.managers;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ViewComponentManager$FragmentContextWrapper$1 implements k3P {
    public final /* synthetic */ d R;

    public ViewComponentManager$FragmentContextWrapper$1(d dVar) {
        this.R = dVar;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (alx == alX.ON_DESTROY) {
            d dVar = this.R;
            dVar.getClass();
            dVar.R = null;
            dVar.v = null;
        }
    }
}
