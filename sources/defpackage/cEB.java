package defpackage;

import dev.kdrag0n.virt.NativeLib;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.File;

/* renamed from: cEB  reason: default package */
/* loaded from: classes.dex */
public final class cEB extends k8G implements f_c {
    public final /* synthetic */ iHI R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cEB(iHI ihi, int i) {
        super(0);
        this.X = i;
        this.R = ihi;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.getClass();
                return;
            case 1:
                iHI ihi = this.R;
                ihi.getClass();
                kxm.v(cUF.v(ihi), 4, gvP.V(-3881558636280407955L), null);
                NativeLib.c(new VmNativeCallback(ihi, (gkP) ((nak) ihi.f4529R).get()), new File(ihi.R.getFilesDir(), gvP.V(-3881558679230080915L)).getAbsolutePath(), 102);
                return;
            default:
                iHI ihi2 = this.R;
                ihi2.getClass();
                kxm.v(cUF.v(ihi2), 4, gvP.V(-3881558739359623059L), null);
                NativeLib.d(new VmNativeCallback(ihi2, (gkP) ((nak) ihi2.f4529R).get()), 31978, 103, false);
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
