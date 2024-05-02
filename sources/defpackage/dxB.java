package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;

/* renamed from: dxB  reason: default package */
/* loaded from: classes.dex */
public final class dxB implements h2V {
    public final /* synthetic */ PortForwardCreateViewModel R;
    public final /* synthetic */ int e;

    public /* synthetic */ dxB(PortForwardCreateViewModel portForwardCreateViewModel, int i) {
        this.e = i;
        this.R = portForwardCreateViewModel;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                return v((String) obj);
            case 1:
                return v((String) obj);
            case 2:
                return v((String) obj);
            default:
                ((Boolean) obj).booleanValue();
                PortForwardCreateViewModel.e(this.R);
                return o8s.R;
        }
    }

    public final Object v(String str) {
        switch (this.e) {
            case 0:
                PortForwardCreateViewModel.e(this.R);
                break;
            case 1:
                PortForwardCreateViewModel.e(this.R);
                break;
            default:
                PortForwardCreateViewModel.e(this.R);
                break;
        }
        return o8s.R;
    }
}
