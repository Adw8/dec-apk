package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* renamed from: gm9  reason: default package */
/* loaded from: classes.dex */
public final class gm9 {
    public final cE0 R = new cE0();
    public final cE0 v = new cE0();

    public static gm9 R(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return v(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return v(arrayList);
        } catch (Exception e) {
            StringBuilder U = opT.U("Can't load animation resource ID #0x");
            U.append(Integer.toHexString(i));
            Log.w("MotionSpec", U.toString(), e);
            return null;
        }
    }

    public static gm9 v(ArrayList arrayList) {
        gm9 gm9 = new gm9();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gm9.v.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = My.f300R;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = My.R;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = My.f299R;
                }
                nUp nup = new nUp(startDelay, duration, interpolator);
                nup.R = objectAnimator.getRepeatCount();
                nup.v = objectAnimator.getRepeatMode();
                gm9.R.put(propertyName, nup);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gm9;
    }

    public final nUp c(String str) {
        if (this.R.getOrDefault(str, null) != null) {
            return (nUp) this.R.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm9)) {
            return false;
        }
        return this.R.equals(((gm9) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        return '\n' + gm9.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.R + "}\n";
    }
}
