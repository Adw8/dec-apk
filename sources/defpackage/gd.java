package defpackage;

import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
public final class gd extends G5 {
    public static final int[] R = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: R  reason: collision with other field name */
    public S1 f3810R;

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityManager f3813R;

    /* renamed from: R  reason: collision with other field name */
    public final AndroidComposeView f3814R;

    /* renamed from: R  reason: collision with other field name */
    public Integer f3816R;

    /* renamed from: R  reason: collision with other field name */
    public Map f3819R;

    /* renamed from: R  reason: collision with other field name */
    public p3 f3823R;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3827v;

    /* renamed from: R  reason: collision with other field name */
    public int f3808R = Integer.MIN_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f3812R = new Handler(Looper.getMainLooper());

    /* renamed from: R  reason: collision with other field name */
    public Zz f3811R = new Zz(new AH(this));
    public int v = Integer.MIN_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public eSi f3815R = new eSi();

    /* renamed from: v  reason: collision with other field name */
    public eSi f3826v = new eSi();
    public int c = -1;

    /* renamed from: R  reason: collision with other field name */
    public final L5 f3809R = new L5();

    /* renamed from: R  reason: collision with other field name */
    public final nJ f3822R = jjU.R(-1, null, 6);

    /* renamed from: R  reason: collision with other field name */
    public boolean f3824R = true;

    /* renamed from: v  reason: collision with other field name */
    public L5 f3825v = new L5();

    /* renamed from: R  reason: collision with other field name */
    public LinkedHashMap f3818R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final mBn f3820R = new mBn(6, this);

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3817R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final mox f3821R = new mox(4, this);

    public gd(AndroidComposeView androidComposeView) {
        this.f3814R = androidComposeView;
        this.f3813R = (AccessibilityManager) androidComposeView.getContext().getSystemService("accessibility");
        iia iia = iia.R;
        this.f3819R = iia;
        this.f3823R = new p3(androidComposeView.getSemanticsOwner().R(), iia);
        androidComposeView.addOnAttachStateChangeListener(new V1(2, this));
    }

    public static final boolean J(aD4 ad4) {
        return (((Number) ad4.R.g()).floatValue() < ((Number) ad4.v.g()).floatValue() && !ad4.f793R) || (((Number) ad4.R.g()).floatValue() > 0.0f && ad4.f793R);
    }

    public static final boolean K(aD4 ad4) {
        return (((Number) ad4.R.g()).floatValue() > 0.0f && !ad4.f793R) || (((Number) ad4.R.g()).floatValue() < ((Number) ad4.v.g()).floatValue() && ad4.f793R);
    }

    public static final boolean V(aD4 ad4, float f) {
        return (f < 0.0f && ((Number) ad4.R.g()).floatValue() > 0.0f) || (f > 0.0f && ((Number) ad4.R.g()).floatValue() < ((Number) ad4.v.g()).floatValue());
    }

    public static CharSequence d(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        return charSequence.subSequence(0, i);
    }

    public static String g(oIb oib) {
        bz bzVar;
        if (oib == null) {
            return null;
        }
        kEW kew = oib.f6738R;
        b_t b_t = dwC.R;
        if (kew.R(b_t)) {
            return n1P.C((List) oib.f6738R.v(b_t));
        }
        if (g4x.h(oib)) {
            bz y = y(oib.f6738R);
            if (y != null) {
                return y.R;
            }
            return null;
        }
        List list = (List) gvP.i(oib.f6738R, dwC.t);
        if (list == null || (bzVar = (bz) dF.w(list)) == null) {
            return null;
        }
        return bzVar.R;
    }

    public static final float o(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public static /* synthetic */ void u(gd gdVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        gdVar.I(i, i2, num, null);
    }

    public static bz y(kEW kew) {
        return (bz) gvP.i(kew, dwC.i);
    }

    public final void A(fue fue, L5 l5) {
        fue J;
        hUv l;
        if (fue.K() && !this.f3814R.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(fue)) {
            hUv l2 = aH9.l(fue);
            if (l2 == null) {
                fue J2 = g4x.J(fue, lBz.V);
                l2 = J2 != null ? aH9.l(J2) : null;
                if (l2 == null) {
                    return;
                }
            }
            if (!(msU.h(l2).f5221R || (J = g4x.J(fue, lBz.i)) == null || (l = aH9.l(J)) == null)) {
                l2 = l;
            }
            int i = msU.vz(l2).e;
            if (l5.add(Integer.valueOf(i))) {
                u(this, Y(i), 2048, 1, 8);
            }
        }
    }

    public final AccessibilityEvent C(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent U = U(i, 8192);
        if (num != null) {
            U.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            U.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            U.setItemCount(num3.intValue());
        }
        if (str != null) {
            U.getText().add(str);
        }
        return U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(int r9, long r10, boolean r12) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd.H(int, long, boolean):boolean");
    }

    public final boolean I(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !t()) {
            return false;
        }
        AccessibilityEvent U = U(i, i2);
        if (num != null) {
            U.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            U.setContentDescription(n1P.C(list));
        }
        return h(U);
    }

    public final int N(oIb oib) {
        if (!oib.f6738R.R(dwC.R)) {
            kEW kew = oib.f6738R;
            b_t b_t = dwC.V;
            if (kew.R(b_t)) {
                return odN.c(((odN) oib.f6738R.v(b_t)).f6859R);
            }
        }
        return this.c;
    }

