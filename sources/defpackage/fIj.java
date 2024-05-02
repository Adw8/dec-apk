package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* renamed from: fIj  reason: default package */
/* loaded from: classes.dex */
public final class fIj extends TouchDelegate {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f3375R;

    /* renamed from: R  reason: collision with other field name */
    public final View f3376R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3377R;
    public final Rect c;
    public final Rect v;

    public fIj(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.R = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3375R = rect3;
        Rect rect4 = new Rect();
        this.c = rect4;
        Rect rect5 = new Rect();
        this.v = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f3376R = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f3377R;
                if (z2 && !this.c.contains(x, y)) {
                    z2 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f3377R;
                    this.f3377R = false;
                }
                z = true;
                z2 = false;
            }
            z = true;
        } else {
            if (this.f3375R.contains(x, y)) {
                this.f3377R = true;
                z = true;
            }
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (!z || this.v.contains(x, y)) {
            Rect rect = this.v;
            motionEvent.setLocation((float) (x - rect.left), (float) (y - rect.top));
        } else {
            motionEvent.setLocation((float) (this.f3376R.getWidth() / 2), (float) (this.f3376R.getHeight() / 2));
        }
        return this.f3376R.dispatchTouchEvent(motionEvent);
    }
}
