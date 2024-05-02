package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: dq  reason: default package */
/* loaded from: classes.dex */
public class dq implements l9F, wg, bS6, e86, j7x, kN5, g79, j5I, iET, e38, lFL, gLy, aFp {

    /* renamed from: e  reason: collision with other field name */
    public static dq f2887e;

    /* renamed from: v  reason: collision with other field name */
    public static final dq f2889v = new dq();
    public static final Y6 R = new Y6(-1.0f, -1.0f);
    public static final Y6 v = new Y6(0.0f, -1.0f);
    public static final Y6 c = new Y6(1.0f, -1.0f);
    public static final Y6 e = new Y6(-1.0f, 0.0f);
    public static final Y6 X = new Y6(0.0f, 0.0f);
    public static final Y6 O = new Y6(1.0f, 0.0f);
    public static final Y6 L = new Y6(0.0f, 1.0f);

    /* renamed from: R  reason: collision with other field name */
    public static final ky f2879R = new ky(-1.0f);

    /* renamed from: v  reason: collision with other field name */
    public static final ky f2891v = new ky(0.0f);

    /* renamed from: c  reason: collision with other field name */
    public static final ky f2885c = new ky(1.0f);

    /* renamed from: R  reason: collision with other field name */
    public static final vV f2881R = new vV(-1.0f);

    /* renamed from: v  reason: collision with other field name */
    public static final vV f2893v = new vV(0.0f);

    /* renamed from: c  reason: collision with other field name */
    public static final vV f2886c = new vV(1.0f);

    /* renamed from: R  reason: collision with other field name */
    public static final kfk f2878R = new kfk(4);

    /* renamed from: v  reason: collision with other field name */
    public static final kfk f2890v = new kfk(5);

    /* renamed from: c  reason: collision with other field name */
    public static final /* synthetic */ dq f2883c = new dq();

    /* renamed from: X  reason: collision with other field name */
    public static final /* synthetic */ dq f2882X = new dq();

    /* renamed from: O  reason: collision with other field name */
    public static final /* synthetic */ dq f2877O = new dq();

    /* renamed from: L  reason: collision with other field name */
    public static final dq f2876L = new dq();
    public static final dq Z = new dq();
    public static final dq m = new dq();
    public static final dq x = new dq();

    /* renamed from: c  reason: collision with other field name */
    public static final kfk f2884c = new kfk(0);

    /* renamed from: e  reason: collision with other field name */
    public static final kfk f2888e = new kfk(4);

    /* renamed from: R  reason: collision with other field name */
    public static final mtB f2880R = new mtB(0);

    /* renamed from: v  reason: collision with other field name */
    public static final mtB f2892v = new mtB(1);
    public static final dq H = new dq();
    public static final dq U = new dq();
    public static final /* synthetic */ dq C = new dq();
    public static final /* synthetic */ dq N = new dq();

    static {
        new kfk(2);
        new kfk(3);
        new kfk(1);
    }

    public /* synthetic */ dq() {
    }

