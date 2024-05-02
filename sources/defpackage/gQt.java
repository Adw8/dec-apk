package defpackage;

import android.view.MenuItem;

/* renamed from: gQt  reason: default package */
/* loaded from: classes.dex */
public final class gQt implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ o5B f3760R;

    public gQt(o5B o5b, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3760R = o5b;
        this.R = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.R.onMenuItemActionCollapse(this.f3760R.j(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.R.onMenuItemActionExpand(this.f3760R.j(menuItem));
    }
}
