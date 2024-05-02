package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: Id  reason: default package */
/* loaded from: classes.dex */
public final class Id implements eIH {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ActionBarContextView f186R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f187R = false;

    public Id(ActionBarContextView actionBarContextView) {
        this.f186R = actionBarContextView;
    }

    @Override // defpackage.eIH
    public final void R() {
        if (!this.f187R) {
            ActionBarContextView actionBarContextView = this.f186R;
            actionBarContextView.f1058R = null;
            Id.super.setVisibility(this.R);
        }
    }

    @Override // defpackage.eIH
    public final void c(View view) {
        this.f187R = true;
    }

    @Override // defpackage.eIH
    public final void v() {
        Id.super.setVisibility(0);
        this.f187R = false;
    }
}
