package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bYx  reason: default package */
/* loaded from: classes.dex */
public final class bYx implements lx3 {
    public boolean R;

    public bYx(boolean z) {
        this.R = z;
    }

    public static ObjectAnimator c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new dP9(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.lx3
    public final Animator R(ViewGroup viewGroup, View view) {
        return this.R ? c(view, 0.8f, 1.0f) : c(view, 1.1f, 1.0f);
    }

    @Override // defpackage.lx3
    public final Animator v(ViewGroup viewGroup, View view) {
        return this.R ? c(view, 1.0f, 1.1f) : c(view, 1.0f, 0.8f);
    }
}
