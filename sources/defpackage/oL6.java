package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: oL6  reason: default package */
/* loaded from: classes.dex */
public final class oL6 {
    public int H;
    public int L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f6750O;
    public char R;

    /* renamed from: R  reason: collision with other field name */
    public Menu f6754R;

    /* renamed from: R  reason: collision with other field name */
    public c5B f6755R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f6756R;

    /* renamed from: R  reason: collision with other field name */
    public String f6757R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kpW f6758R;
    public int U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f6760X;
    public int Z;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f6761c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6762c;

    /* renamed from: e  reason: collision with other field name */
    public CharSequence f6763e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6764e;
    public int m;
    public char v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f6766v;

    /* renamed from: v  reason: collision with other field name */
    public String f6767v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6752R = null;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f6753R = null;

    /* renamed from: R  reason: collision with other field name */
    public int f6751R = 0;

    /* renamed from: v  reason: collision with other field name */
    public int f6765v = 0;
    public int c = 0;
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6759R = true;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6768v = true;

    public oL6(kpW kpw, Menu menu) {
        this.f6758R = kpw;
        this.f6754R = menu;
    }

    public final Object R(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f6758R.f5437R.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void v(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f6764e).setVisible(this.f6760X).setEnabled(this.f6750O).setCheckable(this.x >= 1).setTitleCondensed(this.f6766v).setIcon(this.L);
        int i = this.H;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f6767v != null) {
            if (!this.f6758R.f5437R.isRestricted()) {
                kpW kpw = this.f6758R;
                if (kpw.f5438R == null) {
                    kpw.f5438R = kpW.R(kpw.f5437R);
                }
                menuItem.setOnMenuItemClickListener(new oHI(kpw.f5438R, this.f6767v));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.x >= 2) {
            if (menuItem instanceof pce) {
                pce pce = (pce) menuItem;
                pce.Z = (pce.Z & -5) | 4;
            } else if (menuItem instanceof o5B) {
                o5B o5b = (o5B) menuItem;
                try {
                    if (o5b.f6668R == null) {
                        o5b.f6668R = o5b.R.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    o5b.f6668R.invoke(o5b.R, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.f6757R;
        if (str != null) {
            menuItem.setActionView((View) R(str, kpW.R, this.f6758R.f5439R));
            z = true;
        }
        int i2 = this.U;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        c5B c5b = this.f6755R;
        if (c5b != null) {
            if (menuItem instanceof irv) {
                ((irv) menuItem).R(c5b);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f6761c;
        boolean z2 = menuItem instanceof irv;
        if (z2) {
            ((irv) menuItem).c(charSequence);
        } else {
            bnG.Z(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f6763e;
        if (z2) {
            ((irv) menuItem).e(charSequence2);
        } else {
            bnG.C(menuItem, charSequence2);
        }
        char c = this.R;
        int i3 = this.Z;
        if (z2) {
            ((irv) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            bnG.L(menuItem, c, i3);
        }
        char c2 = this.v;
        int i4 = this.m;
        if (z2) {
            ((irv) menuItem).setNumericShortcut(c2, i4);
        } else {
            bnG.H(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f6753R;
        if (mode != null) {
            if (z2) {
                ((irv) menuItem).setIconTintMode(mode);
            } else {
                bnG.x(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f6752R;
        if (colorStateList == null) {
            return;
        }
        if (z2) {
            ((irv) menuItem).setIconTintList(colorStateList);
        } else {
            bnG.m(menuItem, colorStateList);
        }
    }
}
