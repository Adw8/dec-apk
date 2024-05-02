package defpackage;

import androidx.compose.ui.platform.ComposeView;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.config.ConfigViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import java.util.List;

/* renamed from: m2w  reason: default package */
/* loaded from: classes.dex */
public final class m2w extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2w(int i, int i2, Object obj) {
        super(2);
        this.X = i2;
        this.R = obj;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 2:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 3:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 4:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 6:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 7:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case VmNativeCallback.$stable:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 9:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 10:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                ((kVD) this.R).R(m88, this.O | 1);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                ((cRR) this.R).X(this.O, m88, 0);
                return;
            case 2:
                dTl.H((fBS) this.R, m88, this.O | 1);
                return;
            case 3:
                ((gv2) this.R).R(m88, this.O | 1);
                return;
            case 4:
                ((ComposeView) this.R).R(m88, this.O | 1);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                ((nk3) this.R).R(m88, this.O | 1);
                return;
            case 6:
                ((bkb) this.R).R(m88, this.O | 1);
                return;
            case 7:
                cUF.c((List) this.R, m88, this.O | 1);
                return;
            case VmNativeCallback.$stable:
                lTs.e((CreateViewModel) this.R, m88, this.O | 1);
                return;
            case 9:
                cpc.y((ConfigViewModel) this.R, m88, this.O | 1);
                return;
            case 10:
                pdD.X((DeviceSupportViewModel) this.R, m88, this.O | 1);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                cpc.H((OverviewViewModel) this.R, m88, this.O | 1);
                return;
            default:
                mLz.R((RootSettingsViewModel) this.R, m88, this.O | 1);
                return;
        }
    }
}
