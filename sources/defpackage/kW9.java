package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: kW9  reason: default package */
/* loaded from: classes.dex */
public final class kW9 extends k8G implements kg9 {
    public final /* synthetic */ l0f R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kW9(l0f l0f, int i) {
        super(1);
        this.X = i;
        this.R = l0f;
    }

    public final void R(h57 h57) {
        switch (this.X) {
            case 0:
                h57.X(h57, this.R, 0, 0);
                return;
            case 1:
                l0f l0f = this.R;
                long j = dU5.v;
                ((gHI) h57).getClass();
                if (h57.f4042R == mdz.Ltr || h57.R(h57) == 0) {
                    long yf = l0f.yf();
                    l0f.KZ(cU5.v(((int) (j >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(j)), 0.0f, null);
                    return;
                }
                long v = cU5.v((h57.R(h57) - l0f.e) - ((int) (j >> 32)), dU5.v(j));
                long yf2 = l0f.yf();
                l0f.KZ(cU5.v(((int) (v >> 32)) + ((int) (yf2 >> 32)), dU5.v(yf2) + dU5.v(v)), 0.0f, null);
                return;
            case 2:
                h57.X(h57, this.R, 0, 0);
                return;
            case 3:
                h57.X(h57, this.R, 0, 0);
                return;
            case 4:
                h57.v(h57, this.R, 0, 0);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                h57.X(h57, this.R, 0, 0);
                return;
            case 6:
                h57.X(h57, this.R, 0, 0);
                return;
            case 7:
                h57.X(h57, this.R, 0, 0);
                return;
            case VmNativeCallback.$stable:
                h57.O(h57, this.R, 0, 0);
                return;
            default:
                h57.X(h57, this.R, 0, 0);
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((h57) obj);
                break;
            case 1:
                R((h57) obj);
                break;
            case 2:
                R((h57) obj);
                break;
            case 3:
                R((h57) obj);
                break;
            case 4:
                R((h57) obj);
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                R((h57) obj);
                break;
            case 6:
                R((h57) obj);
                break;
            case 7:
                R((h57) obj);
                break;
            case VmNativeCallback.$stable:
                R((h57) obj);
                break;
            default:
                R((h57) obj);
                break;
        }
        return o8s.R;
    }
}
