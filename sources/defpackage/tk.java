package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: tk  reason: default package */
/* loaded from: classes.dex */
public final class tk extends ContentFrameLayout {
    public final /* synthetic */ Q8 R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public tk(Q8 q8, iOa ioa) {
        super(ioa, null);
        this.R = q8;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.R.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                Q8 q8 = this.R;
                q8.g(q8.J(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(aH9.p(getContext(), i));
    }
}
