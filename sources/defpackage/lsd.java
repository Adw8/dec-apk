package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;

/* renamed from: lsd  reason: default package */
/* loaded from: classes.dex */
public final class lsd extends k8G implements lR3 {
    public final /* synthetic */ RootSettingsViewModel R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lsd(RootSettingsViewModel rootSettingsViewModel, int i) {
        super(3);
        this.X = i;
        this.R = rootSettingsViewModel;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                w0 w0Var = (w0) obj;
                ((Number) obj3).intValue();
                vd.v(null, "Apply", new kf3(this.R, 0), (m88) obj2, 48, 1);
                return o8s.R;
            default:
                kun kun = (kun) obj;
                m88 m88 = (m88) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 14) == 0) {
                    intValue |= ((jr_) m88).O(kun) ? 4 : 2;
                }
                if ((intValue & 91) == 18) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return o8s.R;
                    }
                }
                biy.v(kun, "Prevent OS from stopping services", null, "Turn on if network or terminal stops unexpectedly. Disables Android's “phantom process killer.”", null, aH9.I(m88, -19970633, new azM(biy.m(this.R.c, m88), 15, this.R)), null, new kf3(this.R, 1), m88, (intValue & 14) | 199728, 42);
                return o8s.R;
        }
    }
}
