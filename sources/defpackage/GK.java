package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: GK  reason: default package */
/* loaded from: classes.dex */
public final class GK extends Animatable2.AnimationCallback {
    public final /* synthetic */ ePR R;

    public GK(ePR epr) {
        this.R = epr;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.R.f3078R.f3859v;
        if (colorStateList != null) {
            cAO.Z(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        ggH ggh = this.R.f3078R;
        ColorStateList colorStateList = ggh.f3859v;
        if (colorStateList != null) {
            cAO.L(drawable, colorStateList.getColorForState(ggh.f3854R, colorStateList.getDefaultColor()));
        }
    }
}
