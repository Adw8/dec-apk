package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: eY0  reason: default package */
/* loaded from: classes.dex */
public final class eY0 extends UF implements foC {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ b_R f3131R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f3132R;

    /* renamed from: R  reason: collision with other field name */
    public kH f3133R;

    /* renamed from: R  reason: collision with other field name */
    public final lRG f3134R;

    public eY0(b_R b_r, Context context, WE we) {
        this.f3131R = b_r;
        this.R = context;
        this.f3133R = we;
        lRG lrg = new lRG(context);
        lrg.f5726R = 1;
        this.f3134R = lrg;
        lrg.f5731R = this;
    }

    @Override // defpackage.UF
    public final void C(CharSequence charSequence) {
        this.f3131R.f1734R.setSubtitle(charSequence);
    }

    @Override // defpackage.UF
    public final void H(View view) {
        this.f3131R.f1734R.setCustomView(view);
        this.f3132R = new WeakReference(view);
    }

    @Override // defpackage.UF
    public final CharSequence L() {
        return this.f3131R.f1734R.getSubtitle();
    }

    @Override // defpackage.UF
    public final void N(int i) {
        P(this.f3131R.f1731R.getResources().getString(i));
    }

    @Override // defpackage.UF
    public final MenuInflater O() {
        return new kpW(this.R);
    }

    @Override // defpackage.UF
    public final void P(CharSequence charSequence) {
        this.f3131R.f1734R.setTitle(charSequence);
    }

    @Override // defpackage.foC
    public final boolean R(lRG lrg, MenuItem menuItem) {
        kH kHVar = this.f3133R;
        if (kHVar != null) {
            return kHVar.v(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.UF
    public final void U(int i) {
        C(this.f3131R.f1731R.getResources().getString(i));
    }

    @Override // defpackage.UF
    public final lRG X() {
        return this.f3134R;
    }

    @Override // defpackage.UF
    public final CharSequence Z() {
        return this.f3131R.f1734R.getTitle();
    }

    @Override // defpackage.foC
    public final void c(lRG lrg) {
        if (this.f3133R != null) {
            m();
            RR rr = this.f3131R.f1734R.f1051R;
            if (rr != null) {
                rr.U();
            }
        }
    }

    @Override // defpackage.UF
    public final View e() {
        WeakReference weakReference = this.f3132R;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.UF
    public final void j(boolean z) {
        ((UF) this).f556R = z;
        this.f3131R.f1734R.setTitleOptional(z);
    }

    @Override // defpackage.UF
    public final void m() {
        if (this.f3131R.f1736R == this) {
            this.f3134R.K();
            try {
                this.f3133R.R(this, this.f3134R);
            } finally {
                this.f3134R.o();
            }
        }
    }

    @Override // defpackage.UF
    public final void v() {
        b_R b_r = this.f3131R;
        if (b_r.f1736R == this) {
            if (!(!b_r.e)) {
                b_r.f1744v = this;
                b_r.f1742R = this.f3133R;
            } else {
                this.f3133R.c(this);
            }
            this.f3133R = null;
            this.f3131R.Kl(false);
            ActionBarContextView actionBarContextView = this.f3131R.f1734R;
            if (actionBarContextView.f1053R == null) {
                actionBarContextView.X();
            }
            b_R b_r2 = this.f3131R;
            b_r2.f1735R.setHideOnContentScrollEnabled(b_r2.Z);
            this.f3131R.f1736R = null;
        }
    }

    @Override // defpackage.UF
    public final boolean x() {
        return this.f3131R.f1734R.f1060c;
    }
}
