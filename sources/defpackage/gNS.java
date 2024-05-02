package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: gNS  reason: default package */
/* loaded from: classes.dex */
public final class gNS {
    public static final PorterDuff.Mode R = PorterDuff.Mode.SRC_IN;

    /* renamed from: R  reason: collision with other field name */
    public static final bhM f3745R = new bhM();

    /* renamed from: R  reason: collision with other field name */
    public static gNS f3746R;

    /* renamed from: R  reason: collision with other field name */
    public TypedValue f3747R;

    /* renamed from: R  reason: collision with other field name */
    public j0 f3748R;

    /* renamed from: R  reason: collision with other field name */
    public WeakHashMap f3749R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3750R;
    public final WeakHashMap v = new WeakHashMap(0);

    public static synchronized PorterDuffColorFilter L(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (gNS.class) {
            bhM bhm = f3745R;
            bhm.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) bhm.R(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                bhm.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) bhm.v(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized gNS c() {
        gNS gns;
        synchronized (gNS.class) {
            if (f3746R == null) {
                f3746R = new gNS();
            }
            gns = f3746R;
        }
        return gns;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        defpackage.cAO.m(r12, r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable O(android.content.Context r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gNS.O(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void R(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            jXn jxn = (jXn) this.v.get(context);
            if (jxn == null) {
                jxn = new jXn();
                this.v.put(context, jxn);
            }
            jxn.L(j, new WeakReference(constantState));
        }
    }

    public final synchronized Drawable X(Context context, int i) {
        return O(context, i, false);
    }

    public final synchronized ColorStateList Z(Context context, int i) {
        ColorStateList colorStateList;
        eSi esi;
        try {
            WeakHashMap weakHashMap = this.f3749R;
            ColorStateList colorStateList2 = null;
            colorStateList = (weakHashMap == null || (esi = (eSi) weakHashMap.get(context)) == null) ? null : (ColorStateList) esi.L(i, null);
            if (colorStateList == null) {
                j0 j0Var = this.f3748R;
                if (j0Var != null) {
                    colorStateList2 = j0Var.L(context, i);
                }
                if (colorStateList2 != null) {
                    if (this.f3749R == null) {
                        this.f3749R = new WeakHashMap();
                    }
                    eSi esi2 = (eSi) this.f3749R.get(context);
                    if (esi2 == null) {
                        esi2 = new eSi();
                        this.f3749R.put(context, esi2);
                    }
                    esi2.v(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    public final synchronized Drawable e(Context context, long j) {
        Object[] objArr;
        Object obj;
        jXn jxn = (jXn) this.v.get(context);
        if (jxn == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) jxn.O(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int U = vd.U(jxn.f4953R, jxn.e, j);
            if (U >= 0 && (objArr = jxn.f4954R)[U] != (obj = jXn.R)) {
                objArr[U] = obj;
                jxn.f4952R = true;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            j0 r6 = r6.f3748R
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0076
            android.graphics.PorterDuff$Mode r2 = defpackage.pp.R
            java.lang.Object r3 = r6.f4786R
            int[] r3 = (int[]) r3
            boolean r3 = defpackage.j0.c(r3, r8)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            r5 = -1
            if (r3 == 0) goto L_0x001a
            r4 = 2130903280(0x7f0300f0, float:1.7413374E38)
            goto L_0x004a
        L_0x001a:
            java.lang.Object r3 = r6.c
            int[] r3 = (int[]) r3
            boolean r3 = defpackage.j0.c(r3, r8)
            if (r3 == 0) goto L_0x0028
            r4 = 2130903278(0x7f0300ee, float:1.741337E38)
            goto L_0x004a
        L_0x0028:
            java.lang.Object r6 = r6.e
            int[] r6 = (int[]) r6
            boolean r6 = defpackage.j0.c(r6, r8)
            if (r6 == 0) goto L_0x0035
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004a
        L_0x0035:
            r6 = 2131165257(0x7f070049, float:1.7944726E38)
            if (r8 != r6) goto L_0x0045
            r6 = 16842800(0x1010030, float:2.3693693E-38)
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            goto L_0x004c
        L_0x0045:
            r6 = 2131165239(0x7f070037, float:1.794469E38)
            if (r8 != r6) goto L_0x004e
        L_0x004a:
            r6 = r4
            r8 = r5
        L_0x004c:
            r3 = r0
            goto L_0x0051
        L_0x004e:
            r6 = r1
            r3 = r6
            r8 = r5
        L_0x0051:
            if (r3 == 0) goto L_0x0072
            android.graphics.Rect r3 = defpackage.mTA.R
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r6 = defpackage.lM2.c(r7, r6)
            java.lang.Class<pp> r7 = defpackage.pp.class
            monitor-enter(r7)
            android.graphics.PorterDuffColorFilter r6 = L(r6, r2)     // Catch: all -> 0x006f
            monitor-exit(r7)
            r9.setColorFilter(r6)
            if (r8 == r5) goto L_0x006d
            r9.setAlpha(r8)
        L_0x006d:
            r6 = r0
            goto L_0x0073
        L_0x006f:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L_0x0072:
            r6 = r1
        L_0x0073:
            if (r6 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r0 = r1
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gNS.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final Drawable v(Context context, int i) {
        if (this.f3747R == null) {
            this.f3747R = new TypedValue();
        }
        TypedValue typedValue = this.f3747R;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e = e(context, j);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.f3748R != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{X(context, R.drawable.abc_cab_background_internal_bg), X(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = j0.O(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = j0.O(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = j0.O(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            R(context, j, layerDrawable);
        }
        return layerDrawable;
    }
}
