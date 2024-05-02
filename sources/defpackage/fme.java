package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.LinkedHashMap;

/* renamed from: fme  reason: default package */
/* loaded from: classes.dex */
public final class fme extends k8G implements f_c {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f3560X;
    public static final fme R = new fme(0);
    public static final fme v = new fme(1);
    public static final fme c = new fme(2);
    public static final fme e = new fme(3);
    public static final fme X = new fme(5);
    public static final fme O = new fme(6);
    public static final fme L = new fme(7);
    public static final fme Z = new fme(8);
    public static final fme m = new fme(9);
    public static final fme x = new fme(10);
    public static final fme H = new fme(11);
    public static final fme U = new fme(12);
    public static final fme C = new fme(13);
    public static final fme N = new fme(14);
    public static final fme P = new fme(15);
    public static final fme j = new fme(16);
    public static final fme g = new fme(17);
    public static final fme y = new fme(18);
    public static final fme t = new fme(19);
    public static final fme i = new fme(20);
    public static final fme V = new fme(21);
    public static final fme o = new fme(22);
    public static final fme K = new fme(23);
    public static final fme J = new fme(24);
    public static final fme Y = new fme(25);
    public static final fme h = new fme(26);
    public static final fme I = new fme(27);
    public static final fme u = new fme(28);
    public static final fme z = new fme(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fme(int i2) {
        super(0);
        this.f3560X = i2;
    }

    public final fue R() {
        switch (this.f3560X) {
            case 4:
                return new fue(2, true, 0);
            default:
                return new fue(3, false, 0);
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        Choreographer choreographer;
        switch (this.f3560X) {
            case 0:
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                return R();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new LinkedHashMap();
            case 6:
                return R();
            case 7:
                ur.v("LocalConfiguration");
                throw null;
            case VmNativeCallback.$stable:
                ur.v("LocalContext");
                throw null;
            case 9:
                ur.v("LocalImageVectorCache");
                throw null;
            case 10:
                ur.v("LocalLifecycleOwner");
                throw null;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                ur.v("LocalSavedStateRegistryOwner");
                throw null;
            case 12:
                ur.v("LocalView");
                throw null;
            case 13:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    h8R h8r = iFn.R;
                    choreographer = (Choreographer) l6.T(hJr.R, new cL(null));
                }
                hk hkVar = new hk(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return jjU.t(hkVar, hkVar.f4363R);
            case 14:
            case 15:
                return null;
            case 16:
                lnF.v("LocalAutofillTree");
                throw null;
            case 17:
                lnF.v("LocalClipboardManager");
                throw null;
            case 18:
                lnF.v("LocalDensity");
                throw null;
            case 19:
                lnF.v("LocalFocusManager");
                throw null;
            case 20:
                lnF.v("LocalFontFamilyResolver");
                throw null;
            case 21:
                lnF.v("LocalFontLoader");
                throw null;
            case 22:
                lnF.v("LocalHapticFeedback");
                throw null;
            case 23:
                lnF.v("LocalInputManager");
                throw null;
            case 24:
                lnF.v("LocalLayoutDirection");
                throw null;
            case 25:
            case 26:
                return null;
            case 27:
                lnF.v("LocalTextToolbar");
                throw null;
            case 28:
                lnF.v("LocalUriHandler");
                throw null;
            default:
                lnF.v("LocalViewConfiguration");
                throw null;
        }
    }
}
