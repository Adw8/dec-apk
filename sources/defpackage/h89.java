package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewOverlay;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: h89  reason: default package */
/* loaded from: classes.dex */
public final class h89 implements hJT, ovy, Sz, aoz, RL, uE {
    public Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ h89(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    public final void C(Drawable drawable) {
        switch (this.e) {
            case 18:
                ((ViewGroupOverlay) this.R).remove(drawable);
                return;
            default:
                ((ViewOverlay) this.R).remove(drawable);
                return;
        }
    }

    public final Jd H(ProviderInfo providerInfo, PackageManager packageManager) {
        String str = providerInfo.authority;
        String str2 = providerInfo.packageName;
        Signature[] o = ((dq) this.R).o(packageManager, str2);
        ArrayList arrayList = new ArrayList();
        for (Signature signature : o) {
            arrayList.add(signature.toByteArray());
        }
        return new Jd(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
    }

    @Override // defpackage.aoz
    public final void L(int i, Object obj) {
        dTl.f2622R.L(i, obj);
        ((ProfileInstallReceiver) this.R).setResultCode(i);
    }

    public final gWM O() {
        return ((isJ) this.R).v();
    }

    @Override // defpackage.ovy
    public final void R(lRG lrg, boolean z) {
        if (lrg instanceof go1) {
            lrg.H().c(false);
        }
        ovy ovy = ((RR) this.R).f491R;
        if (ovy != null) {
            ovy.R(lrg, z);
        }
    }

    public final qN U(b0 b0Var) {
        csA X = ((imt) this.R).X(b0Var);
        ((imt) this.R).O(X);
        return ((imt) this.R).R(X);
    }

    @Override // defpackage.hJT
    public final void X(lRG lrg, MenuItem menuItem) {
        ((f5) this.R).f3290R.removeCallbacksAndMessages(lrg);
    }

    public final void Z(byte b) {
        ((Parcel) this.R).writeByte(b);
    }

    @Override // defpackage.RL
    public final boolean c(View view) {
        boolean z = false;
        if (!((SwipeDismissBehavior) this.R).t(view)) {
            return false;
        }
        WeakHashMap weakHashMap = of5.f6887R;
        boolean z2 = eHQ.e(view) == 1;
        int i = ((SwipeDismissBehavior) this.R).f2252R;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.R).getClass();
        return true;
    }

    @Override // defpackage.ovy
    public final boolean e(lRG lrg) {
        Object obj = this.R;
        if (lrg == ((RR) obj).f489R) {
            return false;
        }
        ((go1) lrg).v.getClass();
        ((RR) obj).getClass();
        ovy ovy = ((RR) this.R).f491R;
        if (ovy != null) {
            return ovy.e(lrg);
        }
        return false;
    }

    @Override // defpackage.hJT
    public final void g(lRG lrg, pce pce) {
        g2 g2Var = null;
        ((f5) this.R).f3290R.removeCallbacksAndMessages(null);
        int size = ((f5) this.R).f3300v.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lrg == ((g2) ((f5) this.R).f3300v.get(i)).f3654R) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < ((f5) this.R).f3300v.size()) {
                g2Var = (g2) ((f5) this.R).f3300v.get(i2);
            }
            ((f5) this.R).f3290R.postAtTime(new F8(this, g2Var, pce, lrg, 0), lrg, SystemClock.uptimeMillis() + 200);
        }
    }

    public final void m(float f) {
        ((Parcel) this.R).writeFloat(f);
    }

    public final String toString() {
        switch (this.e) {
            case 10:
                StringBuilder U = opT.U("ContentInfoCompat{");
                U.append((ContentInfo) this.R);
                U.append("}");
                return U.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.uE
    public final void v(Typeface typeface) {
        QL ql = (QL) this.R;
        if (ql.P(typeface)) {
            ql.m(false);
        }
    }

    public final void x(long j) {
        long v = eT9.v(j);
        byte b = 0;
        if (!lqt.R(v, 0)) {
            if (lqt.R(v, 4294967296L)) {
                b = 1;
            } else if (lqt.R(v, 8589934592L)) {
                b = 2;
            }
        }
        Z(b);
        if (!lqt.R(eT9.v(j), 0)) {
            m(eT9.c(j));
        }
    }

    public h89(n1P n1p) {
        this.e = 7;
        this.R = n1p;
    }

    public /* synthetic */ h89(pon pon) {
        this.e = 24;
    }

    public h89(ViewGroup viewGroup, int i) {
        this.e = 22;
        this.R = viewGroup.getOverlay();
    }

    public h89(ViewGroup viewGroup) {
        this.e = 18;
        this.R = viewGroup.getOverlay();
    }

    public h89(int i) {
        this.e = i;
        if (i == 6) {
            this.R = Parcel.obtain();
        } else if (i == 11) {
            this.R = new b1s();
        } else if (i != 27) {
            this.R = new W3();
        } else {
            this.R = new HashMap();
        }
    }

    public h89(TextView textView) {
        this.e = 15;
        if (textView != null) {
            this.R = new jrh(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public h89(opT opt) {
        this.e = 14;
        this.R = new k7G();
    }

    public h89(SwipeDismissBehavior swipeDismissBehavior) {
        this.e = 23;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.v = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.c = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f2252R = 0;
    }

    public h89(gWM gwm) {
        this.e = 11;
        this.R = new b1s(gwm);
    }
}
