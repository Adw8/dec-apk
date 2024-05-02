package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;

/* renamed from: cFH  reason: default package */
/* loaded from: classes.dex */
public final class cFH extends k8G implements lR3 {
    public final /* synthetic */ RootSettingsViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f2035R;
    public final /* synthetic */ int X = 1;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cFH(h0T h0t, RootSettingsViewModel rootSettingsViewModel) {
        super(3);
        this.f2035R = h0t;
        this.R = rootSettingsViewModel;
    }

    public final void R(kun kun, m88 m88, int i) {
        int i2;
        int i3;
        int i4 = 4;
        switch (this.X) {
            case 0:
                if ((i & 14) == 0) {
                    if (!((jr_) m88).O(kun)) {
                        i4 = 2;
                    }
                    i3 = i | i4;
                } else {
                    i3 = i;
                }
                if ((i3 & 91) == 18) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                dTl.v(kun, ((Boolean) this.f2035R.getValue()).booleanValue(), kun.v(aff.R, dq.f2893v), null, null, null, aH9.I(m88, 1561761737, new lsd(this.R, 0)), m88, (i3 & 14) | 1572864, 28);
                return;
            default:
                if ((i & 14) == 0) {
                    if (!((jr_) m88).O(kun)) {
                        i4 = 2;
                    }
                    i2 = i | i4;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) == 18) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                int i5 = this.R.R;
                mLY mly = mLY.R;
                h0T h0t = this.f2035R;
                jr_ jr_3 = (jr_) m88;
                jr_3.w(1157296644);
                boolean O = jr_3.O(h0t);
                Object I = jr_3.I();
                if (O || I == ppN.R) {
                    I = new n2R(h0t, 6);
                    jr_3.ZW(I);
                }
                jr_3.g(false);
                biy.X(kun, "Memory size", null, "vmMemorySize", 1200, 400, i5, 200, mly, (kg9) I, jr_3, (i2 & 14) | 113470512, 2);
                return;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((kun) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
            default:
                R((kun) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cFH(RootSettingsViewModel rootSettingsViewModel, h0T h0t) {
        super(3);
        this.R = rootSettingsViewModel;
        this.f2035R = h0t;
    }
}
