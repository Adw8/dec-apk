package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: Jb  reason: default package */
/* loaded from: classes.dex */
public final class Jb implements bF9 {
    public final /* synthetic */ fue R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ qc f204R;

    public Jb(fue fue, gJ8 gj8) {
        this.f204R = gj8;
        this.R = fue;
    }

    public final int O(int i) {
        qc qcVar = this.f204R;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        qc qcVar2 = this.f204R;
        qcVar.measure(makeMeasureSpec, qc.L(qcVar2, 0, i, qcVar2.getLayoutParams().height));
        return this.f204R.getMeasuredWidth();
    }

    @Override // defpackage.bF9
    public final int R(poS pos, List list, int i) {
        qc qcVar = this.f204R;
        qcVar.measure(qc.L(qcVar, 0, i, qcVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f204R.getMeasuredHeight();
    }

    @Override // defpackage.bF9
    public final int X(poS pos, List list, int i) {
        return O(i);
    }

    @Override // defpackage.bF9
    public final int c(poS pos, List list, int i) {
        return O(i);
    }

    @Override // defpackage.bF9
    public final int e(poS pos, List list, int i) {
        qc qcVar = this.f204R;
        qcVar.measure(qc.L(qcVar, 0, i, qcVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f204R.getMeasuredHeight();
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        if (oys.x(j) != 0) {
            this.f204R.getChildAt(0).setMinimumWidth(oys.x(j));
        }
        if (oys.m(j) != 0) {
            this.f204R.getChildAt(0).setMinimumHeight(oys.m(j));
        }
        qc qcVar = this.f204R;
        qcVar.measure(qc.L(qcVar, oys.x(j), oys.Z(j), this.f204R.getLayoutParams().width), qc.L(this.f204R, oys.m(j), oys.L(j), this.f204R.getLayoutParams().height));
        return mzf.f(this.f204R.getMeasuredWidth(), this.f204R.getMeasuredHeight(), iia.R, new jh(this.f204R, this.R, 0));
    }
}
