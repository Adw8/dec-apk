package defpackage;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: bA6  reason: default package */
/* loaded from: classes.dex */
public final class bA6 implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ bA6(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                f6m f6m = (f6m) this.R;
                int i = f6m.P;
                if (i == 1) {
                    f6m.f3310R.cancel();
                } else if (i != 2) {
                    return;
                }
                f6m.P = 3;
                ValueAnimator valueAnimator = f6m.f3310R;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                f6m.f3310R.setDuration((long) 500);
                f6m.f3310R.start();
                return;
            default:
                ((StaggeredGridLayoutManager) this.R).ve();
                return;
        }
    }
}
