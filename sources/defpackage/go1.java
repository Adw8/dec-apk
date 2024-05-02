package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: go1  reason: default package */
/* loaded from: classes.dex */
public final class go1 extends lRG implements SubMenu {
    public lRG R;
    public pce v;

    public go1(Context context, lRG lrg, pce pce) {
        super(context);
        this.R = lrg;
        this.v = pce;
    }

    @Override // defpackage.lRG
    public final boolean C() {
        return this.R.C();
    }

    @Override // defpackage.lRG
    public final lRG H() {
        return this.R.H();
    }

    @Override // defpackage.lRG
    public final boolean N() {
        return this.R.N();
    }

    @Override // defpackage.lRG
    public final boolean O(pce pce) {
        return this.R.O(pce);
    }

    @Override // defpackage.lRG
    public final boolean P() {
        return this.R.P();
    }

    @Override // defpackage.lRG
    public final boolean X(lRG lrg, MenuItem menuItem) {
        return super.X(lrg, menuItem) || this.R.X(lrg, menuItem);
    }

    @Override // defpackage.lRG
    public final boolean e(pce pce) {
        return this.R.e(pce);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.v;
    }

    @Override // defpackage.lRG, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.R.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        V(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        V(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        V(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.v.setIcon(drawable);
        return this;
    }

    @Override // defpackage.lRG, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.R.setQwertyMode(z);
    }

    @Override // defpackage.lRG
    public final String x() {
        pce pce = this.v;
        int i = pce != null ? pce.f7106R : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        V(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        V(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.v.setIcon(i);
        return this;
    }
}
