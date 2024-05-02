package defpackage;

import android.view.MenuItem;

/* renamed from: eZu  reason: default package */
/* loaded from: classes.dex */
public final class eZu implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ o5B f3136R;

    public eZu(o5B o5b, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3136R = o5b;
        this.R = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.R.onMenuItemClick(this.f3136R.j(menuItem));
    }
}
