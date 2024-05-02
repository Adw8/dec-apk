package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: pce  reason: default package */
/* loaded from: classes.dex */
public final class pce implements irv {
    public char R;

    /* renamed from: R  reason: collision with other field name */
    public final int f7106R;

    /* renamed from: R  reason: collision with other field name */
    public Intent f7107R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f7110R;

    /* renamed from: R  reason: collision with other field name */
    public MenuItem.OnActionExpandListener f7111R;

    /* renamed from: R  reason: collision with other field name */
    public MenuItem.OnMenuItemClickListener f7112R;

    /* renamed from: R  reason: collision with other field name */
    public View f7113R;

    /* renamed from: R  reason: collision with other field name */
    public c5B f7114R;

    /* renamed from: R  reason: collision with other field name */
    public go1 f7115R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f7116R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f7117R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f7119c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public CharSequence f7121e;
    public int m;
    public char v;

    /* renamed from: v  reason: collision with other field name */
    public final int f7123v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f7124v;
    public int X = 4096;
    public int O = 4096;
    public int L = 0;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f7108R = null;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f7109R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7118R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7125v = false;

    /* renamed from: c  reason: collision with other field name */
    public boolean f7120c = false;
    public int Z = 16;

    /* renamed from: e  reason: collision with other field name */
    public boolean f7122e = false;

    public pce(lRG lrg, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f7117R = lrg;
        this.f7106R = i2;
        this.f7123v = i;
        this.c = i3;
        this.e = i4;
        this.f7116R = charSequence;
        this.m = i5;
    }