    public static final boolean C() {
        Class cls = AndroidComposeView.R;
        try {
            if (AndroidComposeView.R == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                AndroidComposeView.R = cls2;
                AndroidComposeView.f1183R = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = AndroidComposeView.f1183R;
            Boolean bool = null;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            if (invoke instanceof Boolean) {
                bool = (Boolean) invoke;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0080, code lost:
        if (r11 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x007c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean K(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq.K(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static float N(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static int P(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(opT.m("Can't represent a size of ", i, " in Constraints"));
    }

    public static final long U(iRR irr, long j, mCa mca) {
        if (irr.f4590R.f4165R.length() == 0) {
            return odN.v;
        }
        int A = iH_.A(irr.f4590R.f4165R);
        int i = odN.R;
        long j2 = ((odN) mca.x(Integer.valueOf(caw.x((int) (j >> 32), 0, A)))).f6859R;
        long j3 = ((odN) mca.x(Integer.valueOf(caw.x(odN.c(j), 0, A)))).f6859R;
        return dtx.e(odN.O(j) ? odN.c(j2) : (int) (j2 >> 32), odN.O(j) ? (int) (j3 >> 32) : odN.c(j3));
    }

    public static boolean Y(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static long g(int i, int i2, int i3, int i4) {
        long j;
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int P = P(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int P2 = P(i6);
        if (P + P2 <= 31) {
            if (P2 == 13) {
                j = 3;
            } else if (P2 == 18) {
                j = 1;
            } else if (P2 == 15) {
                j = 2;
            } else if (P2 == 16) {
                j = 0;
            } else {
                throw new IllegalStateException("Should only have the provided constants.");
            }
            int i7 = 0;
            int i8 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            if (i4 != Integer.MAX_VALUE) {
                i7 = i4 + 1;
            }
            int i9 = oys.R[(int) j];
            return (((long) i8) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i7) << (i9 + 31));
        }
        throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
    }

    public static boolean j(double d, kg9 kg9, kg9 kg92) {
        return Math.abs(((Number) kg9.x(Double.valueOf(d))).doubleValue() - ((Number) kg92.x(Double.valueOf(d))).doubleValue()) <= 0.001d;
    }

    public static long t(int i) {
        if (i >= 0) {
            return g(i, i, 0, Integer.MAX_VALUE);
        }
        throw new IllegalArgumentException(opT.m("width(", i, ") must be >= 0").toString());
    }

    public static nmx y(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    if (obj != null) {
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return new nmx(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        } else if (bundle2 == null) {
            return new nmx();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
            return new nmx(hashMap);
        }
    }

    @Override // defpackage.aFp
    public Object H(IBinder iBinder) {
        int i = nJu.R;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof mVQ ? (mVQ) queryLocalInterface : new let(iBinder);
    }

    public void I(boolean z) {
    }

    public boolean J() {
        return false;
    }

    @Override // defpackage.g79
    public void L(lXr lxr, String str, Throwable th) {
    }

    @Override // defpackage.kN5
    public void O(ohT oht) {
        ((jDh) oht).v();
    }

    @Override // defpackage.wg
    public long R() {
        return System.currentTimeMillis();
    }

    public ProviderInfo V(ResolveInfo resolveInfo) {
        throw new IllegalStateException("Unable to get provider info prior to API 19");
    }

    @Override // defpackage.l9F
    public Object X(Object obj) {
        return obj.toString();
    }

    @Override // defpackage.j5I
    public boolean Z(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.j5I
    public void c(dMX dmx) {
        dmx.clear();
    }

    @Override // defpackage.lFL
    public int e(CharSequence charSequence, int i) {
        int i2 = i + 0;
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            m8j m8j = iRg.R;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 0;
            }
            i3 = 1;
        }
        return i3;
    }

    public List h(PackageManager packageManager, Intent intent) {
        return Collections.emptyList();
    }

    public InputFilter[] i(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    @Override // defpackage.wg
    public long m() {
        return SystemClock.elapsedRealtime();
    }

    public TransformationMethod n(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    public Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void u(boolean z) {
    }

    @Override // defpackage.bS6
    public Object v(bsy bsy) {
        return bsy.R.g();
    }

    @Override // defpackage.g79
    public void x(lXr lxr, String str, Object... objArr) {
    }

    public void z(h5 h5Var, float f) {
        miq miq = (miq) ((Drawable) h5Var.R);
        boolean useCompatPadding = ((l8) h5Var.v).getUseCompatPadding();
        boolean C2 = h5Var.C();
        if (!(f == miq.v && miq.f6133R == useCompatPadding && miq.f6135v == C2)) {
            miq.v = f;
            miq.f6133R = useCompatPadding;
            miq.f6135v = C2;
            miq.c(null);
            miq.invalidateSelf();
        }
        if (!((l8) h5Var.v).getUseCompatPadding()) {
            h5Var.K(0, 0, 0, 0);
            return;
        }
        miq miq2 = (miq) ((Drawable) h5Var.R);
        float f2 = miq2.v;
        float f3 = miq2.R;
        int ceil = (int) Math.ceil((double) lsR.R(f2, f3, h5Var.C()));
        int ceil2 = (int) Math.ceil((double) lsR.v(f2, f3, h5Var.C()));
        h5Var.K(ceil, ceil2, ceil, ceil2);
    }

    public /* synthetic */ dq(int i) {
    }

    public /* synthetic */ dq(Object obj) {
    }
}
