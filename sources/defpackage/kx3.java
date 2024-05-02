package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

@mEz("fragment")
/* renamed from: kx3  reason: default package */
/* loaded from: classes.dex */
public class kx3 extends jFk {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f5522R;

    /* renamed from: R  reason: collision with other field name */
    public final hAW f5523R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f5524R = new LinkedHashSet();

    public kx3(Context context, hAW haw, int i) {
        this.f5522R = context;
        this.f5523R = haw;
        this.R = i;
    }

    public final KP H(j5B j5b, ixU ixu) {
        Bundle bundle = j5b.f4820R;
        String str = ((eiV) j5b.f4822R).e;
        if (str != null) {
            int i = 0;
            if (str.charAt(0) == '.') {
                str = this.f5522R.getPackageName() + str;
            }
            aLv A = this.f5523R.A();
            this.f5522R.getClassLoader();
            pm2 R = A.R(str);
            R.B(bundle);
            hAW haw = this.f5523R;
            haw.getClass();
            KP kp = new KP(haw);
            int i2 = ixu != null ? ixu.v : -1;
            int i3 = ixu != null ? ixu.c : -1;
            int i4 = ixu != null ? ixu.e : -1;
            int i5 = ixu != null ? ixu.X : -1;
            if (!(i2 == -1 && i3 == -1 && i4 == -1 && i5 == -1)) {
                if (i2 == -1) {
                    i2 = 0;
                }
                if (i3 == -1) {
                    i3 = 0;
                }
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i5 != -1) {
                    i = i5;
                }
                kp.R = i2;
                kp.v = i3;
                kp.c = i4;
                kp.e = i;
            }
            int i6 = this.R;
            if (i6 != 0) {
                kp.X(i6, R, null, 2);
                kp.L(R);
                kp.f255c = true;
                return kp;
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }

    @Override // defpackage.jFk
    public final void L(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f5524R.clear();
            s3.E(stringArrayList, this.f5524R);
        }
    }

    @Override // defpackage.jFk
    public final void O(j5B j5b) {
        if (this.f5523R.p()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        KP H = H(j5b, null);
        if (((List) v().R.getValue()).size() > 1) {
            hAW haw = this.f5523R;
            String str = j5b.f4826R;
            haw.getClass();
            haw.o(new oyF(haw, str, -1), false);
            String str2 = j5b.f4826R;
            if (H.f259v) {
                H.f252R = true;
                H.f250R = str2;
            } else {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
        }
        H.e(false);
        v().v(j5b);
    }

    @Override // defpackage.jFk
    public final e9E R() {
        return new eiV(this);
    }

    @Override // defpackage.jFk
    public final Bundle Z() {
        if (this.f5524R.isEmpty()) {
            return null;
        }
        return hDC.X(new kSh("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f5524R)));
    }

    @Override // defpackage.jFk
    public final void e(List list, ixU ixu) {
        if (this.f5523R.p()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j5B j5b = (j5B) it.next();
            boolean isEmpty = ((List) v().R.getValue()).isEmpty();
            if (ixu != null && !isEmpty && ixu.f4781v && this.f5524R.remove(j5b.f4826R)) {
                hAW haw = this.f5523R;
                String str = j5b.f4826R;
                haw.getClass();
                haw.o(new oPm(haw, str, 0), false);
                v().X(j5b);
            } else {
                KP H = H(j5b, ixu);
                if (!isEmpty) {
                    String str2 = j5b.f4826R;
                    if (H.f259v) {
                        H.f252R = true;
                        H.f250R = str2;
                    } else {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                }
                H.e(false);
                v().X(j5b);
            }
        }
    }

    @Override // defpackage.jFk
    public final void m(j5B j5b, boolean z) {
        if (this.f5523R.p()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z) {
            List list = (List) v().R.getValue();
            j5B j5b2 = (j5B) dF.b(list);
            for (j5B j5b3 : dF.xN(list.subList(list.indexOf(j5b), list.size()))) {
                if (n3x.v(j5b3, j5b2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + j5b3);
                } else {
                    hAW haw = this.f5523R;
                    String str = j5b3.f4826R;
                    haw.getClass();
                    haw.o(new oPm(haw, str, 1), false);
                    this.f5524R.add(j5b3.f4826R);
                }
            }
        } else {
            hAW haw2 = this.f5523R;
            String str2 = j5b.f4826R;
            haw2.getClass();
            haw2.o(new oyF(haw2, str2, -1), false);
        }
        v().c(j5b, z);
    }
}
