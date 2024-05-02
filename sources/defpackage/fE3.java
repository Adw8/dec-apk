package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: fE3  reason: default package */
/* loaded from: classes.dex */
public final class fE3 extends ActionMode {
    public final UF R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3355R;

    public fE3(Context context, UF uf) {
        this.f3355R = context;
        this.R = uf;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.R.v();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.R.e();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new dES(this.f3355R, this.R.X());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.R.O();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.R.L();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.R.R;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.R.Z();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.R.f556R;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.R.m();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.R.x();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.R.H(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.R.C(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.R.R = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.R.P(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.R.j(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.R.U(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.R.N(i);
    }
}
