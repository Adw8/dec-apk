package defpackage;

import java.util.Set;

/* renamed from: aaK  reason: default package */
/* loaded from: classes.dex */
public final class aaK extends k8G implements iv7 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaK(int i, Object obj) {
        super(2);
        this.X = i;
        this.R = obj;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                dR6 dr6 = (dR6) obj2;
                R((Set) obj);
                break;
            default:
                dR6 dr62 = (dR6) obj2;
                R((Set) obj);
                break;
        }
        return o8s.R;
    }

    public final void R(Set set) {
        k0 k0Var;
        switch (this.X) {
            case 0:
                fLL fll = (fLL) this.R;
                synchronized (fll.f3384R) {
                    if (((a8X) fll.f3383R.getValue()).compareTo(a8X.Idle) >= 0) {
                        fll.f3394v.add(set);
                        k0Var = fll.t();
                    } else {
                        k0Var = null;
                    }
                }
                if (k0Var != null) {
                    ((xx) k0Var).Y(o8s.R);
                    return;
                }
                return;
            default:
                ((gn) this.R).e(set);
                return;
        }
    }
}
