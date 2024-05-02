package defpackage;

import android.view.View;

/* renamed from: M7  reason: default package */
/* loaded from: classes.dex */
public final class M7 extends k_G {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ View v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M7(View view, View view2, Object obj, int i) {
        super(view2);
        this.L = i;
        this.v = view;
        this.R = obj;
    }

    @Override // defpackage.k_G
    public final boolean c() {
        switch (this.L) {
            case 0:
                ((JJ) this.v).R.U();
                return true;
            default:
                if (!((_Q) this.v).getInternalPopup().v()) {
                    _Q _q = (_Q) this.v;
                    _q.f697R.U(M9.v(_q), M9.R(_q));
                }
                return true;
        }
    }

    @Override // defpackage.k_G
    public final boolean e() {
        switch (this.L) {
            case 0:
                RR rr = ((JJ) this.v).R;
                if (rr.f486R != null) {
                    return false;
                }
                rr.e();
                return true;
            default:
                super.e();
                return true;
        }
    }

    @Override // defpackage.k_G
    public final gt5 v() {
        switch (this.L) {
            case 0:
                Ni ni = ((JJ) this.v).R.f481R;
                if (ni == null) {
                    return null;
                }
                return ni.R();
            default:
                return (j3) this.R;
        }
    }
}
