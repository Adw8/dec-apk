package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.Iterator;

/* renamed from: q4  reason: default package */
/* loaded from: classes.dex */
public final class q4 extends k8G implements f_c {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(int i, Object obj) {
        super(0);
        this.X = i;
        this.R = obj;
    }

    public final jy_ R() {
        switch (this.X) {
            case 9:
                return ((lh8) this.R).f5804R;
            default:
                int i = gyU.e;
                return ((gyU) this.R).U();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff A[LOOP:3: B:53:0x00f9->B:55:0x00ff, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.c():void");
    }

    @Override // defpackage.f_c
    public final Object g() {
        Object obj = null;
        switch (this.X) {
            case 0:
                return v();
            case 1:
                return new gx6((e9w) this.R, iia.R);
            case 2:
                return ((kY5) this.R).c();
            case 3:
                return new ceM((nLK) this.R, 0.0f);
            case 4:
                c();
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return v();
            case 6:
                c();
                return o8s.R;
            case 7:
                c();
                return o8s.R;
            case VmNativeCallback.$stable:
                c();
                return o8s.R;
            case 9:
                return R();
            case 10:
                return R();
            case lVo.HKDF_SALT_FIELD_NUMBER:
                c();
                return o8s.R;
            case 12:
                c();
                return o8s.R;
            case 13:
                c();
                return o8s.R;
            case 14:
                c();
                return o8s.R;
            case 15:
                c();
                return o8s.R;
            case 16:
                c();
                return o8s.R;
            case 17:
                c();
                return o8s.R;
            case 18:
                return new mX0(((lz) this.R).f5875R.f768R.getTextLocale(), ((lz) this.R).f5879R.Z());
            case 19:
                return new hky(((nUF) this.R).f6399R);
            case 20:
                return new BaseInputConnection(((egg) this.R).R, false);
            case 21:
                c();
                return o8s.R;
            case 22:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                View typedView$ui_release = ((gJ8) ((eGS) this.R).R).getTypedView$ui_release();
                if (typedView$ui_release != null) {
                    typedView$ui_release.saveHierarchyState(sparseArray);
                }
                return sparseArray;
            case 23:
                c();
                return o8s.R;
            case 24:
                return v();
            case 25:
                return mxC.P((ly1) this.R);
            case 26:
                n4N n4n = (n4N) this.R;
                dq7 dq7 = n4n instanceof dq7 ? (dq7) n4n : null;
                if (dq7 != null) {
                    return (Integer) dq7.f2898R.getValue();
                }
                return null;
            case 27:
                KM km = (KM) this.R;
                return opT.H(km.f247R, km.v);
            case 28:
                k0v a = iOY.a(dF.a(((h4N) this.R).f4040R.L().L()), h6d.R);
                h4N h4n = (h4N) this.R;
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    jMO jmo = (jMO) next;
                    if (jmo.R.R <= ((Number) h4n.f4038R.J(h4n, jmo)).intValue()) {
                        obj = next;
                    }
                }
                return (jMO) obj;
            default:
                return new Ea(((gcd) this.R).f3807R.v(oBR.R));
        }
    }

    public final Boolean v() {
        boolean z = true;
        switch (this.X) {
            case 0:
                ViewParent parent = ((View) this.R).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        return Boolean.valueOf(z);
                    }
                    parent = viewGroup.getParent();
                }
                z = false;
                return Boolean.valueOf(z);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                if (((oOe) ((gv2) this.R).f3984R.getValue()) == null || ((ltH) ((gv2) this.R).f3987v.getValue()) == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (((bkb) this.R).getParentLayoutCoordinates() == null || ((bkb) this.R).m9getPopupContentSizebOM6tXw() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
