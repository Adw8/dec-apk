package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: kmL  reason: default package */
/* loaded from: classes.dex */
public final class kmL extends k8G implements kg9 {
    public final /* synthetic */ kg9 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmL(int i, kg9 kg9) {
        super(1);
        this.X = i;
        this.R = kg9;
    }

    public final long R(long j) {
        switch (this.X) {
            case 0:
                return iTI.R(((Number) this.R.x(Integer.valueOf((int) (j >> 32)))).intValue(), ltH.v(j));
            case 1:
                return iTI.R((int) (j >> 32), ((Number) this.R.x(Integer.valueOf(ltH.v(j)))).intValue());
            case 2:
                return iTI.R(((Number) this.R.x(Integer.valueOf((int) (j >> 32)))).intValue(), ltH.v(j));
            default:
                return iTI.R((int) (j >> 32), ((Number) this.R.x(Integer.valueOf(ltH.v(j)))).intValue());
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i;
        switch (this.X) {
            case 0:
                return new ltH(R(((ltH) obj).R));
            case 1:
                return new ltH(R(((ltH) obj).R));
            case 2:
                return new ltH(R(((ltH) obj).R));
            case 3:
                return new ltH(R(((ltH) obj).R));
            case 4:
                return this.R.x(Long.valueOf(((Number) obj).longValue() / 1));
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
            case 6:
            case 7:
            default:
                gWG gwg = (gWG) obj;
                if (gwg instanceof jui) {
                    return (Boolean) this.R.x(gwg);
                }
                throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
            case VmNativeCallback.$stable:
                nQA nqa = (nQA) obj;
                synchronized (jwU.f5150R) {
                    i = jwU.R;
                    jwU.R = i + 1;
                }
                return new oDm(i, nqa, this.R);
            case 9:
                dR6 dr6 = (dR6) this.R.x((nQA) obj);
                synchronized (jwU.f5150R) {
                    jwU.f5153R = jwU.f5153R.C(dr6.e());
                }
                return dr6;
        }
    }
}
