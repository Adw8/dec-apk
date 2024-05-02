package defpackage;

import android.content.Context;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.security.SecureRandom;

/* renamed from: mY_  reason: default package */
/* loaded from: classes.dex */
public final class mY_ extends k8G implements f_c {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f6059X;
    public static final mY_ R = new mY_(0);
    public static final mY_ v = new mY_(1);
    public static final mY_ c = new mY_(3);
    public static final mY_ e = new mY_(4);
    public static final mY_ X = new mY_(5);
    public static final mY_ O = new mY_(6);
    public static final mY_ L = new mY_(7);
    public static final mY_ Z = new mY_(8);
    public static final mY_ m = new mY_(9);
    public static final mY_ x = new mY_(10);
    public static final mY_ H = new mY_(11);
    public static final mY_ U = new mY_(12);
    public static final mY_ C = new mY_(13);
    public static final mY_ N = new mY_(14);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mY_(int i) {
        super(0);
        this.f6059X = i;
    }

    public final bd4 R() {
        switch (this.f6059X) {
            case 12:
                return ppN.N(new String[0]);
            case 13:
                throw new IllegalStateException("trailers not available".toString());
            default:
                throw new IllegalStateException("trailers not available".toString());
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        boolean z = false;
        switch (this.f6059X) {
            case 0:
                lnF.v("LocalWindowInfo");
                throw null;
            case 1:
                return v();
            case 2:
                return v();
            case 3:
                return null;
            case 4:
                long j = gaA.e;
                if (j != n3.O) {
                    z = true;
                }
                return z ? new y8(j) : kVu.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return o8s.R;
            case 6:
                return "DEFAULT_TEST_TAG";
            case 7:
                return o8s.R;
            case VmNativeCallback.$stable:
                cH4 ch4 = new cH4(null);
                if (ch4.f2053R == null) {
                    Context context = ch4.R;
                    ch4.f2053R = context == null ? null : context.getSharedPreferences(ch4.v, 0);
                }
                ch4.R = null;
                return new mkC(ch4);
            case 9:
                return Y5.v ? SecureRandom.getInstanceStrong() : new SecureRandom();
            case 10:
                return v();
            case lVo.HKDF_SALT_FIELD_NUMBER:
                return null;
            case 12:
                return R();
            case 13:
                return R();
            default:
                return R();
        }
    }

    public final Boolean v() {
        switch (this.f6059X) {
            case 1:
                return Boolean.FALSE;
            case 2:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }
}
