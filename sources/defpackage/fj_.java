package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: fj_  reason: default package */
/* loaded from: classes.dex */
public final class fj_ extends UF implements foC {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public ActionBarContextView f3535R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f3536R;

    /* renamed from: R  reason: collision with other field name */
    public kH f3537R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f3538R;
    public boolean v;

    public fj_(Context context, ActionBarContextView actionBarContextView, kH kHVar) {
        this.R = context;
        this.f3535R = actionBarContextView;
        this.f3537R = kHVar;
        lRG lrg = new lRG(actionBarContextView.getContext());
        lrg.f5726R = 1;
        this.f3538R = lrg;
        lrg.f5731R = this;
    }

    @Override // defpackage.UF
    public final void C(CharSequence charSequence) {
        this.f3535R.setSubtitle(charSequence);
    }

    @Override // defpackage.UF
    public final void H(View view) {
        this.f3535R.setCustomView(view);
        this.f3536R = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.UF
    public final CharSequence L() {
        return this.f3535R.getSubtitle();
    }

    @Override // defpackage.UF
    public final void N(int i) {
        P(this.R.getString(i));
    }

    @Override // defpackage.UF
    public final MenuInflater O() {
        return new kpW(this.f3535R.getContext());
    }

    @Override // defpackage.UF
    public final void P(CharSequence charSequence) {
        this.f3535R.setTitle(charSequence);
    }

    @Override // defpackage.foC
    public final boolean R(lRG lrg, MenuItem menuItem) {
        return this.f3537R.v(this, menuItem);
    }

    @Override // defpackage.UF
    public final void U(int i) {
        C(this.R.getString(i));
    }

    @Override // defpackage.UF
    public final lRG X() {
        return this.f3538R;
    }

    @Override // defpackage.UF
    public final CharSequence Z() {
        return this.f3535R.getTitle();
    }

    @Override // defpackage.foC
    public final void c(lRG lrg) {
        m();
        RR rr = this.f3535R.f1051R;
        if (rr != null) {
            rr.U();
        }
    }

    @Override // defpackage.UF
    public final View e() {
        WeakReference weakReference = this.f3536R;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.UF
    public final void j(boolean z) {
        ((UF) this).f556R = z;
        this.f3535R.setTitleOptional(z);
    }

    @Override // defpackage.UF
    public final void m() {
        this.f3537R.R(this, this.f3538R);
    }

    @Override // defpackage.UF
    public final void v() {
        if (!this.v) {
            this.v = true;
            this.f3537R.c(this);
        }
    }

    @Override // defpackage.UF
    public final boolean x() {
        return this.f3535R.f1060c;
    }
}
