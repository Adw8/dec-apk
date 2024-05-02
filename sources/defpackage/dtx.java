package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import dev.kdrag0n.virtcontainer.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: dtx  reason: default package */
/* loaded from: classes.dex */
public abstract class dtx implements j__ {
    public static long R;

    /* renamed from: R  reason: collision with other field name */
    public static Method f2906R;

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f2907R = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    /* renamed from: R  reason: collision with other field name */
    public static final c_x f2905R = new c_x(0, 0);

    public static final hh4 H(iuk iuk, bz bzVar) {
        ((hw1) iuk).getClass();
        return new hh4(bzVar, new c_x(bzVar.length(), bzVar.length()));
    }

    public static /* synthetic */ long J(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return K(i, i2, j);
    }

    public static final long K(int i, int i2, long j) {
        int x = oys.x(j) + i;
        int i3 = 0;
        if (x < 0) {
            x = 0;
        }
        int Z = oys.Z(j);
        if (Z != Integer.MAX_VALUE && (Z = Z + i) < 0) {
            Z = 0;
        }
        int m = oys.m(j) + i2;
        if (m < 0) {
            m = 0;
        }
        i3 = oys.L(j);
        if (i3 == Integer.MAX_VALUE || (i3 = i3 + i2) >= 0) {
        }
        return R(x, Z, m, i3);
    }

    public static final long L(int i, long j) {
        int i2 = odN.R;
        int i3 = (int) (j >> 32);
        int x = caw.x(i3, 0, i);
        int x2 = caw.x(odN.c(j), 0, i);
        return (x == i3 && x2 == odN.c(j)) ? j : e(x, x2);
    }

    public static Intent N(Activity activity) {
        Intent R2 = al6.R(activity);
        if (R2 != null) {
            return R2;
        }
        try {
            String j = j(activity, activity.getComponentName());
            if (j == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, j);
            try {
                return j(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + j + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final long O(long j, long j2) {
        return iTI.R(caw.x((int) (j2 >> 32), oys.x(j), oys.Z(j)), caw.x(ltH.v(j2), oys.m(j), oys.L(j)));
    }

    public static Intent P(Context context, ComponentName componentName) {
        String j = j(context, componentName);
        if (j == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), j);
        return j(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static final long R(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i < 0 || i3 < 0) {
                    z = false;
                }
                if (z) {
                    return dq.g(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    public static int U(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static boolean V(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final long X(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = d_E.R;
        return floatToIntBits2;
    }

    public static final long Y(long j, long j2) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j2 >= 0)) {
            throw new IllegalArgumentException(("saturatedAdd is optimized for non-negative longs: " + j + " + " + j2).toString());
        } else if (i == 0 || j2 <= Long.MAX_VALUE - j) {
            return j + j2;
        } else {
            return Long.MAX_VALUE;
        }
    }

    public static final long Z(long j, long j2) {
        return R(caw.x(oys.x(j2), oys.x(j), oys.Z(j)), caw.x(oys.Z(j2), oys.x(j), oys.Z(j)), caw.x(oys.m(j2), oys.m(j), oys.L(j)), caw.x(oys.L(j2), oys.m(j), oys.L(j)));
    }

    public static /* synthetic */ long c(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return R(0, i, 0, i2);
    }

    public static final long e(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 < 0) {
                z = false;
            }
            if (z) {
                long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
                int i3 = odN.R;
                return j;
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }

    public static final bz g(d5M d5m) {
        bz bzVar = d5m.f2488R;
        long j = d5m.R;
        bzVar.getClass();
        return bzVar.subSequence(odN.X(j), odN.e(j));
    }

    public static final String h(int i, m88 m88) {
        return gQc.G(m88).getString(i);
    }

    public static boolean i() {
        try {
            if (f2906R == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2906R == null) {
                R = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2906R = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2906R.invoke(null, Long.valueOf(R))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }

    public static String j(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int m(long j, int i) {
        return caw.x(i, oys.m(j), oys.L(j));
    }

    public static final boolean o(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float v = buB.v(j);
        float c = buB.c(j);
        return ((f6 * f6) / (c * c)) + ((f5 * f5) / (v * v)) <= 1.0f;
    }

    public static final bz t(d5M d5m, int i) {
        return d5m.f2488R.subSequence(Math.max(0, odN.X(d5m.R) - i), odN.X(d5m.R));
    }

    public static final int x(long j, int i) {
        return caw.x(i, oys.x(j), oys.Z(j));
    }

    public static final bz y(d5M d5m, int i) {
        return d5m.f2488R.subSequence(odN.e(d5m.R), Math.min(odN.e(d5m.R) + i, d5m.f2488R.R.length()));
    }

    public abstract o02 C();
}
