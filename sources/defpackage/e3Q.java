package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;

/* renamed from: e3Q  reason: default package */
/* loaded from: classes.dex */
public final class e3Q extends k8G implements kg9 {
    public final /* synthetic */ PortForwardCreateViewModel R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3Q(PortForwardCreateViewModel portForwardCreateViewModel, int i) {
        super(1);
        this.X = i;
        this.R = portForwardCreateViewModel;
    }

    public final void R(String str) {
        int i = 5;
        switch (this.X) {
            case 0:
                String obj = iH_.vr(e1X.R.R.matcher(str).replaceAll("")).toString();
                ivW ivw = this.R.c;
                int length = obj.length();
                if (length <= 5) {
                    i = length;
                }
                ivw.H(obj.substring(0, i));
                return;
            default:
                String obj2 = iH_.vr(e1X.R.R.matcher(str).replaceAll("")).toString();
                ivW ivw2 = this.R.e;
                int length2 = obj2.length();
                if (length2 <= 5) {
                    i = length2;
                }
                ivw2.H(obj2.substring(0, i));
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((String) obj);
                break;
            case 1:
                R((String) obj);
                break;
            default:
                this.R.X.H(Boolean.valueOf(((Boolean) obj).booleanValue()));
                break;
        }
        return o8s.R;
    }
}
