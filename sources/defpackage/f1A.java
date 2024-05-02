package defpackage;

import android.view.View;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.WeakHashMap;

/* renamed from: f1A  reason: default package */
/* loaded from: classes.dex */
public final class f1A {
    public final /* synthetic */ int R;

    public /* synthetic */ f1A(int i) {
        this.R = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List R(defpackage.mdh r21, int r22, defpackage.mdh r23, boolean r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1A.R(mdh, int, mdh, boolean, boolean):java.util.List");
    }

    public static mQD X(kef kef, d5M d5m, gXZ gxz, djV djv, deW dew, deW dew2) {
        nWW nww = new nWW();
        ofd ofd = new ofd(gxz, dew, nww, 9);
        egg egg = (egg) kef.R;
        egg.f3179R = true;
        egg.f3173R = d5m;
        egg.f3174R = djv;
        egg.f3176R = ofd;
        egg.v = dew2;
        egg.f3178R.e(dx5.StartInput);
        mQD mqd = new mQD(kef, kef.R);
        kef.f5384R.set(mqd);
        nww.R = mqd;
        return mqd;
    }

    public static final dq8 c(int i, String str) {
        WeakHashMap weakHashMap = kHc.R;
        return new dq8(new g2o(0, 0, 0, 0), str);
    }

    public static kHc e(m88 m88) {
        kHc khc;
        jr_ jr_ = (jr_) m88;
        jr_.w(-1366542614);
        View view = (View) jr_.x(ur.X);
        WeakHashMap weakHashMap = kHc.R;
        synchronized (weakHashMap) {
            Object obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new kHc(view);
                weakHashMap.put(view, obj);
            }
            khc = (kHc) obj;
        }
        caw.v(khc, new V4(khc, 5, view), jr_);
        jr_.g(false);
        return khc;
    }

    public static final y3 v(int i, String str) {
        WeakHashMap weakHashMap = kHc.R;
        return new y3(i, str);
    }

    public final String toString() {
        switch (this.R) {
            case 14:
                return "Empty";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1A(int i, int i2) {
        this(29);
        this.R = i;
        switch (i) {
            case 2:
                this(2);
                return;
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
            default:
                this(1);
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
                this(19);
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
