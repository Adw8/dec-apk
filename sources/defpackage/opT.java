package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: opT  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class opT {
    public static StringBuilder C(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static String H(String str, String str2) {
        return str + str2;
    }

    public static hm8 L(Class cls, String str, String str2, int i, j3H j3h) {
        hm8 hm8 = new hm8(cls, str, str2, i);
        j3h.getClass();
        return hm8;
    }

    public static /* synthetic */ Iterator N() {
        try {
            return Arrays.asList(new YI()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static int O(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static final void R(int i, View view) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (hAW.W(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            } else if (i2 == 1) {
                if (hAW.W(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                view.setVisibility(0);
            } else if (i2 == 2) {
                if (hAW.W(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
            } else if (i2 == 3) {
                if (hAW.W(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        } else {
            throw null;
        }
    }

    public static StringBuilder U(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ String V(int i) {
        return i == 1 ? "NONE" : i == 2 ? "ADDING" : i == 3 ? "REMOVING" : "null";
    }

    public static int X(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static String Z(String str, int i) {
        return str + i;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return v(view.getVisibility());
    }

    public static int e(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static /* synthetic */ String g(int i) {
        return i == 1 ? "INVARIANT" : i == 2 ? "IN" : i == 3 ? "OUT" : "null";
    }

    public static /* synthetic */ String i(int i) {
        return i == 1 ? "RUN_AS_NON_EXPEDITED_WORK_REQUEST" : i == 2 ? "DROP_WORK_REQUEST" : "null";
    }

    public static /* synthetic */ String j(int i) {
        return i == 1 ? "BEGIN_ARRAY" : i == 2 ? "END_ARRAY" : i == 3 ? "BEGIN_OBJECT" : i == 4 ? "END_OBJECT" : i == 5 ? "NAME" : i == 6 ? "STRING" : i == 7 ? "NUMBER" : i == 8 ? "BOOLEAN" : i == 9 ? "NULL" : i == 10 ? "END_DOCUMENT" : "null";
    }

    public static String m(String str, int i, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String o(int i) {
        return i == 1 ? "REMOVED" : i == 2 ? "VISIBLE" : i == 3 ? "GONE" : i == 4 ? "INVISIBLE" : "null";
    }

    public static /* synthetic */ String t(int i) {
        return i == 1 ? "InMeasureBlock" : i == 2 ? "InLayoutBlock" : i == 3 ? "NotUsed" : "null";
    }

    public static int v(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(Z("Unknown visibility ", i));
    }

    public static String x(String str, long j) {
        return str + j;
    }

    public static /* synthetic */ String y(int i) {
        return i == 1 ? "Measuring" : i == 2 ? "LookaheadMeasuring" : i == 3 ? "LayingOut" : i == 4 ? "LookaheadLayingOut" : i == 5 ? "Idle" : "null";
    }

    public abstract void P();
}
