package defpackage;

import android.view.View;

/* renamed from: m_D  reason: default package */
/* loaded from: classes.dex */
public final class m_D implements mpM {
    public final /* synthetic */ View R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e;

    public m_D(int i, View view, int i2) {
        this.e = i;
        this.R = view;
        this.X = i2;
    }

    @Override // defpackage.mpM
    public final gWM v(View view, gWM gwm) {
        int i = gwm.R(7).v;
        if (this.e >= 0) {
            this.R.getLayoutParams().height = this.e + i;
            View view2 = this.R;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.R;
        view3.setPadding(view3.getPaddingLeft(), this.X + i, this.R.getPaddingRight(), this.R.getPaddingBottom());
        return gwm;
    }
}
