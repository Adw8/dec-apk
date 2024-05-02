package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: gi_  reason: default package */
/* loaded from: classes.dex */
public final class gi_ implements lx3 {
    public int R;

    public gi_(int i) {
        this.R = i;
    }

    public static ObjectAnimator c(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new oDR(view, f3, 1));
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new oDR(view, f3, 2));
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.lx3
    public final Animator R(ViewGroup viewGroup, View view) {
        int i = this.R;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (i == 3) {
            return c(view, ((float) dimensionPixelSize) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return c(view, translationX - ((float) dimensionPixelSize), translationX, translationX);
        }
        if (i == 48) {
            return e(view, translationY - ((float) dimensionPixelSize), translationY, translationY);
        }
        if (i == 80) {
            return e(view, ((float) dimensionPixelSize) + translationY, translationY, translationY);
        }
        boolean z = false;
        if (i == 8388611) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (eHQ.e(viewGroup) == 1) {
                z = true;
            }
            float f = (float) dimensionPixelSize;
            return c(view, z ? f + translationX : translationX - f, translationX, translationX);
        } else if (i == 8388613) {
            WeakHashMap weakHashMap2 = of5.f6887R;
            if (eHQ.e(viewGroup) == 1) {
                z = true;
            }
            float f2 = (float) dimensionPixelSize;
            return c(view, z ? translationX - f2 : f2 + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException(opT.Z("Invalid slide direction: ", i));
        }
    }

    @Override // defpackage.lx3
    public final Animator v(ViewGroup viewGroup, View view) {
        int i = this.R;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (i == 3) {
            return c(view, translationX, translationX - ((float) dimensionPixelSize), translationX);
        }
        if (i == 5) {
            return c(view, translationX, ((float) dimensionPixelSize) + translationX, translationX);
        }
        if (i == 48) {
            return e(view, translationY, ((float) dimensionPixelSize) + translationY, translationY);
        }
        if (i == 80) {
            return e(view, translationY, translationY - ((float) dimensionPixelSize), translationY);
        }
        boolean z = false;
        if (i == 8388611) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (eHQ.e(viewGroup) == 1) {
                z = true;
            }
            float f = (float) dimensionPixelSize;
            return c(view, translationX, z ? translationX - f : f + translationX, translationX);
        } else if (i == 8388613) {
            WeakHashMap weakHashMap2 = of5.f6887R;
            if (eHQ.e(viewGroup) == 1) {
                z = true;
            }
            float f2 = (float) dimensionPixelSize;
            return c(view, translationX, z ? f2 + translationX : translationX - f2, translationX);
        } else {
            throw new IllegalArgumentException(opT.Z("Invalid slide direction: ", i));
        }
    }
}
