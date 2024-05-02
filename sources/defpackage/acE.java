package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: acE  reason: default package */
/* loaded from: classes.dex */
public final class acE implements nRn {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f935R;

    public /* synthetic */ acE(int i, Object obj) {
        this.R = i;
        this.f935R = obj;
    }

    @Override // defpackage.nRn
    public final void R() {
        switch (this.R) {
            case 0:
                ((nm1) this.f935R).f6576R = null;
                return;
            case 1:
                if (((kY5) this.f935R).v()) {
                    dTl.W((kY5) this.f935R);
                    return;
                }
                return;
            case 2:
                ((fBS) this.f935R).H();
                return;
            case 3:
                iP3 ip3 = (iP3) this.f935R;
                if (ip3.f4579R) {
                    ip3.R.getViewTreeObserver().removeOnGlobalLayoutListener(ip3);
                    ip3.f4579R = false;
                }
                ip3.R.removeOnAttachStateChangeListener(ip3);
                return;
            case 4:
                ((gv2) this.f935R).e();
                gv2 gv2 = (gv2) this.f935R;
                gv2.setTag(R.id.view_tree_lifecycle_owner, null);
                gv2.f3977R.getViewTreeObserver().removeOnGlobalLayoutListener(gv2);
                gv2.f3979R.removeViewImmediate(gv2);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((fJK) this.f935R).R();
                return;
            case 6:
                lGT R = ((n67) ((dH9) this.f935R).getValue()).R();
                fue fue = R.f5637R;
                fue.c = true;
                for (oxg oxg : R.f5641R.values()) {
                    fJK fjk = oxg.R;
                    if (fjk != null) {
                        fjk.R();
                    }
                }
                R.f5637R.A();
                fue.c = false;
                R.f5641R.clear();
                R.f5643v.clear();
                R.c = 0;
                R.v = 0;
                R.f5642c.clear();
                R.v();
                return;
            case 7:
                ((oHC) this.f935R).f6720R.g();
                return;
            case VmNativeCallback.$stable /* 8 */:
                ((dVs) this.f935R).R();
                return;
            case 9:
                ((hfa) this.f935R).dismiss();
                ((hfa) this.f935R).f4342R.e();
                return;
            default:
                ((bkb) this.f935R).e();
                bkb bkb = (bkb) this.f935R;
                bkb.setTag(R.id.view_tree_lifecycle_owner, null);
                bkb.f1791R.removeViewImmediate(bkb);
                return;
        }
    }
}
