package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.List;
import java.util.Map;

/* renamed from: nqF  reason: default package */
/* loaded from: classes.dex */
public final class nqF extends k8G implements kg9 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f6609X;
    public static final nqF R = new nqF(0);
    public static final nqF v = new nqF(1);
    public static final nqF c = new nqF(2);
    public static final nqF e = new nqF(3);
    public static final nqF X = new nqF(5);
    public static final nqF O = new nqF(7);
    public static final nqF L = new nqF(8);
    public static final nqF Z = new nqF(9);
    public static final nqF m = new nqF(10);
    public static final nqF x = new nqF(11);
    public static final nqF H = new nqF(12);
    public static final nqF U = new nqF(14);
    public static final nqF C = new nqF(15);
    public static final nqF N = new nqF(16);
    public static final nqF P = new nqF(17);
    public static final nqF j = new nqF(18);
    public static final nqF g = new nqF(19);
    public static final nqF y = new nqF(20);
    public static final nqF t = new nqF(21);
    public static final nqF i = new nqF(22);
    public static final nqF V = new nqF(23);
    public static final nqF o = new nqF(24);
    public static final nqF K = new nqF(25);
    public static final nqF J = new nqF(26);
    public static final nqF Y = new nqF(27);
    public static final nqF h = new nqF(28);
    public static final nqF I = new nqF(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nqF(int i2) {
        super(1);
        this.f6609X = i2;
    }

    public final Double R(double d) {
        switch (this.f6609X) {
            case 20:
                double d2 = d < 0.0d ? -d : d;
                return Double.valueOf(Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d));
            case 21:
                double d3 = d < 0.0d ? -d : d;
                return Double.valueOf(Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d3, d));
            default:
                return Double.valueOf(d);
        }
    }

    public final jzQ c() {
        switch (this.f6609X) {
            case 14:
                return jzQ.R;
            case 15:
                return jzQ.R;
            case 16:
                return jzQ.R;
            default:
                return jzQ.R;
        }
    }

    public final void v(e7 e7Var) {
        switch (this.f6609X) {
            case 25:
                e7Var.v = true;
                msU.vz(e7Var).t();
                return;
            case 26:
                if (((j28) e7Var).f4792R) {
                    pcP snapshotObserver = msU.BF(e7Var).getSnapshotObserver();
                    dq dqVar = iTI.R;
                    snapshotObserver.R(e7Var, J, new Z8(e7Var, 2));
                    return;
                }
                return;
            default:
                e7Var.U();
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i2 = this.f6609X;
        switch (i2) {
            case 0:
                iRR irr = (iRR) obj;
                return o8s.R;
            case 1:
                long j2 = ((aWo) obj).f906R;
                return aH9.f(j2) ? new ct(aWo.e(j2), aWo.X(j2)) : eDJ.f3033R;
            case 2:
                ct ctVar = (ct) obj;
                return new aWo(aH9.N(ctVar.R, ctVar.v));
            case 3:
                d5M d5m = (d5M) obj;
                return o8s.R;
            case 4:
            case 6:
            case 13:
            default:
                ((oE) obj).e().c = false;
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                List list = (List) obj;
                return new lqA(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            case 7:
                return new oVq((Map) obj);
            case VmNativeCallback.$stable:
                return obj;
            case 9:
                nQA nqa = (nQA) obj;
                return o8s.R;
            case 10:
                nQA nqa2 = (nQA) obj;
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                return Boolean.valueOf(!(((eo1) obj) instanceof o9B));
            case 12:
                hcI.R((pi1) obj);
                return o8s.R;
            case 14:
                int i3 = ((jnj) obj).R;
                return c();
            case 15:
                int i4 = ((jnj) obj).R;
                return c();
            case 16:
                int i5 = ((jnj) obj).R;
                return c();
            case 17:
                int i6 = ((jnj) obj).R;
                return c();
            case 18:
                pi1 pi1 = (pi1) obj;
                switch (i2) {
                    case 18:
                        msU.cE(pi1);
                        return Boolean.TRUE;
                    default:
                        msU.cE(pi1);
                        return Boolean.TRUE;
                }
            case 19:
                pi1 pi12 = (pi1) obj;
                switch (i2) {
                    case 18:
                        msU.cE(pi12);
                        return Boolean.TRUE;
                    default:
                        msU.cE(pi12);
                        return Boolean.TRUE;
                }
            case 20:
                return R(((Number) obj).doubleValue());
            case 21:
                return R(((Number) obj).doubleValue());
            case 22:
                return R(((Number) obj).doubleValue());
            case 23:
                h7_ h7_ = (h7_) obj;
                return o8s.R;
            case 24:
                h57 h57 = (h57) obj;
                return o8s.R;
            case 25:
                v((e7) obj);
                return o8s.R;
            case 26:
                v((e7) obj);
                return o8s.R;
            case 27:
                v((e7) obj);
                return o8s.R;
            case 28:
                return ((fue) obj).f3606R.f7298R;
        }
    }
}
