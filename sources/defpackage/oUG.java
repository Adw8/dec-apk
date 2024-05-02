package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: oUG  reason: default package */
/* loaded from: classes.dex */
public final class oUG implements View.OnTouchListener {
    public final /* synthetic */ olv R;

    public oUG(olv olv) {
        this.R = olv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        J_ j_;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (j_ = this.R.R) != null && j_.isShowing() && x >= 0 && x < this.R.R.getWidth() && y >= 0 && y < this.R.R.getHeight()) {
            olv olv = this.R;
            olv.f6920R.postDelayed(olv.f6925R, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            olv olv2 = this.R;
            olv2.f6920R.removeCallbacks(olv2.f6925R);
            return false;
        }
    }
}
