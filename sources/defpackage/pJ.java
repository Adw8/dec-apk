package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: pJ  reason: default package */
/* loaded from: classes.dex */
public abstract class pJ extends hm9 implements Lb {
    public Q8 R;

    public pJ() {
        ((d) this).f1015R.f4264R.c("androidx:appcompat", new IK(0, this));
        C(new hL(this, 0));
    }

    private void V() {
        aH9.vr(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        aH9.cr(getWindow().getDecorView(), this);
    }

    @Override // defpackage.Lb
    public final void X() {
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        V();
        i().v(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Q8 q8 = (Q8) i();
        boolean z = true;
        q8.H = true;
        int i = q8.e;
        if (i == -100) {
            i = -100;
        }
        int I = q8.I(context, i);
        Configuration configuration = null;
        z = false;
        if (Q8.t && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(Q8.y(context, I, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof iOa) {
            try {
                ((iOa) context).R(Q8.y(context, I, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (Q8.y) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration y = Q8.y(context, I, configuration, true);
            iOa ioa = new iOa(context, 2132017703);
            ioa.R(y);
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
            } catch (NullPointerException unused3) {
            }
            if (z) {
                ktX.R(ioa.getTheme());
            }
            context = ioa;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((Q8) i()).h();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.cMB, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((Q8) i()).h();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        Q8 q8 = (Q8) i();
        q8.V();
        return q8.f405R.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Q8 q8 = (Q8) i();
        if (q8.f413R == null) {
            q8.h();
            b_R b_r = q8.f409R;
            q8.f413R = new kpW(b_r != null ? b_r.pG() : q8.f400R);
        }
        return q8.f413R;
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final Resources getResources() {
        int i = g5E.R;
        return super.getResources();
    }

    public final j7 i() {
        if (this.R == null) {
            L5 l5 = j7.R;
            this.R = new Q8(this, null, this, this);
        }
        return this.R;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        Q8 q8 = (Q8) i();
        if (q8.f409R != null) {
            q8.h();
            q8.f409R.getClass();
            q8.O |= 1;
            if (!q8.j) {
                View decorView = q8.f405R.getDecorView();
                Fz fz = q8.v;
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.C(decorView, fz);
                q8.j = true;
            }
        }
    }

    @Override // defpackage.Lb
    public final void m() {
    }

    public boolean o() {
        Intent N = dtx.N(this);
        if (N == null) {
            return false;
        }
        if (al6.c(this, N)) {
            fiw fiw = new fiw(this);
            Intent N2 = dtx.N(this);
            if (N2 == null) {
                N2 = dtx.N(this);
            }
            if (N2 != null) {
                ComponentName component = N2.getComponent();
                if (component == null) {
                    component = N2.resolveActivity(fiw.R.getPackageManager());
                }
                fiw.R(component);
                fiw.f3523R.add(N2);
            }
            fiw.v();
            try {
                Object obj = C1.R;
                uO.R(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            al6.v(this, N);
            return true;
        }
    }

    @Override // androidx.activity.d, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Q8 q8 = (Q8) i();
        if (q8.f421e && q8.f418R) {
            q8.h();
            b_R b_r = q8.f409R;
            if (b_r != null) {
                b_r.wm(b_r.f1731R.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        pp R = pp.R();
        Context context = q8.f400R;
        synchronized (R) {
            gNS gns = R.f7286R;
            synchronized (gns) {
                jXn jxn = (jXn) gns.v.get(context);
                if (jxn != null) {
                    jxn.v();
                }
            }
        }
        q8.f401R = new Configuration(q8.f400R.getResources().getConfiguration());
        q8.C(false);
        configuration.updateFrom(q8.f400R.getResources().getConfiguration());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.hm9, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i().O();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.hm9, androidx.activity.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        Q8 q8 = (Q8) i();
        q8.h();
        b_R b_r = q8.f409R;
        if (menuItem.getItemId() != 16908332 || b_r == null || (((muY) b_r.f1737R).R & 4) == 0) {
            return false;
        }
        return o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.d, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((Q8) i()).V();
    }

    @Override // defpackage.hm9, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        Q8 q8 = (Q8) i();
        q8.h();
        b_R b_r = q8.f409R;
        if (b_r != null) {
            b_r.L = true;
        }
    }

    @Override // defpackage.hm9, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((Q8) i()).C(true);
    }

    @Override // defpackage.hm9, android.app.Activity
    public final void onStop() {
        super.onStop();
        Q8 q8 = (Q8) i();
        q8.h();
        b_R b_r = q8.f409R;
        if (b_r != null) {
            b_r.L = false;
            hYl hyl = b_r.f1740R;
            if (hyl != null) {
                hyl.R();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        i().U(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((Q8) i()).h();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        V();
        i().m(i);
    }

    @Override // android.app.Activity, android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void setTheme(int i) {
        super.setTheme(i);
        ((Q8) i()).X = i;
    }

    @Override // defpackage.Lb
    public final void v() {
    }

    @Override // androidx.activity.d, android.app.Activity
    public void setContentView(View view) {
        V();
        i().x(view);
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        V();
        i().H(view, layoutParams);
    }
}
