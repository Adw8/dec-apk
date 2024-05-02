package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* renamed from: y7  reason: default package */
/* loaded from: classes.dex */
public final class y7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object v;

    public /* synthetic */ y7(Object obj, c18 c18) {
        this.v = obj;
        this.R = c18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((c18) this.R).U(floatValue);
        Drawable drawable = ((AppBarLayout) this.v).f2213R;
        if (drawable instanceof c18) {
            ((c18) drawable).U(floatValue);
        }
        Iterator it = ((AppBarLayout) this.v).v.iterator();
        while (it.hasNext()) {
            int i = ((c18) this.R).e;
            ((qp) it.next()).R();
        }
    }
}
