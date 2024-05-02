package defpackage;

import android.view.View;

/* renamed from: b3s  reason: default package */
/* loaded from: classes.dex */
public final class b3s implements View.OnClickListener {
    public final /* synthetic */ cKO R;
    public final /* synthetic */ int e;

    public b3s(cKO cko, int i) {
        this.R = cko;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fhy R = fhy.R(this.e, this.R.R.f4270R.e);
        BD bd = this.R.R.R;
        if (R.f3521R.compareTo(bd.f20R.f3521R) < 0) {
            R = bd.f20R;
        } else {
            if (R.f3521R.compareTo(bd.v.f3521R) > 0) {
                R = bd.v;
            }
        }
        this.R.R.E(R);
        this.R.R.f(1);
    }
}
