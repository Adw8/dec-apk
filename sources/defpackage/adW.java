package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: adW  reason: default package */
/* loaded from: classes.dex */
public final class adW extends Drawable.ConstantState {
    public final Drawable.ConstantState R;

    public adW(Drawable.ConstantState constantState) {
        this.R = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.R.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.R.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        lPr lpr = new lPr();
        ((et7) lpr).R = (VectorDrawable) this.R.newDrawable();
        return lpr;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        lPr lpr = new lPr();
        ((et7) lpr).R = (VectorDrawable) this.R.newDrawable(resources);
        return lpr;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        lPr lpr = new lPr();
        ((et7) lpr).R = (VectorDrawable) this.R.newDrawable(resources, theme);
        return lpr;
    }
}
