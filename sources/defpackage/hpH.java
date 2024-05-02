package defpackage;

import android.content.Context;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;

/* renamed from: hpH  reason: default package */
/* loaded from: classes.dex */
public final class hpH extends k8G implements lR3 {
    public final /* synthetic */ RootSettingsViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mpr f4388R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hpH(mpr mpr, RootSettingsViewModel rootSettingsViewModel) {
        super(3);
        this.X = 1;
        this.f4388R = mpr;
        this.R = rootSettingsViewModel;
    }

    public final void R(kun kun, m88 m88, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 4;
        switch (this.X) {
            case 0:
                if ((i & 14) == 0) {
                    if (((jr_) m88).O(kun)) {
                        i5 = 4;
                    }
                    i3 = i | i5;
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
                h0T m = biy.m(this.R.v, m88);
                Context context = (Context) ((jr_) m88).x(ur.f7428R);
                int i7 = i3 & 14;
                biy.v(kun, "Shared folders", null, ((Boolean) m.getValue()).booleanValue() ? "At /sdcard" : "Requires “All files” access", null, aH9.I(m88, 374433206, new azM(m, 14, context)), null, new gEM(context, 4), m88, i7 | 196656, 42);
                biy.R(kun, "Start on boot", "For starting services", "serviceStartOnBoot", false, null, m88, i7 | 28080, 16);
                int i8 = i7 | 3120;
                biy.v(kun, "Port forwarding", null, "Connect to running servers", null, null, null, new gVU(this.f4388R, 7), m88, i8, 58);
                biy.v(kun, "USB", null, "Add or remove devices", null, null, null, new gVU(this.f4388R, 8), m88, i8, 58);
                return;
            case 1:
                if ((i & 14) == 0) {
                    if (!((jr_) m88).O(kun)) {
                        i6 = 2;
                    }
                    i4 = i | i6;
                } else {
                    i4 = i;
                }
                if ((i4 & 91) == 18) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                int i9 = (i4 & 14) | 48;
                biy.v(kun, "About", null, null, null, null, null, new gVU(this.f4388R, 9), m88, i9, 62);
                biy.v(kun, "Request a feature", null, null, null, null, null, new gEM((Context) ((jr_) m88).x(ur.f7428R), 5), m88, i9, 62);
                biy.v(kun, "Share debug report", null, null, null, null, null, new kf3(this.R, 2), m88, i9, 62);
                return;
            default:
                if ((i & 14) == 0) {
                    if (((jr_) m88).O(kun)) {
                        i5 = 4;
                    }
                    i2 = i | i5;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) == 18) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                jr_ jr_4 = (jr_) m88;
                jr_4.w(-492369756);
                Object I = jr_4.I();
                if (I == ppN.R) {
                    I = l6.n(Boolean.FALSE);
                    jr_4.ZW(I);
                }
                jr_4.g(false);
                h0T h0t = (h0T) I;
                int i10 = i2 & 14;
                biy.e(kun, "Virtual machine", aH9.I(jr_4, -119698015, new cFH(h0t, this.R)), aH9.I(jr_4, -1169070016, new cFH(this.R, h0t)), jr_4, i10 | 3504, 0);
                int i11 = i10 | 3120;
                biy.e(kun, "Features", null, aH9.I(jr_4, 1358437175, new hpH(this.R, this.f4388R, 0)), jr_4, i11, 2);
                biy.e(kun, "Tweaks", null, aH9.I(jr_4, 964033336, new lsd(this.R, 1)), jr_4, i11, 2);
                biy.e(kun, null, null, aH9.I(jr_4, 569629497, new hpH(this.f4388R, this.R)), jr_4, i10 | 3072, 3);
                return;
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((kun) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
            case 1:
                R((kun) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
            case 2:
                R((kun) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
            default:
                QX qx = (QX) obj;
                m88 m88 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return o8s.R;
                    }
                }
                biy.c(this.R.f2780R, dTl.B(adU.c, dTl.s(m88)), aH9.I(m88, -53298578, new hpH(this.R, this.f4388R, 2)), m88, 392, 0);
                return o8s.R;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpH(RootSettingsViewModel rootSettingsViewModel, mpr mpr, int i) {
        super(3);
        this.X = i;
        this.R = rootSettingsViewModel;
        this.f4388R = mpr;
    }
}
