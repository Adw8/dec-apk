package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: j3  reason: default package */
/* loaded from: classes.dex */
public final class j3 extends olv implements G6 {
    public int H;
    public final /* synthetic */ _Q R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f4805R;
    public final Rect c = new Rect();
    public ListAdapter v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public j3(_Q _q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.R = _q;
        ((olv) this).f6921R = _q;
        ((olv) this).f6930e = true;
        ((olv) this).R.setFocusable(true);
        ((olv) this).f6922R = new ck(this, 1, _q);
    }

    @Override // defpackage.G6
    public final void C(CharSequence charSequence) {
        this.f4805R = charSequence;
    }

    @Override // defpackage.G6
    public final void H(int i) {
        this.H = i;
    }

    @Override // defpackage.olv, defpackage.G6
    public final void L(ListAdapter listAdapter) {
        super.L(listAdapter);
        this.v = listAdapter;
    }

    @Override // defpackage.G6
    public final void U(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean v = v();
        t();
        ((olv) this).R.setInputMethodMode(2);
        Z();
        aYp ayp = ((olv) this).f6917R;
        ayp.setChoiceMode(1);
        M9.e(ayp, i);
        M9.c(ayp, i2);
        int selectedItemPosition = this.R.getSelectedItemPosition();
        aYp ayp2 = ((olv) this).f6917R;
        if (v() && ayp2 != null) {
            ayp2.setListSelectionHidden(false);
            ayp2.setSelection(selectedItemPosition);
            if (ayp2.getChoiceMode() != 0) {
                ayp2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!v && (viewTreeObserver = this.R.getViewTreeObserver()) != null) {
            Cx cx = new Cx(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(cx);
            ((olv) this).R.setOnDismissListener(new Py(this, cx));
        }
    }

    @Override // defpackage.G6
    public final CharSequence m() {
        return this.f4805R;
    }

    public final void t() {
        Drawable x = x();
        int i = 0;
        if (x != null) {
            x.getPadding(this.R.f701R);
            i = oJF.R(this.R) ? this.R.f701R.right : -this.R.f701R.left;
        } else {
            Rect rect = this.R.f701R;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.R.getPaddingLeft();
        int paddingRight = this.R.getPaddingRight();
        int width = this.R.getWidth();
        _Q _q = this.R;
        int i2 = _q.e;
        if (i2 == -2) {
            int R = _q.R((SpinnerAdapter) this.v, x());
            int i3 = this.R.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.R.f701R;
            int i4 = (i3 - rect2.left) - rect2.right;
            if (R > i4) {
                R = i4;
            }
            y(Math.max(R, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            y((width - paddingLeft) - paddingRight);
        } else {
            y(i2);
        }
        this.O = oJF.R(this.R) ? (((width - paddingRight) - this.X) - this.H) + i : paddingLeft + this.H + i;
    }
}