    public static void X(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final boolean L() {
        c5B c5b;
        if ((this.m & 8) == 0) {
            return false;
        }
        if (this.f7113R == null && (c5b = this.f7114R) != null) {
            this.f7113R = c5b.v(this);
        }
        return this.f7113R != null;
    }

    public final Drawable O(Drawable drawable) {
        if (drawable != null && this.f7120c && (this.f7118R || this.f7125v)) {
            drawable = drawable.mutate();
            if (this.f7118R) {
                cAO.Z(drawable, this.f7108R);
            }
            if (this.f7125v) {
                cAO.m(drawable, this.f7109R);
            }
            this.f7120c = false;
        }
        return drawable;
    }

    @Override // defpackage.irv
    public final irv R(c5B c5b) {
        c5B c5b2 = this.f7114R;
        if (c5b2 != null) {
            c5b2.getClass();
        }
        this.f7113R = null;
        this.f7114R = c5b;
        this.f7117R.j(true);
        c5B c5b3 = this.f7114R;
        if (c5b3 != null) {
            c5b3.e(new gL6(2, this));
        }
        return this;
    }

    public final boolean Z() {
        return (this.Z & 32) == 32;
    }

    @Override // defpackage.irv
    public final irv c(CharSequence charSequence) {
        this.f7119c = charSequence;
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.m & 8) == 0) {
            return false;
        }
        if (this.f7113R == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7111R;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7117R.e(this);
        }
        return false;
    }

    @Override // defpackage.irv
    public final irv e(CharSequence charSequence) {
        this.f7121e = charSequence;
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final boolean expandActionView() {
        if (!L()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7111R;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7117R.O(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final View getActionView() {
        View view = this.f7113R;
        if (view != null) {
            return view;
        }
        c5B c5b = this.f7114R;
        if (c5b == null) {
            return null;
        }
        View v = c5b.v(this);
        this.f7113R = v;
        return v;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.v;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7119c;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f7123v;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f7110R;
        if (drawable != null) {
            return O(drawable);
        }
        int i = this.L;
        if (i == 0) {
            return null;
        }
        Drawable p = aH9.p(this.f7117R.f5727R, i);
        this.L = 0;
        this.f7110R = p;
        return O(p);
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7108R;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7109R;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7107R;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f7106R;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.X;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.R;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7115R;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7116R;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7124v;
        return charSequence != null ? charSequence : this.f7116R;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7121e;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f7115R != null;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f7122e;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.Z & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.Z & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.Z & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        c5B c5b = this.f7114R;
        return (c5b == null || !c5b.c()) ? (this.Z & 8) == 0 : (this.Z & 8) == 0 && this.f7114R.R();
    }

    public final void m(boolean z) {
        if (z) {
            this.Z |= 32;
        } else {
            this.Z &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f7113R = view;
        this.f7114R = null;
        if (view != null && view.getId() == -1 && (i = this.f7106R) > 0) {
            view.setId(i);
        }
        lRG lrg = this.f7117R;
        lrg.f5739e = true;
        lrg.j(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.v == c) {
            return this;
        }
        this.v = Character.toLowerCase(c);
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.Z;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.Z = i2;
        if (i != i2) {
            this.f7117R.j(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.Z;
        int i2 = 2;
        if ((i & 4) != 0) {
            lRG lrg = this.f7117R;
            lrg.getClass();
            int i3 = this.f7123v;
            int size = lrg.f5733R.size();
            lrg.K();
            for (int i4 = 0; i4 < size; i4++) {
                pce pce = (pce) lrg.f5733R.get(i4);
                if (pce.f7123v == i3) {
                    boolean z2 = true;
                    if (((pce.Z & 4) != 0) && pce.isCheckable()) {
                        if (pce != this) {
                            z2 = false;
                        }
                        int i5 = pce.Z;
                        int i6 = (z2 ? 2 : 0) | (i5 & -3);
                        pce.Z = i6;
                        if (i5 != i6) {
                            pce.f7117R.j(false);
                        }
                    }
                }
            }
            lrg.o();
        } else {
            int i7 = i & -3;
            if (!z) {
                i2 = 0;
            }
            int i8 = i2 | i7;
            this.Z = i8;
            if (i != i8) {
                this.f7117R.j(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.Z |= 16;
        } else {
            this.Z &= -17;
        }
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.L = 0;
        this.f7110R = drawable;
        this.f7120c = true;
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7108R = colorStateList;
        this.f7118R = true;
        this.f7120c = true;
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7109R = mode;
        this.f7125v = true;
        this.f7120c = true;
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7107R = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.R == c) {
            return this;
        }
        this.R = c;
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7111R = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7112R = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.R = c;
        this.v = Character.toLowerCase(c2);
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.m = i;
            lRG lrg = this.f7117R;
            lrg.f5739e = true;
            lrg.j(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7116R = charSequence;
        this.f7117R.j(false);
        go1 go1 = this.f7115R;
        if (go1 != null) {
            go1.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7124v = charSequence;
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.Z;
        boolean z2 = false;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.Z = i2;
        if (i != i2) {
            z2 = true;
        }
        if (z2) {
            lRG lrg = this.f7117R;
            lrg.f5738c = true;
            lrg.j(true);
        }
        return this;
    }

    @Override // java.lang.Object
    public final String toString() {
        CharSequence charSequence = this.f7116R;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // defpackage.irv
    public final c5B v() {
        return this.f7114R;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.v == c && this.O == i) {
            return this;
        }
        this.v = Character.toLowerCase(c);
        this.O = KeyEvent.normalizeMetaState(i);
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.R == c && this.X == i) {
            return this;
        }
        this.R = c;
        this.X = KeyEvent.normalizeMetaState(i);
        this.f7117R.j(false);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.R = c;
        this.X = KeyEvent.normalizeMetaState(i);
        this.v = Character.toLowerCase(c2);
        this.O = KeyEvent.normalizeMetaState(i2);
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f7110R = null;
        this.L = i;
        this.f7120c = true;
        this.f7117R.j(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f7117R.f5727R.getString(i));
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f7117R.f5727R;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f7113R = inflate;
        this.f7114R = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f7106R) > 0) {
            inflate.setId(i2);
        }
        lRG lrg = this.f7117R;
        lrg.f5739e = true;
        lrg.j(true);
        return this;
    }
}
