package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: e4  reason: default package */
/* loaded from: classes.dex */
public final class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f2948R;

    public /* synthetic */ e4(int i, Object obj) {
        this.R = i;
        this.f2948R = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.R) {
            case 0:
                ((CollapsingToolbarLayout) this.f2948R).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c18 c18 = ((BottomSheetBehavior) this.f2948R).f2267R;
                if (c18 != null) {
                    c18.N(floatValue);
                    return;
                }
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = ((oN) this.f2948R).f6784R.iterator();
                while (it.hasNext()) {
                    j3y j3y = (j3y) it.next();
                    j3y.c = 1.2f;
                    j3y.R = floatValue2;
                    j3y.v = floatValue2;
                    j3y.e = My.R(0.0f, 1.0f, 0.19f, 1.0f, floatValue2);
                    j3y.invalidateSelf();
                }
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.H((oN) this.f2948R);
                return;
            default:
                ((TextInputLayout) this.f2948R).f2346R.j(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
