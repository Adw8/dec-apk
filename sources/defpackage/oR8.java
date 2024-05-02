package defpackage;

import android.content.Context;
import dev.kdrag0n.virtcontainer.R;
import java.util.Arrays;

/* renamed from: oR8  reason: default package */
/* loaded from: classes.dex */
public final class oR8 extends k8G implements iv7 {
    public final /* synthetic */ Context R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oR8(Context context, int i) {
        super(2);
        this.X = i;
        this.R = context;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
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
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                g1c.c(gQc.G(m88).getString(R.string.main_dialog_beta_optout_desc, Arrays.copyOf(new Object[]{cUF.Z(this.R)}, 1)), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 0, 0, 65534);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                g1c.v(lTs.h(cpc.Q(this.R, R.string.onboarding_adb_pair_dialog_permission_failed_desc, new String[0])), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, null, m88, 0, 0, 131070);
                return;
        }
    }
}
