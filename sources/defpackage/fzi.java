package defpackage;

import android.graphics.PathMeasure;
import android.os.Looper;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: fzi  reason: default package */
/* loaded from: classes.dex */
public final class fzi extends k8G implements f_c {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f3644X;
    public static final fzi R = new fzi(0);
    public static final fzi v = new fzi(1);
    public static final fzi c = new fzi(2);
    public static final fzi e = new fzi(3);
    public static final fzi X = new fzi(4);
    public static final fzi O = new fzi(5);
    public static final fzi L = new fzi(6);
    public static final fzi Z = new fzi(7);
    public static final fzi m = new fzi(8);
    public static final fzi x = new fzi(9);
    public static final fzi H = new fzi(10);
    public static final fzi U = new fzi(11);
    public static final fzi C = new fzi(12);
    public static final fzi N = new fzi(13);
    public static final fzi P = new fzi(14);
    public static final fzi j = new fzi(15);
    public static final fzi g = new fzi(16);
    public static final fzi y = new fzi(17);
    public static final fzi t = new fzi(18);
    public static final fzi i = new fzi(19);
    public static final fzi V = new fzi(20);
    public static final fzi o = new fzi(22);
    public static final fzi K = new fzi(23);
    public static final fzi J = new fzi(24);
    public static final fzi Y = new fzi(25);
    public static final fzi h = new fzi(26);
    public static final fzi I = new fzi(27);
    public static final fzi u = new fzi(28);
    public static final fzi z = new fzi(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzi(int i2) {
        super(0);
        this.f3644X = i2;
    }

    @Override // defpackage.f_c
    public final Object g() {
        int i2 = this.f3644X;
        switch (i2) {
            case 0:
                return null;
            case 1:
                return c4a.R;
            case 2:
                return new oC2();
            case 3:
                return o8s.R;
            case 4:
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                switch (i2) {
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        return Boolean.FALSE;
                    default:
                        return Boolean.TRUE;
                }
            case 6:
                return new klw();
            case 7:
            case VmNativeCallback.$stable:
            case 9:
                return null;
            case 10:
                return ei2.R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return o0P.R;
            case 12:
                return _1.c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 536870911);
            case 13:
                return new n3(n3.v);
            case 14:
                return null;
            case 15:
                return new eG1();
            case 16:
                return new hoI((float) 0);
            case 17:
                return kMk.R;
            case 18:
                switch (i2) {
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        return Boolean.FALSE;
                    default:
                        return Boolean.TRUE;
                }
            case 19:
                return new c_P();
            case 20:
                return "DEFAULT_TEST_TAG";
            case 21:
                return Looper.getMainLooper() != null ? jlG.f5013R : nz_.R;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return null;
            case 28:
                return new zX(new PathMeasure());
            default:
                return o8s.R;
        }
    }
}
