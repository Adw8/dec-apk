package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: pp  reason: default package */
/* loaded from: classes.dex */
public final class pp {
    public static final PorterDuff.Mode R = PorterDuff.Mode.SRC_IN;

    /* renamed from: R  reason: collision with other field name */
    public static pp f7285R;

    /* renamed from: R  reason: collision with other field name */
    public gNS f7286R;

    public static synchronized pp R() {
        pp ppVar;
        synchronized (pp.class) {
            if (f7285R == null) {
                c();
            }
            ppVar = f7285R;
        }
        return ppVar;
    }

    public static synchronized void c() {
        synchronized (pp.class) {
            if (f7285R == null) {
                pp ppVar = new pp();
                f7285R = ppVar;
                ppVar.f7286R = gNS.c();
                gNS gns = f7285R.f7286R;
                j0 j0Var = new j0();
                synchronized (gns) {
                    gns.f3748R = j0Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, epC epc, int[] iArr) {
        PorterDuff.Mode mode = gNS.R;
        int[] state = drawable.getState();
        Rect rect = mTA.R;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = epc.f3213v;
        if (z || epc.f3212R) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) epc.R : null;
            PorterDuff.Mode mode2 = epc.f3212R ? (PorterDuff.Mode) epc.v : gNS.R;
            if (!(colorStateList == null || mode2 == null)) {
                porterDuffColorFilter = gNS.L(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        drawable.clearColorFilter();
    }

    public final synchronized Drawable v(Context context, int i) {
        return this.f7286R.X(context, i);
    }
}
