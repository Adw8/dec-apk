package defpackage;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: cc  reason: default package */
/* loaded from: classes.dex */
public final class cc extends k_G {
    public final /* synthetic */ ActionMenuItemView R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cc(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.R = actionMenuItemView;
    }

    @Override // defpackage.k_G
    public final boolean c() {
        gt5 v;
        ActionMenuItemView actionMenuItemView = this.R;
        ikD ikd = actionMenuItemView.f1029R;
        return ikd != null && ikd.R(actionMenuItemView.f1031R) && (v = v()) != null && v.v();
    }

    @Override // defpackage.k_G
    public final gt5 v() {
        Ni ni;
        ca caVar = this.R.f1027R;
        if (caVar == null || (ni = ((m8) caVar).R.v) == null) {
            return null;
        }
        return ni.R();
    }
}
