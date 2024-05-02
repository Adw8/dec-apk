package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: Em  reason: default package */
/* loaded from: classes.dex */
public final class Em implements irv {
    public char R;

    /* renamed from: R  reason: collision with other field name */
    public Context f96R;

    /* renamed from: R  reason: collision with other field name */
    public Intent f97R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f100R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f101R;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f103c;
    public CharSequence e;
    public char v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f105v;

    /* renamed from: R  reason: collision with other field name */
    public int f95R = 4096;

    /* renamed from: v  reason: collision with other field name */
    public int f104v = 4096;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f98R = null;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f99R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f102R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f106v = false;
    public int c = 16;

    public Em(Context context, CharSequence charSequence) {
        this.f96R = context;
        this.f101R = charSequence;
    }

    @Override // defpackage.irv
    public final irv R(c5B c5b) {
        throw new UnsupportedOperationException();
    }

    public final void X() {
        Drawable drawable = this.f100R;
        if (drawable == null) {
            return;
        }
        if (this.f102R || this.f106v) {
            this.f100R = drawable;
            Drawable mutate = drawable.mutate();
            this.f100R = mutate;
            if (this.f102R) {
                cAO.Z(mutate, this.f98R);
            }
            if (this.f106v) {
                cAO.m(this.f100R, this.f99R);
            }
        }
    }

    @Override // defpackage.irv
    public final irv c(CharSequence charSequence) {
        this.f103c = charSequence;
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // defpackage.irv
    public final irv e(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f104v;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.v;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f103c;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f100R;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f98R;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f99R;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f97R;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f95R;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.R;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f101R;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f105v;
        return charSequence != null ? charSequence : this.f101R;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.c & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.c & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.c & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.c & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.v = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.c = (z ? 1 : 0) | (this.c & -2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.c = (z ? 2 : 0) | (this.c & -3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f103c = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.c = (z ? 16 : 0) | (this.c & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f100R = drawable;
        X();
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f98R = colorStateList;
        this.f102R = true;
        X();
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f99R = mode;
        this.f106v = true;
        X();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f97R = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.R = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.R = c;
        this.v = Character.toLowerCase(c2);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f101R = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f105v = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.c & 8;
        if (z) {
            i = 0;
        }
        this.c = i2 | i;
        return this;
    }

    @Override // defpackage.irv
    public final c5B v() {
        return null;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.v = Character.toLowerCase(c);
        this.f104v = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.R = c;
        this.f95R = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f101R = this.f96R.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Context context = this.f96R;
        Object obj = C1.R;
        this.f100R = eNe.v(context, i);
        X();
        return this;
    }

    @Override // defpackage.irv, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.R = c;
        this.f95R = KeyEvent.normalizeMetaState(i);
        this.v = Character.toLowerCase(c2);
        this.f104v = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
