package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* renamed from: byW  reason: default package */
/* loaded from: classes.dex */
public abstract class byW {
    public static ViewPropertyAnimator R(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}
