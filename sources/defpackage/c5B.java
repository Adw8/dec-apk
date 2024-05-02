package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: c5B  reason: default package */
/* loaded from: classes.dex */
public abstract class c5B {
    public final ActionProvider R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ o5B f1961R;

    public c5B(o5B o5b, ActionProvider actionProvider) {
        this.f1961R = o5b;
        this.R = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean R();

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void e(gL6 gl6);

    public abstract View v(MenuItem menuItem);
}
