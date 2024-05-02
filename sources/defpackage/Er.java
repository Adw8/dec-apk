package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: Er  reason: default package */
/* loaded from: classes.dex */
public final class Er extends Drawable.ConstantState {
    public final Drawable.ConstantState R;

    public Er(Drawable.ConstantState constantState) {
        this.R = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.R.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.R.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        EH eh = new EH(null);
        Drawable newDrawable = this.R.newDrawable();
        ((et7) eh).R = newDrawable;
        newDrawable.setCallback(eh.f86R);
        return eh;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        EH eh = new EH(null);
        Drawable newDrawable = this.R.newDrawable(resources);
        ((et7) eh).R = newDrawable;
        newDrawable.setCallback(eh.f86R);
        return eh;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        EH eh = new EH(null);
        Drawable newDrawable = this.R.newDrawable(resources, theme);
        ((et7) eh).R = newDrawable;
        newDrawable.setCallback(eh.f86R);
        return eh;
    }
}