    public final int P(oIb oib) {
        if (!oib.f6738R.R(dwC.R)) {
            kEW kew = oib.f6738R;
            b_t b_t = dwC.V;
            if (kew.R(b_t)) {
                return (int) (((odN) oib.f6738R.v(b_t)).f6859R >> 32);
            }
        }
        return this.c;
    }

    public final void Q(oIb oib, p3 p3Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List X = oib.X(false);
        int size = X.size();
        for (int i = 0; i < size; i++) {
            oIb oib2 = (oIb) X.get(i);
            if (j().containsKey(Integer.valueOf(oib2.R))) {
                if (!p3Var.R.contains(Integer.valueOf(oib2.R))) {
                    i(oib.f6736R);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(oib2.R));
            }
        }
        for (Number number : p3Var.R) {
            if (!linkedHashSet.contains(Integer.valueOf(number.intValue()))) {
                i(oib.f6736R);
                return;
            }
        }
        List X2 = oib.X(false);
        int size2 = X2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            oIb oib3 = (oIb) X2.get(i2);
            if (j().containsKey(Integer.valueOf(oib3.R))) {
                Q(oib3, (p3) this.f3818R.get(Integer.valueOf(oib3.R)));
            }
        }
    }

    public final boolean S(oIb oib, int i, int i2, boolean z) {
        String g;
        kEW kew = oib.f6738R;
        b_t b_t = jGN.L;
        boolean z2 = false;
        if (kew.R(b_t) && g4x.H(oib)) {
            lR3 lr3 = (lR3) ((Tp) oib.f6738R.v(b_t)).R;
            if (lr3 != null) {
                return ((Boolean) lr3.y(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.c) || (g = g(oib)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > g.length()) {
                i = -1;
            }
            this.c = i;
            if (g.length() > 0) {
                z2 = true;
            }
            int Y = Y(oib.R);
            Integer num = null;
            Integer valueOf = z2 ? Integer.valueOf(this.c) : null;
            Integer valueOf2 = z2 ? Integer.valueOf(this.c) : null;
            if (z2) {
                num = Integer.valueOf(g.length());
            }
            h(C(Y, valueOf, valueOf2, num, g));
            n(oib.R);
            return true;
        }
    }

    public final AccessibilityEvent U(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f3814R.getContext().getPackageName());
        obtain.setSource(this.f3814R, i);
        bNN bnn = (bNN) j().get(Integer.valueOf(i));
        if (bnn != null) {
            obtain.setPassword(bnn.f1612R.O().R(dwC.Y));
        }
        return obtain;
    }

    public final void W(int i) {
        int i2 = this.f3808R;
        if (i2 != i) {
            this.f3808R = i;
            u(this, i, 128, null, 12);
            u(this, i2, 256, null, 12);
        }
    }

    public final int Y(int i) {
        if (i == this.f3814R.getSemanticsOwner().R().R) {
            return -1;
        }
        return i;
    }

    public final boolean h(AccessibilityEvent accessibilityEvent) {
        if (!t()) {
            return false;
        }
        return this.f3814R.getParent().requestSendAccessibilityEvent(this.f3814R, accessibilityEvent);
    }

    public final void i(fue fue) {
        if (this.f3809R.add(fue)) {
            this.f3822R.e(o8s.R);
        }
    }

    public final Map j() {
        if (this.f3824R) {
            oIb R2 = this.f3814R.getSemanticsOwner().R();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            fue fue = R2.f6736R;
            if (fue.f3608X && fue.K()) {
                Region region = new Region();
                region.set(ooA.o(R2.e()));
                g4x.Y(region, R2, linkedHashMap, R2);
            }
            this.f3819R = linkedHashMap;
            this.f3824R = false;
        }
        return this.f3819R;
    }

    public final void n(int i) {
        S1 s1 = this.f3810R;
        if (s1 != null) {
            if (i == s1.f502R.R) {
                if (SystemClock.uptimeMillis() - s1.f501R <= 1000) {
                    AccessibilityEvent U = U(Y(s1.f502R.R), 131072);
                    U.setFromIndex(s1.c);
                    U.setToIndex(s1.e);
                    U.setAction(s1.R);
                    U.setMovementGranularity(s1.v);
                    U.getText().add(g(s1.f502R));
                    h(U);
                }
            } else {
                return;
            }
        }
        this.f3810R = null;
    }

    public final boolean t() {
        return this.f3813R.isEnabled() && this.f3813R.isTouchExplorationEnabled();
    }

    @Override // defpackage.G5
    public final Zz v(View view) {
        return this.f3811R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:22:0x004e, B:23:0x005d, B:26:0x006c, B:28:0x0074, B:30:0x007d, B:32:0x0084, B:33:0x0092, B:35:0x0099, B:36:0x00a2), top: B:45:0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(defpackage.aOO r10) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd.x(aOO):java.lang.Object");
    }

    public final void z(int i, int i2, String str) {
        AccessibilityEvent U = U(Y(i), 32);
        U.setContentChangeTypes(i2);
        if (str != null) {
            U.getText().add(str);
        }
        h(U);
    }
}
