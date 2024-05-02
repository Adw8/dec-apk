package defpackage;

/* renamed from: VK  reason: default package */
/* loaded from: classes.dex */
public final class VK extends k8G implements f_c {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f574R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VK(float f, int i, Object obj) {
        super(0);
        this.X = i;
        this.f574R = obj;
        this.R = f;
    }

    public final void R() {
        lqA lqa;
        boolean z = true;
        Pc pc = null;
        lqA lqa2 = null;
        switch (this.X) {
            case 0:
                lPv lpv = (lPv) this.f574R;
                Float valueOf = (lpv == null || (lqa = ((lkd) lpv).f5812R) == null) ? null : Float.valueOf(lqa.v());
                float f = this.R;
                if (valueOf == null || valueOf.floatValue() != f) {
                    z = false;
                }
                if (!z) {
                    lPv lpv2 = (lPv) this.f574R;
                    if (lpv2 != null) {
                        lqa2 = ((lkd) lpv2).f5812R;
                    }
                    if (lqa2 != null) {
                        lqa2.f5843R.R(Float.valueOf(this.R));
                        return;
                    }
                    return;
                }
                return;
            default:
                _6 _6 = (_6) this.f574R;
                Float valueOf2 = Float.valueOf(this.R);
                Object obj = _6.f685c;
                Pc pc2 = valueOf2 == null ? null : (Pc) _6.f683R.R.x(valueOf2);
                if (pc2 == null) {
                    pc2 = _6.R;
                }
                if (obj != null) {
                    pc = (Pc) _6.f683R.R.x(obj);
                }
                if (pc == null) {
                    pc = _6.v;
                }
                int v = pc2.v();
                int i = 0;
                while (i < v) {
                    i++;
                    if ((pc2.R(i) <= pc.R(i) ? 1 : null) == null) {
                        throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + pc2 + " is greater than upper bound " + pc + " on index " + i).toString());
                    }
                }
                _6.c = pc2;
                _6.e = pc;
                _6.f685c = obj;
                _6.f686v = valueOf2;
                if (!((Boolean) _6.f684R.getValue()).booleanValue()) {
                    Object v2 = _6.v(_6.c());
                    if (!n3x.v(v2, _6.c())) {
                        _6.f680R.f508R.R(v2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
