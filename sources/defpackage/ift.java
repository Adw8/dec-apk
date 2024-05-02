package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.Set;

/* renamed from: ift  reason: default package */
/* loaded from: classes.dex */
public class ift implements ovy, bTI {
    public final int e;

    public /* synthetic */ ift(int i) {
        this.e = i;
    }

    public static void H() {
        boolean z;
        synchronized (jwU.f5150R) {
            Set set = ((kpt) ((n3s) jwU.f5152R.get())).R;
            z = false;
            if (set != null) {
                if (!set.isEmpty()) {
                    z = true;
                }
            }
        }
        if (z) {
            jwU.e(nqF.Z);
        }
    }

    public static kpt U(a7Q a7q, V4 v4) {
        kpt Y;
        dR6 L = jwU.L();
        kpt kpt = L instanceof kpt ? (kpt) L : null;
        if (kpt != null && (Y = kpt.Y(a7q, v4)) != null) {
            return Y;
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
    }

    public static dR6 c() {
        return jwU.X((dR6) jwU.f5149R.H(), null, false);
    }

    public static Object m(kg9 kg9, f_c f_c) {
        dR6 dr6;
        if (kg9 == null) {
            return f_c.g();
        }
        dR6 dr62 = (dR6) jwU.f5149R.H();
        if (dr62 == null || (dr62 instanceof kpt)) {
            dr6 = new b5u(dr62 instanceof kpt ? (kpt) dr62 : null, kg9, null, true, false);
        } else if (kg9 == null) {
            return f_c.g();
        } else {
            dr6 = dr62.y(kg9);
        }
        try {
            dR6 m = dr6.m();
            Object g = f_c.g();
            dR6.P(m);
            return g;
        } finally {
            dr6.c();
        }
    }

    public static final void v(gL6 gl6) {
        ivW ivw;
        gDl gdl;
        g1k g1k;
        ivW ivw2 = fLL.v;
        do {
            ivw = fLL.v;
            gdl = (gDl) ivw.getValue();
            g1k = (g1k) gdl;
            ftv ftv = (ftv) g1k.f3649R.get(gl6);
            if (ftv != null) {
                e76 e76 = g1k.f3649R;
                boolean z = false;
                pgk o = e76.f2983R.o(gl6 != null ? gl6.hashCode() : 0, 0, gl6);
                if (e76.f2983R != o) {
                    e76 = o == null ? e76.R : new e76(o, e76.e - 1);
                }
                Object obj = ftv.R;
                hw1 hw1 = hw1.X;
                if (obj != hw1) {
                    e76 = e76.R(ftv.R, new ftv(((ftv) e76.get(obj)).R, ftv.v));
                }
                Object obj2 = ftv.v;
                if (obj2 != hw1) {
                    e76 = e76.R(ftv.v, new ftv(ftv.R, ((ftv) e76.get(obj2)).v));
                }
                Object obj3 = ftv.R;
                Object obj4 = !(obj3 != hw1) ? ftv.v : g1k.f3650R;
                if (ftv.v != hw1) {
                    z = true;
                }
                if (z) {
                    obj3 = g1k.v;
                }
                g1k = new g1k(obj4, obj3, e76);
            }
            if (gdl == g1k) {
                return;
            }
        } while (!ivw.x(gdl, g1k));
    }

    public static fbt x(iv7 iv7) {
        h5 h5Var = jwU.f5149R;
        jwU.e(nqF.m);
        synchronized (jwU.f5150R) {
            jwU.f5151R.add(iv7);
        }
        return new fbt((k8G) iv7, 0);
    }

    public void L(float f, float f2, float f3, okT okt) {
        okt.c(f, 0.0f);
    }

    public boolean O() {
        return this instanceof cyq;
    }

    @Override // defpackage.ovy
    public void R(lRG lrg, boolean z) {
    }

    public int X() {
        switch (this.e) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }

    public k_s Z() {
        switch (this.e) {
            case 7:
                return oey.f6871R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return ceM.f2167R;
            default:
                return lqA.f5842R;
        }
    }

    @Override // defpackage.ovy
    public boolean e(lRG lrg) {
        return false;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ift(int i, int i2) {
        this(29);
        this.e = i;
        switch (i) {
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case VmNativeCallback.$stable:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
            default:
                this(1);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                return;
        }
    }
}
