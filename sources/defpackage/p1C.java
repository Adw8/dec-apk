package defpackage;

import android.widget.AbsListView;

/* renamed from: p1C  reason: default package */
/* loaded from: classes.dex */
public final class p1C implements AbsListView.OnScrollListener {
    public final /* synthetic */ olv R;

    public p1C(olv olv) {
        this.R = olv;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        boolean z = true;
        if (i == 1) {
            if (this.R.R.getInputMethodMode() != 2) {
                z = false;
            }
            if (!z && this.R.R.getContentView() != null) {
                olv olv = this.R;
                olv.f6920R.removeCallbacks(olv.f6925R);
                this.R.f6925R.run();
            }
        }
    }
}
