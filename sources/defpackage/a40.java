package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a40  reason: default package */
/* loaded from: classes.dex */
public final class a40 extends g2N {
    public final /* synthetic */ int v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a40(kds kds, int i) {
        super(kds);
        this.v = i;
    }

    @Override // defpackage.g2N
    public final void C(int i) {
        switch (this.v) {
            case 0:
                ((g2N) this).f3657R.T(i);
                return;
            default:
                ((g2N) this).f3657R.r(i);
                return;
        }
    }

    @Override // defpackage.g2N
    public final int H(View view) {
        switch (this.v) {
            case 0:
                ((g2N) this).f3657R.S(view, ((g2N) this).f3656R);
                return ((g2N) this).f3656R.right;
            default:
                ((g2N) this).f3657R.S(view, ((g2N) this).f3656R);
                return ((g2N) this).f3656R.bottom;
        }
    }

    @Override // defpackage.g2N
    public final int L() {
        switch (this.v) {
            case 0:
                return ((g2N) this).f3657R.v;
            default:
                return ((g2N) this).f3657R.c;
        }
    }

    public final int N(View view) {
        int measuredWidth;
        int i;
        switch (this.v) {
            case 0:
                l88 l88 = (l88) view.getLayoutParams();
                ((g2N) this).f3657R.getClass();
                Rect rect = ((l88) view.getLayoutParams()).R;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) l88).topMargin;
                i = ((ViewGroup.MarginLayoutParams) l88).bottomMargin;
                break;
            default:
                l88 l882 = (l88) view.getLayoutParams();
                ((g2N) this).f3657R.getClass();
                Rect rect2 = ((l88) view.getLayoutParams()).R;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) l882).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) l882).rightMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // defpackage.g2N
    public final int O() {
        int i;
        int h;
        switch (this.v) {
            case 0:
                kds kds = ((g2N) this).f3657R;
                i = kds.e;
                h = kds.u();
                break;
            default:
                kds kds2 = ((g2N) this).f3657R;
                i = kds2.X;
                h = kds2.h();
                break;
        }
        return i - h;
    }

    @Override // defpackage.g2N
    public final int U(View view) {
        switch (this.v) {
            case 0:
                ((g2N) this).f3657R.S(view, ((g2N) this).f3656R);
                return ((g2N) this).f3656R.left;
            default:
                ((g2N) this).f3657R.S(view, ((g2N) this).f3656R);
                return ((g2N) this).f3656R.top;
        }
    }

    @Override // defpackage.g2N
    public final int X() {
        switch (this.v) {
            case 0:
                return ((g2N) this).f3657R.e;
            default:
                return ((g2N) this).f3657R.X;
        }
    }

    @Override // defpackage.g2N
    public final int Z() {
        switch (this.v) {
            case 0:
                return ((g2N) this).f3657R.I();
            default:
                return ((g2N) this).f3657R.z();
        }
    }

    @Override // defpackage.g2N
    public final int c(View view) {
        int measuredHeight;
        int i;
        switch (this.v) {
            case 0:
                l88 l88 = (l88) view.getLayoutParams();
                ((g2N) this).f3657R.getClass();
                Rect rect = ((l88) view.getLayoutParams()).R;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) l88).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) l88).rightMargin;
                break;
            default:
                l88 l882 = (l88) view.getLayoutParams();
                ((g2N) this).f3657R.getClass();
                Rect rect2 = ((l88) view.getLayoutParams()).R;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) l882).topMargin;
                i = ((ViewGroup.MarginLayoutParams) l882).bottomMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.g2N
    public final int e(View view) {
        int top;
        int i;
        switch (this.v) {
            case 0:
                ((g2N) this).f3657R.getClass();
                top = view.getLeft() - ((l88) view.getLayoutParams()).R.left;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((g2N) this).f3657R.getClass();
                top = view.getTop() - ((l88) view.getLayoutParams()).R.top;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).topMargin;
                break;
        }
        return top - i;
    }

    @Override // defpackage.g2N
    public final int m() {
        int z;
        int h;
        switch (this.v) {
            case 0:
                kds kds = ((g2N) this).f3657R;
                z = kds.e - kds.I();
                h = ((g2N) this).f3657R.u();
                break;
            default:
                kds kds2 = ((g2N) this).f3657R;
                z = kds2.X - kds2.z();
                h = ((g2N) this).f3657R.h();
                break;
        }
        return z - h;
    }

    @Override // defpackage.g2N
    public final int v(View view) {
        int bottom;
        int i;
        switch (this.v) {
            case 0:
                ((g2N) this).f3657R.getClass();
                bottom = view.getRight() + ((l88) view.getLayoutParams()).R.right;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((g2N) this).f3657R.getClass();
                bottom = view.getBottom() + ((l88) view.getLayoutParams()).R.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).bottomMargin;
                break;
        }
        return bottom + i;
    }
}
