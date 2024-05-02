package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* renamed from: nk3  reason: default package */
/* loaded from: classes.dex */
public final class nk3 extends LG {
    public final Window R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f6534R = l6.n(jLF.R);
    public boolean c;
    public boolean e;

    public nk3(Context context, Window window) {
        super(context);
        this.R = window;
    }

    @Override // defpackage.LG
    public final void L(int i, int i2) {
        if (this.c) {
            super.L(i, i2);
            return;
        }
        super.L(View.MeasureSpec.makeMeasureSpec(mLz.t(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(mLz.t(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // defpackage.LG
    public final void O(boolean z, int i, int i2, int i3, int i4) {
        super.O(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.R.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // defpackage.LG
    public final void R(m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1735448596);
        ((iv7) this.f6534R.getValue()).J(jr_, 0);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 5, this);
        }
    }

    @Override // defpackage.LG
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.e;
    }
}
