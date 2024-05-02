package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: Q8  reason: default package */
/* loaded from: classes.dex */
public final class Q8 extends j7 implements foC, LayoutInflater.Factory2 {
    public boolean C;
    public boolean H;
    public boolean L;
    public boolean N;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f394O;
    public boolean P;

    /* renamed from: R  reason: collision with other field name */
    public Fz f395R;

    /* renamed from: R  reason: collision with other field name */
    public final Lb f396R;

    /* renamed from: R  reason: collision with other field name */
    public Qj f397R;

    /* renamed from: R  reason: collision with other field name */
    public RA f398R;

    /* renamed from: R  reason: collision with other field name */
    public UF f399R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f400R;

    /* renamed from: R  reason: collision with other field name */
    public Configuration f401R;

    /* renamed from: R  reason: collision with other field name */
    public Rect f402R;

    /* renamed from: R  reason: collision with other field name */
    public View f403R;

    /* renamed from: R  reason: collision with other field name */
    public ViewGroup f404R;

    /* renamed from: R  reason: collision with other field name */
    public Window f405R;

    /* renamed from: R  reason: collision with other field name */
    public PopupWindow f406R;

    /* renamed from: R  reason: collision with other field name */
    public TextView f407R;

    /* renamed from: R  reason: collision with other field name */
    public ActionBarContextView f408R;

    /* renamed from: R  reason: collision with other field name */
    public b_R f409R;

    /* renamed from: R  reason: collision with other field name */
    public i6 f410R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f411R;

    /* renamed from: R  reason: collision with other field name */
    public kP9 f412R;

    /* renamed from: R  reason: collision with other field name */
    public kpW f413R;

    /* renamed from: R  reason: collision with other field name */
    public q7 f415R;

    /* renamed from: R  reason: collision with other field name */
    public rD f416R;

    /* renamed from: R  reason: collision with other field name */
    public uD f417R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f418R;

    /* renamed from: R  reason: collision with other field name */
    public rD[] f419R;
    public boolean U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f420X;
    public boolean Z;
    public boolean c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f421e;
    public boolean g;
    public boolean j;
    public boolean m;

    /* renamed from: v  reason: collision with other field name */
    public RA f422v;

    /* renamed from: v  reason: collision with other field name */
    public Rect f423v;

    /* renamed from: v  reason: collision with other field name */
    public final Object f424v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f425v;
    public boolean x;
    public static final cE0 R = new cE0();

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f393R = {16842836};
    public static final boolean y = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean t = true;

    /* renamed from: R  reason: collision with other field name */
    public ozg f414R = null;
    public final Fz v = new Fz(this, 0);

    public Q8(Context context, Window window, Lb lb, Object obj) {
        pJ pJVar;
        this.e = -100;
        this.f400R = context;
        this.f396R = lb;
        this.f424v = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof pJ)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    pJVar = (pJ) context;
                    break;
                }
            }
            pJVar = null;
            if (pJVar != null) {
                this.e = ((Q8) pJVar.i()).e;
            }
        }
        if (this.e == -100) {
            cE0 ce0 = R;
            Integer num = (Integer) ce0.getOrDefault(this.f424v.getClass().getName(), null);
            if (num != null) {
                this.e = num.intValue();
                ce0.remove(this.f424v.getClass().getName());
            }
        }
        if (window != null) {
            N(window);
        }
        pp.c();
    }

    public static Configuration y(Context context, int i, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public final int A(gWM gwm, Rect rect) {
        boolean z;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3 = 0;
        int O = gwm != null ? gwm.O() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f408R;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f408R.getLayoutParams();
            boolean z2 = true;
            if (this.f408R.isShown()) {
                if (this.f402R == null) {
                    this.f402R = new Rect();
                    this.f423v = new Rect();
                }
                Rect rect2 = this.f402R;
                Rect rect3 = this.f423v;
                if (gwm == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(gwm.e(), gwm.O(), gwm.X(), gwm.c());
                }
                ViewGroup viewGroup = this.f404R;
                Method method = oJF.R;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                ViewGroup viewGroup2 = this.f404R;
                WeakHashMap weakHashMap = of5.f6887R;
                gWM R2 = jUJ.R(viewGroup2);
                int e2 = R2 == null ? 0 : R2.e();
                int X = R2 == null ? 0 : R2.X();
                if (marginLayoutParams2.topMargin == i4 && marginLayoutParams2.leftMargin == i5 && marginLayoutParams2.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i4;
                    marginLayoutParams2.leftMargin = i5;
                    marginLayoutParams2.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || this.f403R != null) {
                    View view = this.f403R;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i2 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == e2 && marginLayoutParams.rightMargin == X))) {
                        marginLayoutParams.height = i2;
                        marginLayoutParams.leftMargin = e2;
                        marginLayoutParams.rightMargin = X;
                        this.f403R.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f400R);
                    this.f403R = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = e2;
                    layoutParams.rightMargin = X;
                    this.f404R.addView(this.f403R, -1, layoutParams);
                }
                View view3 = this.f403R;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f403R;
                    if ((mHC.L(view4) & 8192) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        Context context = this.f400R;
                        Object obj = C1.R;
                        i = dmD.R(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Context context2 = this.f400R;
                        Object obj2 = C1.R;
                        i = dmD.R(context2, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(i);
                }
                if (!this.f394O && z) {
                    O = 0;
                }
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                this.f408R.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.f403R;
        if (view5 != null) {
            if (!z) {
                i3 = 8;
            }
            view5.setVisibility(i3);
        }
        return O;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(boolean r11) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.C(boolean):boolean");
    }

    @Override // defpackage.j7
    public final void H(View view, ViewGroup.LayoutParams layoutParams) {
        V();
        ViewGroup viewGroup = (ViewGroup) this.f404R.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f415R.R(this.f405R.getCallback());
    }

    public final int I(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.f422v == null) {
                            this.f422v = new RA(this, context);
                        }
                        return this.f422v.Z();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return K(context).Z();
            }
        }
        return i;
    }

    public final rD J(int i) {
        rD[] rDVarArr = this.f419R;
        if (rDVarArr == null || rDVarArr.length <= i) {
            rD[] rDVarArr2 = new rD[i + 1];
            if (rDVarArr != null) {
                System.arraycopy(rDVarArr, 0, rDVarArr2, 0, rDVarArr.length);
            }
            this.f419R = rDVarArr2;
            rDVarArr = rDVarArr2;
        }
        rD rDVar = rDVarArr[i];
        if (rDVar != null) {
            return rDVar;
        }
        rD rDVar2 = new rD(i);
        rDVarArr[i] = rDVar2;
        return rDVar2;
    }

    public final Xb K(Context context) {
        if (this.f398R == null) {
            if (CV.R == null) {
                Context applicationContext = context.getApplicationContext();
                CV.R = new CV(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f398R = new RA(this, CV.R);
        }
        return this.f398R;
    }

    public final void N(Window window) {
        if (this.f405R == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof q7)) {
                q7 q7Var = new q7(this, callback);
                this.f415R = q7Var;
                window.setCallback(q7Var);
                CV Y = CV.Y(this.f400R, null, f393R);
                Drawable C = Y.C(0);
                if (C != null) {
                    window.setBackgroundDrawable(C);
                }
                Y.z();
                this.f405R = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.j7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f424v
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = defpackage.j7.f4835R
            monitor-enter(r0)
            defpackage.j7.L(r3)     // Catch: all -> 0x000e
            monitor-exit(r0)     // Catch: all -> 0x000e
            goto L_0x0011
        L_0x000e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x000e
            throw r3
        L_0x0011:
            boolean r0 = r3.j
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f405R
            android.view.View r0 = r0.getDecorView()
            Fz r1 = r3.v
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.C = r0
            int r0 = r3.e
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f424v
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            cE0 r0 = defpackage.Q8.R
            java.lang.Object r1 = r3.f424v
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            cE0 r0 = defpackage.Q8.R
            java.lang.Object r1 = r3.f424v
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            RA r0 = r3.f398R
            if (r0 == 0) goto L_0x0063
            r0.v()
        L_0x0063:
            RA r3 = r3.f422v
            if (r3 == 0) goto L_0x006a
            r3.v()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.O():void");
    }

    public final void P(int i, rD rDVar, lRG lrg) {
        if (lrg == null) {
            if (rDVar == null && i >= 0) {
                rD[] rDVarArr = this.f419R;
                if (i < rDVarArr.length) {
                    rDVar = rDVarArr[i];
                }
            }
            if (rDVar != null) {
                lrg = rDVar.f7388R;
            }
        }
        if ((rDVar == null || rDVar.f7391c) && !this.C) {
            q7 q7Var = this.f415R;
            Window.Callback callback = this.f405R.getCallback();
            q7Var.getClass();
            try {
                q7Var.c = true;
                callback.onPanelClosed(i, lrg);
            } finally {
                q7Var.c = false;
            }
        }
    }

    public final void Q() {
        if (this.f418R) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // defpackage.foC
    public final boolean R(lRG lrg, MenuItem menuItem) {
        int i;
        int i2;
        rD rDVar;
        Window.Callback Y = Y();
        if (Y != null && !this.C) {
            lRG H = lrg.H();
            rD[] rDVarArr = this.f419R;
            if (rDVarArr != null) {
                i2 = rDVarArr.length;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
            while (true) {
                if (i < i2) {
                    rDVar = rDVarArr[i];
                    if (rDVar != null && rDVar.f7388R == H) {
                        break;
                    }
                    i++;
                } else {
                    rDVar = null;
                    break;
                }
            }
            if (rDVar != null) {
                return Y.onMenuItemSelected(rDVar.R, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.j7
    public final void U(CharSequence charSequence) {
        this.f411R = charSequence;
        kP9 kp9 = this.f412R;
        if (kp9 != null) {
            kp9.setWindowTitle(charSequence);
            return;
        }
        b_R b_r = this.f409R;
        if (b_r != null) {
            muY muy = (muY) b_r.f1737R;
            if (!muy.f6231R) {
                muy.f6230R = charSequence;
                if ((muy.R & 8) != 0) {
                    muy.f6229R.setTitle(charSequence);
                    if (muy.f6231R) {
                        of5.L(muy.f6229R.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.f407R;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void V() {
        ViewGroup viewGroup;
        if (!this.f418R) {
            TypedArray obtainStyledAttributes = this.f400R.obtainStyledAttributes(iTI.x);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    Z(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    Z(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    Z(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    Z(10);
                }
                this.L = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                o();
                this.f405R.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f400R);
                if (this.Z) {
                    viewGroup = this.f394O ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.L) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f420X = false;
                    this.f421e = false;
                } else if (this.f421e) {
                    TypedValue typedValue = new TypedValue();
                    this.f400R.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new iOa(this.f400R, typedValue.resourceId) : this.f400R).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    kP9 kp9 = (kP9) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f412R = kp9;
                    kp9.setWindowCallback(Y());
                    if (this.f420X) {
                        ((ActionBarOverlayLayout) this.f412R).H(109);
                    }
                    if (this.f425v) {
                        ((ActionBarOverlayLayout) this.f412R).H(2);
                    }
                    if (this.c) {
                        ((ActionBarOverlayLayout) this.f412R).H(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    qy qyVar = new qy(0, this);
                    WeakHashMap weakHashMap = of5.f6887R;
                    m18.V(viewGroup, qyVar);
                    if (this.f412R == null) {
                        this.f407R = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = oJF.R;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f405R.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f405R.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new uD(this));
                    this.f404R = viewGroup;
                    Object obj = this.f424v;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f411R;
                    if (!TextUtils.isEmpty(title)) {
                        kP9 kp92 = this.f412R;
                        if (kp92 != null) {
                            kp92.setWindowTitle(title);
                        } else {
                            b_R b_r = this.f409R;
                            if (b_r != null) {
                                muY muy = (muY) b_r.f1737R;
                                if (!muy.f6231R) {
                                    muy.f6230R = title;
                                    if ((muy.R & 8) != 0) {
                                        muy.f6229R.setTitle(title);
                                        if (muy.f6231R) {
                                            of5.L(muy.f6229R.getRootView(), title);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.f407R;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f404R.findViewById(16908290);
                    View decorView = this.f405R.getDecorView();
                    contentFrameLayout2.R.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = of5.f6887R;
                    if (d6y.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f400R.obtainStyledAttributes(iTI.x);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f418R = true;
                    rD J = J(0);
                    if (!this.C && J.f7388R == null) {
                        this.O |= 4096;
                        if (!this.j) {
                            mHC.C(this.f405R.getDecorView(), this.v);
                            this.j = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder U = opT.U("AppCompat does not support the current theme features: { windowActionBar: ");
                U.append(this.f421e);
                U.append(", windowActionBarOverlay: ");
                U.append(this.f420X);
                U.append(", android:windowIsFloating: ");
                U.append(this.L);
                U.append(", windowActionModeOverlay: ");
                U.append(this.f394O);
                U.append(", windowNoTitle: ");
                U.append(this.Z);
                U.append(" }");
                throw new IllegalArgumentException(U.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    @Override // defpackage.j7
    public final void X() {
        this.H = true;
        C(false);
        o();
        Object obj = this.f424v;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = dtx.j(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                b_R b_r = this.f409R;
                if (b_r == null) {
                    this.g = true;
                } else if (!b_r.f1743R) {
                    muY muy = (muY) b_r.f1737R;
                    int i = muy.R;
                    b_r.f1743R = true;
                    muy.R(4 | (i & -5));
                }
            }
            synchronized (j7.f4835R) {
                j7.L(this);
                j7.R.add(new WeakReference(this));
            }
        }
        this.f401R = new Configuration(this.f400R.getResources().getConfiguration());
        this.U = true;
    }

    public final Window.Callback Y() {
        return this.f405R.getCallback();
    }

    @Override // defpackage.j7
    public final boolean Z(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.Z && i == 108) {
            return false;
        }
        if (this.f421e && i == 1) {
            this.f421e = false;
        }
        if (i == 1) {
            Q();
            this.Z = true;
            return true;
        } else if (i == 2) {
            Q();
            this.f425v = true;
            return true;
        } else if (i == 5) {
            Q();
            this.c = true;
            return true;
        } else if (i == 10) {
            Q();
            this.f394O = true;
            return true;
        } else if (i == 108) {
            Q();
            this.f421e = true;
            return true;
        } else if (i != 109) {
            return this.f405R.requestFeature(i);
        } else {
            Q();
            this.f420X = true;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r6 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f  */
    @Override // defpackage.foC
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.lRG r6) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.c(lRG):void");
    }

    @Override // defpackage.j7
    public final void e() {
        LayoutInflater from = LayoutInflater.from(this.f400R);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof Q8)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.rD r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0035
            int r2 = r6.R
            if (r2 != 0) goto L_0x0035
            kP9 r2 = r5.f412R
            if (r2 == 0) goto L_0x0035
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.U()
            elR r2 = r2.f1074R
            muY r2 = (defpackage.muY) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f6229R
            androidx.appcompat.widget.ActionMenuView r2 = r2.f1163R
            if (r2 == 0) goto L_0x002c
            RR r2 = r2.R
            if (r2 == 0) goto L_0x0027
            boolean r2 = r2.Z()
            if (r2 == 0) goto L_0x0027
            r2 = r0
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            if (r2 == 0) goto L_0x002c
            r2 = r0
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r2 == 0) goto L_0x0035
            lRG r6 = r6.f7388R
            r5.j(r6)
            return
        L_0x0035:
            android.content.Context r2 = r5.f400R
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L_0x0054
            boolean r4 = r6.f7391c
            if (r4 == 0) goto L_0x0054
            tk r4 = r6.f7389R
            if (r4 == 0) goto L_0x0054
            r2.removeView(r4)
            if (r7 == 0) goto L_0x0054
            int r7 = r6.R
            r5.P(r7, r6, r3)
        L_0x0054:
            r6.f7390R = r1
            r6.f7394v = r1
            r6.f7391c = r1
            r6.f7385R = r3
            r6.f7392e = r0
            rD r7 = r5.f416R
            if (r7 != r6) goto L_0x0064
            r5.f416R = r3
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.g(rD, boolean):void");
    }

    public final void h() {
        V();
        if (this.f421e && this.f409R == null) {
            Object obj = this.f424v;
            if (obj instanceof Activity) {
                this.f409R = new b_R((Activity) this.f424v, this.f420X);
            } else if (obj instanceof Dialog) {
                this.f409R = new b_R((Dialog) this.f424v);
            }
            b_R b_r = this.f409R;
            if (b_r != null) {
                boolean z = this.g;
                if (!b_r.f1743R) {
                    int i = z ? 4 : 0;
                    muY muy = (muY) b_r.f1737R;
                    int i2 = muy.R;
                    b_r.f1743R = true;
                    muy.R((i & 4) | (i2 & -5));
                }
            }
        }
    }

    public final void i(int i) {
        rD J = J(i);
        if (J.f7388R != null) {
            Bundle bundle = new Bundle();
            J.f7388R.i(bundle);
            if (bundle.size() > 0) {
                J.f7384R = bundle;
            }
            J.f7388R.K();
            J.f7388R.clear();
        }
        J.X = true;
        J.f7392e = true;
        if ((i == 108 || i == 0) && this.f412R != null) {
            rD J2 = J(0);
            J2.f7390R = false;
            n(J2, null);
        }
    }

    public final void j(lRG lrg) {
        RR rr;
        if (!this.m) {
            this.m = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f412R;
            actionBarOverlayLayout.U();
            ActionMenuView actionMenuView = ((muY) actionBarOverlayLayout.f1074R).f6229R.f1163R;
            if (!(actionMenuView == null || (rr = actionMenuView.R) == null)) {
                rr.e();
                Ni ni = rr.v;
                if (ni != null && ni.v()) {
                    ((h6s) ni).f4068R.dismiss();
                }
            }
            Window.Callback Y = Y();
            if (Y != null && !this.C) {
                Y.onPanelClosed(108, lrg);
            }
            this.m = false;
        }
    }

    @Override // defpackage.j7
    public final void m(int i) {
        V();
        ViewGroup viewGroup = (ViewGroup) this.f404R.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f400R).inflate(i, viewGroup);
        this.f415R.R(this.f405R.getCallback());
    }

    public final boolean n(rD rDVar, KeyEvent keyEvent) {
        kP9 kp9;
        kP9 kp92;
        kP9 kp93;
        Resources.Theme theme;
        kP9 kp94;
        if (this.C) {
            return false;
        }
        if (rDVar.f7390R) {
            return true;
        }
        rD rDVar2 = this.f416R;
        if (!(rDVar2 == null || rDVar2 == rDVar)) {
            g(rDVar2, false);
        }
        Window.Callback Y = Y();
        if (Y != null) {
            rDVar.f7393v = Y.onCreatePanelView(rDVar.R);
        }
        int i = rDVar.R;
        boolean z = i == 0 || i == 108;
        if (z && (kp94 = this.f412R) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) kp94;
            actionBarOverlayLayout.U();
            ((muY) actionBarOverlayLayout.f1074R).f6235v = true;
        }
        if (rDVar.f7393v == null) {
            lRG lrg = rDVar.f7388R;
            if (lrg == null || rDVar.X) {
                if (lrg == null) {
                    Context context = this.f400R;
                    int i2 = rDVar.R;
                    if ((i2 == 0 || i2 == 108) && this.f412R != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            iOa ioa = new iOa(context, 0);
                            ioa.getTheme().setTo(theme);
                            context = ioa;
                        }
                    }
                    lRG lrg2 = new lRG(context);
                    lrg2.f5731R = this;
                    lRG lrg3 = rDVar.f7388R;
                    if (lrg2 != lrg3) {
                        if (lrg3 != null) {
                            lrg3.y(rDVar.f7386R);
                        }
                        rDVar.f7388R = lrg2;
                        hwc hwc = rDVar.f7386R;
                        if (hwc != null) {
                            lrg2.v(hwc, lrg2.f5727R);
                        }
                    }
                    if (rDVar.f7388R == null) {
                        return false;
                    }
                }
                if (z && (kp93 = this.f412R) != null) {
                    if (this.f410R == null) {
                        this.f410R = new i6(this);
                    }
                    ((ActionBarOverlayLayout) kp93).C(rDVar.f7388R, this.f410R);
                }
                rDVar.f7388R.K();
                if (!Y.onCreatePanelMenu(rDVar.R, rDVar.f7388R)) {
                    lRG lrg4 = rDVar.f7388R;
                    if (lrg4 != null) {
                        if (lrg4 != null) {
                            lrg4.y(rDVar.f7386R);
                        }
                        rDVar.f7388R = null;
                    }
                    if (z && (kp92 = this.f412R) != null) {
                        ((ActionBarOverlayLayout) kp92).C(null, this.f410R);
                    }
                    return false;
                }
                rDVar.X = false;
            }
            rDVar.f7388R.K();
            Bundle bundle = rDVar.f7384R;
            if (bundle != null) {
                rDVar.f7388R.t(bundle);
                rDVar.f7384R = null;
            }
            if (!Y.onPreparePanel(0, rDVar.f7393v, rDVar.f7388R)) {
                if (z && (kp9 = this.f412R) != null) {
                    ((ActionBarOverlayLayout) kp9).C(null, this.f410R);
                }
                rDVar.f7388R.o();
                return false;
            }
            rDVar.f7388R.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            rDVar.f7388R.o();
        }
        rDVar.f7390R = true;
        rDVar.f7394v = false;
        this.f416R = rDVar;
        return true;
    }

    public final void o() {
        if (this.f405R == null) {
            Object obj = this.f424v;
            if (obj instanceof Activity) {
                N(((Activity) obj).getWindow());
            }
        }
        if (this.f405R == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x01ad */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0117, code lost:
        if (r9.equals("ImageButton") == false) goto L_0x0146;
     */
    @Override // android.view.LayoutInflater.Factory2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
        // Method dump skipped, instructions count: 652
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018f, code lost:
        if (r6 == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fa, code lost:
        if ((r7 != null && r7.U()) != false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.t(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0154, code lost:
        if (r13 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0178, code lost:
        if (r13.f4427R.getCount() > 0) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(defpackage.rD r14, android.view.KeyEvent r15) {
        /*
        // Method dump skipped, instructions count: 477
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.u(rD, android.view.KeyEvent):void");
    }

    @Override // defpackage.j7
    public final void v(View view, ViewGroup.LayoutParams layoutParams) {
        V();
        ((ViewGroup) this.f404R.findViewById(16908290)).addView(view, layoutParams);
        this.f415R.R(this.f405R.getCallback());
    }

    @Override // defpackage.j7
    public final void x(View view) {
        V();
        ViewGroup viewGroup = (ViewGroup) this.f404R.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f415R.R(this.f405R.getCallback());
    }

    public final boolean z(rD rDVar, int i, KeyEvent keyEvent) {
        lRG lrg;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rDVar.f7390R || n(rDVar, keyEvent)) && (lrg = rDVar.f7388R) != null) {
            return lrg.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
